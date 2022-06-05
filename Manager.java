package model.workers;

public class Manager extends Person {
    private int salary;
    private double salaryBonus;
    private int managingBonus;
    private int phoneNum;
    private int mobilePhoneNum;
    private int roomNum;
    private String department;

    public Manager(String name, String surname, int bearthYear, int wage, double bonusPercent, int managingBonus,
                   int phoneNum, int mobilePhoneNum, int roomNum, String department) {
        super(name, surname, bearthYear);
        this.salary = wage;
        this.salaryBonus = bonusPercent;
        this.managingBonus = managingBonus;
        this.phoneNum = phoneNum;
        this.mobilePhoneNum = mobilePhoneNum;
        this.roomNum = roomNum;
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(double salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    public int getManagingBonus() {
        return managingBonus;
    }

    public void setManagingBonus(int managingBonus) {
        this.managingBonus = managingBonus;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getMobilePhoneNum() {
        return mobilePhoneNum;
    }

    public void setMobilePhoneNum(int mobilePhoneNum) {
        this.mobilePhoneNum = mobilePhoneNum;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double payRate(){
        return (getSalary())+(getSalary() * getSalaryBonus())+(getManagingBonus());
    }

    public void printOut() {
        System.out.println( "Manager{" +
                "salary=" + salary +
                ", salaryBonus=" + salaryBonus +
                ", managingBonus=" + managingBonus +
                ", phoneNum=" + phoneNum +
                ", mobilePhoneNum=" + mobilePhoneNum +
                ", roomNum=" + roomNum +
                ", department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bearthYear=" + bearthYear +
                ", Pay=" + payRate() +
                '}');
    }
}
