//AUTHOR:FERNEY CAMILO TALERO BELLO
//DATE:02/11/2020
//DESCRIPTION:GENERAL THE AGE RANDOMY }

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        int N_products= f_total_products();
        doble v_IVA =0, v_total_bill=0= v_average_price=0,
        int v_vector_products[] = f_fill_vector_products(N_products);
        for(int i=0;<v_N_products;i++){
            if(v_vector_products[i]>10000){
                v_IVA= v_IVA+ (v_vector_products[i]*0.19);

            }
            v_total_bill+=v_vector_products[i];
        }
        v_average_price= (v_total_bill+v_IVA)/v_N_products;
        System.out.println("gross value:$"+v_total_bill);
        System.out.println("tax(19%):$"+v*v_IVA);
        System.out.println("total bill $:"(v_total_bill+v_IVA));
        System.out.println("Average bill:$"v_average_price);
    }

    public static void f_introduction(){
        //description show inicial menu/information of program
        System.out.println("-----------------------------------------------------------------!");
        System.out.println( "-----------------------------------------------------------------");
        System.out.println("-------------SofVECTORY------------------------------------!");
        System.out.println(".......version 1.0 camilo talero  Nov 02---------------+............")
        System.out.println("----------make by Ferney Camilo Talero ---------------------------!");
        System.out.println("-------------------------------------------------------------------")
        System.out.println("---------------------------------------------------------------!");
    }

    public static int f_total_product(){
        //description: this return the total product between 1 and 10000
        Scanner keyboard = new Scanner(System.in);
        System.out.println("imput the total products do you need");
        int v_total_product=keyboard.nextInt();
        while(v_total_product<1 || v_total_product>10000){
            System.out.println("Err the value should be beetween 1 to input again ");
            v_total_product=keyboard.nextInt();
        }
    }

    public static int[] f_fill_vector_products(int N_products){
        //description:this mthod returns a vector with price N products
        int[] v_vector = new int[N_products];

        for (int i=0; i<N_products; i++){
            //(math random()* (v_max . v_min))
            v_vector[i]= (Math.random()*(98000))+1000
        }
        

    }
}
