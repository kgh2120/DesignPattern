package creationalPattern.abstractFactory.after;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipProFactory());
        Ship ship = shipFactory.createShip();
    }
}
