import java.awt.*;

public class Awt1 {
    public static void main(String[] args) {
        Frame frame = new Frame("Exemplo AWT");
        Label label = new Label("Olá, mundo!");

        frame.add(label);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}





