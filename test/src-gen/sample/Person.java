package sample;

import org.eclipse.xtext.xbase.lib.StringExtensions;

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
  
  public String fullName(final String from) {
    String _operator_plus = StringExtensions.operator_plus("Hello ", this.firstname);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, " ");
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, this.lastname);
    String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, " from ");
    String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, from);
    return _operator_plus_4;
  }
}
