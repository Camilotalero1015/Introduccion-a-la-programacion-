//p1: lineas de comentarios de autor,fecha, y descripcion
//AUTOR:Camilo Talero, Stephanny Soto, Nicolas Quintero
//FECHA:03-DIC-2020
//DESCRIPCION:Proyecto final del curso

//p2: importar las librerias requeridas
import javax.swing.*;      //ventajas y formularios 
import java.awt.*;        //botones,cajas de texto, etc..
import java.awt.event.*; // crear eventos para los elementos del formulario

// p3 cambiar la extencion de la clase
public class formulario_inicio extends JFrame{

    JButton boton_inicio;
    public formulario_inicio(){
        //etiquetas
        JLabel l_title = new JLabel("Software Alimentos");
        l_title.setBounds(140,15,500,40);
        add(l_title);
        JLabel l_version = new JLabel("versión 1.0");
        l_version.setBounds(10,130,200,20);

        boton_inicio =new JButton("Empezar");
        boton_inicio.setBounds(150,70,90,30);
        boton_inicio.addActionListener(new boton_clic());

        add(l_title);
        add (l_version);
        add (boton_inicio);
        //configuracion del formaulario 
        setTitle("Inicio");
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(400,200);
        setLocationRelativeTo(null);   //ubique en la mitad de la pantalla
        setDefaultCloseOperation (EXIT_ON_CLOSE);

    }
}
//clase para llamar el evento clic del boton_inicio
class boton_clic implements ActionListener{
    public void actionPerformed(ActionEvent a){
        formulario_principal form_principal= new formulario_principal();
    }

}

