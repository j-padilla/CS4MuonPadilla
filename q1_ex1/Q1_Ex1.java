
package q1_ex1;

/**
 *
 * @author MUON
 */
public class Q1_Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int mt = 7;
      int jt = 4;
      int ty = mt + jt;
      boolean isMore = true;
      String mtSubj = "Computer Science";
      String jtSubj = "Social Science";
      boolean sS = true;
      
      if(mtSubj.equals(jtSubj)) {
          sS = true;
      }
      else {
          sS = false;
      }
      
      if(jt > mt) {
         isMore = true;
      }
      else {
         isMore = false;
      }
            
      System.out.printf("Teacher 1 %nName: Mark Tarcelo %nSubject: %s  %nYears of Teaching: %d %n",mtSubj, mt );
      System.out.printf("%nTeacher 2 %nName: Joshua Tarcelo %nSubject: %s  %nYears of Teaching: %d %n",jtSubj, jt );

      System.out.printf("%nTotal years of teaching: %d %n",ty);
      System.out.println("Joshua Tarcelo has more years of teaching: " + isMore);
      System.out.printf("The teachers have the same subject: " + sS );
      
    }
    
}
