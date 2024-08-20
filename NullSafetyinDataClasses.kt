class User(val name: String?, val email: String?)
fun printUserDetails(user: User) {
    if (user.name == null || user.email == null) {
        println("Incomplete User")
    } else {
        println("User(name=${user.name}, email=${user.email})")
    }
}
fun main() {
    val user1 = User("piyush", "spiyush@gmail.com")
    val user2 = User(null, "psonu@gmail.com")
    val user3 = User("xyz", null)

    printUserDetails(user1)
    printUserDetails(user2)
    printUserDetails(user3)
}