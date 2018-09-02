
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Square   extends Shapes{

    public Square() {
        pro=new HashMap();
        pro.put("SideLength",0.0);
        Color=Color.black;
        
        
    }

   
    @Override
    public void draw(Graphics canvas) {
    Graphics2D s = (Graphics2D) canvas;
    Rectangle2D r = new Rectangle2D.Double();
    r.setRect(Point.x ,Point.y, pro.get("SideLength"),pro.get("SideLength"));
    if(FColor!= null){s.setColor(FColor); s.fill(r);}
    s.setColor(Color);
    s.draw(r);
    
    
        


    }
    
}
