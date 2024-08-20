fun isSubset(subset: List<Int>, superset: List<Int>): Boolean {
    for (element in subset) {
        if (element !in superset) {
            return false
        }
    }
    return true
}
fun main() {
    val list1 = listOf(10, 20, 30)
    val list2 = listOf(10, 20, 30, 40, 50)
    val result = isSubset(list1, list2)
    println(result)  
}