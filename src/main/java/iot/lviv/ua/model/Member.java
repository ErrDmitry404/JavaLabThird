package iot.lviv.ua.model;

public abstract class Member {
  public String fullName;
  public int age;
  private double salary;


  public Member(String fullName, int age, double salary) {
    this.fullName = fullName;
    this.age = age;
    this.salary = salary;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }


  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }



  public abstract void makeAction();

  @Override
  public String toString() {
    return "TeamMate{" +
        "fullName='" + fullName + '\'' +
        ", age=" + age +
        ", salary=" + salary +
        '}';
  }
}
