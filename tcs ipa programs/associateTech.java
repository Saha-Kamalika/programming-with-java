package xplore;/*Create class xplore.Associate with below attributes: id - int name - String technology - String experienceInYears - int

Create class Solution and implement static method "associatesForGivenTechnology" in the Solution class. This method will take array of xplore.Associate objects and a searchTechnology String as parameters. And will return another array of xplore.Associate objects where the searchTechnology String matches with the original array of xplore.Associate object's technology attribute (case insensitive search) and experienceInYears attribute should be multiples of 5.

Write necessary getters and setters.

Before calling "associatesForGivenTechnology" method in the main method, read values for five associate objects referring the attributes in above sequence along with a String searchTechnology. Then call the "associatesForGivenTechnology" method and write the logic to print the id's in the main method.*/
import java.util.Arrays;
import java.util.Scanner;

public class associateTech {
    public static void main(String[] args) {
        Associate[] associates = new Associate[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            associates[i]=new Associate(sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
        }
        String searchTechnology =sc.next();
        Associate[] result = associatesForGivenTechnology(associates,searchTechnology);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i].getId());
        }
    }
    public static Associate[] associatesForGivenTechnology(Associate[] associates, String searchTechnology){
        Associate[] ans=new Associate[0];
        for(int i=0;i<associates.length;i++){
            if(associates[i].getTechnology().equals(searchTechnology) && associates[i].getExperienceInYears()%5==0) {
                ans = Arrays.copyOf(ans, ans.length + 1);
                ans[ans.length - 1] = associates[i];
            }
        }
        return ans;
    }
}
class Associate{
    private int id;
    private String name;
    private String technology;
    private int experienceInYears;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getTechnology(){
        return technology;
    }
    public void setTechnology(String technology){
        this.technology=technology;
    }
    public int getExperienceInYears(){
        return experienceInYears;
    }
    public void setExperienceInYears(int experienceInYears){
        this.experienceInYears=experienceInYears;
    }
    public Associate(int id, String name, String technology, int experienceInYears){
        this.id=id;
        this.name=name;
        this.technology=technology;
        this.experienceInYears=experienceInYears;
    }
}

