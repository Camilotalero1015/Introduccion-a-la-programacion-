//P1: lineas de come tarios de author, date and description.
//AUTHOR: FERNEY CAMILO TALERO BELLO,  ANA STEPHANNY SOTO FORERO, NICOLAS SANTIAGO QUINTERO
//DATE: 2020-Dic-03
//DESCRIPTION:this Final Program of course


//p2 importar las librerias requeridas 
import javax.swing.*; //VENTAJAS Y FORMULARIOS
import java.awt.*;    //botones, cajas y textos etc...
import java.awt.event.*; // crear eventos para los elementos

//p3 cambiar la extencion del formulario 
public class formulario_acercade extends JFrame{

    public formulario_acercade(){  //contruccion de la clase ()

            //etiquetas
    
            JLabel l_Ingenieros = new JLabel("Desarrolladores: Camilo Talero, Stephanny Soto, Nicolas Quintero");
            l_Ingenieros.setBounds(10,20,400,20);

            JLabel l_fac = new JLabel("Facultad: Ingenieria Mecánica");
            l_fac.setBounds(10,50,400,20);
            
            JLabel l_Correo = new JLabel(" Correo: ferney.talero, ana.soto, nicolas.quintero");
            l_Correo.setBounds(10,80,400,20);

            JLabel l_Profe = new JLabel("Github: /Camilotalero1015, /StephannySoto, /Nicolas04Santiago");
            l_Profe.setBounds(10,110,400,20);

    
            
            add (l_Ingenieros);
            add(l_fac);
            add (l_Profe);
            add (l_Correo);
            //configuracion del formaulario 
            setTitle("Acerca de");
            setLayout(null);
            setVisible(true);
            setResizable(false);
            setSize(450,200);
            setLocationRelativeTo(null);   //ubique en la mitad de la pantalla
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    
    }
}