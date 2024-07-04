package task2;

import java.util.Iterator;

public class process {
    double averagePercentage=0;
    char grade;

    double average(int tot,int sub){
    this.averagePercentage= tot /sub;
       return averagePercentage;
    }

    char gracecchack(int tot){

        if (averagePercentage >= 90) {
           this.grade = 'A';
        } else if (averagePercentage >= 80) {
            this.grade = 'B';
        } else if (averagePercentage >= 70) {
            this.grade = 'C';
        } else if (averagePercentage >= 60) {
            this.grade = 'D';
        } else {
            this.grade = 'F';
        }
return grade;
    }
}
