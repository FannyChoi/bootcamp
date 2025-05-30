public class Candidate extends ExamSubject {
  private ExamSubject[] examSubjects;

  public Candidate() {
    this.examSubjects = new ExamSubject[3];
  }

  public void attendEnglishExam() {
    this.examSubjects[0] = ExamSubject.ofEnglish();
  }

  public void attendHistoryExam() {
    this.examSubjects[1] = ExamSubject.ofHistory();
  }

  public void attendMathExam() {
    this.examSubjects[2] = ExamSubject.ofMath();
  }

  public int getEnglishScore() {
    return this.examSubjects[0].getScore();
  }

  public int getHistoryScore() {
    return this.examSubjects[1].getScore();
  }

  public int getMathScore() {
    return this.examSubjects[2].getScore();
  }

  public void setEnglish(int score) {
    if (this.examSubjects[0] != null) {
      this.examSubjects[0].setScore(score);
    } else {
      System.out.println("The candidate didn't attend the English Exam");
    }
  }

  public void setHistory(int score) {
    this.examSubjects[1].setScore(score);
  }

  public void setMath(int score) {
    this.examSubjects[2].setScore(score);
  }


  public static void main(String[] args) {
    Candidate canA
  }
}
