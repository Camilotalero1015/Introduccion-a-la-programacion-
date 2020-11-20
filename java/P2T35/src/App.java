//AUTHOR:FERNEY CAMILO TALERO BELLO // ESTEBAN GAONA
//DATE:10/11/2020
//DESCRIPTION:

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       f_introduction();
       double[][] v_matriz_grades= f_fill_matriz();
       double v_final_grades=0;
       System.out.println("---students grades---");
       for (int i=0;i<10;i++){
           v_final_grades=v_matriz_grades[i][0]*0.3+v_matriz_grades[i][1]*0.5+
        System.out.println(v_matriz_grades[i]+"|"+v_matriz_grades[i][1]+"|"+v_matriz_grades[i][2]);

       }
    }
    //p3 crear el metodo introduccion
    public static void f_introduction(){
        //description show inicial menu/information of program
        System.out.println("-----------------------------------------------------------------!");
        System.out.println( "-----------------------------------------------------------------");
        System.out.println("-------------Sof0hangman------------------------------------!");
        System.out.println(".......version 1.0 camilo talero  Nov 06---------------+............");
        System.out.println("----------make by Ferney Camilo Talero ---------------------------!");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------!");
    }
    public static double[][] f_fill_matriz(){
        //description:this method returns the fill matriz  (10*3) whit double between 
        double[][] v_matriz = new double [10][3];
        for (int i=0;i<10;i++){
            v_matriz[i][0]=Math.random()*5.1;
            v_matriz[i][1]=Math.random()*5.1;
            v_matriz[i][2]=Math.random()*5.1;
            
        }
        return v_matriz;
    }

}
