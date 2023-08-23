import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Principal extends JFrame implements ActionListener{

  private JLabel et1, et2, et3, et4, et5, et6, et7, et8, et9, et10;
  private JMenuBar menubar;
  private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
  private JMenuItem rojo, negro, morado, nuevo, salir, vacaciones, creador;
  private JTextField field1, field2, field3;
  private JComboBox combo1, combo2;
  private JTextArea area;
  private JScrollPane scroll;
  String nombreP = "";  

  public Principal(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Pantalla Principal");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    getContentPane().setBackground(new Color(255,0,0));
    Terminos_Condiciones recuperar = new Terminos_Condiciones();
    nombreP = recuperar.nombre;

    menubar = new JMenuBar();
    menubar.setBackground(new Color(255,0,0));
    setJMenuBar(menubar);

    menuOpciones = new JMenu("Opciones");
    menuOpciones.setBackground(new Color(255,0,0));
    menuOpciones.setFont(new Font("Arial", 0, 20));
    menuOpciones.setForeground(new Color(255,255,255));
    menubar.add(menuOpciones);

    menuColorFondo = new JMenu("Color de Fondo");
    menuColorFondo.setFont(new Font("Andale Mono", 0, 19));
    menuColorFondo.setForeground(new Color(255,0,0));
    menuOpciones.add(menuColorFondo);

    rojo = new JMenuItem("Rojo");
    rojo.setFont(new Font("Andale Mono", 0, 19));
    rojo.setForeground(new Color(255,0,0));
    menuColorFondo.add(rojo);
    rojo.addActionListener(this);

    negro = new JMenuItem("Negro");
    negro.setFont(new Font("Andale Mono", 0, 19));
    negro.setForeground(new Color(255,0,0));
    menuColorFondo.add(negro);
    negro.addActionListener(this);

    morado = new JMenuItem("Morado");
    morado.setFont(new Font("Andale Mono", 0, 19));
    morado.setForeground(new Color(255,0,0));
    menuColorFondo.add(morado);
    morado.addActionListener(this);

    nuevo = new JMenuItem("Nuevo");
    nuevo.setFont(new Font("Andale Mono", 0, 20));
    nuevo.setForeground(new Color(255,0,0));
    menuOpciones.add(nuevo);
    nuevo.addActionListener(this);

    salir = new JMenuItem("Salir");
    salir.setFont(new Font("Andale Mono", 0, 19));
    salir.setForeground(new Color(255,0,0));
    menuOpciones.add(salir);
    salir.addActionListener(this);

    menuCalcular = new JMenu("Calcular");
    menuCalcular.setBackground(new Color(255,0,0));
    menuCalcular.setFont(new Font("Andale Mono", 0, 20));
    menuCalcular.setForeground(new Color(255,255,255));
    menubar.add(menuCalcular);

    vacaciones = new JMenuItem("Vacaciones");
    vacaciones.setFont(new Font("Andale Mono", 0, 19));
    vacaciones.setForeground(new Color(255,0,0));
    menuCalcular.add(vacaciones);
    vacaciones.addActionListener(this);
   
    menuAcercaDe = new JMenu("Acerca De");
    menuAcercaDe.setBackground(new Color(255,0,0));
    menuAcercaDe.setFont(new Font("Andale Mono", 0, 20));
    menuAcercaDe.setForeground(new Color(255,255,255));
    menubar.add(menuAcercaDe);
    
    creador = new JMenuItem("El Creador");
    creador.setFont(new Font("Andale Mono", 0, 19));
    creador.setForeground(new Color(255,0,0));
    menuAcercaDe.add(creador);
    creador.addActionListener(this);



    ImageIcon imagen = new ImageIcon("images/Coca Cola.png");
    et1 = new JLabel(imagen);
    et1.setBounds(10,20,400,170);
    add(et1);

    et2 = new JLabel("Bienvenido " + nombreP);
    et2.setBounds(475,75,500,50);
    et2.setFont(new Font("Andale Mono", 1, 30));
    et2.setForeground(new Color(255,255,255));
    add(et2);

    et3 = new JLabel("Datos del Trabajador para el Calculo de Vacaciones");
    et3.setBounds(30,190,720,40);
    et3.setFont(new Font("Andale Mono", 0, 30));
    et3.setForeground(new Color(255,255,255));
    add(et3);

    et4 = new JLabel("Nombre completo:");
    et4.setBounds(20,260,140,19);
    et4.setFont(new Font("Andale Mono", 0, 16));
    et4.setForeground(new Color(255,255,255));
    add(et4);

    field1 = new JTextField();
    field1.setBounds(20,290,200,30);
    field1.setBackground(new Color(255,255,255));
    field1.setFont(new Font("Andale Mono", 1, 16));
    field1.setForeground(new Color(255,0,0));
    add(field1);

    et5 = new JLabel("Primer Apellido:");
    et5.setBounds(20,350,140,19);
    et5.setFont(new Font("Andale Mono", 0, 16));
    et5.setForeground(new Color(255,255,255));
    add(et5); 

    field2 = new JTextField();
    field2.setBounds(20,380,200,30);   
    field2.setBackground(new Color(255,255,255));
    field2.setFont(new Font("Andale Mono", 1, 16));
    field2.setForeground(new Color(255,0,0));
    add(field2);

    et6 = new JLabel("Segundo Apellido:");
    et6.setBounds(20,440,140,19);
    et6.setFont(new Font("Andale Mono", 0, 16));
    et6.setForeground(new Color(255,255,255));
    add(et6);

    field3 = new JTextField();
    field3.setBounds(20,470,200,30);
    field3.setBackground(new Color(255,255,255));   
    field3.setFont(new Font("Andale Mono", 1, 16));
    field3.setForeground(new Color(255,0,0));
    add(field3);

    et7 = new JLabel("Selecciona el Departamento");
    et7.setBounds(275,260,300,19);
    et7.setFont(new Font("Andale Mono", 0, 16));
    et7.setForeground(new Color(255,255,255));
    add(et7);

    combo1 = new JComboBox();
    combo1.setBounds(275,290,300,30);
    combo1.setBackground(new Color(255,255,255));
    combo1.setFont(new Font("Andale Mono", 1, 16));
    combo1.setForeground(new Color(255,0,0));
    add(combo1);
    combo1.addItem("");
    combo1.addItem("Atencion al Cliente");
    combo1.addItem("Departamento de Logistica");
    combo1.addItem("Departamento de Gerencia");

    et8 = new JLabel("Selecciona la Antiguedad:");
    et8.setBounds(275,350,300,19);
    et8.setFont(new Font("Andale Mono", 0, 16));
    et8.setForeground(new Color(255,255,255));
    add(et8);

    combo2 = new JComboBox();
    combo2.setBounds(275,380,300,30);
    combo2.setBackground(new Color(255,255,255));
    combo2.setFont(new Font("Andale Mono", 1, 16));
    combo2.setForeground(new Color(255,0,0));
    add(combo2);
    combo2.addItem("");
    combo2.addItem("1 ano de servicio");
    combo2.addItem("2 a 6 anos de servicio");
    combo2.addItem("7 o mas anos de servicio");

    et9 = new JLabel("Resultado del Calculo:");
    et9.setBounds(275,440,300,19);
    et9.setFont(new Font("Andale Mono", 0, 16));
    et9.setForeground(new Color(255,255,255));
    add(et9);

    area = new JTextArea("\n\nAqui aparece el resultado del calculo de vacaciones");
    area.setEditable(false);
    area.setBackground(new Color(255,255,255));   
    area.setFont(new Font("Andale Mono", 1, 16));
    area.setForeground(new Color(255,0,0));
    scroll = new JScrollPane(area);
    scroll.setBounds(275,470,500,100);
    add(scroll);

    et10 = new JLabel("@2021 The Coca-Cola Company | Todos los derechos reservados");
    et10.setBounds(120,600,550,20);
    et10.setFont(new Font("Andale Mono", 1, 16));
    et10.setForeground(new Color(255,255,255));
    add(et10);
  }



  public void actionPerformed(ActionEvent ev){
    if(ev.getSource() == rojo){ 
      getContentPane().setBackground(new Color(255,0,0));
      menubar.setBackground(new Color(255,0,0));
    }


    if(ev.getSource() == negro){
      getContentPane().setBackground(new Color(0,0,0));
      menubar.setBackground(new Color(0,0,0));
    }

    if(ev.getSource() == morado){
      getContentPane().setBackground(new Color(255,0,255));
      menubar.setBackground(new Color(255,0,255));
    }


    if(ev.getSource() == nuevo){
      field1.setText("");
      field2.setText(""); 
      field3.setText("");
      area.setText("\n\nAqui aparece el resultado del calculo de vacaciones");
    }


    if(ev.getSource() == salir){
      Terminos_Condiciones ventanalicencia = new Terminos_Condiciones();
      ventanalicencia.setBounds(0,0,700,550);
      ventanalicencia.setVisible(true);
      ventanalicencia.setResizable(false);
      ventanalicencia.setLocationRelativeTo(null);
      this.setVisible(false);
    }


    if(ev.getSource() == vacaciones){
      String nombrecompleto = field1.getText();
      String primerapellido = field2.getText();
      String segundoapellido = field3.getText();
      String departamento = combo1.getSelectedItem().toString();
      String antiguedad = combo2.getSelectedItem().toString();

         if(nombrecompleto.equals("") || primerapellido.equals("") || segundoapellido.equals("") ||
            departamento.equals("") || antiguedad.equals("")){
 
           JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
         } else{

             if(departamento.equals("Atencion al Cliente")){
                 if(antiguedad.equals("1 ano de servicio")){
                   area.setText("\n " + nombrecompleto + " " + primerapellido + " " + segundoapellido + " usted que labora en " + 
                                "\n " + departamento + " con " + antiguedad + 
                                "\n recibe 6 dias de vacaciones.");
                 }
                 if(antiguedad.equals("2 a 6 anos de servicio")){
                   area.setText("\n " + nombrecompleto + " " + primerapellido + " " + segundoapellido + " usted que labora en " + 
                                "\n " + departamento + " con " + antiguedad + 
                                "\n recibe 14 dias de vacaciones.");
                 }
                 if(antiguedad.equals("7 o mas anos de servicio")){
                   area.setText("\n " + nombrecompleto + " " + primerapellido + " " + segundoapellido + " usted que labora en " + 
                                "\n " + departamento + " con " + antiguedad + 
                                "\n recibe 20 dias de vacaciones.");
                 }
             }


             if(departamento.equals("Departamento de Logistica")){
                 if(antiguedad.equals("1 ano de servicio")){
                   area.setText("\n " + nombrecompleto + " " + primerapellido + " " + segundoapellido + " usted que labora en " + 
                                "\n " + departamento + " con " + antiguedad + 
                                "\n recibe 7 dias de vacaciones.");
                 }
                 if(antiguedad.equals("2 a 6 anos de servicio")){
                   area.setText("\n " + nombrecompleto + " " + primerapellido + " " + segundoapellido + " usted que labora en " + 
                                "\n " + departamento + " con " + antiguedad + 
                                "\n recibe 15 dias de vacaciones.");
                 }
                 if(antiguedad.equals("7 o mas anos de servicio")){
                   area.setText("\n " + nombrecompleto + " " + primerapellido + " " + segundoapellido + " usted que labora en " + 
                                "\n " + departamento + " con " + antiguedad + 
                                "\n recibe 22 dias de vacaciones.");
                 }
             }


             if(departamento.equals("Departamento de Gerencia")){
                 if(antiguedad.equals("1 ano de servicio")){
                   area.setText("\n " + nombrecompleto + " " + primerapellido + " " + segundoapellido + " usted que labora en " + 
                                "\n " + departamento + " con " + antiguedad + 
                                "\n recibe 10 dias de vacaciones.");
                 }
                 if(antiguedad.equals("2 a 6 anos de servicio")){
                   area.setText("\n " + nombrecompleto + " " + primerapellido + " " + segundoapellido + " usted que labora en " + 
                                "\n " + departamento + " con " + antiguedad + 
                                "\n recibe 20 dias de vacaciones.");
                 }
                 if(antiguedad.equals("7 o mas anos de servicio")){
                   area.setText("\n " + nombrecompleto + " " + primerapellido + " " + segundoapellido + " usted que labora en " + 
                                "\n " + departamento + " con " + antiguedad + 
                                "\n recibe 30 dias de vacaciones.");
                 }
             }
         }
    }


    if(ev.getSource() == creador){
      JOptionPane.showMessageDialog(null, "Creado por \nAnderson Hernandez Castro");
    }
  }



  public static void main(String args[]){
    Principal ventanaPrincipal = new Principal();
    ventanaPrincipal.setBounds(0,0,1000,700);
    ventanaPrincipal.setVisible(true);
    ventanaPrincipal.setResizable(false);
    ventanaPrincipal.setLocationRelativeTo(null);
  }
}
