package c80_array;

public class Ex30_배열복습과_advanced_for {

  public static void main(String[] args) {
    
    //배열변수에 데이터 저장
    //같은 데이터타입의 값을 한꺼번에 여러개 저장
    int[] likeNum = {7, 5, 2, 10, 20, 46, 12, 55, 122};
    
    //배열의 길이
    System.out.println(likeNum.length + "개");
    
    //배열원소에 값을 재할당
    likeNum[0] = 15;
    likeNum[1] = 80;
    
    //인덱스를 이용해서 배열에 저장된 값을 출력
    System.out.println(likeNum[0]);   
    System.out.println(likeNum[1]);   
    System.out.println(likeNum[2]);   
    System.out.println(likeNum[3]);   
    
    
    System.out.println("-----------------------------");
    
    //전통적인 for문을 이용한 배열 데이터 출력
    for(int i=0;i<likeNum.length;i++) {
      System.out.println(likeNum[i]);
    }
    
    
    System.out.println("-----------------------------");
    
    //기능이 향상된 Advanced for문
    for(int num : likeNum) {
      System.out.println(num);
    }
    

    System.out.println("-----------------------------");
    
    
    //배열의 특징
    //1. 단순히 양적인 저장공간
    //2. 배열의 크기를 변경할 수 없다.
    //3. 사용자가 직접 전체 데이터를 확인해야 한다.
    int[] num = new int[10];
    
    //가장 전통적인 for문
    for(int i=0;i<10;i++) {
      num[i] = (i+1)*100;
    }
    
    for(int value : num) {
      System.out.println(value);
    }
        
    
  }

}
