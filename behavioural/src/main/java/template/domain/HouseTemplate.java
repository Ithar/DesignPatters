package template.domain;

public abstract class HouseTemplate {

    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();

        if (hookMethod()) {
            buildRoof();
        }

        System.out.println("House built completed.");
    }

    private void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods and sand.");
    }

    protected abstract void buildPillars();
    protected abstract void buildWalls();
    protected boolean hookMethod() {
        return false;
    }
    protected void buildRoof() {}
}
