
import com.sun.javafx.image.impl.IntArgb;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ItemListener;
import java.awt.geom.Ellipse2D;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collection;

import java.util.HashMap;
import java.util.HashMap.*;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;
import static javax.swing.text.html.HTML.Tag.MAP;
import sun.security.pkcs11.wrapper.Functions;


public class Main extends javax.swing.JFrame 
{
 static int k = 0;
    class Panal extends JPanel
{
     @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        paint(g);
    }
}
    
    int i = 1,j=0;
    int index;
    Map m = new HashMap();
    Point p = new Point();
    Shapes shape;
    private Shape[] functions = new Shape[20] ;
    List  Functions = new ArrayList();
    DrawingEngine2 E = new DrawingEngine2();
    List Buttons = new ArrayList();
    Shapes temp;
    Class NewClass =null;
    NewShape newshape;
     NewPlugin n ;
                 
       public class MyCanvas extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paint(g);
    }

}
    
    
    public Main()throws Exception {
        initComponents();
    
    MyCanvas canvas = new MyCanvas();
    
       
       
    
        
         jDialog1.setLocationRelativeTo(null);
          this.setLocationRelativeTo(null);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jDialog2.setSize(425,350);
        jDialog2.setLocationRelativeTo(null);
        jDialog3.setSize(220,220);
        jDialog3.setLocationRelativeTo(null);
        jDialog4.setSize(200,200);
        jDialog4.setLocationRelativeTo(null);
        jDialog5.setSize(940,370);
        jDialog5.setLocationRelativeTo(null);
        jDialog7.setSize(225,170);
        jDialog7.setLocationRelativeTo(null);
        jDialog6.setSize(350,150);
        jDialog6.setLocationRelativeTo(null);
        jButton17.setVisible(false);
       
       
        }
void forDrawing()
{
JPanel jPanel4 = new JPanel();
jPanel4= this.canvas;

remove(this.canvas);
add(jPanel4);

}
   
    public void set(Shape shape)
    {
        m = shape.getProperties();
        jLabel3.setText(m.keySet().toArray()[0].toString());
        jDialog1.show();
         
        
    }
    void select(int index)
    {
Color c ;
E.refresh(canvas.getGraphics());
c=E.s[index].getColor();        
E.s[index].setColor(Color.yellow);
E.refresh(canvas.getGraphics());
E.s[index].setColor(c);
System.out.println(index);
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jFileChooser1 = new javax.swing.JFileChooser();
        jDialog2 = new javax.swing.JDialog();
        jButton15 = new javax.swing.JButton();
        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel2 = new javax.swing.JLabel();
        jDialog3 = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jDialog4 = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jDialog5 = new javax.swing.JDialog();
        jButton21 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jColorChooser2 = new javax.swing.JColorChooser();
        jPanel8 = new javax.swing.JPanel();
        jColorChooser3 = new javax.swing.JColorChooser();
        jDialog7 = new javax.swing.JDialog();
        jButton22 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jDialog6 = new javax.swing.JDialog();
        jButton23 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        canvas = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setTitle("Set Properties");
        jDialog1.setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        jDialog1.setResizable(false);
        jDialog1.setSize(new java.awt.Dimension(280, 210));
        jDialog1.setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Set Shape Properties"));

        jLabel3.setText("jLabel7");

        jLabel4.setText("X-Axis");

        jLabel5.setText("Y-Axis");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton9.setText("Submit");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton8.setText("Submit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9)
                    .addComponent(jButton8)))
        );

        jFileChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        jDialog2.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog2.setTitle("Drawing Color Chooser");

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton15.setText("Submit");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jDialog2.getContentPane().add(jButton15, java.awt.BorderLayout.PAGE_END);
        jDialog2.getContentPane().add(jColorChooser1, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setLabelFor(this);
        jLabel2.setText("Selec Drawing Color:");
        jDialog2.getContentPane().add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("New Point"));

        jLabel6.setText("Set New-X");

        jLabel7.setText("Set New-Y");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton19.setText("Move to the new Point");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDialog3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton19)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDialog4.setTitle("Edit Dialog");
        jDialog4.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jDialog4WindowOpened(evt);
            }
        });

        jLabel8.setText("jLabel8");

        jButton20.setText("Submit");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jButton20))
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jDialog5.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog5.setTitle("Colorize");

        jButton21.setText("Submit");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Set outLine Color:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jColorChooser2.setToolTipText("Choose Outline COLOR");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jColorChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jColorChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Set Fill Color:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jColorChooser3.setToolTipText("Choose Fill COLOR");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jColorChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jColorChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320))
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton22.setText("Copy");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jLabel9.setText("X-Axis");

        jLabel10.setText("Y-Axis");

        javax.swing.GroupLayout jDialog7Layout = new javax.swing.GroupLayout(jDialog7.getContentPane());
        jDialog7.getContentPane().setLayout(jDialog7Layout);
        jDialog7Layout.setHorizontalGroup(
            jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog7Layout.createSequentialGroup()
                .addGroup(jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog7Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDialog7Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(64, 64, 64)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDialog7Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(64, 64, 64)
                                .addComponent(jTextField7))))
                    .addGroup(jDialog7Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jDialog7Layout.setVerticalGroup(
            jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog7Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton22)
                .addContainerGap())
        );

        jButton23.setText("Submit");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel11.setText("Please Enter (Plugin) Class Name:");

        jLabel12.setText("PLease Enter Package Name");

        javax.swing.GroupLayout jDialog6Layout = new javax.swing.GroupLayout(jDialog6.getContentPane());
        jDialog6.getContentPane().setLayout(jDialog6Layout);
        jDialog6Layout.setHorizontalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog6Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jButton23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDialog6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10)
                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDialog6Layout.setVerticalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton23)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setName("Painting"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setText("Undo");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 93, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 159, 120, -1));

        jLabel1.setText("Select Shape");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 159, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 832, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 131, 212, 10));

        jButton17.setText("jButton25");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17);

        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setLabel("Circle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setLabel("Elipse");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setLabel("Rectangle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setLabel("LineSegment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton16.setText("Triangle");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16);

        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setLabel("Square");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 60));

        jButton11.setText("Edit");
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setEnabled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Copy");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setEnabled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton10.setText("Delete");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setEnabled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton14.setText("Move");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setEnabled(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton13.setText("Colorize");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setEnabled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton24.setText("Refresh");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton24)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton13))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton14))
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton24)
                .addContainerGap())
        );

        jButton11.getAccessibleContext().setAccessibleParent(jPanel3);
        jButton12.getAccessibleContext().setAccessibleParent(jPanel3);
        jButton10.getAccessibleContext().setAccessibleParent(jPanel3);
        jButton14.getAccessibleContext().setAccessibleParent(jPanel3);
        jButton13.getAccessibleContext().setAccessibleParent(jPanel3);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 220, 220));

        jButton6.setText("Redo");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 90, -1));
        jButton6.getAccessibleContext().setAccessibleParent(jPanel3);

        canvas.setBackground(new java.awt.Color(255, 255, 255));
        canvas.setFont(new java.awt.Font("AR BLANCA", 1, 14)); // NOI18N
        canvas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(canvas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 620, 300));

        jButton18.setText("Add External Shape");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       set(shape = new Rectangle());
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       set( shape = new Circle());
        


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
index = jComboBox1.getSelectedIndex();
if(index >=0)
{Color c ;
jButton10.setEnabled(true);
        jButton11.setEnabled(true);
            jButton12.setEnabled(true);
                jButton13.setEnabled(true);
                    jButton14.setEnabled(true);
E.refresh(canvas.getGraphics());
c=E.s[index].getColor();        
E.s[index].setColor(Color.GREEN);
E.refresh(canvas.getGraphics());
E.s[index].setColor(c);
System.out.println(index);}
else
{
    jButton10.setEnabled(false);
        jButton11.setEnabled(false);
            jButton12.setEnabled(false);
                jButton13.setEnabled(false);
                    jButton14.setEnabled(false);


}





        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        p.x = (int) Double.parseDouble(jTextField2.getText());
        p.y = (int) Double.parseDouble(jTextField3.getText());
        shape.setProperties(m);
        shape.setPosition(p);
        
       
        jLabel3.setVisible(true);
        jTextField1.setVisible(true);
        jButton9.setVisible(true);
        jButton8.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        i=1;
       
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jDialog2.show();
        jDialog1.dispose();
        

        


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        m.put(m.keySet().toArray()[i - 1].toString(), Double.parseDouble(jTextField1.getText()));

        if (i < m.size()) {
            jLabel3.setText(m.keySet().toArray()[i].toString());

            i++;
        } else {
            jLabel3.setVisible(false);
            jTextField1.setVisible(false);
            jButton9.setVisible(false);
            jButton8.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            i++;
        }
         jTextField1.setText("");
         jTextField2.setText("");
         jTextField3.setText("");
         
         
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        set(shape = new Square());
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       set(shape =  new LineSegment());
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        set(shape = new Ellipse());
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        E.redo();
        jComboBox1.setModel(new DefaultComboBoxModel(E.ALL.toArray()));
        canvas.paintComponents(canvas.getGraphics());
        canvas.paint(canvas.getGraphics());
        E.refresh(canvas.getGraphics());
        jComboBox1.setModel(new DefaultComboBoxModel(E.ALL.toArray()));

        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      
        E.removeShape((Shape) E.ALL.get(index));
         
      //jPanel4.repaint();
      canvas.paintComponents(canvas.getGraphics());       
      canvas.paintComponents(canvas.getGraphics());
      canvas.paint(canvas.getGraphics());
      
      E.refresh(canvas.getGraphics());
      jComboBox1.setModel(new DefaultComboBoxModel(E.ALL.toArray()));
      
      if(E.ALL.isEmpty())
      {  jButton10.setEnabled(false);
        jButton11.setEnabled(false);
            jButton12.setEnabled(false);
                jButton13.setEnabled(false);
                    jButton14.setEnabled(false);}
      E.refresh(canvas.getGraphics());
      
      
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
shape=(Shapes)E.ALL.get(index);    
m=shape.getProperties();
jLabel8.setText(m.keySet().toArray()[0].toString());
i=1;
jDialog4.show();


    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        
        shape.setColor((Color) jColorChooser1.getColor());
            
        
        E.addShape(shape);
        
        E.refresh(canvas.getGraphics());
        jComboBox1.setModel(new DefaultComboBoxModel(E.ALL.toArray()));
        jDialog2.dispose();
        
        

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       set(shape = new Triangle());
      
       
       
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
      jDialog6.show();
       
  
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       

E.undo();
jComboBox1.setModel(new DefaultComboBoxModel(E.ALL.toArray()));
canvas.paintComponents(canvas.getGraphics());
canvas.paint(canvas.getGraphics());
E.refresh(canvas.getGraphics());

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
     //E.AddUndo();
     p.x=Integer.parseInt(jTextField4.getText());
     p.y=Integer.parseInt(jTextField5.getText());
     shape= (Shapes) E.ALL.get(index);
     shape.setPosition(p);
     //E.ALL.toArray()[index] = shape;
        
   
     canvas.paintComponents(canvas.getGraphics());
     canvas.paint(canvas.getGraphics());
              
     E.refresh(canvas.getGraphics());
        
     jDialog3.dispose();
        System.out.println("Printed");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
jDialog3.show();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
     
        m.put(m.keySet().toArray()[i - 1].toString(), Double.parseDouble(jTextField6.getText()));

        if (i < m.size()) {
           jLabel8.setText(m.keySet().toArray()[i].toString());
           
           i++;
        }
        else
        {// E.AddUndo();
            shape.setProperties(m);
        canvas.paintComponents(canvas.getGraphics());
        canvas.paint(canvas.getGraphics());

        E.refresh(canvas.getGraphics());
                i=1;
        jDialog4.dispose();}
        
        
        
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jDialog4WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog4WindowOpened
        jTextField6.setText(String.valueOf(m.get(m.keySet().toArray()[0].toString())));
        jLabel8.setText(m.keySet().toArray()[0].toString());
        i=1;
        
    }//GEN-LAST:event_jDialog4WindowOpened

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
      shape =  (Shapes) E.ALL.get(index);
      jDialog7.show();
      
      
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        shape =  (Shapes) E.ALL.get(index);
        jDialog5.show();
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
     // E.AddUndo();
        shape.setColor(jColorChooser2.getColor());
        shape.setFillColor(jColorChooser3.getColor());
        E.refresh(canvas.getGraphics());
        jDialog5.dispose();
        
        
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
     try {
         Class Type = Class.forName(shape.getClass().getSimpleName());
         Shapes s = (Shapes) Type.getConstructor().newInstance();
         s.Point.x=(int) Double.parseDouble(jTextField7.getText());
       s.Point.y=(int) Double.parseDouble(jTextField8.getText());
              s.pro = new HashMap(shape.getProperties());
           
       s.setColor(shape.getColor());
       s.setFillColor(shape.getFillColor());
       
      
         System.out.println(s.getPosition()+ " "+ s.getProperties());
       
       E.addShape(s);
       E.refresh(canvas.getGraphics());
       jComboBox1.setModel(new DefaultComboBoxModel(E.ALL.toArray()));
       jDialog7.dispose();
     
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
     } catch (NoSuchMethodException ex) {
         Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
     } catch (SecurityException ex) {
         Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
     } catch (InstantiationException ex) {
         Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IllegalAccessException ex) {
         Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IllegalArgumentException ex) {
         Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
     } catch (InvocationTargetException ex) {
         Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        
    
       
       
       
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        jFileChooser1.showOpenDialog(null);
        jDialog6.dispose();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
E.refresh(canvas.getGraphics());

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
     
         
         List urls = new ArrayList();
         
         try {
         urls.add(jFileChooser1.getSelectedFile().toURI().toURL());
         } catch (MalformedURLException ex) {
         Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         URLClassLoader urlClassLoader = new URLClassLoader((URL[]) urls.toArray(new URL[urls.size()]));
         try {
         NewClass= urlClassLoader.loadClass(jTextField10.getText() + "." + jTextField9.getText());
         } catch (ClassNotFoundException ex) {
         Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
         }
         //       NewPlugin n = new NewPlugin(jFileChooser1.getSelectedFile().toURI().toURL(),jTextField10.getText() + "." + jTextField9.getText());
     
       E.installPluginShape(NewClass);
       jButton17.setText(jTextField9.getText());
        jButton17.setVisible(true);
        
       
                            
 
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        newshape = new NewShape(NewClass);
        set(shape = (Shapes)newshape);
     
       
    }//GEN-LAST:event_jButton17ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel canvas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JColorChooser jColorChooser3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JDialog jDialog7;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
