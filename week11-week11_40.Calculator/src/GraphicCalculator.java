
import java.awt.Container;
//import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300,150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        
        JTextField textOutput = new JTextField("0");
        textOutput.setEnabled(false);
        container.add(textOutput);
        
        JTextField textInput = new JTextField("0");
        container.add(textInput);
        
        JPanel panel = new JPanel(new GridLayout(1,3));
        panel.add(new JButton("+"));
        panel.add(new JButton("-"));
        panel.add(new JButton("Z"));
        container.add(panel, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
