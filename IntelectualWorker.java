package model.workers;

public class IntelectualWorker extends Person{
    private int salary;
    private double salaryBonus;
    private Manager manager;
    private int phoneNum;
    private int roomNum;

    public IntelectualWorker(String name, String surname, int bearthYear, int salary, double salaryBonus, Manager manager,
                             int phoneNum, int roomNum) {
        super(name, surname, bearthYear);
        this.salary = salary;
        this.salaryBonus = salaryBonus;
        this.manager = manager;
        this.phoneNum = phoneNum;
        this.roomNum = roomNum;
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

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public double payRate(){
        return (getSalary())+(getSalary() * getSalaryBonus());
    }

    public void printOut() {
        System.out.println( "IntelectualWorker{" +
                "salary=" + salary +
                ", salaryBonus=" + salaryBonus +
                ", manager=" + manager.getName() +
                ", phoneNum=" + phoneNum +
                ", roomNum=" + roomNum +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bearthYear=" + bearthYear +
                ", Pay=" + payRate() +
                '}');
    }
}
