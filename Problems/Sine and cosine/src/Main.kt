import java.util.*
import kotlin.math.cos

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val angle = scanner.nextDouble()
    val sin = Math.sin(angle)
    val kos = Math.cos(angle)

    print(sin - kos)
}