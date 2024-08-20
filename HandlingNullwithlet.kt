fun printUpperCase(s: String?) {
    s?.let {
        println(it.uppercase())
    } ?: println("String is null")
}

fun main() {
    val s1: String? = "Abilash"
    val s2: String? = null

    printUpperCase(s1)
    printUpperCase(s2)
}