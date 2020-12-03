//p1: lineas de comentarios de autor,fecha, y descripcion
//AUTOR:Camilo Talero, Stephanny Soto, Nicolas Quintero
//FECHA:03-DIC-2020
//DESCRIPCION:Proyecto final del curso

//p2: importar las librerias requeridas
import javax.swing.*;      //ventajas y formularios 
import java.awt.*;        //botones,cajas de texto, etc..
import java.awt.event.*; // crear eventos para los elementos del formulario

// p3 cambiar la extencion de la clase
public class formulario_provedores extends JFrame{

    public formulario_provedores(){  //contruccion de la clase ()
        
        //etiquetas
       
        JLabel l_Nit = new JLabel("NIT:");
        l_Nit.setBounds(10,10,100,20);

        TextField l_Nit4 = new TextField();
        l_Nit4.setBounds(120,10,200,20);

        JLabel l_Nombre = new JLabel("Nombre:");
        l_Nombre.setBounds(10,35,100,20);

        TextField l_Nombre4 = new TextField();
        l_Nombre4.setBounds(120,35,200,20);

        JLabel l_Correo = new JLabel("Dirección: ");
        l_Correo.setBounds(10,60,100,20);

        TextField l_direccion4 = new TextField();
        l_direccion4.setBounds(120,60,200,20);

        JLabel l_Telefono = new JLabel("Teléfono: ");
        l_Telefono.setBounds(10,85,100,20);

        TextField l_telefono4 = new TextField();
        l_telefono4.setBounds(120,85,100,20);

         //BOTON LISTA DE INSUMOS 
         JButton boton_lista_insumos = new JButton("Lista insumos");
         boton_lista_insumos.setBounds (100, 120, 120, 30);
         boton_lista_insumos.addActionListener(new boton_clic());

         //BOTON LISTA DE GUARDAR
         JButton boton_guardar = new JButton("Guardar");
         boton_guardar.setBounds (250, 120, 100, 30);
         boton_guardar.addActionListener(new boton_clic());
 
         //agregar botones al panel izquierdo
         add(boton_lista_insumos);
         add(boton_guardar);
         

       
        add (l_Nit);
        add(l_Nit4);
        add (l_Nombre);
        add(l_Nombre4);
        add (l_Correo);
        add (l_direccion4);
        add (l_Telefono);
        add (l_telefono4);
        //configuracion del formaulario 
        setTitle("Proveedores");
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(400,200);
        setLocationRelativeTo(null);   //ubique en la mitad de la pantalla
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

   }
    
}