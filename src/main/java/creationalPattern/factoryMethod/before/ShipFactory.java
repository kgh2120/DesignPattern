package creationalPattern.factoryMethod.before;

public class ShipFactory {

    public static Ship orderShip(String name, String email) {

        if(name == null || name.isBlank())
            throw new IllegalArgumentException("이름을 입력하세요");

        if(email == null || email.isBlank())
            throw new IllegalArgumentException("이메일을 입력하세요.");

        Ship ship = new Ship();
        ship.setName(name);


        if (name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("white");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setLogo("black");
        }

        return ship;
    }
}
