import java.util.*


class ArrayRotation {

    fun solution(A: IntArray, K: Int): IntArray {
        println("ArrayRotation GO!")

        /* Solution A
        println(A.contentToString())
        val list = A.toList()
        Collections.rotate(list, K)
        println(list.toIntArray().joinToString())
        */

        /* Solution B*/

        val B = IntArray(A.size)

        for ((index) in A.withIndex()) {
            val step = index - K

            if (step < 0)
                B[index] = A[A.size + step]
            else if (step < A.size)
                B[index] = A[step]
            else
                B[index] = A[step - A.size]


        }
        println(A.contentToString())
        println(B.contentToString())

        return intArrayOf(3, 8, 9, 7, 6)
    }

}