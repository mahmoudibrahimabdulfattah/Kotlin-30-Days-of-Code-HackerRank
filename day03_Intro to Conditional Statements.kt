/*
Given an integer , n, perform the following conditional actions:

If  n is odd, print Weird
If  n is even and in the inclusive range of 2 to 5 , print Not Weird
If  n is even and in the inclusive range of  6 to 20 , print Weird
If  n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird

 */

fun main() {
    val N = readLine()!!.trim().toInt()

    if (N%2 != 0){
        println("Weird")
    }else if (N%2 == 0) {
        if (N in 2..5){
            println("Not Weird")
        } else if (N in 6..20){
            println("Weird")
        } else if (N >= 20){
            println("Not Weird")
        }
    }
}
