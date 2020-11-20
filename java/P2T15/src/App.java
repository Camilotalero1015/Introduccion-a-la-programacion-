//ATHOR:FERENY CAMILO TALERO
//DATE:2020 - 13 octubre 2020
//DESCRIPTION: Comvertir grados cf
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      f_menu();
    int option= f_option_convert();
    if(option==1){
       f_convert_C_F();
    }else if(option==2){
       f_convert_F_C();
    }else if(option==3){
       f_convert_K_C();
    } else if(option==4){
       f_convert_C_K();
    }


}


public static void f_menu(){
    //DESCRIPTION:Show inicial menu/information of program
    System.out.println("-----------------------------------------------------------------!");
    System.out.println( "-----------------------------------------------------------------");
    System.out.println("-------------Softconvertgrades------------------------------------!");
    System.out.println( ".......version 1.0 camilo talero oct 13...........................")
    System.out.println("----------make by Ferney Camilo Talero----------------------------!");
    System.out.println("-------------------------------------------------------------------")
    System.out.println("---------------------------------------------------------------!");
    
} 

public static Int f_option_convert(){
    //description  this program return the option covert
Scanner keyboard = new Scanner(System.in);

    System.out.println("Imput the option:");
    System.out.println("1- °C to °F ");
    System.out.println("2- °F to °C ");
    System.out.println("3- °K to °C ");
    System.out.println("4- °C to °K ");
    
}

public static Int f_option_convert_c_f(){
    //description  this program return the option covert
    Scanner teclado = new Scanner(System.in);
    System.out.println(" Converto to °C to °F ");
    System.out.println("input the value of °C:");
    double value=teclado.nextDouble();
    double convert= (value*1.8)+32;
    System.out.println(value+"°C is"+convert+"°F");
    } 

    public static Int f_option_convert_f_c(){
        //description  this program return the option covert
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Converto to °F to °C ");
        System.out.println("input the value of °C:");
        double value=teclado.nextDouble();
        double convert= (value*1.8)-32;
        System.out.println(value+"°C is"+convert+"°F");
    }
    public static Int f_option_convert_k_c(){
        //description  this program return the option covert
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Converto to °k to °c ");
        System.out.println("input the value of °C:");
        double value=teclado.nextDouble();
        double convert= (value*1.8)+32;
        System.out.println(value+"°C is"+convert+"°F");
        } 

        public static Int f_option_convert_c_k(){
            //description  this program return the option covert
            Scanner teclado = new Scanner(System.in);
            System.out.println(" Converto to °C to °K ");
            System.out.println("input the value of °k:");
            double value=teclado.nextDouble();
            double convert= (value*1.8)+32;
            System.out.println(value+"°C is"+convert+"°F");
            } 

}


 
    




