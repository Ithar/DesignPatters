package template.domain;

public class WoodenHouse extends HouseTemplate {
    @Override
    protected void buildPillars() {
        System.out.println("Building Pillars with wood.");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building walls with wood.");
    }

    @Override
    protected boolean hookMethod() {
        return true;
    }

    protected void buildRoof() {
        System.out.println("Building roof with wood !!! ");
    }
}
