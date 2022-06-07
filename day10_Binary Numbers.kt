/*
Given a base-10 integer n, convert it to binary (base-2).
Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
When working with different bases, it is common to show the base as a subscript.

Sample Input 1:
5

Sample Output 1:
1

Sample Input 2:
13

Sample Output 2:
2
 */
fun main() {
    var n = readLine()!!.trim().toInt()
    var result: Int = 0
    var maximum: Int = 0

    while (n > 0){
        if(n%2 == 1){
            result += 1
            if(result > maximum){
                maximum = result
            }
        } else {
            result = 0
        }
        n/=2
    }
    println(maximum)
}