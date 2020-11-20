//AUTHOR:FERNEY CAMILO TALERO BELLO
//DATE: 2020-OCT-10
//DESCRIPTION:Create amethod

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        f_menu()
        System.out println();
        String word = keyboard.nextLine();
        while(word.length()<5){
            System.out.println((" ERR: your ward should have at lest five(5) latters, imput again you word:");
            word= keyboard.nextLine();
        }
        f_first_latter(word);
        f_final_letter(word);
        f_replice_letter(word);

        
    }
    

    public static void f_menu(){

    //DESCRIPTION:Show inicial menu/information of program
    System.out.println("-----------------------------------------------------------------!");
    System.out.println( "-----------------------------------------------------------------");
    System.out.println("-------------Softservice------------------------------------!");
    System.out.println( ".......version 1.0 camilo talero oct 13...........................")
    System.out.println("----------make by Ferney Camilo Talero----------------------------!");
    System.out.println("-------------------------------------------------------------------")
    System.out.println("---------------------------------------------------------------!");
    
    }

     public static void f_first_latter(string word){
        string first_letter= word substring();
        System.out.println("the first latter is"+first_letter);
     }

    public static void f_final latter(String word){
        String final_latter= word.substring(word.length()-1);
        System.out.println("the first latter is"+final_letter);
    }
 
    public static void f_replace_latter(String word, String letter){
    System.out.println("old word is:"+word+" new word is"+new_word);

    }

}
