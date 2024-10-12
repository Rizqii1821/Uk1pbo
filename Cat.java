public class Cat extends Animal {
    private String color;

    // Constructor
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    // Getter dan Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Overriding method makeSound
    @Override
    public void makeSound() {
        System.out.println("Suara kucing: Meow meow!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warna: " + color);
    }
}
