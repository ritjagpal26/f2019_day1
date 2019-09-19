package com.lambton;

public class FirstDay
{
    public static void main(String[] args )
    {
        System.out.println("Welcome to java programming");
        int a=10,b=20,c;
        c=a+b;
        //display result
        System.out.println("sum :" +c);

        int x= Integer.MAX_VALUE;
        System.out.println("X :"+x);

        int y=x+1;

        System.out.println("Y :"+y);


        Student s1 = new Student();
        s1.setvalue();
        s1.display();

        Student s2= new Student();
        s2.studentID=2;
        s2.studentName="Kuldeep singh";
        s2.display();

        Student s3 = new Student();
        s3.studentID=3;
        s3.studentName="Pritesh Kumar";
        s3.display();
    }
}
