package c50_class;

//게터와 세터형식의 클래스
class Person{
  String name;
  int age;
  
  //게터함수
  String getName() {
    return name;
  }
  
  //세터함수
  void setName(String name_) {
    name = name_;
  }
  
  int getAge() {
    return age;
  }
  
  void setAge(int age_) {
    age = age_;
  }
  
  void say() {
    System.out.println("이름 : "+this.getName());
    System.out.println("나이 : "+this.getAge());
  }
}

public class Ex90_GetterSetter {
  public static void main(String[] args) {
    Person duly = new Person();
    
    duly.setName("둘리");
    duly.setAge(7);
    
    System.out.printf("내 친구 %s는 %d살 입니다.\n",duly.getName(),duly.getAge());
    
    duly.say();
    
  }
  
}
