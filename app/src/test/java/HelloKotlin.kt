fun avgFunc(initial: Float=0f, vararg numbers: Float): Double {
    var result = 0f
    for (num in numbers) {
        result += num
    }
    println("result: $result, numbers.size: ${numbers.size}")
    val avg = result/numbers.size
            return (avg+initial).toDouble()
}

fun main() {
    print("Enter the lines:")
    val input = readLine()!!.toInt()
    for(i in 1..input){
        for(j in 1..input-i)
            print(" ")
        for(k in 1 until 2*i)
            print("*")
        println(" ")
    }

    var score: Int? = 32
    score = score?.also{it+10}
    println(score)
}