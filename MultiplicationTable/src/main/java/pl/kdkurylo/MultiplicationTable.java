package pl.kdkurylo;

public class MultiplicationTable {

    private int size;

    public MultiplicationTable(int size) {
        this.size = size;
    }

    public void createTable() {
        for (int i = 0; i < (size + 1); i++) {
            for (int j = 0; j < (size + 1); j++) {
                System.out.format("%5d", i * j);
            }
            System.out.println();
        }
    }
}
