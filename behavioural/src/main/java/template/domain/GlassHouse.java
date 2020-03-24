package template.domain;

public class GlassHouse extends HouseTemplate {
    @Override
    protected void buildPillars() {
        System.out.println("Building Pillars with glass coating");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building Walls with glass.");
    }
}
