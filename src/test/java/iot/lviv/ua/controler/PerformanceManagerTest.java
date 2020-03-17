package iot.lviv.ua.controler;

import iot.lviv.ua.manager.HallManager;
import iot.lviv.ua.manager.PerformanceManager;
import iot.lviv.ua.model.Actor;
import iot.lviv.ua.model.Musician;
import iot.lviv.ua.model.Performance;
import iot.lviv.ua.model.ShowType;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PerformanceManagerTest {

  private PerformanceManager pfm;
  private HallManager hm;

  @Before
  public void setUp() throws Exception {
    pfm = new PerformanceManager();
    hm = new HallManager();

    hm.addHall("Musical Hall", "old address 2", 30, 10);
    hm.addHall("Circus Hall", "near city address 5", 50, 20);
    hm.addHall("Ballet Hall", "new address 6", 70, 30);
    hm.addHall("Cinema Theatre", "new address 9", 50, 20);
    hm.addHall("Orchestral Hall", "new address 6", 60, 20);
    hm.addHall("Concert Hall", "new address 6", 80, 30);

    Performance p1 = pfm.createPerformance(hm.chooseHall(0), "Musical", ShowType.MUSICAL, LocalDate.of(2020, 4, 6), 90, 80);
    Performance p2 = pfm.createPerformance(hm.chooseHall(1), "Circus with Wolves", ShowType.CIRCUS, LocalDate.of(2020, 4, 1), 60, 40);
    Performance p3 = pfm.createPerformance(hm.chooseHall(2), "Ballet Show", ShowType.BALLET, LocalDate.of(2020, 4, 9), 90, 130);
    Performance p4 = pfm.createPerformance(hm.chooseHall(3), "Blockbuster", ShowType.MOVIE, LocalDate.of(2020, 4, 10), 90, 70);
    Performance p5 = pfm .createPerformance(hm.chooseHall(4), "Grand Orchestral", ShowType.ORCHESTRAL,LocalDate.of(2020, 4, 8), 180, 180);
    Performance p6 = pfm.createPerformance(hm.chooseHall(5), "Grand Concert", ShowType.CONCERT,LocalDate.of(2020, 4, 8), 180, 100);

    p1.addMember(new Musician("John Jo", 30, 1800, "Guitar", "Pro"));
    p1.addMember(new Musician("Sebastian Nar", 45, 700, "Drums", "Novice"));
    p1.addMember(new Musician("Sebastian Vito", 41, 900, "Piano", "Novice"));
    p2.addMember(new Actor("Bob Joe", 19, 3000, "Animal Trainer", 10));
    p3.addMember(new Actor("Sarah Mo", 23, 9000, "Choreographer", 70));
    p4.addMember(new Actor("Bob Sar", 25, 20000, "main-role", 20));
    p4.addMember(new Actor("Ronald Sar", 22, 19000, "main-role", 30));
    p5.addMember(new Musician("Sebastian Sui", 48, 19000, "Violin", "Pro"));
    p6.addMember(new Musician("Rick Sui", 35, 17000, "Saxophone", "Pro"));
  }

  @Test
  public void getPerformancesWithMusicians() {
    List<Performance> result = new ArrayList<>();

    Performance p1 = pfm.getByName("Musical");
    Performance p5 = pfm.getByName("Grand Orchestral");
    Performance p6 = pfm.getByName("Grand Concert");
    result.add(p1);
    result.add(p5);
    result.add(p6);
    Assert.assertEquals(result, pfm.getPerformancesWithMusicians());

  }
}
