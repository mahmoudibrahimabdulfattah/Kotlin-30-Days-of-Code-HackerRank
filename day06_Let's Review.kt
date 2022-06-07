
/*
Given a string S, of length N that is indexed from  0 to N - 1 , print its even-indexed and odd-indexed characters
as 2 space-separated strings on a single line (see the Sample below for more detail).

Note:  0 is considered to be an even index.

Sample Input:
2
Hacker
Rank

Sample Output:
Hce akr
Rn ak
 */


fun main(args: Array<String>) {
    val T: Int = readLine()!!.toInt()
    val list = mutableListOf<String>()

    for (i in 1..T) {
        val S: String = readLine()!!.trim()
        val N = S.toCharArray()
        val m = N.size - 1
        var evenChars: String = ""
        var oddChars: String = ""

        for (j in 0..m) {
            if(j%2 == 0){
                evenChars += S[j]
            } else {
                oddChars += S[j]
            }
        }
        list.add("$evenChars $oddChars")
    }
    for(i in 0 until  T){
        println(list[i])
    }
}