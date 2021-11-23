package ch13_IfElse

fun main() {
    print("챔피언을 입력해 주세요 : ")
    var champ = readLine()

    if (champ == "룰루"){
        println("스킨을 선택하시겠습니까? : ")
        var answer = readLine()
        if (answer == "yes"){
            println("스킨을 선택해 주세요\n1.우주 그루브 룰루\t2.마녀 룰루\t3.별 수호자 룰루\t4.수영장 파티 룰루")
            var pick = readLine()?.toInt()
            if (pick == 1){
                println("우주 그루브 룰루 장착")
            }else if (pick == 2){
                println("마녀 룰루 장착")
            }else if(pick == 3){
                println("별 수호자 룰루 장착")
            }else if (pick == 4){
                println("수영장 파티 룰루 장착")
            }else{
                println("실패")
            }
        }
    }

}