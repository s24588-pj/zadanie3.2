package model.workers;

public class Intern extends Person {
    private ManagingMember managingMember;
    private boolean hasScholarship;

    public Intern(String name, String surname, int bearthYear, ManagingMember managingMember, boolean hasScholarship) {
        super(name, surname, bearthYear);
        this.managingMember = managingMember;
        this.hasScholarship = hasScholarship;
    }

    public ManagingMember getManagingMember() {
        return managingMember;
    }

    public void setManagingMember(ManagingMember managingMember) {
        this.managingMember = managingMember;
    }

    public boolean getHasScholarship() {
        return hasScholarship;
    }

    public void setHasScholarship(boolean hasScholarship) {
        this.hasScholarship = hasScholarship;
    }

    public double payRate(){
        if (hasScholarship) return 1000;
        else return 0;
    }

    public void printOut() {
        System.out.println( "Intern{" +
                "managingMember=" + managingMember.getName() +
                ", hasScholarship=" + hasScholarship +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bearthYear=" + bearthYear +
                ", Pay=" + payRate() +
                '}');
    }
}
