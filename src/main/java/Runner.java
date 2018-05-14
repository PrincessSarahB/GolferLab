import db.DBGolfer;
import models.Golfer;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Bob", "Bob", 20);
        DBGolfer.save(golfer1);

        Golfer golfer2 = new Golfer("Fred", "Fred", 30);
        DBGolfer.save(golfer2);

        DBGolfer.delete(golfer1);

        golfer2.setFirstName("bob");

        DBGolfer.update(golfer2);

        List<Golfer> golfers = DBGolfer.getGolfers();

        Golfer foundGolfer = DBGolfer.find(golfer2.getId());


    }
}
