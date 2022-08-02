package creationalPattern.factoryMethod.before;

public class Client {


    public static void main(String[] args) {
        Ship w = ShipFactory.orderShip("whiteShip", "kgh2120");
        Ship b = ShipFactory.orderShip("blackship", "kgh2120");

        System.out.println(w);
        System.out.println(b);
    }
}
