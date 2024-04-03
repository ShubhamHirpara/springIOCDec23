package co.pragra.learning.sprignioc020424;

public class DieselEngine implements IEngine{
    String engineType;
    Integer horsePower;
    @Override
    public void display() {
        System.out.println("EngineType: " + engineType + " HorsePower: " + horsePower);
    }
}
