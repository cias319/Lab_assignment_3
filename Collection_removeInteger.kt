fun removeLessThanN(list: List<Int>, n: Int): List<Int> {
    return list.filter { it >= n }
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val filtered = removeLessThanN(list, 3)
    println(filtered)  
}