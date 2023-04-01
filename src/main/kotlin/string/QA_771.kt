package string

fun main(){
    val jewels = "z"
    val stones = "ZZ"

    print(numJewelsInStones(jewels, stones))
}

fun numJewelsInStones(jewels: String, stones: String): Int {

    var noOfStone = 0

    for (i in stones){
        if(jewels.contains(i)){
            noOfStone += 1
        }
    }
    return noOfStone
}