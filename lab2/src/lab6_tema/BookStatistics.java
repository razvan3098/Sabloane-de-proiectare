package lab6_tema;

public class BookStatistics implements Visitor {

    private int imagesCounter = 0;
    private int tablesCounter = 0;
    private int paragraphsCounter = 0;

    public void visit(Image image){
        imagesCounter++;
    }

    public void visit(Paragraph paragraph){
        paragraphsCounter++;
    }

    public void visit(Table table){
        tablesCounter++;
    }

    public void visit(ImageProxy imageProxy){
        imagesCounter++;
    }

    public void printStatistics(){
        System.out.println("Book Statistics: ");
        System.out.println("### Number of images: "+imagesCounter);
        System.out.println("### Number of paragraph: "+paragraphsCounter);
        System.out.println("### Number of tables: "+tablesCounter);
    }
}
