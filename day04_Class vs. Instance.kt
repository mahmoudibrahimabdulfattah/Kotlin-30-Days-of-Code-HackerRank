/*
Sample Input:
4
-1
10
16
18

Sample Output:
Age is not valid, setting age to 0.
You are young.
You are young.

You are young.
You are a teenager.

You are a teenager.
You are old.

You are old.
You are old.
 */



class Person(initialAge: Int) {
    private var age = 0

    init {
        // Add some more code to run some checks on initialAge
        if (initialAge < 0) {
            println("Age is not valid, setting age to 0.")
            age = 0
        } else {
            age = initialAge
        }
    }


    fun amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        var message = ""
        if (age < 13) {
            message = "You are young."
        } else if (age in 3 until 18) {
            message = "You are a teenager."
        } else if (age > 18) {
            message = "You are old."
        }
        println(message)
    }

    fun yearPasses() {
        // Increment this person's age.
        age++
    }
}


fun main(args: Array<String>) {
    val T: Int = readLine()!!.toInt()
    for (i in 1..T) {
        val age: Int = readLine()!!.toInt()
        val p = Person(age)
        p.amIOld()
        for (j in 1..3) {
            p.yearPasses()
        }
        p.amIOld()
    }
}