package iot.lviv.ua.model;

public class Hall {
  private String name;
  private String address;
  private int rows;
  private int seatsPerRow;

  public Hall(String name, String address,int rows, int seatsPerRow) {
    this.name = name;
    this.address = address;
    this.rows = rows;
    this.seatsPerRow = seatsPerRow;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public int getRows() {
    return rows;
  }

  public void setRows(int rows) {
    this.rows = rows;
  }

  public int getSeatsPerRow() {
    return seatsPerRow;
  }

  public void setSeatsPerRow(int seatsPerRow) {
    this.seatsPerRow = seatsPerRow;
  }
}
