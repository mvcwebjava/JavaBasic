package collection_110;

public class Student {
    private int no;
    private String name;
    private String tel;
    
    public Student(int no, String name, String tel) {
        this.no = no;
        this.name = name;
        this.tel = tel;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void printInfo(){
        System.out.println("번호 : "+this.no);
        System.out.println("이름 : "+this.name);
        System.out.println("연락처 : "+this.tel);
        System.out.println("----------------------------------------");
    }
}

