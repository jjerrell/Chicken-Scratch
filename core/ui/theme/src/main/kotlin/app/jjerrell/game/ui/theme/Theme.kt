package app.jjerrell.game.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = PrimaryDarkColors.primary,
    primaryVariant = PrimaryDarkColors.primaryVariant,
    secondary = PrimaryDarkColors.secondary,
    secondaryVariant = PrimaryDarkColors.secondaryVariant,
    background = PrimaryDarkColors.background,
    surface = PrimaryDarkColors.surface,
    error = PrimaryDarkColors.error,
    onPrimary = PrimaryDarkColors.onPrimary,
    onSecondary = PrimaryDarkColors.onSecondary,
    onBackground = PrimaryDarkColors.onBackground,
    onSurface = PrimaryDarkColors.onSurface,
    onError = PrimaryDarkColors.onError,
)

private val LightColorPalette = lightColors(
    primary = PrimaryLightColors.primary,
    primaryVariant = PrimaryLightColors.primaryVariant,
    secondary = PrimaryLightColors.secondary,
    secondaryVariant = PrimaryLightColors.secondaryVariant,
    background = PrimaryLightColors.background,
    surface = PrimaryLightColors.surface,
    error = PrimaryLightColors.error,
    onPrimary = PrimaryLightColors.onPrimary,
    onSecondary = PrimaryLightColors.onSecondary,
    onBackground = PrimaryLightColors.onBackground,
    onSurface = PrimaryLightColors.onSurface,
    onError = PrimaryLightColors.onError,
)

@Composable
fun AlgorithmicSortTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}