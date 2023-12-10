import java.util.Scanner;
public class Student_grade_calculator {
    public static char grade(double percentage){
        char grade='.';
        String grades="OABCDEFGHIJ" ;
        int grade_finder=10-((int) percentage/10);
        grade=grades.charAt(grade_finder);
        return grade;
    }
    public static void display_result(double total_mark,double percentage,char grade){
        System.out.println("Total Marks obtained in all subjects: "+total_mark);
        System.out.println("Prcentage obtained by the student: "+percentage+"%");
        System.out.println("\nGrade Distrubution\n'O' --> Outstanding (100%)\n'A' --> (90-99%)\n'B' --> (80-89%)\n'C' --> (70-79%)\n'D' --> (60-69%)\n'E' --> (50-59%)\n'F' --> (40-49%)\n'G' --> (30-39%)\n'H' --> FAIL(20-29%)\n'I' --> FAIL(10-19%)\n'J' --> FAIL(0-9%)");
        System.out.println("Yout grade is: "+grade);
    }
    public static void main(String args[]){
        //Input Marks obtained in different subjects
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks obtained in Maths: ");
        double Maths=sc.nextDouble();
        System.out.print("Enter marks obtained in Physics: ");
        double Physics=sc.nextDouble();
        System.out.print("Enter marks obtained in Chemistry: ");
        double Chemistry=sc.nextDouble();
        System.out.print("Enter marks obtained in English: ");
        double English=sc.nextDouble();
        System.out.print("Enter marks obtained in Computer science: ");
        double Computer_science=sc.nextDouble();

        //object formation
        Subjects student=new Subjects(Maths,Physics,Chemistry,English,Computer_science);
        double total_mark=student.total_marks();
        double percentage=student.percentage();
        char grade=grade(percentage);
        display_result(total_mark,percentage,grade);
    }
}
class Subjects{
    double Maths,Physics,Chemistry,English,Computer_science,total;
    Subjects(double Maths,double Physics,double Chemistry,double English,double Computer_science){
        this.Maths=Maths;
        this.Physics=Physics;
        this.Chemistry=Chemistry;
        this.English=English;
        this.Computer_science=Computer_science;
    }
    public double total_marks(){
        double total=this.Maths+this.Physics+this.Chemistry+this.English+this.Computer_science;
        this.total=total;
        return total;
    }
    public double percentage(){
        double avg_perc=this.total/5;
        return avg_perc;
    }
}
