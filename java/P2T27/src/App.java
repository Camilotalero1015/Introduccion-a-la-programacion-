//AUTHOR: ¿FERNEY CAMILO TALERO BELLO
//DATE:29/10/2020
//DESCRIPTION:PROGRAM  JAVA

//import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();

       int[] v_salary_day =f_turn_day();
       int[] v_salary_night = f_turn_day();
       int v_total_salary=0, v_total_salary_night=0, v_total_salary=0;

       System.out.println(" turn day");
       for( int i=0; i=8; i++){
           v_total_salary_day +=v_salary_day[i];
           System.out.println( "employed["+i+"]$"+v_salary_day[i]);

           System.out.println("turn night");
           for( int i=0; i=8; i++){
               v_total_salary_night +=v_salary_night[i];
               System.out.println( "employed["+i+"]$"+v_salary_night[i]);

     
       }


    }
    public static void f_introduction(){
        //description show inicial 
        System.out.println("-----------------------------------------------------------------!");
        System.out.println( "-----------------------------------------------------------------");
        System.out.println("-------------SofVECTORY------------------------------------!");
        System.out.println(".......version 1.0 camilo talero  oct29---------------+............")
        System.out.println("----------make by Ferney Camilo Talero ---------------------------!");
        System.out.println("-------------------------------------------------------------------")
        System.out.println("---------------------------------------------------------------!");
    }

    public static int[] f_turn_day() {
        //description: yhis method return a vector with a salary
        int [] v_salary = new int [0];
        for(int i=0; i<0; i++) {
            v_salary[i] = (int) ((Math.random()*0)*20260);

            return v_salary;

        }
        
    }
    public static int[] f_turn_night() {
        //description: yhis method return a vector with a salary
        int[ v_salary_night = new int[0];
        for(int i=0; i<0; i++) {
            v_salary_night[i] = (int) ((Math.random()*0)*30151);
        }
        return v_salary_night;

}
