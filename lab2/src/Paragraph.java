public class Paragraph{
    public String text;
    public Paragraph(String text){
        this.text=text;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "text='" + text + '\'' +
                '}';
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    public void print(){
        System.out.println(this.text);
    }
}