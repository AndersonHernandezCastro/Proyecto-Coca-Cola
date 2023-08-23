import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Terminos_Condiciones extends JFrame implements ChangeListener, ActionListener{

  private JLabel etiqueta1, etiqueta2;
  private JTextArea textarea;
  private JScrollPane scroll;
  private JButton boton1, boton2;
  private JCheckBox check1;
  String nombre = "";

  public Terminos_Condiciones(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Portada recuperar = new Portada();
    nombre = recuperar.texto;

    etiqueta1 = new JLabel("TERMINOS Y CONDICIONES");
    etiqueta1.setFont(new Font("Andale Mono", 3, 20));
    etiqueta1.setForeground(new Color(0,0,0));
    etiqueta1.setBounds(205,20,290,20); 
    add(etiqueta1);

    textarea = new JTextArea();
    textarea.setEditable(false);
    textarea.setFont(new Font("Andale Mono", 0, 11));
    textarea.setText("\n\n        TERMINOS Y CONDICIONES:" +     
                     "\n\n          A. PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE AAA.YUP." +
                     "\n          B. PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISENO DE LAS INTERFACES GRAFICAS." +
                     "\n          C. AAA.YUP NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                     "\n\n        LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                     "\n        (AAA.YUP Y EL AUTOR ANDERSON HERNANDEZ CASTRO) NO SE RESPONSABILIZAN DEL USO QUE USTED HAGA" +
                     "\n        CON ESTE SOFTWARE Y SUS SERVICIOS PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (Yo Acepto) SI" +
                     "\n        USTED NO ACEPTA ESTOS TERMINOS HAGA CLIC EN (No Acepto) Y NO UTILICE ESTE SOFTWARE.");
    scroll = new JScrollPane(textarea);
    scroll.setBounds(10,50,680,275);
    add(scroll);

    check1 = new JCheckBox("Yo " + nombre + " Acepto");
    check1.setBounds(15,420,250,20);
    check1.addChangeListener(this);
    add(check1);

    boton1 = new JButton("Continuar");
    boton1.setBounds(10,450,120,30);
    boton1.setEnabled(false);
    boton1.addActionListener(this);
    add(boton1);

    boton2 = new JButton("No Acepto");
    boton2.setBounds(140,450,120,30);
    boton2.addActionListener(this);
    add(boton2);

    ImageIcon et2 = new ImageIcon("images/Coca Cola.png");
    etiqueta2 = new JLabel(et2);
    etiqueta2.setBounds(300,370,380,120);
    add(etiqueta2);    
  }


  public void stateChanged(ChangeEvent e){
    if(check1.isSelected() == true){
      boton1.setEnabled(true);
      boton2.setEnabled(false);
    } else{
      boton1.setEnabled(false);
      boton2.setEnabled(true);      
    }
  }


  public void actionPerformed(ActionEvent ev){
    if(ev.getSource() == boton1){
      Principal ventanaPrincipal = new Principal();
      ventanaPrincipal.setBounds(0,0,800,700);
      ventanaPrincipal.setVisible(true);
      ventanaPrincipal.setResizable(false);
      ventanaPrincipal.setLocationRelativeTo(null);
      this.setVisible(false);
    }
    if(ev.getSource() == boton2){
      Portada ventanaPortada = new Portada();
      ventanaPortada.setBounds(0,0,425,520);
      ventanaPortada.setVisible(true);
      ventanaPortada.setResizable(false);
      ventanaPortada.setLocationRelativeTo(null); 
      this.setVisible(false);      
    }
  }


  public static void main(String args[]){
    Terminos_Condiciones ventanalicencia = new Terminos_Condiciones();
    ventanalicencia.setBounds(0,0,700,550);
    ventanalicencia.setVisible(true);
    ventanalicencia.setResizable(false);
    ventanalicencia.setLocationRelativeTo(null);
  }
}
