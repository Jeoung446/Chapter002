//- 필요한 클래스들을 설계합니다.(버거, 아이스크림, 음료, 맥주, 주문, 공통 등)
//- 클래스들의 프로퍼티와 메소드를 정의합니다
//- 예를 들어 아래 이미지처럼 클래스 다이어그램을 그려봅시다.
//- 햄버거는 이름, 가격 같은 프로퍼티와 정보를 출력하는 메소드가 있을 수 있죠?
//- Lv1에서 작성한 로직을 메소드로 만듭니다.

fun main() {
    val a = Burger("치즈버거", "없음")
    var b = a.burger(8000)
    val c = Burger("치즈버거", "감자튀김")
    val d = c.burgerSet(20000)
    val e = Beer().hite(21)
    println(b)
    println(d)
    println(e)
}

class Burger(name: String, side: String) {
    var name: String
    var side: String

    init {
        this.name = name
        this.side = side
    }

    fun burger(total: Int): String {
        var price = 7000
        val result = if (name == "치즈버거" && price >= 7000 || side != "감자튀김") {
            "${price}입니다. 남은 잔돈은 ${total - price} 입니다"
        } else {
            "다시 선택해주세요"
        }
        return result
    }

    fun burgerSet(total: Int): String {
        var price = 12000
        val setResult = if (name == "치즈버거" && price >= 10000 && side == "감자튀김") {
            "세트는${price}입니다. 남은 돈은 ${total - price}입니다"
        } else {
            "돈이 없으면 돌아가세요"
        }
        return setResult
    }
}

class Beer {
    fun hite(age: Int): String {
        var total = if (age < 20) {
            "${age}이상이어야지 구매 가능합니다"
        } else {
            "구매가능합니다"
        }
        return total
    }

}

