package branch;

public class sample_branch_b {
    String name,roll;
    int product;

     sample_branch_b(String name, String roll, int product) {
        this.name = name;
        this.roll = roll;
        this.product = product;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
}
