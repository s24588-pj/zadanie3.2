package model.workers;

public class PhysicalWorker extends Person {
    private int wage;
    private int workingHours;
    private int overtimeHours;
    private Manager manager;
    private String skills;

    public PhysicalWorker(String name, String surname, int bearthYear, int wage, int workingHours, int overtimeHours, Manager manager, String skills) {
        super(name, surname, bearthYear);
        this.wage = wage;
        this.workingHours = workingHours;
        this.overtimeHours = overtimeHours;
        this.manager = manager;
        this.skills = skills;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public double payRate(){
        return (getWage()*getWorkingHours())+(getWage() * getOvertimeHours() * 1.5);
    }

    public void printOut() {
        System.out.println( "PhysicalWorker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bearthYear=" + bearthYear +
                ", wage=" + wage +
                ", workingHours=" + workingHours +
                ", overtimeHours=" + overtimeHours +
                ", manager=" + manager.getName() +
                ", skills='" + skills + '\'' +
                ", Pay='" + payRate() + '\'' +
                '}');
    }
}
