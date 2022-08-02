package creationalPattern.abstractFactory.before;

public class WhiteShip implements Ship{


    private String name;
    private String color;
    private String logo;
    private WhiteAnchor anchor;
    private WhiteWheel wheel;

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
    public WhiteAnchor getAnchor() {
        return anchor;
    }

    @Override
    public void setAnchor(WhiteAnchor anchor) {
        this.anchor = anchor;
    }

    @Override
    public WhiteWheel getWheel() {
        return wheel;
    }

    public void setWheel(WhiteWheel wheel) {
        this.wheel = wheel;
    }
}
