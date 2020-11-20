//AUTHOR:FERNEY CAMILO TALERO BELLO // ESTEBAN GAONA
//DATE:10/11/2020
//DESCRIPTION:

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        string v_opt_user = f_option_user();
        string[] v_vector_words= f_fill_vector(v_opt_user);

        char v_letter user;
        int v_random= (int)(Math.ramdom()*9);
        String [] v_word_guess=v_vector_words[v_random];  //v_word_guess es la palabra que el usuario debe adivinar
        int v_failed_attemts=0;                           // contar los intentos fallidos
        int v_total_vacios=0;                             //contar los espcios vacios restantes en la palabra
        char [] v_vector_word_guess[] =new char [v_vector_word_guess.length()];  //vector para los espacios vacios ( _ )


        //temporal
        for(int i=0, i<10; i++){System.out.println("["+i+"]= "+v_vector_words[i]);}
        System.out.println("/nWord to guess:["+v_random+"]="+v_word_guess);
        //temporal


        //draw underscors
        System.out.println("the word to guess is:/n");
        for(int i=0,i<v_word_guess.length();i++){
            System.out.print("_");
        v_vector_word_guess[i]="_";
    }
        //to make the game
        do{
            //a:pedir letra
            System.out.println("/nInput a letter");
            v_letter_user=keyboard.next().charAt(0); //solo tomara la primera letra que ingrese
            if(v_vector_word_guess.indexOf(v_letter_user))>-1{
                
            }else{     //si no encuentra la letra dento de la palabra
                v_failed_attemts+=1;
                System.out.println("ERR: this letther don't exis into the word(faild attemps"+v_faled_attemts+"/4");

            }
        }




    }

    //p3 crear el metodo introduccion
    public static void f_introduction(){
        //description show inicial menu/information of program
        System.out.println("-----------------------------------------------------------------!");
        System.out.println( "-----------------------------------------------------------------");
        System.out.println("-------------Sof0hangman------------------------------------!");
        System.out.println(".......version 1.0 camilo talero  Nov 06---------------+............")
        System.out.println("----------make by Ferney Camilo Talero ---------------------------!");
        System.out.println("-------------------------------------------------------------------")
        System.out.println("---------------------------------------------------------------!");
    }
    //creamos el vector 
    public static String f_option_user(){
        //description:this method return a char (Y/N)
        Scanner keyboard= new Scanner(System.in);
        System.out.println("do you want to enter the wors (Y/N)");
        string v_option=keyboard.nextLine();
        while(v_option.equals("N")|| ("Y")){
            System.out.println("do you want to enter the wors (Y/N)");
         v_option=keyboard.nextLine();

        }
        return v_option;

        public static String[] f_word_user(int i){
            //description: this method returns a string vector 10 words.
            Scanner keyboard= new Scanner(System.in);
            System.out.println("input the ["+i+"]word");
        string v_option=keyboard.nextLine();
        while(v_option.equals("N")|| ("Y")){
            System.out.println("do you want to enter the wors (Y/N)");
         v_option=keyboard.nextLine();
        } 


    }
    public static String[] f_fill_vector(String v_opt_user){
        //description: this method returns a string vector 10 words.
        Scanner keyboard= new Scanner(System.in);
        String[]v_vector_words=new String[10];

    }
        
        if(v_opt_user.equals("Y")){//input 10 word by keyboard
        for(int i=0;i<10;i++){
            v_vector_words[i]
        }
        }else{
            v_vector_words[0]"casa";
            v_vector_words[1]"perro";
            v_vector_words[2]"universidad";
            v_vector_words[3]"colombia";
            v_vector_words[4]"telefono";
            v_vector_words[5]"cama";
            v_vector_words[6]"computador";
            v_vector_words[7]"java";
            v_vector_words[8]"programacion";
            v_vector_words[9]"tecnologia";
        
            
            
            Sting[] v_vector_words="casa","perro","universidad", "colombia","telefono","cama","computador","java","programacion";"tecnologia"}
    }



}
