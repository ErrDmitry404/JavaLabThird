package iot.lviv.ua.model;

public class Actor extends Member {
  private String role;
  private int experience;

  public Actor(String fullName, int age, double salary, String role, int experience) {
    super(fullName, age, salary);
    this.role = role;
    this.experience = experience;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public int getExperience() {
    return experience;
  }

  public void setExperience(int experience) {
    this.experience = experience;
  }

  @Override
  public void makeAction() {
    System.out.println(fullName+ "play role: "+role);
  }

  @Override
  public String toString() {
    return "Actor{" +
        " fullName='" + fullName +
        ", age=" + age +
        "role='" + role +
        ", experience='" + experience +
        '}';
  }
}
