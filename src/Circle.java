
import java.awt.*;
import java.awt.geom.*;
import java.util.HashMap;
import java.util.Map;

public class Circle extends Shapes {
  
    public Circle(){
    
     pro=new HashMap();
     pro.put("Radius",0.0);
     //Color=Color.black;
   }
    
  

   
    @Override
    public void draw(Graphics canvas) {
    Ellipse2D E = new Ellipse2D.Double();
    E.setFrame(Point.x , Point.y , pro.get("Radius"),pro.get("Radius"));
    Graphics2D g = (Graphics2D) canvas;
    g.setColor(Color);
    g.draw(E);
     if(FColor!= null){g.setColor(FColor); g.fill(E);}
       
        
                
        
       
        
    }

}
