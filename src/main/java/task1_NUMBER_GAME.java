import java.util.Random;
import java.util.Scanner;

public class task1_NUMBER_GAME {
    int randomnum;
    int score =0;
    void cpunum(){
        Random  random=new Random();
        this.randomnum=random.nextInt(100);
    }
   Boolean persion(int num){
       if (num!=this.randomnum){
           System.out.println("pleace try again ");
           if (num<this.randomnum){
               System.out.println("too lower");
           }
           else if (num>this.randomnum){
               System.out.println("too higher");
           }
           score++;
           return true;
       }else {
           System.out.println("won the game\nand the score is : "+this.score);
           return false;
       }

    }
    public static void main(String[] args) {
        System.out.println("let start the game");
        System.out.println(".....................................................................");
task1_NUMBER_GAME ob1=new task1_NUMBER_GAME();
        Scanner sc=new Scanner(System.in);
ob1.cpunum();
Boolean  t=true;
while (t){
    boolean ans=ob1.persion(sc.nextInt());
    t=ans;
    System.out.println("..........................................................................");
}
    }
}
