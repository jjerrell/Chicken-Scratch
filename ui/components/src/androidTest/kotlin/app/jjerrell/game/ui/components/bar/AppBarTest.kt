package app.jjerrell.game.ui.components.bar

import androidx.compose.foundation.Image
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import app.jjerrell.game.ui.debug.setThemedContent
import org.junit.Rule
import org.junit.Test

class AppBarTest {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun testDefaultTitle() {
        setup(defaultTitle = true, actions = false)
        // test
        composeRule.onNodeWithTag(AppBarUtil.TAG).assertExists()
        composeRule.onNodeWithTag(AppBarUtil.TAG_TITLE).assertExists()
        composeRule.onNodeWithTag(AppBarUtil.TAG_TITLE).assertTextEquals("Hello, World!")
    }

    @Test
    fun testCustomTitle() {
        setup(defaultTitle = false, actions = false)
        // test
        composeRule.onNodeWithTag(AppBarUtil.TAG).assertExists()
        composeRule.onNodeWithText("Goodbye, Friend.").assertExists()
    }

    @Test
    fun testNoActions() {
        setup(defaultTitle = true, actions = false)
        // test
        composeRule.onNodeWithText("Click it!").assertDoesNotExist()
    }

    @Test
    fun testActions() {
        setup(defaultTitle = true, actions = true)
        // test
        composeRule.onNodeWithText("Click it!").assertExists()
    }
}

private fun AppBarTest.setup(defaultTitle: Boolean, actions: Boolean) {
    composeRule.setThemedContent {
        AppBar(
            title = if (defaultTitle) "Hello, World!" else "",
            titleContent = {
                Text("Goodbye, Friend.")
            },
            actions = {
                when (actions) {
                    true -> {
                        TextButton(onClick = { println("We clicked it!") }) {
                            Text("Click it!")
                        }
                    }
                    false -> {}
                }
            }
        )
    }
}