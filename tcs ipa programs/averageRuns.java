package xplore;

import java.util.Arrays;
import java.util.Scanner;

public class averageRuns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Player[] players = new Player[4];
        for(int i=0;i<4;i++){
            players[i]=new Player(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        int target=sc.nextInt();
        double[] result=findAverageOfRuns(players,target);
        for (int i=0;i<result.length;i++){
            if(result[i] >= 80 && result[i] <= 100)
                System.out.println("Grade A");
            else if(result[i] >= 50 && result[i] <= 79)
                System.out.println("Grade B");
            else
                System.out.println("Grade C");
        }
    }
    public static double[] findAverageOfRuns(Player[] players, int target){
        double[] ans=new double[0];
        for(int i=0;i<players.length;i++){
            if(players[i].getMatchesPlayed() >= target){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = (double)(players[i].getRunsScored()/players[i].getMatchesPlayed());
            }
        }
        return ans;
    }
}
class Player{
    private int id;
    private String name;
    private int iccRank;
    private int matchesPlayed;
    private int runsScored;

    public int getId() {
        return id;
    }

    public Player(int id, String name, int iccRank, int matchesPlayed, int runsScored) {
        this.id = id;
        this.name = name;
        this.iccRank = iccRank;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIccRank() {
        return iccRank;
    }

    public void setIccRank(int iccRank) {
        this.iccRank = iccRank;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }
}
