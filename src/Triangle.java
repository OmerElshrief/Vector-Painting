
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Triangle extends Shapes{
    public Triangle(){
        pro.put("Point1_X",0.0);
        pro.put("Point1_Y",0.0);
        pro.put("Point2_X",0.0);
        pro.put("Point2_Y",0.0);
        
    }
    

    @Override
    public void draw(Graphics canvas) {
        Polygon p = new Polygon();
        p.addPoint(Point.x,Point.y);
        p.addPoint((int) pro.get("Point1_X").intValue(), (int)pro.get("Point1_Y").intValue());
        p.addPoint((int) pro.get("Point2_X").intValue(), (int)pro.get("Point2_Y").intValue());
        Graphics2D g = (Graphics2D) canvas;
         if(FColor!= null){g.setColor(FColor); g.fill(p);}
        g.setColor(Color);
        g.drawPolygon(p);
        
    }



}
