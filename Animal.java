public class Animal {
    private String name;
    private int age;

    // Constructor Overloading
    public Animal() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter dan Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Umur harus berupa angka positif.");
        }
    }

    // Polymorphism: Method ini akan di-override
    public void makeSound() {
        System.out.println("Hewan dapat mengeluarkan suara.");
    }

    public void displayInfo() {
        System.out.println("Nama: " + name + ", Umur: " + age);
    }
}
