public class Student {
    private String name;
    private int classScore;
    private int numberOfQuizes = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassScore() {
        return classScore;
    }

    public void setClassScore(int classScore) {
        this.classScore = classScore;
    }

    public Student(String name, int quizScore) {
        this.name = name;
        this.classScore = quizScore;
    }
    public void addQuiz(int Score){
        classScore += Score;
        numberOfQuizes++;
    }
    public void getAverageScore() {
        int aveScore = classScore/numberOfQuizes;
        System.out.println(aveScore);
    }

}
