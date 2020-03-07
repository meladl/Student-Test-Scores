package students.test.scores;
public class StudentsTestScores {
    public static void main(String[] args) {
    Student mohamed = new Student("Mohamed Eladl");
    mohamed.addQuiz(90);
    mohamed.addQuiz(84);
    mohamed.addQuiz(105);
    mohamed.addQuiz(80);
    mohamed.addQuiz(70);
    mohamed.addQuiz(45);
    mohamed.addQuiz(50);
    mohamed.addQuiz(100);
    mohamed.addQuiz(75);
    mohamed.addQuiz(99);
    System.out.println("Student's name is ");
    System.out.println(mohamed.getName());
    System.out.println("Student's Total Score is ");
    System.out.println(mohamed.getTotalScore());
    System.out.println("Student's Average Score is ");
    System.out.println(mohamed.getAverageScore());
    }
    
}
