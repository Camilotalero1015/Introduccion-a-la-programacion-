//ATHOR:FERENY CAMILO TALERO
//DATE:2020 - OCTOBER -08
//DESCRIPTION: this program calculate the parcel service 

import java.util.Scanner;

import jdk.nashorn.internal.ir.ReturnNode;

public class App {
    public static void main(String[] args) throws Exception {
        f_menu();
        int option= f_address();
        double weight= f_weight();

        if(){

        }else if(option==2){
            price= weight= 10;
        }else if(option==3){
            price= weight= 12;
        }else if(option==4){
            price= weight= 24;
        }else{
            price= weight= 27;
        }

    }
    

    public static void menu(){

       //description:this progrma return the option adress
       Scanner keyboard =new Scanner(System.in);
       System.out.println("imput the aplication address");
       System.out.println("1 north american");
       System.out.println("2 central amreican");
       System.out.println("3 south american");
       System.out.println("4europa");
       System.out.println("5 asia");

       int option = keyboard.nextInt()

       while(option<1 || option>5){
          System.out.println("imput the aplication address");
          System.out.println("1 north american");
          System.out.println("2 central amreican")
          System.out.println("3 south american")
          System.out.println("4europa")
          System.out.println("5 asia");

          option=keyboard.nextInt();
        }
        
        return option;

    }

    public static double f_weith() {
        Scanner teclado2 = new Scanner(System.in );
        System.out.println("imput the weight Kg  of parcel");
        double weight0 teclado2. nextDouble();
        while(weight);

        
    }
}

