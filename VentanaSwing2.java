package ico.fes;

 import java.awt.FlowLayout;
 import javax.swing.JFrame;
 import javax.swing.JLabel;

 public class VentanaSwing2 extends JFrame {
  
    JLabel etiqueta1;
    
    public VentanaSwing2(){
     super("Ventana swing");
     getContentPane().setLayout(new FlowLayout());
     etiqueta1 = new JLabel("Grados C.");
     getContentPase().add(etiqueta1);
     addWindowListener(new MainWinAdaptador());
     pack();
     setVisible(true);
     setSize(400,300);
     }
   
    public static void main (String [] args){
         VentanaSwing v = new VentanaSwing();
    }







}