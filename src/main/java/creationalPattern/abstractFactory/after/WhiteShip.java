package creationalPattern.abstractFactory.after;

public class WhiteShip implements Ship {


    private String name;
    private String color;
    private String logo;
    private Anchor anchor;
    private Wheel wheel;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getLogo() {
        return logo;
    }

    @Override
    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public Anchor getAnchor() {
        return anchor;
    }

    @Override
    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    @Override
    public Wheel getWheel() {
        return wheel;
    }

    @Override
    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
