import javax.swing.*;
import java.awt.*;

public class Layout extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel topPanel = new JPanel();
        JPanel midPanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        //TopPNL//
        JButton Tw3Buttom = new JButton("Tw3");
        JButton quitButton = new JButton("Quit");

        JButton helloButton = new JButton("Hello");
        JButton readyButton = new JButton("Ready");
        JButton pauseButton = new JButton("Pause");

        topPanel.add(quitButton);
        topPanel.add(Tw3Buttom);
        midPanel.add(helloButton);
        bottomPanel.add(readyButton);
        bottomPanel.add(pauseButton);

        frame.setSize(500, 500);
        frame.setTitle("JPanelTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(midPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
