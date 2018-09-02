
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cina marCina
 */
public class NewPlugin {

    Class NewClass;
    URLClassLoader GetClass;
    Object NewClassObj;
    Method method ;
    Constructor NewClassConst;
    public NewPlugin(URL url, String className) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List urls = new ArrayList();

        urls.add(url);
        System.err.println("File loaded");
        GetClass = new URLClassLoader((URL[]) urls.toArray(new URL[urls.size()]));
        NewClass = GetClass.loadClass(className);
        
      }        
public Shape GetObject() throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
{
     NewClassConst = NewClass.getConstructor();
         NewClassObj = NewClassConst.newInstance();
         method = NewClass.getMethod("hey");
        method.invoke(NewClassObj);
        return (Shape) NewClassObj;
}
        

    }
    


