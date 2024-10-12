public class Main {
    public static void main(String[] args) {
        
        Dog dog = new Dog("Bobby", 3, "Golden Retriever");
        dog.displayInfo();
        dog.makeSound();

        
        Cat cat = new Cat("Luna", 2, "White");
        cat.displayInfo();
        cat.makeSound();


        Bird bird = new Bird("Chimmey", 1, true);
        bird.displayInfo();
        bird.makeSound();

        
        Person owner = new Person("Alice", "Actrees");
        owner.displayInfo();


        dog.setBreed("Labrador");
        System.out.println("Jenis anjing setelah diubah: " + dog.getBreed());

        cat.setColor("Black");
        System.out.println("Warna Kucing setelah diubah: " + cat.getColor());

        bird.setCanFly(false);
        System.out.println("Burung bisa terbang setelah diubah: " + (bird.getCanFly() ? "Ya" : "Tidak"));
    }
}
