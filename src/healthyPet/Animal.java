package healthyPet;

public class Animal implements HealthPetsCalculator{
    private String name;
    private int weightInKG;
    private HealthPetsCalculator healthPetsCalculator;
    public Animal(String name, int weightInKG) {
        this.name = name;
        this.weightInKG = weightInKG *1000; // ändrar vikten från Kilogram till gram
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeightInKG() {
        return weightInKG;
    }

    public void setWeightInKG(int weightInKG) {
        this.weightInKG = weightInKG;
    }

    @Override
    public double calculateDiet(Animal animal, int divisor) {
        double dietInGram;
        dietInGram = (animal.getWeightInKG()/divisor);
        return dietInGram;
    }
}
