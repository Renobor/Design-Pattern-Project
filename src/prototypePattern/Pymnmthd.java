package prototypePattern;

import observerPattern.*;

public class Pymnmthd extends Product implements Observer{

    public  static String pymnmthd[] = {"자동이체", "자동이체", "자동이체", "방문납부", "자동이체", "방문납부", "방문납부", "자동이체", "자동이체", "자동이체"};
    private Subject subject;
    
    public Pymnmthd(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

     //Observer로 변경되는 값
    public void update(String msrmdpst, String fnncInst, String bankacntnmbr, String pymnmthd, int s){
        this.pymnmthd[s] = pymnmthd;
    }
    
    public void print() {
        /*System.out.println("납부방법");
        System.out.println("-------------------------------");
        for (int i = 0; i < pymnmthd.length; i++) {
            System.out.print(i + 1 + ".  ");
            System.out.println(pymnmthd[i]);
        }*/
         System.out.println(pymnmthd[0]);
    }

}
