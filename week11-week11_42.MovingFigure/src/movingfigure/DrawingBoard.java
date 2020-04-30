/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

/**
 *
 * @author alesa
 */

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {
    private Figure obj;
    
    public DrawingBoard(Figure obj) {
        this.obj = obj;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.obj.draw(g);
    }
}
