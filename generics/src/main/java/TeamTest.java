public class TeamTest {


    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

      //  Team liverpool = new Team("Liverpool");

        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");

       // Team<String> brokenTeam = new Team<>("This won't work");

//        liverpool.addPlayer(joe);
//        liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

        System.out.println(liverpool.numPlayers());



    }
}
