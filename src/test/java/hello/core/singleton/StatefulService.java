package hello.core.singleton;

public class StatefulService {

    private int price;

    // 싱글톤은 무상태로 설계해야 한다.
    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
//        this.price = price;
        return price;
    }

//    public int getPrice() {
//        return price;
//    }
}
