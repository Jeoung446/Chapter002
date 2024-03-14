//- Lv2에서 설계한 클래스들을 상속 관계를 가지도록 변경합니다.
//- Burger도 부모 클래스를 가질 수 있을지 고민해봅시다.
//- 예를 들어 ShackBurger는 Burger의 자식이고, Burger는 Food의 자식일수도 있습니다.
//- 해당 부분은 반드시 이해가 필요합니다!
//    검색&튜터님들의 도움을 받아 꼭 짚고 넘어갑시다!
//- 하나의 리스트 객체로 모든 메뉴들을 관리하도록 수정합니다. List
//- 프로그램을 실행하면 메인에서 init 메소드를 실행하여
//    메뉴들을 객체화하고 리스트에 담아둡니다.
open class Burger1(var name: String, var price: Int) {
    // init로 name 초기화
    init {
        this.name = name
        this.price = price
    }
    open fun cheeze(price: Int): String {
        return "이것은 치즈버거입니다"
    }
    open fun big(price: Int): String {
        return "이것은 불고기버거입니다."
    }
}
fun main() {
    val cheeze = Cheezeburger()
    val big = Big()
    var item = listOf(
        "치즈버거 = ${cheeze.cheeze(8000)}",
        "빅맥버거 = ${big.big(10000)}",
        "세트 = ${big.set(30000)}"
    )
    item.forEach{ println(it) }

}

class Cheezeburger() : Burger1("치즈버거", 7000) {
    override fun cheeze(total: Int): String {
        val result = if (name == "치즈버거" && price >= 7000) {
            "7000원입니다.거스름 돈은 ${total - price} 입니다"
        } else {
            "취소되었습니다."
        }
        return result

    }
}

class Big() : Burger1(name = "빅맥", 10000) {
    override fun big(total: Int): String {
        val result = if (name == "빅맥" && price <= 10000) {
            "10000원입니다. 거스름 돈은 ${total - price} 입니다"
        } else {
            "취소되었습니다."
        }
        return result
    }
    fun set(total: Int): String {
        var price:Int = 20000
        var side = "감자튀김"
        val result = if (name == "빅맥" && price >= 20000 && side == "감자튀김") {
            "20000원입니다 거스름돈은 ${total - price} 입니다"
        } else {
            "취소되었습니다."
        }
        return result
    }
}