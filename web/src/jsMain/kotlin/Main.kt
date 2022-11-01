import androidx.compose.runtime.Composable
import org.example.kmpdemo.framework.di.injectedServices
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable
import org.kodein.di.compose.withDI


fun main(){
    renderComposable(rootElementId = "root") {
        counterApp()
    }
}

@Composable
fun counterApp() = withDI(injectedServices) {


    Div ( {style { padding(1.em) }} ) {
        H1 {
            Text("HELLO WORLD")
        }

    }

}
