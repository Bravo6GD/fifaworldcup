
import models.players;
import models.teams;
import models.groups;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> plist = new ArrayList<String>();
        plist.add("Messi");
        plist.add("Maguire");
        plist.add("Ronaldo");
        players player1= new players("messi",1,34,99);
        teams team1 = new teams("Argentina","blue/white","RW");
        groups group = new groups("C");

        player1.printFormat();;
        team1.printFormat();
        group.printFormat();


    }
}