import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val word1 = scanner.next().toLowerCase()
    val word2 = scanner.next().toLowerCase()

    if (word1 == word2) print(true) else print(false)

}