/*
********************************************************
*Author: Nyakama Mahle                                 *
*publisher : Nyakama Mahle                             *
*Date: 2021/june/01;                                   *
*                                                      *
********************************************************
*/
import java.util.Scanner;

public class BirthDay{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

String name;
String J;//Java
String P;//Programming
String L;//Language


int currentYear,yearOfBirth,day,month,age;

    System.out.println("Enter your name ");
    name=input.nextLine();

    System.out.println("Enter year you were born in ");
    yearOfBirth=input.nextInt();

    System.out.println("Enter current year we are in ");
    currentYear=input.nextInt();

    System.out.println("Enter day you were born in ");
    day=input.nextInt();

    System.out.println("Enter month you were born in ");
    month=input.nextInt();

    age=currentYear-yearOfBirth;
    
    System.out.println("Date of Birth of "+name+" is " +yearOfBirth+"/"+month+"/"+day);
    System.out.println(name+" is "+age+" years old ");
    
    System.out.println("Enter Java" );
    J=input.nextLine();
    

    System.out.println("Enter Programming" );
    P=input.nextLine();
      


    System.out.println("Enter Language" );
    L=input.nextLine();

    System.out.println();
    System.out.println("Sample output1");
    System.out.println(J);
    System.out.println(P);
    System.out.println(L);
    System.out.println();
    System.out.println("Sample output2");
    System.out.println();
    System.out.println(L);
    System.out.println(P);
    System.out.println(J);
   
    

System.exit(0);

}

}







