class OddOccurrencesInArray {

    /*
For example, in array A such that:
  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9

        the elements at indexes 0 and 2 have value 9,
        the elements at indexes 1 and 3 have value 3,
        the elements at indexes 4 and 6 have value 9,
        the element at index 5 has value 7 and is unpaired.


Example test:   [9, 3, 9, 3, 9, 7, 9]
WRONG ANSWER (got 0 expected 7)
     */
    fun solution( A: IntArray): Int {
        println("OddOccurrencesInArray GO!")
        println(A.contentToString())

        /* Solution A */
        val occurrenceMap = mutableMapOf<Int,Int>()
        var oddOccurrence = -1
        A.forEachIndexed { _, element ->
            if(occurrenceMap.containsKey(element))
                occurrenceMap[element] = occurrenceMap.getValue(element) + 1
            else
                occurrenceMap[element] = 1
        }
        val occurrenceMapFiltered = occurrenceMap.filterValues { it == 1 }
        if(occurrenceMapFiltered.iterator().hasNext())
            oddOccurrence = occurrenceMapFiltered.iterator().next().key

        println(oddOccurrence)


        /* Solution B*/
        var result = 0
        A.forEach {
            result = result xor it
        }
        println(result)

        return 0
    }
}