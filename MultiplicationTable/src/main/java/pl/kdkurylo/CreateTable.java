package pl.kdkurylo;

public class CreateTable {

    public static void main(String[] args) {
        MultiplicationTable t1 = new MultiplicationTable(2);
        MultiplicationTable t2 = new MultiplicationTable(5);
        MultiplicationTable t3 = new MultiplicationTable(10);
        MultiplicationTable t4 = new MultiplicationTable(12);

        t1.createTable();
        System.out.println("=====================================================================");
        t2.createTable();
        System.out.println("=====================================================================");
        t3.createTable();
        System.out.println("=====================================================================");
        t4.createTable();
        System.out.println("=====================================================================");
    }
}
