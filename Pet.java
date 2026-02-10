public class Pet {
    private String name;
    public Pet() {
        setName("Pet Name");
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        String info = "";
        info += "Pet information:\n";
        info += "Name: " + name;
        return info;
    }
    public static void main(String[] args) {
        Pet p1 = new Pet();
        System.out.println(p1.toString());
        System.out.println();
        Pet p2 = new Pet();
        p2.setName("Shiloh");
        System.out.println(p2.toString());
    }

}
