package healthyPet;

public class Ormar extends Animal {
    public Ormar(String name, int weight) {
        super(name, weight);
    }
    @Override
    public double calculateDiet(Animal animal, int divisor) {
        double dietInGram = 20.00;
        return dietInGram;
    }
}
