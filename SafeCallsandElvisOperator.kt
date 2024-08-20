fun getStringLength(s: String?): Int {
    return s?.length ?: -1
}

fun main() {
    val s1: String? = "india"
    val s2: String? = null
    println(getStringLength(s1))
    println(getStringLength(s2))
}