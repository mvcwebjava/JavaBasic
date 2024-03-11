package c80_array;

//연습문제 - 배열 데이터 역순 배치
public class Quiz_01_배열데이터_역순배치 {
  public static void main(String[] args) {
    
    int[] arr = { 1, 9, 4, 2, 5 };
    
    // 배열을 역순으로 재정렬하기
    //--> 0번재 항목과 마지막(배열길이 -1 번째) 항목을 맞교환. 
    //--> 1번재 항목과 끝에서 두번재 ((배열길이-1)-1번째) 항목을 
    //     맞교환
    //--> n번째 항목과 ((배열길이 - 1)-n) 번재 항목을 맞교환 
    for (int i = 0; i <arr.length / 2; i++) {
        
        int temp = arr[i];
        //i번째 항목을 임시 변수에 복사한다.
        arr[i] = arr[(arr.length -1) -i];
        //반대쪽 항목을 i번째 위치로 복사한다.
        arr[(arr.length - 1) -i] =temp;
        //임시 변수의 값을 반대쪽 항목에 복사한다.
        }
        printArray(arr);
    }
  
    public static void printArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
