package lab7;

public class Main3 {

    public static void main(String[] args) throws Exception {
        Command cmd1 = new OpenCommand();
        cmd1.execute();
        Command cmd2 = new StatisticsCommand();
        cmd2.execute();
        System.out.println("\nThe book: ");
        DocumentManager.getBook().print();
    }
}