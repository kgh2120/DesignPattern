package creationalPattern.abstractFactory.after;

public interface Ship {
    String getName();

    void setName(String name);

    String getColor();

    void setColor(String color);

    String getLogo();

    void setLogo(String logo);

    void setAnchor(Anchor anchor);

    void setWheel(Wheel whiteWheel);

    Anchor getAnchor();

    Wheel getWheel();

    @Override
    String toString();
}
