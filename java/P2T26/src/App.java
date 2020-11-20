//AUTHOR: 
//DATE
//DESCRIPTION:

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        System.out.println(Math.random());
        double v_num=(Math.random()*(100000)+100000);
        System.out.println(v_num);

        Int v_num2 =(Int) v_num;
        System.out.println(v_num1);

        int v_num3 =(Int)Math.random(v_num);
        System.out.println(v_num3);

        int[] v_salary = new int[5];
        //[math.random()* (v_max -*-(v_max -*- v_min))+ v_min]
        v_salary[0]=(int) (Math.random()*(50-10)+10);
        v_salary[1]=(int) (Math.random()*(50-10)+10);
        v_salary[3]=(int) (Math.random()*(50-10)+10);
        v_salary[4]=(int) (Math.random()*(50-10)+10);

        System.out.println(Math.random());
        System.out.println("[0]:"+ v_salary[0]);
        System.out.println("[1]:"+ v_salary[1]);
        System.out.println("[2]:"+ v_salary[2]);
        System.out.println("[3]:"+ v_salary[3]);
        System.out.println("[4]:"+ v_salary[4]);

    }

        

        
        //math.random() * (v_max - v_min))+v_min
        //(0,02)*(2.000.000)+1.000.000) .. (2.000.000 y1.000.000

    public static void f_introduction(){
        //description show menu
        System.out.println("-----------------------------------------------------------------!");
        System.out.println( "-----------------------------------------------------------------");
        System.out.println("-------------SofVECTORY------------------------------------!");
        System.out.println( ".......version 1.0 camilo talero  oct27---------------+............")
        System.out.println("----------make by Ferney Camilo Talero ---------------------------!");
        System.out.println("-------------------------------------------------------------------")
        System.out.println("---------------------------------------------------------------!");
    }
}
