
package prototypePattern;
import java.util.HashMap;


public class Manager {
  //HashMap을 이용하여 객체 생성. 효율적으로 저장하고 필요시 해당 데이터를 쉽게 삭제하기 위함.  
  private HashMap showcase = new HashMap();

    // name = hash key값
    // proto = data 값
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }
    
    public void delete(String name) {
        showcase.remove(name);
    }
    
    public Product create(String protoname) {
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }

}
