
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.HashMap;


public  class Rectangle extends Shapes{

    public Rectangle() {
        pro=new HashMap();
        pro.put("Side Length",0.0);
        pro.put("Side Wedth",0.0);
        Color=Color.black;
        
    }
    @Override
    public void draw(Graphics canvas)
    {
    Graphics2D s = (Graphics2D) canvas;
    Rectangle2D r = new Rectangle2D.Double();
    System.out.println("Heeeey " + pro);
    r.setRect(Point.x ,Point.y, pro.get("Side Length"),pro.get("Side Wedth"));
    s.setFont(new Font("TimesRoman", Font.BOLD, 20)); 
    s.setColor(Color);
    s.draw(r);
    
   if(FColor!= null){s.setColor(FColor); s.fill(r);}
    
    
    }
    
    
}
