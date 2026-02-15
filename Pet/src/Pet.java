public class Pet {

    private String type;
    private String name;
    private int age;

    public Pet() {
        setType("Animal");
        setName("Pet Name");
        setAge(1);
    }
    public Pet(String type, String name, int age){
        setType(type);
        setName(name);
        setAge(age);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String speak(){
        if (type.equalsIgnoreCase("dog")){
            return "Woof";
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        }else {
            return "Yowl";
        }
    }

    public String toString() {
        String info = "";
        info += "Pet information:\n";
        info += "Type: " + type + "\n";
        info += "Name: " + name + "\n";
        info += "Sound: " + speak() + "\n";
        info += "Age: " + age + "\n";
        return info;
    }
}
