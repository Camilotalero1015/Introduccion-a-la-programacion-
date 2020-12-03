//p1: lineas de comentarios de autor,fecha, y descripcion
//AUTOR:Camilo Talero, Stephanny Soto, Nicolas Quintero
//FECHA:03-DIC-2020
//DESCRIPCION:Proyecto final del curso

//p2: importar las librerias requeridas
import javax.swing.*;      //ventajas y formularios 
import java.awt.*;        //botones,cajas de texto, etc..
import java.awt.event.*; // crear eventos para los elementos del formulario

//p3 cambiar la extencion del formulario 
public class formulario_principal extends JFrame{

    public formulario_principal(){ //contructor de la  clase(dibuja el formulario )
        setLayout(new BorderLayout()); //ni formulario se va a mirar como vordes ( south, noth,east,w)
        //panel superior (NORTH)
   
        //pannel izquierdo(WEST)
        JPanel panel_izquierdo = new JPanel();
        panel_izquierdo.setLayout(new GridLayout(3,1));
        
        //BOTON DE PROVEEDORES
        JButton boton_prov= new JButton("Proveedores");
        boton_prov.addActionListener(new boton_prov_clic());

        //BOTON PRODUCTOS
        JButton boton_prod = new JButton("Productos");
        boton_prod.addActionListener(new boton_prod_clic());

        //BOTON ACERCA DE
        JButton boton_acercade = new JButton("Acerca de");
        boton_acercade.addActionListener(new boton_acercade_clic());

        JPanel panel_derecho =new JPanel();
        panel_derecho.setLayout(new BorderLayout());
        panel_derecho.add(new Label("MENÚ PRINCIPAL"),BorderLayout.NORTH);
        panel_derecho.add(panel_izquierdo,BorderLayout.WEST);
        
        add(new Label("Creado por: Camilo Talero, Stephanny Soto y Nicolas Quintero"),BorderLayout.SOUTH);


        //JPanel panel_inferior =new JPanel();
        //setLayout(new BorderLayout());
        //JLabel l_creador = new JLabel("versión 1.0");
        //panel_inferior.add(l_creador);


        //agregar botones al panel izquierdo
        panel_izquierdo.add(boton_prov);
        panel_izquierdo.add(boton_prod);
        panel_izquierdo.add(boton_acercade);

        //agregar los paneles superior e izquierdo al formulario
        //add(panel_inferior,BorderLayout.SOUTH);
        add(panel_derecho,BorderLayout.EAST);
        add(panel_izquierdo,BorderLayout.WEST);
        //Configuracion del formulario
        setTitle("Principal");
        setVisible(true);
        setResizable(false);
        setSize(380,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);




    }

}

//clase para llamar el evento clic del boton provedores
class boton_prov_clic implements ActionListener{
    public void actionPerformed(ActionEvent a){
        //llamar el nuevo formulario 
        formulario_provedores form_proveedores = new formulario_provedores();
    }
}

//clase para llamar el evento clic del boton producto
class boton_prod_clic implements ActionListener{
    public void actionPerformed(ActionEvent a){
        //llamar el nuevo formulario 
        formulario_productos form_productos = new formulario_productos();
    }
}

//clase para llamar el evento clic del boton acerca de
class boton_acercade_clic implements ActionListener{
    public void actionPerformed(ActionEvent a){
        formulario_acercade form_acercade = new formulario_acercade();
    }
}