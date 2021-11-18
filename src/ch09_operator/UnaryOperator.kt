package ch09_operator

fun main() {
    //단항 연산자 (Unary Operator {+ , -}

    var value = 5

    value = 9

    value = +value

    println(value)

    value = -9
    value = +value
    println(value)

    value = -value //-곱하기 느낌으로다가 +일때는 +*+라서 아무런 변화가 없고 -*-=+라서 값이 바뀜 그래서 9
    println(value)

    value = 9
    value = -value //-9가 되겟죠
    println(value)
}