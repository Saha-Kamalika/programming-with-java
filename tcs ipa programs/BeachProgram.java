package xplore;
import java.util.Scanner;
public class BeachProgram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Beach[] beaches=new Beach[5];
        for(int i=0;i<5;i++){
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            String loc=sc.nextLine();
            String type=sc.nextLine();
            int rating=sc.nextInt();
            int avg=sc.nextInt();
            sc.nextLine();
            beaches[i]=new Beach(id,name,loc,type,rating,avg);

        }
        String location=sc.nextLine();
        int avg=sc.nextInt();
        sc.nextLine();
        Beach ans=findLeastRating(beaches,location,avg);
        if(ans==null) System.out.println("No data found");
        else System.out.println(ans.getRating());
    }
    public static Beach findLeastRating(Beach[] beaches, String location, int avg) {
        int min = Integer.MAX_VALUE;
        Beach ans = null;
        for (int i = 0; i < beaches.length; i++) {
            if (beaches[i].getLocation().equalsIgnoreCase(location) && beaches[i].getAvgPerson() > avg && beaches[i].getRating() < min) {
                min = beaches[i].getRating();
                ans = beaches[i];
            }
        }
        return ans;
    }
}
class Beach{
    private int beachId;
    private String beachName;
    private String location;
    private String type;
    private int rating;
    private int avgPerson;

    public Beach(int beachId, String beachName, String location, String type, int rating, int avgPerson) {
        this.beachId = beachId;
        this.beachName = beachName;
        this.location = location;
        this.type = type;
        this.rating = rating;
        this.avgPerson = avgPerson;
    }

    public int getBeachId() {
        return beachId;
    }

    public void setBeachId(int beachId) {
        this.beachId = beachId;
    }

    public String getBeachName() {
        return beachName;
    }

    public void setBeachName(String beachName) {
        this.beachName = beachName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getAvgPerson() {
        return avgPerson;
    }

    public void setAvgPerson(int avgPerson) {
        this.avgPerson = avgPerson;
    }
}