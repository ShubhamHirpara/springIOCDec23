package co.pragra.learning.sprignioc020424;

public class PetrolEngine implements IEngine{
    String engineType;
    Integer horsePower;
    @Override
    public void display() {
        System.out.println("EngineType: " + engineType + " HorsePower: " + horsePower);
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public void intAbc(){
        System.out.println("Database connection established");
    }
    public void distroyAbc(){
        System.out.println("Database connection closed");
    }
    public PetrolEngine(String engineType, Integer horsePower) {
        this.engineType = engineType;
        this.horsePower = horsePower;
    }
}
