package creationalPattern.factoryMethod.after;

public class Client {


    public static void main(String[] args) {
        Client c = new Client();
        c.print(new WhiteShipFactory(), "WhiteShip", "kgh2120@naver.com");

        c.print(new BlackShipFactory(), "BlackShip", "kgh2120@naver.com");
    }

    public void print(ShipFactory factory, String name, String email) {
        Ship ship = factory.orderShip(name, email);
        System.out.println(ship);
    }
}
