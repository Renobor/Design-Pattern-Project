/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerPattern;
import java.util.*;
import createClient.*;
/**
 *
 * @author wjdgh
 */
public class PaymentInformation implements Subject {
    private ArrayList<Observer> observers;
    private String msrmdpst; //예금주명
    private String fnncInst; //금융기관
    private String bankacntnmbr; //계좌번호
    private String pymnmthd; //납부방법
    private int s; //테이블 행 번호
    
    public PaymentInformation(){
        observers = new ArrayList<>();
    } 
    
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        observers.remove(index);
    }

    public void notifyObserver() {
        for(Observer o : observers){
            o.update(msrmdpst, fnncInst, bankacntnmbr, pymnmthd, s);
        }
    }
    
    public void setPaymentInformation(String msrmdpst, String fnncInst, String bankacntnmbr, String pymnmthd, int s){
        this.msrmdpst = msrmdpst;
        this.fnncInst = fnncInst;
        this.bankacntnmbr = bankacntnmbr;
        this.pymnmthd = pymnmthd;
        this.s = s;
        
        //변경된 값로 업데이트
        notifyObserver();
    }
}
