import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the divisibleSumPairs function below.
fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {

    var count:Int=0
    for((index ,value)in ar.withIndex()){

        ar.forEachIndexed { index2, value2 ->

            if(index!=index2 ){
                if(index<index2 && (value+value2)%k==0)count++
            }

        }


    }

return count;
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}
