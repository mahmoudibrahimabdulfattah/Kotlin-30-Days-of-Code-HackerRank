import java.util.*

/*
Function Description
Complete the factorial function in the editor below. Be sure to use recursion.
factorial has the following paramter:
int n: an integer
Returns
int: the factorial of n

Sample Input:
3

Sample Output:
6
*/

fun factorial(x: Int): Int {
    if(x == 1 || x == 0) return 1
    return x * factorial(x-1)
}

fun main() {
    val n = readLine()!!.trim().toInt()
    println(factorial(n))
}
