package lab7;

public class Table implements Element
{
    private String name;

    Table(String name){
        this.name=name;
    }

    public void print(){
        System.out.println("Table with name: "+this.name);
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}