class FrogJump {

    fun solution(X: Int, Y: Int, D: Int): Int {
        /* Solution A
        //(10, 85, 30)
        var currentPosition = X
        var numberOfJumpsToTargetPlace = 0
        println("X : $X, Y : $Y, D : $D ")
        if (X <= Y) {
            while (currentPosition < Y) {
                currentPosition += D
                numberOfJumpsToTargetPlace = numberOfJumpsToTargetPlace.inc()
                println(currentPosition)
                println(numberOfJumpsToTargetPlace)
            }
        }
        println("finished : $currentPosition")
        println("finished : $numberOfJumpsToTargetPlace")
        */

        /* Solution B *
        ( 1, 5, 2 )
        (10, 85, 30)
        */

        var numberOfJumps = 0
        if (Y > X) {
            var numberOfJumpsApprox = (Y - X)/D
            var lastDistance =  (Y - X)%D
            if (lastDistance>0)
                numberOfJumps = numberOfJumpsApprox.inc()
            else
                numberOfJumps = numberOfJumpsApprox

            println("finished : $numberOfJumps")
            println("lastDistance : $lastDistance")
        }

        return numberOfJumps
    }
}