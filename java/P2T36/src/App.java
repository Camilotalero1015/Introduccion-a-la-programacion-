//AUTHOR:FERNEY CAMILO TALERO BELLO // ESTEBAN GAONA
//DATE:13/11/2020
//DESCRIPTION:

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        int v_user_competitors=f_total_competitors();
        int[][] v_matriz_time = f_fill_matriz_times(v_user_competitors);
        int v_player_total_times=0
        for (int i=0;i<v_user_competitors;i++){
            System.out.print("/nplayer ["+i+"]:");
            for(int j=0;j<6++){
                System.out.print(v_matriz_time[i][j]+"|");

            }
        }
        f_fill_matriz_times(v_user_competitors)

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

    // p4 saber cuantos competidores
    public static int f_total_competitors();
    //descripcion: this method returns the total competitor that user input
    Scanner keyboard= new Scanner(System.in);
    System.out.println("input the total competitors do you want:");
    int V_total_competitor=keyboard.nextInt();
    while(f_total_competitors<1){

    }  


    public static int[][] f_fill_matriz_times(int v_user_competitors) {
        //description:this method 
        int[][] v_matriz_time =new int[v_user_competitors][6];
        for(int i=0;i<v_user_competitors;i++){
            for/int j=0;j<6;j++){  //recorrer las vueltas(columnas de cada competidor)
                v_matriz_time[i][j] =(int)(math.random()*(15-8)+8);


            }
        }
    
    }

    public static void f_show_winner(int[][]v_matriz_time){
        //introduccion: this method show who player is winner
        int v_player_winner=0;
        int v_player_winner_time =0;
        int v_player_tmp_time=0;
        for(int i=0;matriz_times.length;i++){
            v_player_tmp_time=0;
            for(int j=0;j<6;j++){
                v_player_tmp_time=v_matriz_time[i][j];


            }
            if(i==0){ //si es el primer jugador para mi es el ganador
                v_player_winner=i;
                v_player_winner=v_player_tmp_time;

            }else{
                if(v_player_winner_time<v_player_tmp_time){
                    v_player_winner=i
                    v_player_winner=v_player_winner_time;
                }
            }
        }
    }

        
    }
    



}
