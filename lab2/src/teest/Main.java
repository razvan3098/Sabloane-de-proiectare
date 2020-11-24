package teest;

public class Main {
    public static void main(String[] args) {
        Director cap1 = new Director("Dir");
        Fisier p1 = new Fisier("Fisier 1");
        Fisier p2 = new Fisier("Fisier 2");
        cap1.add(p1);
        cap1.add(p2);
        Fisier p3 = new Fisier("Fisier 3");
        cap1.add(p3);
        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.print();
        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());

        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
        cap1.print();
    }
}
