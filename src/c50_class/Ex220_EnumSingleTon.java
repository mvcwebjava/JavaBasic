package c50_class;

enum CalcEnum{
    INSTANCE;
}

public class Ex220_EnumSingleTon {
    public static void main(String[] args) {
        CalcEnum instance_1 = CalcEnum.INSTANCE;
        CalcEnum instance_2 = CalcEnum.INSTANCE;
    
        System.out.println("instance_1==instance_2 : "+(instance_1==instance_2));

    }
}


