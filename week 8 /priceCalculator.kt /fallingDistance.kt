
fun fallingDistance(time: Int): Double {
    val g = 9.8
    val distance = 0.5 * g * time * time
    return distance
}

fun main() {
    for (t in 1..10) {
        val distance = fallingDistance(t)
        println("Time: $t seconds, Distance: ${"%.2f".format(distance)} meters")
    }
}
