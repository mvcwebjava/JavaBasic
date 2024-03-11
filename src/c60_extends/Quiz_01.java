package c60_extends;

//연습문제 -  부모클래스 디자인
/**
 *--------------------------------------
 * 다음의 출력결과가 표시되도록 함께 제공되는 Rect클래스를
 * 참고해서 Share 클래스를 완성하세요.
 * 단, Rect 클래스와 Exam0501 클래스는 수정할 수 없습니다.
 *
 *
 * [실행결과 예시]
 *--------------------------------------
 *      Shape [width=10, height=5]
 *      면적: 50
 *      둘레: 30
 */

class Shape {

    private int width;
    private int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return 0;
    }

    public int getRound() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shape [width=" + width + ", height=" + height + "]";
    }

}

class Rect extends Shape {
    /**
     * 생성자
     * @param width     - 가로길이
     * @param height    - 세로길이
     */
    public Rect(int width, int height) {
        super(width, height);
    }
    
    /**
     * 면적을 구해서 리턴한다.
     */
    @Override
    public int getArea() {
        int x = this.getWidth();
        int y = this.getHeight();
        int z = x * y;
        return z;
    }

    /**
     * 둘레의 길이를 구해서 리턴한다.
     */
    @Override
    public int getRound() {
        int x = this.getWidth();
        int y = this.getHeight();
        int z = (x * 2) + (y * 2);
        return z;
    }
}

public class Quiz_01 {
    public static void main(String[] args) {
        Rect r = new Rect(10, 5);
        System.out.println(r.toString());
        
        int a = r.getArea();
        int b = r.getRound();
        
        System.out.println("사각형의 면적: " + a);
        System.out.println("사각형의 둘레: " + b);
    }
}
