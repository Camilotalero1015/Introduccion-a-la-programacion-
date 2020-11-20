//AUTHOR:FERNEY CAMILO TALERO BELLO
//DATE:05/11/2020
//DESCRIPTION:

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        f_introduction();
        int v_vector_number[]= f_fill_vector_numbers();
        int v_oportunity=1,v_user_number;
        boolean v_win=false;
        do{
            System.out.println("opportunity" +v_oportunity+ "input number between 1and 10");
            v_user_number=keyboard.nextInt();
            for(int i=0; i<10;i++){
                if(v_vector_number[i]==v_user_number){
                    v_win=true;
                }
            }
            v_oportunity=v_oportunity+1;


        }while(v_oportunity<4 && v_win==false);
        if(v_win==false){
            System.out.println("Sorry you loss 100.000.000 dollars");
        }else{
            System.out.println( "congratulation you win 1.000.000 dollars")


        }

    }

    public static void f_introduction(){
        //description show inicial menu/information of program
        System.out.println("-----------------------------------------------------------------!");
        System.out.println( "-----------------------------------------------------------------");
        System.out.println("-------------Sofmachineleteria------------------------------------!");
        System.out.println(".......version 1.0 camilo talero  Nov 05---------------+............")
        System.out.println("----------make by Ferney Camilo Talero ---------------------------!");
        System.out.println("-------------------------------------------------------------------")
        System.out.println("---------------------------------------------------------------!");
    }

    public static int [] f_fill_vector_numbers (){
        //descriptions: this method returns 10 randoms numbere between 1 and 10
        int[ v_vector = new int[10];
        for( int i=0; i<10;i++){
            v_vector[i]=(int) (Math.random()*9)+1;
            System.out.println("["+i+"]="+v_vector);
        }
        return v_vector;
    }

}
