
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.HashMap;
import javafx.scene.shape.Line;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class LineSegment extends Shapes {

    public LineSegment() {
      
        pro.put("X-Coordinates", 0.0);
        pro.put("Y-Coordinates", 0.0);
        Color=Color.black;
        
        
    }

   
    
    @Override
    public void draw(Graphics canvas) 
    {
    Line2D E = new Line2D.Double(Point.x , Point.y , pro.get("X-Coordinates"),pro.get("Y-Coordinates"));
   //E.setLine(Point.x , Point.y , (int)pro.get("X-Coordinates").intValue(),(int)pro.get("Y-Coordinates").intValue());
    Graphics2D g = (Graphics2D) canvas;
     g.setColor(Color);
   
   
    g.draw(E);
    
    }
    
}
