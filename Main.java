public class Main {
    public static void main(String[] args) {
        // Membuat objek Dog
        Dog dog = new Dog("Bobby", 3, "Golden Retriever");
        dog.displayInfo();
        dog.makeSound();

        // Membuat objek Cat
        Cat cat = new Cat("Luna", 2, "White");
        cat.displayInfo();
        cat.makeSound();

        // Membuat objek Bird
        Bird bird = new Bird("Chimmey", 1, true);
        bird.displayInfo();
        bird.makeSound();

        // Membuat objek Person (Pemilik)
        Person owner = new Person("Alice", "Actrees");
        owner.displayInfo();

        // Memodifikasi data menggunakan setter
        dog.setBreed("Labrador");
        System.out.println("Jenis anjing setelah diubah: " + dog.getBreed());

        cat.setColor("Black");
        System.out.println("Warna Kucing setelah diubah: " + cat.getColor());

        bird.setCanFly(false);
        System.out.println("Burung bisa terbang setelah diubah: " + (bird.getCanFly() ? "Ya" : "Tidak"));
    }
}
