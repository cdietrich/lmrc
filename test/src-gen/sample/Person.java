package sample;

public class Person {
  private String lastname;
  
  public String getLastname() {
    return this.lastname;
  }
  
  public void setLastname(final String lastname) {
    this.lastname = lastname;
  }
  
  private String firstname;
  
  public String getFirstname() {
    return this.firstname;
  }
  
  public void setFirstname(final String firstname) {
    this.firstname = firstname;
  }
  
  private Integer age;
  
  public Integer getAge() {
    return this.age;
  }
  
  public void setAge(final Integer age) {
    this.age = age;
  }
  
  public String fullName(final String from) {
    String _plus = ("Hello " + this.firstname);
    String _plus_1 = (_plus + " ");
    String _plus_2 = (_plus_1 + this.lastname);
    String _plus_3 = (_plus_2 + " from ");
    return (_plus_3 + from);
  }
}
