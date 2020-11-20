
//AUTHOR:CAMILO TALERO 
//DATE: OCT-23 -2020
//DESCRIPTION: Caluculate 
import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class App {
    public static void main(String[] args) throws Exception {
       f_introduction();
       double v_alary_average=0, v_salary_total=0, v_salary_heiher=0;
       Int N_employees=f_salary_one_employees();
       for(Int i=1; i<N_employees;i++){
           v_salary_total= v_ salary_ total+ v_salary_ tmp;
           if(v_salary_heiher< v_salary tmp);
           
       }




    }

    //crar el metodo f_ introduction
    public static void f_introduction(){
    //description show menu
    System.out.println("-----------------------------------------------------------------!");
    System.out.println( "-----------------------------------------------------------------");
    System.out.println("-------------Softservice------------------------------------!");
    System.out.println( ".......version 1.0 camilo talero  oct22---------------+............")
    System.out.println("----------make by Ferney Camilo Talero ---------------------------!");
    System.out.println("-------------------------------------------------------------------")
    System.out.println("---------------------------------------------------------------!");
    }
    public static int F_N_ employees({
        //description: this total returns the total to calculation
        Scanner keyboard= new Scanner(System.in);
        System.out println(" unput the total employees");
        int N_employees= keyboard. nextInt();
        while(N_employees<1 || N_ employees>100){
            System.out.println("ERR your should be should");
            N_ employees 

        }
    }

    public static double f_salary_one_employees( Int i){
        //description:
        Scanner keyboard= new Scanner(System.in);
        System.out.println(" input the salary by the employed"+i+"$");
        Int salary=keyboard.nexInt();
        while(salary<1){
            System.out.println();
            salary=keyboard.nextInt();
        
        }
        System.out println("");{
        Int workdays=Keyboard.nexInt();
        System.out.println(" Err the workgaysshould be between 1 and,input again the workdays.for rhe employee"+i);
        workdays= keyboard.nextInt();
    }





    }
}
