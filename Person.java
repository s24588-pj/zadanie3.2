package model.workers;

public abstract class Person {
    protected String name;
    protected String surname;
    protected int bearthYear;

    public Person(String name, String surname, int bearthYear) {
        this.name = name;
        this.surname = surname;
        this.bearthYear = bearthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBearthYear() {
        return bearthYear;
    }

    public void setBearthYear(int bearthYear) {
        this.bearthYear = bearthYear;
    }
}
