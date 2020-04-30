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

public class Square extends Figure {
    private int length;
    
    public Square(int x, int y, int sideLength) {
        super(x,y);
        this.length = sideLength;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(this.getX(), this.getY(), length, length);
    }  
}
