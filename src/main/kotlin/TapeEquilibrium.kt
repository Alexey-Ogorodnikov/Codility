import java.lang.Math.abs

class TapeEquilibrium {
    fun solution(A: IntArray): Int {
        println("ArrayDifference GO!")
        println(A.contentToString())

        var sum = 0
        var myMap = emptyMap<Int,Int>().toMutableMap()

        for ((i, value) in A.withIndex())
        {

            sum += value
            myMap[i] = sum

            println("element $value")
            println("sum $sum \n")
        }

        println(myMap)


        val p = emptyArray<Int>().toMutableList()
        for((k,v) in myMap)
        {
            println("k $k")
            println("v $v \n")
            if (k < myMap.size - 1)
            {
                val difference = 2 * v - myMap[myMap.size - 1]!!
                println("difference ${abs(difference)} \n")
                p.add(abs(difference))
            }
        }
        val sortedP = p.toIntArray().sorted()
        println(sortedP.first())

        return sortedP.first()
    }
}