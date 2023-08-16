import java.awt.*;

public class Awt4 {
    public static void main(String[] args) {
        Frame frame = new Frame("Exemplo de Componentes de Texto AWT");
        TextField textField = new TextField("Digite aqui");
        TextArea textArea = new TextArea("Área de texto", 5, 30);

        frame.setLayout(new FlowLayout());
        frame.add(textField);
        frame.add(textArea);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
