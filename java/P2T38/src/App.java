//AUTHOR:FERNEY CAMILO TALERO BELLO // STEPHANNY SOTO 
//DATE:16/11/2020
//DESCRIPTION: this sofware simulate the rate food the rate food in the cafeteria. for this,


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      f_introduction();
      Scanner.keyboard = new

      int rows = f_total_town();
      int columns= f_total_columns()
      int[][] matriz_number = new int [rows][columns];
      matriz_number= f_fill_matriz(matriz_number);
      System.out.println("imput the number of the town");
      int number_row=keyboard.nextInt();
      int summatory=0;
      double= average=0;
        while (number_rows>0 && number_rows< matriz_number.length-1){
            System.out.println();
            for(int j=0; j<matriz_number[1].length;j++){
                summatory+=matriz_number[number_row][j];
            }

           f_show_matriz_value(matriz_number);
           average= summatory/matriz_number[1].length;
           System.out.println("number row"+number_row+"the sum"+summatory+"an the average"+average);
           number_row=keyboard.nextInt();
           while(option_continue()equalsIgnoreCase("N"));
           
        }


    }
    //p3 crear el metodo introduccion
 public static void f_introduction(){
    //description show inicial menu/information of program
    System.out.println("-----------------------------------------------------------------!");
    System.out.println( "-----------------------------------------------------------------");
    System.out.println("-------------Sof0twumingcompetetuon------------------------------------!");
    System.out.println(".......version 1.0 camilo talero  Nov 06---------------+............");
    System.out.println("----------make by Ferney Camilo Talero ---------------------------!");
    System.out.println("-------------------------------------------------------------------");
    System.out.println("---------------------------------------------------------------!");
 }

    public static int f_total_town(){
    System.out.println("imput who many rows do you want in the matriz"); 
    
    int f_total_town=keyboard.nextInt();
    while( f_total_town<=0){
        System.out.println("ERR THE VALUE MUST GREATER THAN ZERO;");
        System.out.println(" imput Again who many total rows do you want");
        f_total_town= keyboard.nextInt();

    
    }
    return f_total_town;

} 

public static int f_total_columns(){
    System.out.println("imput who many rows do you want in the matriz"); 
    int f_total_rows= keyboard.nextInt();
    while( f_total_columns<=0){
        System.out.println("ERR THE VALUE MUST GREATER THAN ZERO;");
        System.out.println(" imput Again who many total rows do you want");
        f_total_coulumns= keyboard.nextInt();

    
    }
    return f_total_columns;


} 

public private static int f_fill_matriz(int[][] matriz_number){
    //description:
    for(int i=0;i<matriz_number.length;i++){
    for(int k=0;k<matriz_number[0].length;k++){
       matriz_number[i][k]= (int) Math.floor((Math.random()*1000)+1);
    }

    }
    return matriz_number;
} 
public private static void f_show_matriz_value(int[][] f_fill_matriz){
    //description:
    for(int i=0;i<matriz_number.length;i++){
    System.out.println("/n["+i+"]");
    for(int j=0;j<5;j++){
        System.out.print(f_fill_matriz[1][j]+);
    }
}
}


}   
