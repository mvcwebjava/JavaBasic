package c80_array;

public class Ex50_System_arraycopy {
  public static void main(String[] args) {

    // 배열의 부분복사
    // System.arraycopy(원본배열, 원본에서읽어올시작index, 복사할배열, 삽입할index, 읽어올개수);
    
    int[] source = new int[] {5,4,6,9,7,9};
    int[] target = {100,200,300,400,500,600,700};
    
    //원본배열의 일부분을 복사
    System.arraycopy(source, 2, target, 3, 4);//100,200,300,6,9,7,9

    for(int item : target) {
      System.out.print(item+"\t");
    }
  }
}
