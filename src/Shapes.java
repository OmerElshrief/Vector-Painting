
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cina marCina
 */
public abstract class Shapes implements Shape  {

    protected java.awt.Point Point = new Point();
    protected Map<String, Double> pro = new HashMap();
    public Color Color;
    protected Color FColor = null;

    public Shapes() {
        
    }
    
   

    @Override
    public void setPosition(Point position) {
        Point.x = position.x;
        Point.y = position.y;

    }

    @Override
    public Point getPosition() {
        Point p = new Point();
        p.x = Point.x;
        p.y = Point.y;

        return p;

    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        pro = properties;
    }

    @Override
    public Map<String, Double> getProperties() {

        return pro;

    }

    @Override
    public void setColor(Color color) {
        Color = color;

    }

    @Override
    public Color getColor() {
        return Color;
    }

    @Override
    public void setFillColor(Color color) {
        FColor = color;
    }

    @Override
    public Color getFillColor() {
        return FColor;
    }
    public abstract void draw(Graphics canvas);
    
            public Object clone()throws CloneNotSupportedException{ 
                return null;

} 
    
    
}
