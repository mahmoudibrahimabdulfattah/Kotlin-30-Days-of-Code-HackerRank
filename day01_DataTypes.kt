/*
day 1

Complete the code in the editor below. The variables i, d, s and  are already declared and initialized for you. You must:
Declare  variables: one of type int, one of type double, and one of type String.
Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
Use the  operator to perform the following operations:
Print the sum of  plus your int variable on a new line.
Print the sum of  plus your double variable to a scale of one decimal place on a new line.
Concatenate  with the string you read as input and print the result on a new line.

Sample Input:
12
4.0
is the best place to learn and practice coding!

Sample Output:
16
8.0
HackerRank is the best place to learn and practice coding!
 */

fun main() {
    val i = 4
    val d = 4.0
    val s: String = "HackerRank "

    var a: Int? = readLine()?.toInt()
    var b: Double? = readLine()?.toDouble()
    var str: String? = readLine()

    println(i!! + a!!)
    println(d!! + b!!)
    println(s!! + str!!)
}