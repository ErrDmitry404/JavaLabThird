package iot.lviv.ua.manager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import iot.lviv.ua.model.Hall;
import iot.lviv.ua.model.Member;
import iot.lviv.ua.model.Musician;
import iot.lviv.ua.model.Performance;
import iot.lviv.ua.model.ShowType;

public class PerformanceManager {

  protected List<Performance> performances = new ArrayList<Performance>();

  public Performance createPerformance(Hall hall, String name, ShowType type, LocalDate date, int duration,
      double price) {

    Performance pm = new Performance(name, duration, date, type, price, hall);
    performances.add(pm);
    return pm;
  }

  public List<Performance> getPerformancesWithMusicians() {
    List<Performance> result = new ArrayList<>();

    for (Performance pf : performances) {
      for (Member mb : pf.getMembers()) {
        if (mb instanceof Musician) {
          result.add(pf);
          break;
        }
      }
    }
    return result;
  }

  public Performance getByName(String name) {
    for (Performance pf : performances) {
      if (pf.getName().equals(name)) {

        return pf;

      }

    }
    return null;
  }

  public List<Performance> getPerformances() {
    return performances;
  }
}
