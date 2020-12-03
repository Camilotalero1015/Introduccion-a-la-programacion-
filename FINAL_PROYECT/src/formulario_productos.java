//P1: lineas de come tarios de author, date and description.
//AUTHOR: FERNEY CAMILO TALERO BELLO,  ANA STEPHANNY SOTO FORERO, NICOLAS SANTIAGO QUINTERO
//DATE: 2020-Dic-03
//DESCRIPTION:this Final Program of course


//p2 importar las librerias requeridas 
import javax.swing.*; //VENTAJAS Y FORMULARIOS
import java.awt.*;    //botones, cajas y textos etc...
import java.awt.event.*; // crear eventos para los elementos

//p3 cambiar la extencion del formulario 
public class formulario_productos extends JFrame{
    public formulario_productos(){  //contruccion de la clase ()

        //etiquetas
        
        JLabel l_Nro_productos = new JLabel("Nro_producto:");
        l_Nro_productos.setBounds(10,10,100,20);

        TextField l_Nro_productos4 = new TextField();
        l_Nro_productos4.setBounds(150,10,50,20);
        
        JLabel l_tiempo = new JLabel("Tiempo de fabricación:");
        l_tiempo.setBounds(250,10,150,20);

        TextField l_tiempo4 = new TextField();
        l_tiempo4.setBounds(400,10,50,20);

        JLabel l_Description = new JLabel("Descripción:");
        l_Description.setBounds(10,40,100,20);

        TextField l_Description4 = new TextField();
        l_Description4.setBounds(150,40,200,20);

        JLabel l_Costo_de_fabricacion = new JLabel(" Costo de fabricación: ");
        l_Costo_de_fabricacion.setBounds(10,70,150,20);
        
        TextField l_Costo_de_fabricacion4 = new TextField();
        l_Costo_de_fabricacion4.setBounds(150,70,50,20);

        JLabel l_valor = new JLabel("Valor unitario: ");
        l_valor.setBounds(300,70,100,20);
        
        TextField l_valor4 = new TextField();
        l_valor4.setBounds(400,70,50,20);

         //BOTON LISTA DE VER DETALLES
         JButton boton_Ver_detalles = new JButton("ver detalles");
         boton_Ver_detalles.setBounds (60, 120, 100, 30);
         boton_Ver_detalles.addActionListener(new boton_clic());

         //BOTON LISTA DE GUARDAR
         JButton boton_Guardar = new JButton("Guardar");
         boton_Guardar.setBounds (300, 120, 100, 30);
         boton_Guardar.addActionListener(new boton_clic());

         //BOTON LISTA DE imprimir
         JButton boton_imprimir = new JButton("Imprimir");
         boton_imprimir.setBounds (180, 120, 100, 30);
         boton_imprimir.addActionListener(new boton_clic());
 
 
         //agregar boton guardar 
        add(l_Costo_de_fabricacion4);
        add(l_Nro_productos);
        add(l_Description);
        add(l_Costo_de_fabricacion);
        add(l_Nro_productos4);
        add(l_tiempo);
        add(l_tiempo4);
        add(l_Description4);
        add(l_valor);
        add(l_valor4);
        
        add(boton_Ver_detalles);
        add(boton_Guardar);
        add(boton_imprimir);
        //configuracion del formaulario 
        setTitle("Productos");
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(500,200);
        setLocationRelativeTo(null);   //ubique en la mitad de la pantalla
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}
    
}