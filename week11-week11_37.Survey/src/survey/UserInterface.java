package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200,300));
        
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents(Container container){
        BoxLayout  layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JLabel("Are you?"));
        
        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");
        
        container.add(no);
        container.add(yes);
        
        container.add(new JLabel("Why?"));
        JRadioButton noReason = new JRadioButton("No reason.");
        JRadioButton itsFun = new JRadioButton("Because it is fun!");
        
        ButtonGroup buttonGroup = new ButtonGroup();
        //used so i cant check 2 radio buttons
        buttonGroup.add(noReason);
        buttonGroup.add(itsFun);
        
        container.add(noReason);
        container.add(itsFun);
        
        JButton done = new JButton("Done!");
        container.add(done);
    }
    
    
    public JFrame getFrame() {
        return frame;
    }
}
