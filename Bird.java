public class Bird extends Animal {
    private boolean canFly;

    
    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    
    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    
    @Override
    public void makeSound() {
        System.out.println("Suara burung: Tweet Tweet!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bisa terbang: " + (canFly ? "Yes" : "No"));
    }
}
