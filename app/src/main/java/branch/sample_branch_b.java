package branch;

public class sample_branch_b {
    String name,roll;
    double income;

    public sample_branch_b(String name, String roll, double income) {
        this.name = name;
        this.roll = roll;
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
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
