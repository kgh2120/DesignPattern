package creationalPattern.factoryMethod.after;

public interface ShipFactory {

    default Ship orderShip(String name, String email){
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendToEmail(email,ship);

        return ship;
    }

    private void sendToEmail(String email, Ship ship) {
        System.out.println(ship.getName() + "을 다 만들었습니다.");
    }

    Ship createShip();

    private void validate(String name, String email) {

        if(name == null || name.isBlank())
            throw new IllegalArgumentException("이름을 입력하세요");
        if(email == null || email.isBlank())
            throw new IllegalArgumentException("이메일을 입력하세요.");
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");

    }
}
