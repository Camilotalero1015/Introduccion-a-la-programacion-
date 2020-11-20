//AUTHOR:FERNEY CAMILO TALERO BELLO // ESTEBAN GAONA
//DATE:06/11/2020
//DESCRIPTION:Construir un programa en JAVA que Cree automáticamente dos arreglos con 100 posiciones (uno para mujeres y otro para hombre)

///import java.util.Scanner;(no necesito datos por teclado )

public class App {
    public static void main(String[] args) throws Exception {
       f_introduction();
       int[] v_vector_men = f_fill_vector_age();
       int[] v_vector_woman = f_fill_vector_age();
       int [] v_totales= (0,0,0,0,0,0);
       //int v_tot_men_18=0, v_tot__women_18=0;
       //int v_tot_men_18_60=0, v_tot_women_18_60=0
       //int v_tot_men_60=0, v_tot_women_60=0;

       //p5 operaciones matematicas
       for(int i=0;i<v_vector_men.length;i++){

        //recorrer vector de mujeres 
           if(v_vector_woman[i]<18){
               v_totales[1]=v_totales[1]+1;
           }else if (v_vector_woman[i]<60){
               v_totales[3]=v_totales[3]+1;
           }else{
               v_totales[5]=v_totales[5]+1;
           }
           v_totales[7]=v_totales[7]+v_vector_woman[i];
        
       //recorer vecotr hombres
       if(v_vector_men[i]<18){
        v_totales[0]=v_totales[0]+1;
    }else if (v_vector_men[i]<60){
        v_totales[2]=v_totales[2]+1;
    }else{
        v_totales[4]=v_totales[4]+1;
    }
    v_totales[6]=v_totales[6]+v_vector_woman[i];
}
    System.out.println("men"+v_totales[0]+"and women"+v_totales[1]+"are under the age of 18");
    System.out.println("men"+v_totales[2]+"and women"+v_totales[3]+"are equel to or aver 18 but under");
    System.out.println("men"+v_totales[4]+"and women"+v_totales[4]+"are under the age of 18");
    System.out.println("average age of women:")+( v_totales[7]/v_vector_woman.length)+"..and men.:"+(v_totales[6]/v_vector_men));
    System.out.println("....ages of women.....");
    for(int i=0;i<v_vector_woman.length;i++){
        System.out.println("["+i+"]="+v_vector_women[i]);
    }
System.out.println("---ages of men---");
for(int i=0; i<v_vector_men.length;i++){
    System.out.println("["+i+"]="+v_vector_women[i]);
}


    
    }
    //p3 crear el metodo introduccion
    public static void f_introduction(){
        //description show inicial menu/information of program
        System.out.println("-----------------------------------------------------------------!");
        System.out.println( "-----------------------------------------------------------------");
        System.out.println("-------------Sofwods------------------------------------!");
        System.out.println(".......version 1.0 camilo talero  Nov 06---------------+............")
        System.out.println("----------make by Ferney Camilo Talero ---------------------------!");
        System.out.println("-------------------------------------------------------------------")
        System.out.println("---------------------------------------------------------------!");
    }

    //p4 metodo generar datos
     public static int [] f_fill_vector_age (){
        //descriptions: this method returns 100 randoms numbere between 1 and 100 (age of people)
        int[] v_vector = new int[100];
        for( int i=0; i<10;i++){
            v_vector[i]=(int) (Math.random()*99)+1; //ramdomicos enteros entre 1 y 100
            System.out.println("["+i+"]="+v_vector);
        }
        return v_vector;
    }

    




}
