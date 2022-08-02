package creationalPattern.abstractFactory.before;

public interface Ship {
    String getName();

    void setName(String name);

    String getColor();

    void setColor(String color);

    String getLogo();

    void setLogo(String logo);

    void setAnchor(WhiteAnchor anchor);

    void setWheel(WhiteWheel whiteWheel);

    WhiteAnchor getAnchor();

    WhiteWheel getWheel();

    @Override
    String toString();
}
