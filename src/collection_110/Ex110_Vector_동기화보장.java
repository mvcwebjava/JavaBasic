package collection_110;

import java.util.Vector;

public class Ex110_Vector_동기화보장 {

  public static void main(String[] args) {
    
    //ArrayList와 사용법 동일
    Vector<String> v  = new Vector<String>();
    
    v.addElement(new String("둘리"));//0
    v.add("길동");
    
    v.insertElementAt("마이쿨", 1);//중간에 데이터 삽입
    v.setElementAt("마이콜", 1);//데이터 수정
    
    String duly = v.elementAt(0);
    String micol = v.get(1);
    String gildong = v.get(2);
    
    
    System.out.println(duly);
    System.out.println(micol);
    System.out.println(gildong);
    
    System.out.println("v 벡터의 크기는 "+ v.size());
    
    int index = v.indexOf("길동");
    System.out.println("길동 데이터의 인덱스 위치는 "+index);
    
    
    System.out.println("둘리 라는 데이터가 존재하나요? "+v.contains("둘리"));
    

    
  }

}
