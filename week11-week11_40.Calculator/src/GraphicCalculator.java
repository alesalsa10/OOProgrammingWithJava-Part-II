
import java.awt.Container;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private int result;

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
        
        JTextField textInput = new JTextField("");
        container.add(textInput);
        
        JPanel panel = new JPanel(new GridLayout(1,3));
        
        JButton plus = new JButton("+");
        panel.add(plus);
        
        JButton minus = new JButton("-");
        panel.add(minus);
        
        JButton reset = new JButton("Z");
        panel.add(reset);
        
        
        container.add(panel);
        
        EventListener handler = new EventListener(plus, minus, reset, textOutput, textInput);
        
        plus.addActionListener(handler);
        minus.addActionListener(handler);
        reset.addActionListener(handler);
        reset.setEnabled(false);
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
