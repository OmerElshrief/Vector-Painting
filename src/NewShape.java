

import static com.oracle.jrockit.jfr.ContentType.Class;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewShape extends Shapes {
Method method ;
Shape s;
Class NewClass;
 Object NewClassObj;
 Constructor NewClassConst;

    public NewShape(Class NewClass) {
       
        this.NewClass = NewClass;
       
    try {
        prepareObj();
    } catch (NoSuchMethodException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalArgumentException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InvocationTargetException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
private void prepareObj() throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
{
      NewClassConst = NewClass.getConstructor();
      NewClassObj = NewClassConst.newInstance();
}


    @Override
    public void draw(Graphics canvas) {
    try {
        Class[] x = new Class[1];
        x[0]= Graphics.class;
        method = NewClass.getMethod("draw",x);
        method.invoke(NewClassObj,canvas);
    } catch (NoSuchMethodException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SecurityException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalArgumentException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InvocationTargetException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
    
    
    
   

    @Override
    public void setPosition(Point position) {
    try {
        method = NewClass.getMethod("setPosition", Point.class);
        method.invoke(NewClassObj, position);
    } catch (NoSuchMethodException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SecurityException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalArgumentException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InvocationTargetException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    }
        

    }

    @Override
    public Point getPosition() {
    try {
        method = NewClass.getMethod("getPosition");
        
    } catch (NoSuchMethodException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SecurityException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    }

    try {
        return (Point) method.invoke(NewClassObj);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalArgumentException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InvocationTargetException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    }
return null;
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
    try {
        method = NewClass.getMethod("setProperties",Map.class);
        method.invoke(NewClassObj,properties);
    } catch (NoSuchMethodException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SecurityException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalArgumentException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InvocationTargetException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }

    @Override
    public Map<String, Double> getProperties() {
    try {
        method = NewClass.getMethod("getProperties");
    } catch (NoSuchMethodException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SecurityException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        return (Map<String, Double>) method.invoke(NewClassObj);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalArgumentException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InvocationTargetException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    }
return null;
    }

    @Override
    public void setColor(Color color) {
    try {
        method = NewClass.getMethod("setColor",Color.class);
        method.invoke(NewClassObj, color);
    } catch (NoSuchMethodException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SecurityException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalArgumentException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InvocationTargetException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    }
        

    }

    @Override
    public Color getColor() {
    try {
        method = NewClass.getMethod("getColor");
        return (Color) method.invoke(NewClassObj);
    } catch (NoSuchMethodException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SecurityException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalArgumentException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InvocationTargetException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
    }

    @Override
    public void setFillColor(Color color) {
        try {
        method = NewClass.getMethod("setFillColor",Color.class);
        method.invoke(NewClassObj, color);
    } catch (NoSuchMethodException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SecurityException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalArgumentException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InvocationTargetException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @Override
    public Color getFillColor() {
       try {
        method = NewClass.getMethod("getFillColor");
        return (Color) method.invoke(NewClassObj);
    } catch (NoSuchMethodException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SecurityException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalArgumentException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InvocationTargetException ex) {
        Logger.getLogger(NewShape.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
    }
    
}
