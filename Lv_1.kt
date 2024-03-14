//- 프로그램을 실행하면 메뉴판의 번호들을 보여줍니다.
//- 대분류 메뉴에 해당하는 숫자를 입력하면 선택하면 세부 메뉴들을 보여줍니다.
//- 예를 들어 햄버거에 해당하는 숫자를 입력 하면
//    햄버거 1, 햄버거 2 처럼 세부 종류를 보여줘요.
//- 반복문을 이용해서 메뉴 선택할 수 있게 유지하고
//    대분류 메뉴에서, 0번이 입력되면 프로그램을 종료합니다.

fun main() {
    var a = SHAKESHAKEMENU().burger()
}

class SHAKESHAKEMENU {
    fun burger() {
        while (true) {
            var menu = readln().toInt()
            when (menu) {
                1 -> println("토마토, 양배추, 쉑소그가 토핑된 치즈버거")
                2 -> println("베이컨, 체리 페퍼에 쉑소스가 토핑된 치츠버거")
                3 -> println("몬스터 치즈와 체타 치즈로 속을 채운 베지테리안 치즈 버거")
                0 -> return println("계산해 주세요")
            }
            if (menu == -1 || menu >= 4) {
                println("선택을 잘못하셨습니다")
                break
            }
        }
    }
}