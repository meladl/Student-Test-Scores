package students.test.scores;
public class Student {
    public Student(){
        grade = 0;
        quizcount = 0;
        name = "";
    }
    public Student(String n){
        grade = 0;
        quizcount = 0;
        name = n;
    }
public String getName(){
        return name;
    }
    public void addQuiz(double score){
        double newscore = (score/100)*100;
        double  newGrade = grade + newscore;
        grade = newGrade ;
        quizcount = quizcount +  1;
    }
    public double getTotalScore(){
        return grade; 
    }
    public double getAverageScore(){
        return (grade/quizcount);
    }
    private double grade;
    private double quizcount;
    private String name;
}
    
