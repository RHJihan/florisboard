/*
 * Copyright (C) 2022 Patrick Goldinger
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.patrickgold.florisboard.ime.media.emoji

import dev.patrickgold.florisboard.app.AppPrefs
import dev.patrickgold.jetpref.datastore.model.PreferenceSerializer
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

object EmojiHistory {
    private const val DELIMITER = ";"

    private var emojiGuard = Mutex(locked = false)

    suspend fun addEmoji(prefs: AppPrefs, emoji: Emoji) = emojiGuard.withLock {
        if (!prefs.emoji.historyEnabled.get()) {
            return
        }
        val maxSize = prefs.emoji.historyMaxSize.get().let { if (it == 0) Int.MAX_VALUE else it }
        val list = prefs.emoji.historyData.get().toMutableList()
        list.add(0, emoji)
        prefs.emoji.historyData.set(list.distinctBy { it.value }.take(maxSize))
    }

    suspend fun removeEmoji(prefs: AppPrefs, emoji: Emoji) = emojiGuard.withLock {
        if (!prefs.emoji.historyEnabled.get()) {
            return
        }
        val list = prefs.emoji.historyData.get().toMutableList()
        list.remove(emoji)
        prefs.emoji.historyData.set(list.distinctBy { it.value })
    }

    object Serializer : PreferenceSerializer<List<Emoji>> {
        override fun serialize(value: List<Emoji>): String {
            return value.joinToString(DELIMITER) { it.value }
        }

        override fun deserialize(value: String): List<Emoji> {
            return value.split(DELIMITER).mapNotNull { rawValue ->
                rawValue.trim().let { if (it.isBlank()) null else Emoji(it.trim(), "", emptyList()) }
            }
        }
    }
}
