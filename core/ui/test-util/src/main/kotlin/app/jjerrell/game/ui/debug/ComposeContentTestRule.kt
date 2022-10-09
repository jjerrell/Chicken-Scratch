package app.jjerrell.game.ui.debug

import androidx.compose.runtime.Composable
import androidx.compose.ui.test.junit4.ComposeContentTestRule
import app.jjerrell.game.ui.theme.AlgorithmicSortTheme

public fun ComposeContentTestRule.setThemedContent(
    composable: @Composable () -> Unit
) {
    setContent {
        AlgorithmicSortTheme {
            composable()
        }
    }
}