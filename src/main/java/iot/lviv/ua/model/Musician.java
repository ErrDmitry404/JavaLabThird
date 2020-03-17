package iot.lviv.ua.model;


public class Musician extends Member {
  private String instrument;
  private String masterLevel;

  public Musician(String fullName, int age, double salary, String instrument,
      String masterLevel) {
    super(fullName, age, salary);
    this.instrument = instrument;
    this.masterLevel = masterLevel;
  }

  public String getInstrument() {
    return instrument;
  }

  public void setInstrument(String instrument) {
    this.instrument = instrument;
  }

  public String getMasterLevel() {
    return masterLevel;
  }

  public void setMasterLevel(String masterLevel) {
    this.masterLevel = masterLevel;
  }

  @Override
  public void makeAction() {
    System.out.println(fullName+ "play on: "+instrument);
  }

  @Override
  public String toString() {
    return "Musician{" +
        " fullName='" + fullName +
        ", age=" + age +
        ", instrument='" + instrument +
        ", masterLevel='" + masterLevel +
        '}';
  }
}
