import javax.swing.*;
import java.io.IOException;
import java.net.URL;

public class Start {
    public static void main(String... args) throws IOException {
        System.out.println(ProcessHandle.current().pid());

        JFrame jf = new JFrame("Gotcha!");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.add(new JLabel(new ImageIcon(new URL("http://chambly.c.h.pic.centerblog.net/vo3933xi.jpg"))));
        jf.pack();
        jf.setVisible(true);
    }
}
