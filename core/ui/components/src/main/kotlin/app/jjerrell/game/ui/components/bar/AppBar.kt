package app.jjerrell.game.ui.components.bar

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

@Composable
fun AppBar(
    modifier: Modifier = Modifier,
    title: String = "",
    titleContent: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
) {
    TopAppBar(
        modifier = modifier.testTag(AppBarUtil.TAG),
        title = {
            when (title.isEmpty()) {
                true -> titleContent()
                false -> Text(
                    modifier = Modifier.testTag(AppBarUtil.TAG_TITLE),
                    text = title
                )
            }
        },
        navigationIcon = null,
        actions = actions
    )
}

//object AppBar {
//    const val TAG: String = "APP_BAR"
//    const val TAG_TITLE: String = "${TAG}_TEXT_TITLE"
//}