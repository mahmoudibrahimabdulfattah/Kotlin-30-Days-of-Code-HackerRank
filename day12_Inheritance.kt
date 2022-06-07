
fun main() {

    val firstName: String = readLine()!!
    val lastName: String = readLine()!!
    val id: Int = readLine()!!.trim().toInt()
    val numScores: Int = readLine()!!.trim().toInt()

    val testScores = IntArray(numScores)
    for (i in 0 until numScores) {
        testScores[i] = readLine()!!.trim().toInt()
    }

    val s = Student(firstName, lastName, id, testScores)
    s.printPerson()
    println("Grade: " + s.calculate())

}

open class Person (var firstName: String,  var lastName: String,  var idNumber: Int) {

    fun printPerson() {
        println("Name: $lastName, $firstName\nID: $idNumber")
    }
}

class Student(firstName: String?, lastName: String?, idNumber: Int, val testScores: IntArray) :
    Person(firstName!!, lastName!!, idNumber) {

    fun calculate(): Char {

        var total = 0
        for (testScore in testScores) total += testScore
        val avg = total / testScores.size
        if (avg in 90..100) return 'O'
        if (avg in 80..89) return 'E'
        if (avg in 70..79) return 'A'
        if (avg in 55..69) return 'P'
        if (avg in 40..54) return 'D'
        else return 'T'
    }
}