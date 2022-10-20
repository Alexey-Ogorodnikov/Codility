class MissingElement {
/*
An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
Your goal is to find that missing element.
Write a function:
    fun solution(A: IntArray): Int
that, given an array A, returns the value of the missing element.
For example, given array A such that:
  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.
Write an efficient algorithm for the following assumptions:
        N is an integer within the range [0..100,000];
        the elements of A are all distinct;
        each element of array A is an integer within the range [1..(N + 1)].
     */

    fun solution(A: IntArray): Int {
        /*
          A[0] = 2
          A[1] = 3
          A[2] = 1
          A[3] = 5
         */

/*
        val numbers: IntArray = A
        numbers.sort()
        println(numbers.contentToString())

        println(numbers.min())
        println(numbers.max())
        println(numbers.size)
        println(numbers.max()-numbers.min())

        val numbersFromOne = IntArray(numbers.max() - numbers.min() + 1) { it + numbers.min() }
        println(numbersFromOne.contentToString())
        var missingNumber = 0

        for (i in numbersFromOne.indices) {
            if (numbersFromOne[i] - numbers[i] != 0) {
                println(numbersFromOne[i])
                missingNumber = numbersFromOne[i]
                break
            }
        }

        println()
*/



        val numbers: IntArray = A
        if (numbers.isEmpty())
            return 0
        numbers.sort()

        val numbersCorrectArray = IntArray(numbers[numbers.size-1] - numbers[0] + 1) { it + numbers[0] }
        println(numbers.contentToString())
        println(numbersCorrectArray.contentToString())

        var missingNumber = 0
        for (i in numbersCorrectArray.indices) {
                if (numbersCorrectArray[i] - numbers[i] != 0) {
                    missingNumber = numbersCorrectArray[i]
                    break
                }
        }
        println(missingNumber)
        return missingNumber


        return 0;
    }
}