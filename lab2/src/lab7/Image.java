package lab7;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String imageName;

    Image(String imagename) {
        imageName = imagename;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print(){
        System.out.println("Image with name: "+this.imageName);
    }

    public void add(Element element) throws Exception{
        throw new Exception("Not suppported by leaf elements");
    }

    public void remove (Element element) throws Exception {
        throw new Exception("Not supported by leaf elements");
    }

    public Element getElement (int index) throws Exception {
            throw new Exception("Not supported by leaf elements");
        }




    public void accept(Visitor visitor){
        visitor.visit(this);
    }

}