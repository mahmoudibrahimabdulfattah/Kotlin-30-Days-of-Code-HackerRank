/*
Objective
Today, we will learn about the Array data structure. Check out the Tutorial tab for learning materials and an instructional video.

Task
Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.

Sample Input:
4
1 4 3 2

Sample Output:
2 3 4 1

*/


fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    arr.reverse()

    for (i in 0 until  n){
        print("${arr[i]} ")
    }
}