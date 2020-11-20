//ATHOR:Ferney camilo talero
//DATE:06/10/2020
//DESCRIPTION:this program show the age of a person
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("P2T7 this program show the age of a person!");

        Scanner teclado = new Scanner (System.in);

        System.out.println("input your your birth");
        int YEAR= teclado.nextInt();

        if (YEAR>=2020){
        System.err .println("ERR THIS YOUR CAN'TVPROCES, YOU SHOULD INPUT A YEAR LESS THAN 2020");
        }else{
        
        Int AGE = 2020-YEAR;

        if(AGE>=18){

           System.out.println("she/he is adult");

        }else{

            System.out.println("she/he is kid/girl");
        } 
    }

     
}
