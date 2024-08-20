fun filterStrings(items: List<Any>): List<String> {
    return items.mapNotNull { it as? String }
}

fun main() {
    val items = listOf(1, "Abhilash", 3.5, "Patra", true)
    val strings = filterStrings(items)
    println(strings)
}