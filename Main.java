package model.workers;

public class Main {

    public static void main(String[] args) {
        Manager manager1 = new Manager("Dawid", "Kowalski", 1980, 6000, 0.5,
                1500, 444555666, 777888999, 202, "budowlanka");

        PhysicalWorker physicalWorker1 = new PhysicalWorker("Adam", "Nowak", 2000, 25,
                180, 60, manager1, "Wozek  widlowy");

        IntelectualWorker intelectualWorker1 = new IntelectualWorker("Mariusz", "Kowal", 1990,
                4000, 0.3, manager1, 111222333, 101);

        ManagingMember managingMember1 = new ManagingMember("Arek", "Jankowski", 1970,
                8000, manager1, 3);

        Intern intern1 = new Intern("Adrian", "Pielecki", 2000,
                managingMember1, true);

    manager1.printOut();
    physicalWorker1.printOut();
    intelectualWorker1.printOut();
    managingMember1.printOut();
    intern1.printOut();
    }
}
