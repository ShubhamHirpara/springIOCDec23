package co.pragra.learning.sprignioc020424;

public class BMW {
    IEngine engine;
    Integer horsePower;

    public BMW(IEngine engine, Integer horsePower) {
        this.engine = engine;
        this.horsePower = horsePower;
    }
    public void play(){
        System.out.println("Playig");
    }

    @Override
    public String toString() {
        return "BMW{" +
                "engine=" + engine +
                ", horsePower=" + horsePower +
                '}';
    }
}
