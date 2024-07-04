package task2;

import java.util.*;

public class STUDENT_GRADE_CALCULATOR {
   private static List<data> list;
    public static void main(String[] args) {
   list=new ArrayList<>();
   process ob1=new process();
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome the student grade calculator");
        System.out.println("enter the no. of student");
        int num=sc.nextInt();
        System.out.println("enter the total no. of subject");
        int sub=sc.nextInt();

        int i=0;
int tot=0;
        while (i<num){
            int[]marks=new int[sub];
            System.out.println(i+1+" student no.");
            System.out.println("enter your name");
            String name=sc.next();
            System.out.println("enter your roll no.");
            int rollnum=sc.nextInt();
          for (int j=0;j<sub;j++){
                System.out.println("subject no. "+j+1+" enter the marks");
                marks[j]=sc.nextInt();
            }
          for (int a=0;a<marks.length;a++){
              tot+=marks[a];
          }
          double averrper=ob1.average(tot,sub);
          char grade= ob1.gracecchack(tot);
          list.add(new data(name,rollnum,marks,averrper,tot, grade));
          i++;
        }

      for (data c:list){
          System.out.println("the student name is "+c.getName() +"\n and roll no. is "+c.getRoll()+"\n tottal marks "+c.getPersen()+"\n and the average marks "+c.getAvg()+"\n and grace "+c.getGrace());
      }
        }
}
