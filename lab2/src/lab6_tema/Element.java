package lab6_tema;

public interface Element {


    public void print();

    void accept(Visitor visitor);
}
