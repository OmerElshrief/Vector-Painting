
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cina marCina
 */
public class  Ellipse extends Shapes {

    public Ellipse() {
        pro.put("Length",0.0);
        pro.put("Wedth",0.0);
        Color=Color.black;
        
    }

   
    
    @Override
    public void draw(Graphics canvas) {
    Ellipse2D E = new Ellipse2D.Double();
    E.setFrame(Point.x , Point.y , 2*pro.get("Length"),2*pro.get("Wedth"));
    Graphics2D g = (Graphics2D) canvas;
    g.setColor(Color);
    g.draw(E); 
     if(FColor!= null){g.setColor(FColor); g.fill(E);}
    
    
    }
    
}
