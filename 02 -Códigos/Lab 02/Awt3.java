import java.awt.*;

public class Awt3 extends Canvas {
    public static void main(String[] args) {
        Frame frame = new Frame("Exemplo de Desenho AWT");
        Canvas canvas = new Awt3();
        frame.add(canvas);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine(50, 50, 150, 150);
        g.setColor(Color.BLUE);
        g.fillRect(200, 50, 100, 100);
        g.setColor(Color.GREEN);
        g.fillOval(100, 200, 150, 100);
    }
}



