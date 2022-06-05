package model.workers;

public class ManagingMember extends Person{
    private int salary;
    private Manager Manager;
    private int meetings;

    public ManagingMember(String name, String surname, int bearthYear, int salary,Manager manager, int meetings) {
        super(name, surname, bearthYear);
        this.salary = salary;
        this.Manager = manager;
        this.meetings = meetings;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Manager getManager() {
        return Manager;
    }

    public void setManager(Manager manager) {
        this.Manager = Manager;
    }

    public int getMeetings() {
        return meetings;
    }

    public void setMeetings(int meetings) {
        this.meetings = meetings;
    }

    public double payRate(){
        return (getSalary()+(getMeetings()*400));
    }

    public void printOut() {
        System.out.println( "ManagingMember{" +
                "salary=" + salary +
                ", manager=" + Manager.getName() +
                ", meetings=" + meetings +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bearthYear=" + bearthYear +
                ", Pay=" + payRate() +
                '}');
    }
}


