# Vector painting application
#__________________________________________________
#Description:-
Painting 1 is an application that performs Graphical Drawing for some supported shapes like Circle-Triangle-Rectangle-etc…
It’s coded in Java with NetBeans IDE,  It’s a Graphical user Interface .
Application Features:-
Painting 1 application Provides users with some nice features like:-
1- Drawing 2D Shapes Providing the GUI with the Properties (Ex: Radius, Side Length)
2- Colorizing the drawn shape  With a chosen color from Color chooser panel.
3- Editing the drawn shape.
4- Moving the drawn Shape.
5- Copying the Drawn Shape (Deep Copy).
6- Undo Function, where you can Undo a Drawn Shape or Removed Shape.
7- Redo Function.
8-Supported with Add External Plugin feature which allows the User to add new shapes to the application by loading external JAR File Containing the Shape Class
8- Flexible and use no memory.
9- Very simple to use.

# Design Overview:-
⦁	Let’s  consider a very Simple Design, Starting with 2 Main Interface (DrawingEngine.java & Shape.Java)
⦁	Then two main Classes (Shapes: Implementing Shape Interface , DrawingEngine2: Implementing DrawingEngine)
⦁	Shape Classes (Square , Circle , Triangle , Rectangle , Ellipse , Line Segment) That extends the Shapes Class.
⦁	NewPlugin Class  which is responsible for adding new Shapes to the application.
⦁	NewShape Class which is responsible for Attaching the new Shape to the application and working with it.


# Description for Some important Functions:-
### The Cloning method:-
In this method, Java Reflection is used to get the class name of the selected shape then creating a new instant of this class, Then assigning the new object properties with Selected shape -to be copied-properties, The add this new object to the array of shapes of the DrawingEngine.
Codes:-
//For getting the Class Name of the selected shape to be copied using reflection:
Class Type = Class.forName(shape.getClass().getSimpleName());
//Make an object of this Class of type Shapes wich implements the Interface Shape:
Shapes s = (Shapes) Type.getConstructor().newInstance();
//Assigning the new object properties with Selected shape Properties:
s.pro = new HashMap(shape.getProperties());
s.setColor(shape.getColor());
 s.setFillColor(shape.getFillColor());

### Add Plugin Function:-
In this Function Java reflection is used:
Method used is "URLClassLoader" , 
Constructor: URLClassLoader(URL[] urls) ,
First thing to do is to determine the File URL using FileChooser Now let's begin with the code:-
-
//Creat a list of URLS:
List URLS = new ArrayList();
//After we get the FILE Url from the file Chooser we append the URLS of the selected file to the ArrayList, but we need to convert it from FILE to URL:-
-
URLS.add(jFileChooser1.getSelectedFile().toURI().toURL());
-
//Now we need to Load the Jar file using URLClassLoader() :
-
URLClassLoader urlClassLoader = new URLClassLoader((URL[]) urls.toArray(new URL[urls.size()]));
Class simpleClass = urlClassLoader.loadClass("PackageName.ClassName");
-
//Now we need to instantiate the class (Creat an Object)
-
Constructor simpleConstructor = simpleClass.getConstructor();
Object simpleClassObj = simpleConstructor.newInstance();
UserManual:-
For Creating a Shape:

The user is asked to enter the Shape Properties like “Radius” for circle , “SideLength” for a square, Then the User will be asked to enter the Postion of the Shape (X,Y).

### Selecting a shape:
The user can select a shape to Edit/Move/Copy from the Compobox on the right,
Move:

The user is asked to enter the New position of the Selected Shape.

### Edit:
By selecting a Shape from the ComboBox , then clicking the Button “Edit” The user will be provided with a Dialog box to enter the new properties of the shape.

###Copy:-
Select a shape from ComboBox then Click Copy , the user will enter the new dimensions for the copied shape.
Add New Plugin:-
By clicking the Button “Add Plugin” the user will be provided with a Dialog box to enter the Class Name, then a Filechoose to search for the class, a new Button will be generated in the Buttons field named by the new Shape, then you can draw this shape by pressing this button.

###Undo:
By pressing “Undo” Button, the Latest move will be reversed, If you added a new shape it will be removed, and if you removed a shape it will be added again.
