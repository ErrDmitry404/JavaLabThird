package iot.lviv.ua.model;

import java.util.UUID;

public class Ticket {

  private long id;
  private double price;
  private int seat;
  private int row;
  private Performance performance;
  private boolean isSold;

  public Ticket(double price, int seat, int row, Performance performance, boolean isSold) {
    this.id = Math.abs(UUID.randomUUID().getLeastSignificantBits());
    this.price = price;
    this.seat = seat;
    this.row = row;
    this.performance = performance;
    this.isSold = isSold;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getSeat() {
    return seat;
  }

  public void setSeat(int seat) {
    this.seat = seat;
  }

  public int getRow() {
    return row;
  }

  public void setRow(int row) {
    this.row = row;
  }

  public Performance getPerformance() {
    return performance;
  }

  public void setPerformance(Performance performance) {
    this.performance = performance;
  }

  public boolean isSold() {
    return isSold;
  }

  public void setSold(boolean sold) {
    isSold = sold;
  }

  @Override
  public String toString() {
    return "Ticket{" +
        "id='" + id + '\'' +
        ", price=" + price +
        ", seat='" + seat + '\'' +
        ", row='" + row + '\'' +
        ", performance=" + performance.getName() +
        ", isSold=" + isSold +
        '}';
  }


}
