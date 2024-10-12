public class Dog extends Animal {
    private String breed;

    
    public Dog(String name, int age, String breed) {
        super(name, age);  
        this.breed = breed;
    }

    
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    
    @Override
    public void makeSound() {
        System.out.println("Suara anjing: Gug gug!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis: " + breed);
    }
}
