package lab7;

public class Main2 {

    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("models.Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("models.Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("models.Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("models.Paragraph 4");
        cap1.add(p4);
        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.print();
        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());

        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();

        ImageProxy image1=new ImageProxy("./jpgextension.jpg");
        cap1.add(image1);

        cap1.print();

    }

}
