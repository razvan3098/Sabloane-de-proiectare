public class Paragraph implements Element{

    private String name;

    Paragraph(String name){
        this.name=name;
    }

    public void print(){
        System.out.println("Paragraph with name: "+this.name);
    }

}