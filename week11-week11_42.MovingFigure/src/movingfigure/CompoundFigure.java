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
import java.util.ArrayList;
import java.util.List;

public class CompoundFigure extends Figure{
    private List<Figure> lists ;

    public CompoundFigure() {
        super(0, 0);
        this.lists = new ArrayList<Figure>();
    }

    public void add(Figure f) {
        this.lists.add(f);
    }

    @Override
    public void draw(Graphics graphics) {
        for(Figure f: this.lists) {
            f.draw(graphics);
        }
    }
    
    public void move(int dx, int dy) {
        for(Figure f: this.lists) {
            f.move(dx, dy);
        }
    }
}
