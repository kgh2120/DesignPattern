package creationalPattern.abstractFactory.before;



public class WhiteShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());

        return ship;
    }
}
