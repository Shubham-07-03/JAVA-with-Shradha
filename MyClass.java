import java.util.Arrays;
import java.util.Scanner;

public class MyClass {
  public static void main(String[] args) {

    // System.out.println("Hello Java");

    // Variables 
    // String name = "Aman";
    // int age = 30;
    // String neighbour = "Akku";
    // String friend = neighbour;

    // // Print the values
    // System.out.println("Name: " + name);
    // System.out.println("Age: " + age);
    // System.out.println("Neighbour: " + neighbour);
    // System.out.println("Friend: " + friend);
  

    /** JAVA TYPES
     *  
     *   1 PRIMITIVES 
     *      Byte - 1 [-128 to 127]
     *      Short - 2
     *      int - 4    1, 2, 3 integers
     *      long - 8 
     *      float - 4   3.14
     *      double - 8 
     *      char - 2    a, b, c, d.... charecter 
     *      Boolean -1  TRUE / FAlSE 
     * 
     * for example;
     *      byte age = 12 
     *      int phone = 1234567890; 
     *      long phone2 = 12345678900L;
     *      float pi = 3.14F;
     *      Char letter = '@';
     *      Boolean isAdult = False;
     * 
     *   2 NON_PRIMITIVES
     *     
     *    String name1 = "Aman";
     *    String friend = new String(orignal: "SHUBHAM")
     *    System.out.println(name.length());
     */
     

     // Concatenate 
    //  String name1 = "Aman";
    //  String name2 = "Akku";
    //  String name3 = name1 + name2;

    //  System.out.println(name3);

    //  String name3 = name1 + " and " + name2;
    //  System.out.println(name3);

    // String name = "Aman";
    // System.out.println(name.charAt(0));
    // System.out.println(name.length());


    // REPLACE 
    // String name = "Aman";
    // String name2 = name.replace('m', 'b');
    // System.out.println(name2);
    // System.out.println(name);


    // SUBString
    // String name = "Aman and Akku";
    // System.out.println(name.substring(0, 4));
    // System.out.println(name.substring(5, 9));


    // ARRAYS
/* 
    int age = 30;
    int physics = 97;
    int chem = 98;
    int eng = 95;

    int[] marks = new int[3];
    // marks[0] = 97;
    // marks[1] = 98;
    // marks[2] = 95;

    // System.out.println(marks); // [I@5eb5c224
    // System.out.println(marks[0]);
    // System.out.println(marks[1]);
    // System.out.println(marks[2]);
*/
/*
    int age = 30;
    int physics = 97;
    int chem = 98;
    int eng = 95;

    boolean[] marks = new boolean[3];
    System.out.println(marks[2]); // false
*/
/*

    int age = 30;
    int physics = 97;
    int chem = 98;
    int eng = 95;

    int[] marks = new int[3];
    marks[0] = 97;
    marks[1] = 98;
    marks[2] = 95;
        // length
    // System.out.println(marks.length);
      // SORT 
    System.out.println(marks[0]);
    Arrays.sort(marks);
    System.out.println(marks[0]);

    // sort se phlle array 97 tha sort ke baad array 95 ho gya 
*/

    // int[] marks = {97, 98, 95};
    // int[][] finalMarks = {{97, 98, 95}, {95, 95, 99}};
    // System.out.println(finalMarks[0][0]); //97
    // System.out.println(finalMarks[1][2]); //99



//     CASTING
  // Implicit casting 
    // double price = 100.00;
    // double finalePrice = price + 18;
    // System.out.println(finalePrice); // 118.0

   
   
    //  Explicit CAsting 

    // int p = 100; 
    // int fp = p + (int)18.0;
    // int fp = p + (int)18.9; // 118
    // System.out.println(fp); //118

    // Constant 
     
    // int age = 38;
    // age = 31;
    // age = 32;
    // final float PI = 3.14F;
    // PI = 1.1F;
    // PI - cannot assign a value to final veriables 'PI'
    // The final local variable PI cannot be assigned. It must be blank and not using a compound assignment
    


    // Operators (Arithmetic & Assignment)

    // Arithmetic ('+', '-', '*', '/', '%', ++, --)
    // int a = 1;
    // int b = 2;
    // int sum = a + b;
    // System.out.println(sum);

    // int diff = a - b;
    // System.out.println(diff)

    // int mul = a * b;
    // System.out.println(mul);

    // int div = a / b;
    // System.out.println(div);

    // double a = 5;
    // double b = 3;
    // double modulo = a % b;
    // System.out.println(modulo); // 2.0

    // int numb = 1;
    // System.out.println(numb++); // 1
    // System.out.println(numb); // 2
    // System.out.println(++numb); // 2
    // System.out.println(numb); // 2
    // System.out.println(numb--); // 1
    // System.out.println(numb); // 0
    // System.out.println(--numb); // 0
    // System.out.println(numb); // 0


    // Math Class
    // System.out.println(Math.min(5, 6)); //5
    // System.out.println(Math.max(5, 6)); //6


    // RANDOM
    // System.out.println(Math.random()); // 0.8287504259671619
    // System.out.println(Math.random()* 100); // 33.300690402534435
    // System.out.println((int)(Math.random()*100)); // 7, 70 ,74, ...

  
  // How to take INPUT in JAVA ?
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Input Your Age");
    // // int age = sc.nextInt(); // 18
    // float age = sc.nextFloat(); // 18.0
    // System.out.println(age);

    // System.out.println("Input Your Name");
    // String name = sc.next(); // Shubham
       // there is next fn jo sirf Token leta it's mean ye sirf single wrd print krta h 
    // String name = sc.nextLine(); //Shubham is a good boy 
    // System.out.println(name);


    // Comparison Operators
      // a == b
      // a != b
      // a < b
      // a > b
      // a <= b
      // a >= b
  
    // Conditional Statements
    // boolean isSunUp = true;
    // if(isSunUp == true)
    //   System.out.println("Day");// Day
    // else
    //   System.out.println("Night");
    // int age = 30;
    // if (age > 18)
    //     System.out.println("Can Vote"); // Can Vote
    // else
    //     System.out.println("can't Vote");    


    // Logical Operator - && 
    // int a = 40;
    // int b = 30;
    // if(a < 50 && b < 50 )
    // System.out.println("Both less than 50"); // Both less than 50


    // 'OR' Operator- ||
    // int a = 40;
    // int b = 60;
    // if(a < 50 || b < 50);
    // System.out.println("atleast one less than 50"); // atleast one less than 50


    // boolean isAdult = true; // not adult
    // if(!isAdult)
    //   System.out.println("isAdult");
    // else
    //   System.out.println("not adult");

  // Conditional Statements; if-else
    // Scanner sc = new Scanner(System.in);
    //   // pen = 10;  notebook = 40
    // int cash = sc.nextInt();
    // if(cash < 10){
    //   System.out.println("Can not buy anything");
    //   System.out.println("Get more cash");
    // }  
    // else if (cash > 10 && cash < 50){
    //   System.out.println("Can get 1 thing");
    // }
    // else {
    //   System.out.println("Can get both");
    // }



/*        // Switch statement 
    int day = 1; // 1- mon; 2- tues; 3- wed;...
    switch (day) {
      case 1:
        System.out.println("Monday");
      case 2:
        System.out.println("Tuesday");
      case 3:
        System.out.println("Wed-Sun");  
    }
     print = Monday
            Tuesday
            Wed-Sun
  } 

  int day = 2; // Tuesday
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wed-Sun");  
    }    */


    // For Loop; 1 - 100
    // for (int i = 0; i < 100; i++) {
    //   System.out.println(i);
    // }
    // for (int i = 100; i > 0; i--) {
    //   System.out.println(i);
    // }


    // While Loop
    // int j = 100;
    // while (j >= 1) {
    //   System.out.println(j);
    //   j = j - 1;
    // }


    // Do While 
    // int k = 100;
    // do {
    //   System.out.println(k);
    //   k = k - 1;
    // } while (k >= 1);


/* 
    Scanner sc = new Scanner(System.in);
    int number = 0;
    do {
      System.out.println("input a number");
      number = sc.nextInt();
      System.out.println("here is your number:");
    } while (number >= 0);
      System.out.println("THE END");
      // print  - input a number
                  5
                  here is your number:
                  input a number
                  -5
                  here is your number:
                  THE END
                  Process finished with exit code 0   */


    // Break & Continue
    // int i = 0;
    // while (true) {
    //   System.out.println(i);
    //   i = i + 1;
    //   if (i > 5){
    //     break;
    //   }
    // }               


    // int i = 0;
    // while (true) {
    //   if(i == 3) {
    //     i = i + 1;
    //     continue;
    //   }
    //   System.out.println(i);
    //   i = i + 1;
    //   if (i > 5){
    //     break;
    //   }
    // }
    // print = 0, 1, 2, 4, 5

    // TRY - CATCH in Exception HANDLING
    // int[] marks = {97, 98, 95};
    // // System.out.println(marks[2]);// 95
    // try {
    //   System.out.println(marks[5]);
    // } catch (Exception e) {
    //   // DO something after catching
    // }
    // System.out.println("The name is Aman");


    





  }
}  