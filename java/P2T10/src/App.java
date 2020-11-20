//ATHOR:Ferney camilo talero
//DATE:06/10/2020
//DESCRIPTION:this program show the age of a person
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("P2T10 volumen de un cilindro - ferney camilo talero!");
        
        Scanner keyboard = new Scanner (System.in);

        System.out.println("ingrese el radio en (cm) ");
        double R1 = keyboard.nextDouble();

        System.out.println("ingrese la altura(cm)");
        double H1 = keyboard.nextDouble();

        if(R1<=0 && H1<=0 || H1<=0){
            System.err.println("ERROR: el radio o la altura no pueden ser menosres he iguales que cero ");
        }else{
        double Vol = 3.141592*(R1*R1)*H1; 
        System.out.print("Volumen es:"+Vol+"cm3");
        }


    }
}
