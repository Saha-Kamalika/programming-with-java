import java.util.Scanner;
public class institutionProb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Institution[] institute = new Institution[4];
        for(int i=0;i<4;i++){
            institute[i]=new Institution(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.next());
        }
        String location=sc.next();

        int ans = findNumClearancedByLoc(institute, location);
        if(ans>0){
            System.out.println(ans);
        }
        else System.out.println("There are no cleared students in this particular location");

        String institutionName = sc.next();
        Institution res =updateInstitutionGrade(institute, institutionName);
        if(res!=null)
            System.out.println(res.getInstitutionName()+"::"+res.getGrade());
        else System.out.println("No Institute is available with the specified name");
    }
    public static int findNumClearancedByLoc(Institution[] institute, String location){
        int sum=0;
        for(int i=0;i<institute.length;i++){
            if(institute[i].getLocation().equalsIgnoreCase(location)){
                sum+=institute[i].getNoOfStudentsCleared();
            }
        }
        return sum;
    }
    public static Institution updateInstitutionGrade(Institution[] institute, String institutionName){
        Institution temp=null;
        for(int i=0;i<institute.length;i++) {
            if (institute[i].getInstitutionName().equalsIgnoreCase(institutionName)) {
                int rating = 0;
                rating = (Integer.parseInt(institute[i].getNoOfStudentsPlaced()) * 100) / institute[i].getNoOfStudentsCleared();
                if (rating >= 80) {
                    institute[i].setGrade("A");
                } else institute[i].setGrade("B");
                temp=institute[i];
                return temp;
            }
        }
        return null;
    }
}
class Institution{
    private int institutionId;
    private String institutionName;
    private String noOfStudentsPlaced;
    private int noOfStudentsCleared;
    private String location;
    private String grade;

    public int getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(int institutionId) {
        this.institutionId = institutionId;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getNoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public void setNoOfStudentsPlaced(String noOfStudentsPlaced) {
        this.noOfStudentsPlaced = noOfStudentsPlaced;
    }

    public int getNoOfStudentsCleared() {
        return noOfStudentsCleared;
    }

    public void setNoOfStudentsCleared(int noOfStudentsCleared) {
        this.noOfStudentsCleared = noOfStudentsCleared;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Institution(int institutionId, String institutionName, String noOfStudentsPlaced, int noOfStudentsCleared, String location) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;
    }
}