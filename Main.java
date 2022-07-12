import java.sql.SQLOutput;
import java.sql.Struct;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static void hello(){
        System.out.println("hiii");
    }

    static int sum(int x, int y){

        int z = x+y;
        return z;
    }

     static boolean isOdd(int number){

          return (number %2 == 1) ;
       //
       //  if (number %2 == 1)
       //      return  false;
       //  else
        //     return true;
     }

     static boolean isAngle(){

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        char first = name.toLowerCase().charAt(0);  // x v c s

         if (name.length() == 3 ||  first == 's')
             return true;
         else
             return false;

     }

     static int calcAge(int year){
        int age = 2022 -year;
        return age;
     }

     static String inputName(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("please enter  name : ");
         String name= scanner.next();
         return name;
     }

     static int getRandom(){
         Random random = new Random();
         int love= random.nextInt(101);//0-100
         return love;
     }

    public static void main(String[] args) throws InterruptedException {
      //int z = sum(8,10)  ;
      //  System.out.println(z);
       //  boolean a = isOdd(87);
       // System.out.println(a);
       // System.out.println(     isOdd(87)    );
       //
        //System.out.println(  isAngle() );
       //int age;
       //Scanner scanner = new Scanner(System.in);
//
       //do {
       //    System.out.println("please enter your birth year :");
       //    int year = scanner.nextInt();
       //    age = calcAge(year);
//
       //}while (age < 50);
       // System.out.println(age);

        //String name1=inputName();
        //String name2=inputName();
        //int percent=getRandom();
        //System.out.println( name1 +" love "+name2 +" thiiiiiiiiiis much "+percent+" %");
//
       // LocalDateTime time = LocalDateTime.now();
       // System.out.println(time.getMinute());
       // Math.pow(4,8);
       // "hh".equals("ss");

       // for (int i = 0 ; i < 101 ; i++){
       //     System.out.println(i);
       //     Thread.sleep(1000);
       // }



    }






}
