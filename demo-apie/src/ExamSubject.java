public class ExamSubject {
  // name (English, etc)
  private static int EXAM_CODE = 0; // across objects
  private long id;
  private Name name;
  // score
private int score;

public static ExamSubject ofEnglish() {
  return new ExamSubject(Name.ENGLISH, ++EXAM_CODE);
}

public static ExamSubject ofHistory() {
  return new ExamSubject(Name.HISTORY, ++EXAM_CODE);
}

public static ExamSubject ofMath() {
  return new ExamSubject(Name.MATH, ++EXAM_CODE);
}

  // Construtor
  private ExamSubject(Name name, long id) {
    this.name = name;
    this.id = id;
  }
  // getter, setter
  public void setScore(int score) {
    this.score = score;
  }

  public String getName() {
    return this.name.name();
  }
  public int getScore() {
    return this.score = score;
  }
  // equals(), toString, hashCode()
private enum Name{
  ENGLISH, HISTORY, MATH;
}

  // main
}
