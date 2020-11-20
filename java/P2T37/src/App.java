//AUTHOR:FERNEY CAMILO TALERO BELLO // ESTEBAN GAONA
//DATE:16/11/2020
//DESCRIPTION: this sofware simulate the rate food the rate food in the cafeteria. for this,


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        int v_user_people f_total_surveyed_();
        int [][] v_matriz_survey= f_fill_matriz_survey(v_user_people);
        int v_bad_food=0;
        int v_regular_food=0;
        int v_exellent_food=0;
        int v_total_survey=0;
        for(int i=0;i<v_user_people;i++){  //to walk the rows
            for (int k=0;k<5;k++){         //to walk the colum
                if(v_matriz_survey [i][k]<=3){
                    v_bad_food+=1;        //adding one by one
                }else if( v_matriz_survey[i][k]<=6){
                    v_regular_food+=1;
                }else{
                    v_exellent_food+=1; //adding one by one
                }
                v_total_survey+=1;
            }
        }
        
        System.out.println("----totals----");
        System.out.println("total survey"+v_total_survey+"(100%");
        System.out.println("total bad food"+v_bad_food+"("+((v_bad_food*100)/v_total_survey)+"%)");
        System.out.println("total regular food"+v_regular_food);
        System.out.println("total exellent food"+v_bad_food);


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
    ///p4.1 how many peple surveyed
    public static int f_total_surveyed_(){
        //description: this method returns the total people than surveyed
        Scanner keyboard = new Scanner ( System.in);
        System.out.println("how many people do you want");
        int v_total_people= keyboard.nextInt();
        while (v_total pople<1 || v_total_people>1000){
            System.out.println("how many people do you want");
            v_total_people=keyboard.nextInt();


        }
        return v_total_people;
    }

    //p4.2 make to 
    public static int [][]f_fill_matriz_survey(int v_user_people){
        //description: this method returns the matriz NxS with value beetwen 1 to 10
        int[]v_matriz_survey = new int[v_user_people][5];
        for(int i=0;i<v_user_people;i++){
            v_matriz_survey[i][j]= (int) (math.ramdom()*9)+1;

        }
        return v_matriz_survey;
    }
    public static void f_show_matriz_value(); {
        //
        for(int i=0; i<v_matriz_survey.length;1++);
    }
        
    }


}
