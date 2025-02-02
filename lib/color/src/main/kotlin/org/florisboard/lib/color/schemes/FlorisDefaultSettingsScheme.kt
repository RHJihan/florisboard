/*
 * Copyright (C) 2025 The FlorisBoard Contributors
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

package org.florisboard.lib.color.schemes

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

private val primaryLight = Color(0xFF006E1C)
private val onPrimaryLight = Color(0xFFFFFFFF)
private val primaryContainerLight = Color(0xFF58BC5B)
private val onPrimaryContainerLight = Color(0xFF002204)
private val secondaryLight = Color(0xFF005E16)
private val onSecondaryLight = Color(0xFFFFFFFF)
private val secondaryContainerLight = Color(0xFF2E8534)
private val onSecondaryContainerLight = Color(0xFFFFFFFF)
private val tertiaryLight = Color(0xFF964900)
private val onTertiaryLight = Color(0xFFFFFFFF)
private val tertiaryContainerLight = Color(0xFFFF8926)
private val onTertiaryContainerLight = Color(0xFF341500)
private val errorLight = Color(0xFFBA1A1A)
private val onErrorLight = Color(0xFFFFFFFF)
private val errorContainerLight = Color(0xFFFFDAD6)
private val onErrorContainerLight = Color(0xFF410002)
private val backgroundLight = Color(0xFFF5FBEF)
private val onBackgroundLight = Color(0xFF171D16)
private val surfaceLight = Color(0xFFF5FBEF)
private val onSurfaceLight = Color(0xFF171D16)
private val surfaceVariantLight = Color(0xFFDAE6D4)
private val onSurfaceVariantLight = Color(0xFF3F4A3C)
private val outlineLight = Color(0xFF6F7A6B)
private val outlineVariantLight = Color(0xFFBECAB9)
private val scrimLight = Color(0xFF000000)
private val inverseSurfaceLight = Color(0xFF2C322A)
private val inverseOnSurfaceLight = Color(0xFFEDF3E7)
private val inversePrimaryLight = Color(0xFF78DC77)
private val surfaceDimLight = Color(0xFFD6DCD0)
private val surfaceBrightLight = Color(0xFFF5FBEF)
private val surfaceContainerLowestLight = Color(0xFFFFFFFF)
private val surfaceContainerLowLight = Color(0xFFF0F6EA)
private val surfaceContainerLight = Color(0xFFEAF0E4)
private val surfaceContainerHighLight = Color(0xFFE4EADE)
private val surfaceContainerHighestLight = Color(0xFFDEE4D9)

private val primaryDark = Color(0xFF78DC77)
private val onPrimaryDark = Color(0xFF00390A)
private val primaryContainerDark = Color(0xFF43A648)
private val onPrimaryContainerDark = Color(0xFF000000)
private val secondaryDark = Color(0xFF82DB7E)
private val onSecondaryDark = Color(0xFF00390A)
private val secondaryContainerDark = Color(0xFF2D8433)
private val onSecondaryContainerDark = Color(0xFFFFFFFF)
private val tertiaryDark = Color(0xFFFFB786)
private val onTertiaryDark = Color(0xFF502400)
private val tertiaryContainerDark = Color(0xFFEA7600)
private val onTertiaryContainerDark = Color(0xFF030100)
private val errorDark = Color(0xFFFFB4AB)
private val onErrorDark = Color(0xFF690005)
private val errorContainerDark = Color(0xFF93000A)
private val onErrorContainerDark = Color(0xFFFFDAD6)
private val backgroundDark = Color(0xFF0F120E)
private val onBackgroundDark = Color(0xFFDEE4D9)
private val surfaceDark = Color(0xFF0F120E)
private val onSurfaceDark = Color(0xFFDEE4D9)
private val surfaceVariantDark = Color(0xFF3F4A3C)
private val onSurfaceVariantDark = Color(0xFFBECAB9)
private val outlineDark = Color(0xFF899484)
private val outlineVariantDark = Color(0xFF3F4A3C)
private val scrimDark = Color(0xFF000000)
private val inverseSurfaceDark = Color(0xFFDEE4D9)
private val inverseOnSurfaceDark = Color(0xFF2C322A)
private val inversePrimaryDark = Color(0xFF006E1C)
private val surfaceDimDark = Color(0xFF0F150E)
private val surfaceBrightDark = Color(0xFF353B33)
private val surfaceContainerLowestDark = Color(0xFF0A1009)
private val surfaceContainerLowDark = Color(0xFF171D16)
private val surfaceContainerDark = Color(0xFF1B211A)
private val surfaceContainerHighDark = Color(0xFF262C24)
private val surfaceContainerHighestDark = Color(0xFF30362E)

val amoledDark = Color(0xFF000000)

val florisDefaultSettingsLightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

val florisDefaultSettingsDarkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)
