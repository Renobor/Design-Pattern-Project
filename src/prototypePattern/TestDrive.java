/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypePattern;



import static prototypePattern.Amnt.amnt;
import static prototypePattern.Bankacntnmbr.bankacntnmbr;
import static prototypePattern.CrctFctr.crctFctr;
import static prototypePattern.FnncInst.fnncInst;
import static prototypePattern.Lastmonth.lastmonth;
import static prototypePattern.Mesurementnumber.mesurementnumber;
import static prototypePattern.Msrmdpst.msrmdpst;
import static prototypePattern.NmbrfuelqnttIndc.nmbrfuelqnttIndc;
//import static prototypePattern.Pymnmthd.pymnmthd;
import static prototypePattern.Qnttrqst.qnttrqst;
import static prototypePattern.Rcptamnt.rcptamnt;
import static prototypePattern.Thismonth.thismonth;
import static prototypePattern.Trnsdate.trnsdate;
import static prototypePattern.Usage.usage;

import observerPattern.*;

import java.util.HashMap;


/**
 *
 * @author wjdgh
 */
public class TestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager manager = new Manager();
        PaymentInformation pi = new PaymentInformation();
        
        /* 고객 상세내역 */
        //계량기번호
        Mesurementnumber mesuremennumber = new Mesurementnumber(mesurementnumber);
        //전월지침
        Lastmonth lasmonth = new Lastmonth(lastmonth);
        //당월지침
        Thismonth thimonth = new Thismonth(thismonth);
        //보정계수
        CrctFctr crcFctr = new CrctFctr(crctFctr);
        //사용량
        Usage usag = new Usage(usage);
        //열량계수
        NmbrfuelqnttIndc nmbrfuelqnttlnd = new NmbrfuelqnttIndc(nmbrfuelqnttIndc);
        //청구량
        Qnttrqst qnttrqs = new Qnttrqst(qnttrqst);

        /* 자동납부 이체안내 */
        //예금주명
        Msrmdpst msrdpst = new Msrmdpst(pi);
        //금융기관
        FnncInst fnclnst = new FnncInst(pi);
        //계좌번호
        Bankacntnmbr bank = new Bankacntnmbr(pi);
        //이체일자
        Trnsdate transdate = new Trnsdate(trnsdate);

        /* 요금납부 정보 */
        //금액수납일
        Rcptamnt rcptmnt = new Rcptamnt(rcptamnt);
        //납부방법
        Pymnmthd pym = new Pymnmthd(pi);
        //금액
        Amnt amt = new Amnt(amnt);
        
        pi.setPaymentInformation("aa", "aa", "aa", "aa", 0);
        pym.print();
        bank.print();
        
        /*
        //HashMap을 이용하여 객체 생성 효율적으로 저장하고 필요시 해당 데이터를 쉽게 삭제하기 위함.
        manager.register("Mesurementnumber", mesuremennumber);
        manager.register("Lastmonth", lasmonth);
        manager.register("Thismonth", thimonth);
        manager.register("CrctFctr", crcFctr);
        manager.register("Usage", usag);
        manager.register("NmbrfuelqnttIndc", nmbrfuelqnttlnd);
        manager.register("Qnttrqst", qnttrqs);
                
        manager.register("Msrmdpst", msrdpst);
        manager.register("FnncInst", fnclnst);
        manager.register("Bankacntnmbr", bank);
        manager.register("Trnsdate", transdate);
        
        manager.register("Rcptamnt", rcptmnt);
        manager.register("Pymnmthd", pym);
        manager.register("Amnt", amt);
        
        Product clone1 = manager.create("Mesurementnumber");
        Product clone2 = manager.create("Lastmonth");
        Product clone3 = manager.create("Thismonth");
        Product clone4 = manager.create("CrctFctr");
        Product clone5 = manager.create("Usage");
        Product clone6 = manager.create("NmbrfuelqnttIndc");
        Product clone7 = manager.create("Qnttrqst");
        
        Product clone8 = manager.create("Msrmdpst");
        Product clone9 = manager.create("FnncInst");
        Product clone10 = manager.create("Bankacntnmbr");
        Product clone11 = manager.create("Trnsdate");
        
        Product clone12 = manager.create("Rcptamnt");
        Product clone13 = manager.create("Pymnmthd");
        Product clone14 = manager.create("Amnt");
        
        System.out.println("고객 상세내역");
        System.out.println("****************************");
        clone1.print();
        clone2.print();
        clone3.print();
        clone4.print();
        clone5.print();
        clone6.print();
        clone7.print();
        
        System.out.println("\n");
        System.out.println("자동납부 이체안내");
        System.out.println("****************************");
        clone8.print();
        clone9.print();
        clone10.print();
        clone11.print();
        
        System.out.println("\n");
        System.out.println("요금납부 정보");
        System.out.println("****************************");
        clone12.print();
        clone13.print();
        clone14.print();
*/
    }

}
