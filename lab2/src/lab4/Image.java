package lab4;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String imagename;

    Image(String imageName) {
        imageName = imagename;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print(){
        System.out.println("Image with name: "+this.imagename);
    }

}