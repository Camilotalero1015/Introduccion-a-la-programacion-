// AUTHOR: FERNEY CAMILO TALERO BELLO
//DATE:15/10/2020
//DESCRIPTION: this sofware make many funtions that converst
//KM A MILLAS, MILLAS KILOMETROS
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_menu()
        int user_option= f_option();

        while(user_option!=0){

        if ( user_option==1){
            f_calculate_miles_in_KM();
        }else if ( user_option==2){
            f_calculate_km_in_miles();
        }else if ( user_option==2){
            f_calculate_USDO_in_PESOS();
        }else{
            f_calculate_PESOS_in_USDO();
        }
        user_option-f_option();
    }
    System.out.println();
    }

    public static void f_menu(){
        //DESCRIPTION:Show inicial menu/information of program
        System.out.println("-----------------------------------------------------------------!");
        System.out.println( "-----------------------------------------------------------------");
        System.out.println("-------------Softconverst------------------------------------!");
        System.out.println( ".......version 1.0 camilo talero oct 15...........................")
        System.out.println("----------make by Ferney Camilo Talero----------------------------!");
        System.out.println("-------------------------------------------------------------------")
        System.out.println("---------------------------------------------------------------!");
    }
    public statict int f_option(){
        //description: this mothon return the option that imput the user import
        Scanner teclado = new scanner(System.in);
        System.out.println("imput the option of convert:n1 ");
        System.out.println("");
        System.out.println("");
        int option = teclado.nextInt();
        while(option)= teclado.nextInt();
        System.out.println("");
        System.out.println("");
        option = teclado.nextInt();
        return option; 
    }
    
    public static void f_calculate_miles_in_KM(){
    //description: 
    Scanner teclado = new scanner(System.in);
    System.out. println(" millas a km ");
    System.out. println(" input the total millas ");
    double miles= teclado. nextDouble();
    double km=miles/0.621371;
    System.out. println(" the"+miles+);
}
public static void f_calculate_km_in_miles(){
    //description: 
    Scanner teclado = new scanner(System.in);
    System.out. println(" km a  millas ");
    System.out. println(" input the total millas ");
    double km= teclado. nextDouble();
    double miles=km*0.621371;
    System.out. println(" the"+km+);

}

public static void f_calculate_USDO_in_PESOS(){
    //description: 
    Scanner teclado = new scanner(System.in);
    System.out. println("  3  USDO a aTOTAL PESOS ");
    System.out. println(" input the total USDO ");
    double USDO= teclado. nextDouble();
    double pesos= USDO*3800;
    System.out. println(" the"++);
    
}

public static void f_calculate_PESOS_in_USDO(){
    //description: 
    Scanner teclado = new scanner(System.in);
    System.out. println("  3  PESOS a aTOTAL USDO ");
    System.out. println(" input the total PESOS ");
    double PESOS= teclado. nextDouble();
    double USDO= PESOS/3800;
    System.out. println(" the colombian pesos:"+PESOS+ "Colombian pesos convert to :"+USDO+"USDO");


    
}
