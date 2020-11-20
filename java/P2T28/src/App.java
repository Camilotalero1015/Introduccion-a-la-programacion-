
//AUTHOR: ¿FERNEY CAMILO TALERO BELLO
//DATE:29/10/2020
//DESCRIPTION:GENERAL THE PRICE  RANDOMY( 000

//import java.util.Scanner;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        int[] v_people= f_total_peple();
        int[] v_vector_age= fill_vector_age_people( N_people);

        int v_total_children=0 , v_total_adults=0, v_total_seniors=0;

        for( int i=0; i<N_people;i++){
            if(v_vector_age[i]<18){
                v_total_children+=1;
            }else if ( v_vector_age[i]>18 && v_vector_age[i]<60){
                v_total_adults+=1
            }else{
                v_total_seniors+=1;
            }
            v_sum_ages=v_sum_ages+v_vector_age[i];
            System.out.println("Age of person["+i+"]:"+v_vector_age[i]);

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

    public static int f_total_peple(){
        //description: this return the total person for program
        Scanner keyboard = new Scanner(System.in);
        System.out.println("imput the total people do you need");
        int v_total_people=keyboard.nextInt();
        while(v_total_people<1 || v_total_people>1000){
            System.out println("Err the value should be beetween 1 to input again ");
            v_total_people=keyboard.nextInt();
        }
        return v_total_people;
    }
    public static int[] fill_vector_age_people(int N) {
        //description: this method return a vector with age for N people
        int[] v_vector_age=new int[N]
        for(int i=0; i<N;i++){

            v_vector_age[i]=(int) (Math.random()*100)+1;

        }
        return v_vector_age;
        
    }
}
