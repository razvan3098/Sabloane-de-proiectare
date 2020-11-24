package teest;

public class Fisier implements Element {
    private String name;
    private Align alignStrategy;
    public Fisier(String name) {
        this.name = name;
    }

    public void print(){

        if(alignStrategy==null) {
            System.out.println(this.name);
        }else{
            alignStrategy.render(this.name);
        }
    }

    public void setAlignStrategy(Align alignStrategy){
        this.alignStrategy=alignStrategy;
    }
}


