package pack;

public class pack_class {
    String roll;
    String name;
    pack_class (String a,String b)
    {
        this.roll=a;
        this.name=b;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
