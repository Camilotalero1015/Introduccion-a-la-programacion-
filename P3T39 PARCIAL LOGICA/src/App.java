//AUTHOR: FERNEY CAMILO TALERO BELLO  ANA STEPHANNY SOTO FORERO
//DATE: 2020-nov-19
//DESCRIPTION:software que simule la generación de forma automática de los  doce (12) 
//sueldos del año para N empleados (valor ingresado por el usuario), donde el valor mínimo
// de sueldo de un empleado por mes es del SMLV en Colombia del año 2020 y el valor máximo 
//es SMLV*5 en Colombia. 

// P2:importar las librerias requeridas
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    f_introduction();
    int v_total_employed =f_total_employed();
    int [][] v_matriz_salary= f_matriz_salary(v_total_employed);
    int average=0;
    int total_salary=0;
    int best_salary=0;
    int salary_for_employed=0;
    
    for (int i=0;i<v_total_employed;i++){
        salary_for_employed=0; 
        for(int n=0;n<12;n++){ 
            salary_for_employed=salary_for_employed+v_matriz_salary[i][n];
            total_salary=total_salary+ v_matriz_salary[i][n];
            if (v_matriz_salary[i][n]>best_salary){
                best_salary=v_matriz_salary[i][n];
            }
         }
    }
    average=total_salary/(v_total_employed*12);
    System.out.println("The total salary is "+total_salary);
    System.out.println("The average is "+average);
    System.out.println("The employed with the best salary is "+salary_for_employed);
}


    public static void f_introduction(){
    // p3: crear el metodo de f_introduction() <--- nos muestra informacion inicial del soft
        //description: show inicial menu/information of program
    System.out.println("-----------------------------------------");
    System.out.println("------------soft------------");
    System.out.println("----------version 1.0 2020-nov-19---------");
    System.out.println("----------make by Stephanny Soto----------");
    System.out.println("--------and Ferney Camilo Talero----------");
    System.out.println("------------------------------------------");

    }

    ///p4.1 how many employeds are
    public static int f_total_employed(){
    //description: this method returns the total employed 
    Scanner keyboard = new Scanner ( System.in);
    System.out.println("how many employer are");
    int v_total_employed= keyboard.nextInt();
    
    while (v_total_employed<1 || v_total_employed>1000){
        System.out.println("how many employed are");
        v_total_employed=keyboard.nextInt();
    }
    return v_total_employed;
    }
    
    public static int[][] f_matriz_salary (int v_total_employed){
        //description: this method return the matriz Nx12 with values beteew salary_min to salary_min*5
        int[][]v_matriz_salary= new int[v_total_employed][12];
        for(int i=0; i<v_total_employed;i++){
            for(int j=0;j<12;j++){
                v_matriz_salary[i][j]=(int)(Math.random()*(877803*5))+877803;
             }
        }
        return v_matriz_salary;
    }


}