import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Portada extends JFrame implements ActionListener{

  private JLabel label1, label2, label3, label4;
  private JTextField textfield;
  private JButton boton;
  public static String texto = "";

  public Portada(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Bienvenido");
   getContentPane().setBackground(new Color(255,0,0));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

   ImageIcon imagen = new ImageIcon("images/Coca Cola.png");
   label1 = new JLabel(imagen);
   label1.setBounds(10,10,375,130);
   add(label1);

   label2 = new JLabel("Sistema de Control Vacacional");
   label2.setBounds(50,160,400,30);
   label2.setFont(new Font("Andale Mono", 3, 18));
   label2.setForeground(new Color(255,255,255));  
   add(label2);

   label3 = new JLabel("Ingrese su nombre:");
   label3.setBounds(50,240,200,20);
   label3.setFont(new Font("Arial", 1, 15));
   label3.setForeground(new Color(255,255,255));
   add(label3);

   label4 = new JLabel("2017 The Coca-Cola Company");
   label4.setBounds(130,450,200,30);
   label4.setFont(new Font("Andale Mono", 2, 13));
   label4.setForeground(new Color(255,255,255));
   add(label4);

   textfield = new JTextField();
   textfield.setBounds(20,270,300,30);
   textfield.setBackground(new Color(225,225,225));
   textfield.setFont(new Font("Arial", 0, 18));
   textfield.setForeground(new Color(255,0,0));
   add(textfield);

   boton = new JButton("Ingresar");
   boton.setBounds(120,310,120,40);
   boton.setFont(new Font("Andale Mono", 1, 20));
   boton.setForeground(new Color(255,0,0));
   add(boton);
   boton.addActionListener(this);
  }

 

  public void actionPerformed(ActionEvent ev){
    if(ev.getSource() == boton){
      texto = textfield.getText().trim();
      if(texto.equals("")){
        JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
      } else {
        Terminos_Condiciones ventanalicencia = new Terminos_Condiciones();
        ventanalicencia.setBounds(0,0,700,550);
        ventanalicencia.setVisible(true);
        ventanalicencia.setResizable(false);
        ventanalicencia.setLocationRelativeTo(null);
        this.setVisible(false);   
      }
    }
  }


  public static void main(String args[]){
    Portada ventanaPortada = new Portada();
    ventanaPortada.setBounds(0,0,425,520);
    ventanaPortada.setVisible(true);
    ventanaPortada.setResizable(false);
    ventanaPortada.setLocationRelativeTo(null); 
  } 
}