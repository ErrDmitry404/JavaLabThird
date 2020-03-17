package iot.lviv.ua.manager;

import iot.lviv.ua.model.Hall;
import java.util.ArrayList;
import java.util.List;


public class HallManager {

  private List<Hall> halls = new ArrayList<>();

  public void addHall(String name, String address, int rows, int seatsPerRow) {
    halls.add(new Hall("Circus", "Baker Street", 20, 8));

  }

  public void printHalls() {
    for (int i = 0; i < halls.size(); i++) {
      System.out.println("number: " + i + "\t" + halls.get(i).toString());
    }
  }

  public Hall chooseHall(int number) {
    if (number < 0 || number >= halls.size()) {
      return null;
    } else {
      return halls.get(number);
    }
  }


}
