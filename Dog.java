public class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);  // Memanggil constructor superclass
        this.breed = breed;
    }

    // Getter dan Setter
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Overriding method makeSound
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
