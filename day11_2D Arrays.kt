import java.lang.System.`in`
import java.util.*


fun main() {
    val `in` = Scanner(System.`in`)
    val arr = Array(6) { Array(6) { 0 } }

    for (i in 0 until 6) {
        for (j in 0 until 6){
            arr[i][j] = `in`.nextInt()
        }
    }

    val sum = IntArray(16)
    var h = 0
    for (i in 0..3){
        for (j in 0..3){
            sum[h] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]
            h++
        }
    }
    sum.sort()
    println(sum[15])
}
