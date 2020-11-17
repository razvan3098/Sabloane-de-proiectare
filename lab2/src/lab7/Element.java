package lab7;

public interface Element {


    public void print();

    void accept(Visitor visitor);
}
