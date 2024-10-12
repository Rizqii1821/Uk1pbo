public class Person {
    private String name;
    private String role;

    // Constructor
    public Person(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Getter dan Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Method untuk menampilkan info person
    public void displayInfo() {
        System.out.println("Nama: " + name + ", Pekerjaan: " + role);
    }
}
