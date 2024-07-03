package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class STUDENT_GRADE_CALCULATOR {
    public static void main(String[] args) {
        List <data> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome the student grade calculator");
        System.out.println("enter the no. of student");
        int num=sc.nextInt();
        System.out.println("enter the total no. of subject");
        int sub=sc.nextInt();
        int[]marks=new int[sub];
        int i=0;
        int j=0;
        while (i<num){
            System.out.println(i+1+" student no.");
            System.out.println("enter your name");
            String name=sc.next();
            System.out.println("enter your roll no.");
            int rollnum=sc.nextInt();
            while (sub>j){
                System.out.println("subject no. "+j+" enter the marks");
                marks[j]=sc.nextInt();
            }
            list.add(new data(name,rollnum,marks));
        }


    }
}
