fun filterNonNullIntegers(numbers: List<Int?>): List<Int> {
    return numbers.filterNotNull()
}

fun main() {
    val numbers = listOf(1, null, 3, null, 5)
    val nonNullNumbers = filterNonNullIntegers(numbers)
    println(nonNullNumbers)
}