package teest;

public class Mp3 implements Element{

    private String name;

    Mp3(String name){
        this.name=name;
    }

    public void accept(Visitee visitor) {
        visitor.visit(this);
    }

    public void print() {
        System.out.println(this.name);
    }
}