package lab6;

public class Paragraph implements Element {

    private String name;
    private AlignStrategy alignStrategy;

    Paragraph(String name) {
        this.name = name;
    }

    public void print() {

        if (alignStrategy == null) {
            System.out.println(this.name);
        } else {
            alignStrategy.render(this.name);
        }
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }

}