
import java.awt.Graphics;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.effect.Reflection;
import javax.sound.midi.SysexMessage;

 

/**
 *
 * @author Cina marCina
 */
public class DrawingEngine2 implements DrawingEngine {
    static List<Shape> ALL = new ArrayList<Shape>();
    Shape[] s;
    List SupportedShapes = new ArrayList<Shapes>();
    List[] UndoList = new ArrayList[20];
    List[] RedoList = new ArrayList[20];
    int u = 0 , i=0 , j=0;
   

    @Override
    public void addShape(Shape shape) {
      
       AddUndo();
        ALL.add(shape);
        
       // Undo.push((Shapes) shape);
        u=0;
        
        
        
    }

    @Override
    public void removeShape(Shape shape) {
              
    AddUndo();
        ALL.remove(shape);
        
        System.out.println("Shape Removed");
        
    }

    @Override
    public Shape[] getShapes() {
     s=new Shapes[ALL.size()];
       
        return (Shapes[]) ALL.toArray(s);
    }
    

    @Override
    public void refresh(Graphics canvas) {
      
            
        Shape[] SS = new Shapes [ALL.size()];
      
        SS=getShapes();
        for(int i=0 ; i<ALL.size() ; i++)
        { SS[i].draw(canvas);
          
                  
          
            
        }
    }

    @Override
    public List<Class<? extends Shape>> getSupportedShapes() {
        return SupportedShapes; 


    }

    @Override
    public void installPluginShape(Class<? extends Shape> shapeClass) {
        SupportedShapes.add(shapeClass);
        
    }

    @Override
    public void undo() throws ArrayIndexOutOfBoundsException {
            RedoList[j] = new ArrayList(ALL); 
           ALL = new ArrayList(UndoList[i-1]);
        System.out.println("Undone" + ALL + ALL.size());
        i--; j++;
          }  
        
        
       
        
    

    @Override
    public void redo()throws ArrayIndexOutOfBoundsException {
        
       ALL = new ArrayList(RedoList[j-1]);
       j--;
    
}
public void AddUndo()
{
   if(i==20)
   for(int k = 19 ; k>=0 ; k--) UndoList[k-1] = new ArrayList(UndoList[k]);
   UndoList[i] = new ArrayList(ALL);
   i++;
       
       
   }
    
}

