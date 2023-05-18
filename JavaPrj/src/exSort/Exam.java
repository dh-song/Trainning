package exSort;

public class Exam implements Comparable<Exam> {
    private int kor;
    private int eng;
    private int math;
    
    public Exam() {
       // TODO Auto-generated constructor stub
    }
 
    public Exam(int kor, int eng, int math) {
       super();
       this.kor = kor;
       this.eng = eng;
       this.math = math;
    }
 
    public int getKor() {
       return kor;
    }
 
    public void setKor(int kor) {
       this.kor = kor;
    }
 
    public int getEng() {
       return eng;
    }
 
    public void setEng(int eng) {
       this.eng = eng;
    }
 
    public int getMath() {
       return math;
    }
 
    public void setMath(int math) {
       this.math = math;
    }
    
    public int total() {
       return kor+eng+math;
    }
 
    @Override
    public String toString() {
       return "Exam [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
    }

   @Override
   public int compareTo(Exam o) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
   }
 
 
 
    
 }