import kotlinx.browser.document
import org.w3c.dom.HTMLButtonElement

fun main() {
    val botao = document.getElementById("botao") as HTMLButtonElement
    botao.onclick = {
        botao.textContent = "Carregando..."
    }
}
