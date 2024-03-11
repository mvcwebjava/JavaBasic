package collection_110;

public class Member {

  private String name;
	private String email;
	private String password;
	private String joinday;

	public Member(String name, String email, String password, String joinday) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.joinday = joinday;
	}


  @Override
  public String toString() {
    return "Member [name=" + name + ", email=" + email + ", password=" + password + ", joinday=" + joinday + "]";
  }

}
