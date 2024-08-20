fun mapStrLen(list: List<String>): Map<String, Int> {
    val rMap = mutableMapOf<String, Int>()
    for (str in list) {
        rMap[str] = str.length
    }
    return rMap
}

fun main() {
    val list = listOf("virat", "bumrah", "rohit", "hardik")
    val lengths = mapStrLen(list)
    println(lengths)  
}