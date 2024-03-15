import com.example.chapter2.Food
import com.example.chapter2.Menu

//- 프로그램을 실행하면 메뉴판의 번호들을 보여줍니다.
//- 대분류 메뉴에 해당하는 숫자를 입력하면 선택하면 세부 메뉴들을 보여줍니다.
//- 예를 들어 햄버거에 해당하는 숫자를 입력 하면
//    햄버거 1, 햄버거 2 처럼 세부 종류를 보여줘요.
//- 반복문을 이용해서 메뉴 선택할 수 있게 유지하고
//    대분류 메뉴에서, 0번이 입력되면 프로그램을 종료합니다.
val menus: MutableList<Menu> = ArrayList()
val foods: MutableList<Food> = ArrayList()

var money: Double = 0.0
fun main() {

    init()

    while(true) {
        println("아래 메뉴판을 보고 메뉴를 입력해주세요")
        println("1. 앵거스 비프 통살을 다져 만든 버거")
        println("2. 매장에서 신선하게 만든 아이스크림")
        println("3. 매장에서 직접 만드는 음료")
        println("4. 뉴욕 브로클린 양조 맥주")
        println("0. 종료")

        var categorySelect = readln().toInt()
        when(categorySelect) {
            1 -> {
                println("1. ShackBurger   | W 6.9 | 토마토, 양배추, 쉑소스가 토핑된 치즈버거")
                println("2. SmokeBurger   | W 8.9 | 체리 페퍼에 쉑소스가 토핑된 치즈버거")
                println("3. ShroomBurger  | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
                println("4. Cheese Burger | W 5.4 | 포테이토 번과 비프페티, 치즈가 토핑된 치즈버거")
                println("0. 종료           | 뒤로가기")
                var menuSelect = readln().toInt()
                when (menuSelect) {
                    0 -> {continue}
                }
            }

            2 -> {
                println("1. Plain Ice Cream     | W 12.1 | 바닐라 아이스크림")
                println("2. Chocolate Ice Cream | W 10.2 | 초콜릿 아이스크림")
                println("3. Fruits Ice Cream    | W 15.4 | 과일 아이스크림")
                println("4. Ice Milk            | W 5.4  | 저지방 아이스크림")
                println("0. 종료                 | 뒤로가기")
                var menuSelect = readln().toInt()
                when (menuSelect) {
                    0 -> {continue}
                }
            }

            3 -> {
                println("1. Ade       | W 7.5 | 에이드")
                println("2. Americano | W 6.4 | 아메리카토")
                println("3. Beverage  | W 6.8 | 음료수")
                println("4. Black Tea | W 7.7 | 홍차")
                println("0. 종료       | 뒤로가기")
                var menuSelect = readln().toInt()
                when (menuSelect) {
                    0 -> {continue}
                }
            }

            4 -> {
                println("1. Bokbunja | W 16.2 | 복분자")
                println("2. Bourbon  | W 15.4 | 버번위스키")
                println("3. Cocktail | W 19.2 | 칵테일")
                println("4. Gin      | W 15.4 | 진")
                println("0. 종료      | 뒤로가기")
                var menuSelect = readln().toInt()
                when (menuSelect) {
                    0 -> {continue}
                }
            }

            0 -> {
                println("프로그램을 종료합니다")
                break
            }
        }
    }
}

fun init() {
    money = 100.0
//        "1. ShackBurger   | W 6.9 | 토마토, 양배추, 쉑소스가 토핑된 치즈버거")
//        println("2. SmokeBurger   | W 8.9 | 체리 페퍼에 쉑소스가 토핑된 치즈버거")
//        println("3. ShroomBurger  | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
//        println("4. Cheese Burger | W 5.4 | 포테이토 번과 비프페티, 치즈가 토핑된 치즈버거")

//        println("1. 앵거스 비프 통살을 다져 만든 버거")
//        println("2. 매장에서 신선하게 만든 아이스크림")
//        println("3. 매장에서 직접 만드는 음료")
//        println("4. 뉴욕 브로클린 양조 맥주")
    menus.add(Menu("Burgers", "앵거스 비프 통살을 다져 만든 버거"))
    menus.add(Menu("Forzen Custard", "매장에서 신선하게 만든 아이스크림"))
    menus.add(Menu("Drinks", "매장에서 직접 만드는 음료"))
    menus.add(Menu("Beer", "뉴욕 브로클린 양조 맥주"))

//        foods.add(Food("", 0.0, "", ""))
    foods.add(Food("ShackBurger", 6.9, "burger", "토마토, 양배추, 쉑소스가 토핑된 치즈버거"))
    foods.add(Food("SmokeBurger", 8.9, "burger", "체리 페퍼에 쉑소스가 토핑된 치즈버거"))
    foods.add(Food(" ShroomBurger", 9.4, "burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"))
    foods.add(Food("Cheese Burger", 5.4, "burger", "포테이토 번과 비프페티, 치즈가 토핑된 치즈버거"))

//        println("1. Plain Ice Cream     | W 12.1 | 바닐라 아이스크림")
//        println("2. Chocolate Ice Cream | W 10.2 | 초콜릿 아이스크림")
//        println("3. Fruits Ice Cream    | W 15.4 | 과일 아이스크림")
//        println("4. Ice Milk            | W 5.4  | 저지방 아이스크림")

    foods.add(Food("Plain Ice Cream", 12.1, "Ice Cream", "바닐라 아이스크림"))
    foods.add(Food("Chocolate Ice Cream", 10.2, "Ice Cream", "초콜릿 아이스크림"))
    foods.add(Food("Fruits Ice Cream", 15.4, "Ice Cream", "과일 아이스크림"))
    foods.add(Food("Ice Milk", 5.4, "Ice Cream", "저지방 아이스크림"))

//        println("1. Ade       | W 7.5 | 에이드")
//        println("2. Americano | W 6.4 | 아메리카토")
//        println("3. Beverage  | W 6.8 | 음료수")
//        println("4. Black Tea | W 7.7 | 홍차")

    foods.add(Food("Ade", 7.5, "Drinks", "에이드"))
    foods.add(Food("Americano", 6.4, "Drinks", "아메리카토"))
    foods.add(Food("Beverage", 6.8, "Drinks", "음료수"))
    foods.add(Food("Black Tea", 7.70, "Drinks", "홍차"))

//        println("1. Bokbunja | W 16.2 | 복분자")
//        println("2. Bourbon  | W 15.4 | 버번위스키")
//        println("3. Cocktail | W 19.2 | 칵테일")
//        println("4. Gin      | W 15.4 | 진")

    foods.add(Food("Bokbunja", 16.2, "Beer", "복분자"))
    foods.add(Food("Bourbon", 15.4, "Beer", "버번위스키"))
    foods.add(Food("Cocktail", 19.2, "Beer", "칵테일"))
    foods.add(Food("Gin", 15.4, "Beer", "진"))

}