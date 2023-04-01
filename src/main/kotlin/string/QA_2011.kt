package string

fun main(){

    val operation = arrayOf("X++","++X","--X","X--")

    print(finalValueAfterOperations(operation))
}

fun finalValueAfterOperations(operations: Array<String>): Int {
    var answer = 0

    for (i in operations){
        if (i == "++X" || i=="X++"){
            answer += 1
        }else{
            answer -= 1
        }
    }

    return answer
}