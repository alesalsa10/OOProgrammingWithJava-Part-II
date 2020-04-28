/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

/**
 *
 * @author alesa
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ActionEventListener implements ActionListener {
    private JTextField origin;
    private JLabel destnation;
    
    public ActionEventListener(JTextField origin, JLabel destination){
        this.origin = origin;
        this.destnation = destination;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        this.destnation.setText(this.origin.getText());
        this.origin.setText("");
    }
}
