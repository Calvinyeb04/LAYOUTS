import javax.swing.*;
import java.awt.*;
import java.util.*;

public class RPS_DEMO_LAYout_only extends JFrame{
    static JPanel TopPnl;
    static JPanel StatsPnl;
    static JPanel MidPnl;
    static JPanel ButtomPnl;
    static JScrollPane ScrollPane;

    public static void main(String[] args)
    {
        JFrame Frame = new JFrame();
        JPanel Panel = new JPanel();
        JButton Buttoms = new JButton();

        //Panels//
        TopPnl = new JPanel();
        MidPnl = new JPanel();
        ButtomPnl = new JPanel();
        StatsPnl = new JPanel();
        ScrollPane = new JScrollPane();

        //Buttoms//
        JButton ROCKBTM = new JButton("ROCK");
        JButton PaperBTM = new JButton("Paper");
        JButton SciccorsBTM = new JButton("Sicciors");
        JButton QUITBTM = new JButton("QUIT");

        //Adding Buttoms to Panels//
        TopPnl.add(ROCKBTM);
        TopPnl.add(PaperBTM);
        TopPnl.add(SciccorsBTM);
        TopPnl.add(QUITBTM);

        Frame.setSize(500,500);
        Frame.setTitle("RPS LAYOUT");
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //PANELS POSTIONS//
        Frame.add(TopPnl, BorderLayout.NORTH);
        Frame.add(MidPnl,BorderLayout.CENTER);
        Frame.add(StatsPnl,BorderLayout.WEST);
        Frame.add(ButtomPnl, BorderLayout.SOUTH);

        ResultPanel();
        Stats();

        Frame.setVisible(true);
    }

    public static void ResultPanel()
    {
        JTextArea ResultsArea = new JTextArea();
        ResultsArea.setFont(new Font("Arial", Font.PLAIN,14));
        ScrollPane = new JScrollPane(ResultsArea);
        //Rezing the TextArea//
        ResultsArea.setPreferredSize(new Dimension(300, 200));
        MidPnl.add(ScrollPane);
    }


    public static void Stats()
    {
        ImageIcon Wins = new ImageIcon("src/WIN.jpeg");
        Image scaledImage = Wins.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(scaledImage);

        JLabel imageLabel = new JLabel(ScaledIcon);
        StatsPnl.add(imageLabel);




    }
}
