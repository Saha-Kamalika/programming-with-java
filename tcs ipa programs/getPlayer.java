package xplore;

import java.util.Scanner;

public class getPlayer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Players[] players=new Players[4];
        for(int i=0;i<4;i++){
            players[i]=new Players(sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
        }
        String skill=sc.next();
        int ans=findPointsForGivenSkill(players, skill);
        if(ans>0) System.out.println(ans);
        else System.out.println("The given Skill is not available");
        String level=sc.next();
        Players res=getPlayerBasedOnLevel(players, skill, level);
        if(res!=null) System.out.println(res.getPlayerId());
        else System.out.println("No player is available with specified level, skill and eligibility points");
    }
    public static int findPointsForGivenSkill(Players[] players, String skill){
        int sum=0;
        for(int i=0;i<players.length;i++){
            if(players[i].getSkill().equalsIgnoreCase(skill)) sum+=players[i].getPoints();
        }
        return sum;
    }
    public static Players getPlayerBasedOnLevel(Players[] players, String skill, String level){
        Players ans=null;
        for(int i=0;i<players.length;i++){
            if(players[i].getLevel().equalsIgnoreCase(level) && players[i].getSkill().equalsIgnoreCase(skill) && players[i].getPoints()>=20) {
                ans = players[i];
                return ans;
            }
        }
        return null;
    }
}
class Players{
    private int playerId;
    private String skill;
    private String level;
    private int points;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Players(int playerId, String skill, String level, int points) {
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }
}
