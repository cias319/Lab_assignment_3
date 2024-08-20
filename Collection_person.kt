class Person(val name: String, val age: Int)
fun sortPersons(persons: List<Person>): List<Person> {
    val personsCopy = persons.toMutableList()
    for (i in 0 until personsCopy.size - 1) {
        for (j in 0 until personsCopy.size - i - 1) {
            val p1 = personsCopy[j]
            val p2 = personsCopy[j + 1]
            if (p1.age > p2.age || (p1.age == p2.age && p1.name > p2.name)) {
                personsCopy[j] = p2
                personsCopy[j + 1] = p1
            }
        }
    }
    return personsCopy
}
fun main() {
    val persons = listOf(
        Person("piyush", 21),
        Person("pratyush", 23),
        Person("cias", 22),
        Person("srikant", 21),
        Person("abhilash", 22)
    )
    val sortedPersons = sortPersons(persons)
    for (person in sortedPersons) {
        println("Name: ${person.name}, Age: ${person.age}")
    }
}