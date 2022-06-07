/*
day 1

In this challenge, you will work with arithmetic operators. 
Check out the Tutorial tab for learning materials and an instructional video.

Task
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), 
and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. 
Round the result to the nearest integer.

Sample Input:
12.00
20
8

Sample Output:
15

*/

fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Unit {
    // Write your code here
    val tip: Double = meal_cost * tip_percent / 100
    val tax: Double = meal_cost * tax_percent / 100
    val total: Double = meal_cost + tip + tax

    val totalCost = Math.round(total).toInt()

    println(totalCost)
}

fun main() {
    val meal_cost = readLine()!!.trim().toDouble()

    val tip_percent = readLine()!!.trim().toInt()

    val tax_percent = readLine()!!.trim().toInt()

    solve(meal_cost, tip_percent, tax_percent)
}



