//ATHOR:FERENY CAMILO TALERO
//DATE:2020 - OCTOBER -08
//DESCRIPTION: this program calculate the final grade: N1 (20%) N2(25%) N3(25%) N4 (30%)

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("P2T11 Studen's grades - ferney camilo talero bello !");
        System.out.println("CAMILO VERSION 1.0")
        
        Scanner keyboard=new Scanner(System.In);
       
        System.out.println(" ingrese la primera  nota del 20%");
        float N1=keyboard.nextFloat();

        System.out.println(" ingrese la primera  nota del 25%");
        float N2=keyboard.nextFloat();

        System.out.println(" ingrese la primera  nota del 25%");
        float N3= keyboard.nextFloat();

        System.out.println(" ingrese la primera  nota del 20%");
        float N4= keyboard.nextFloat();

        System.out.println(" ingrese la primera  nota del 30%");
        float N4= keyboard.nextFloat();

        if (N1<0 || N1>5 || N2<0|| N2>5 || N3<0|| N3>5 || N4<0 || N4>5){
        }else{

            float FINALG = (N1*0.2)+(N2*0.25)+(N3*0.25)+(N4*0.30);
            System.out.println("the final grade is:"+FINALG);
        }

    }
}
