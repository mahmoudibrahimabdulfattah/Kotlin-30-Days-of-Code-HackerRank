/*

Task
Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. 
You will then be given an unknown number of names to query your phone book for. For each "name" queried, 
print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for  is not found, 
print Not found instead.

Sample Input:
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry


Sample Output:
sam=99912222
Not found
harry=12299933

*/

fun main() {
    var n: Int = readLine()!!.trim().toInt()
    var phonebook = mutableMapOf<String, Int>()

    for (i in 0 until n){
        var arr = readLine()!!.trimEnd().split(" ").toTypedArray()
        phonebook.put(arr[0], arr[1].toInt())
    }

    var count = 0
    while (count < n){
        var name: String = readLine()!!
        var phoneNumber: Int? = phonebook.get(name)
        println(if (phoneNumber != null){
            "$name=$phoneNumber"
        }else{
            "Not found"
        })
        count++
    }
}