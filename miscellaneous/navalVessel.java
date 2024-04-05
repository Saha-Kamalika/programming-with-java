import java.util.Scanner;

public class navalVessel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vessel[] vessels=new Vessel[4];
        for(int i=0;i<4;i++){
            vessels[i]=new Vessel(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.next());
        }
        int percentage=sc.nextInt();
        int ans=findAvgVoyagesByPct(vessels, percentage);
        System.out.println(ans);

        String purpose=sc.next();
        Vessel res=findVesselByGrade(vessels, purpose);
        if(res!=null) System.out.println(res.getVesselName()+"%"+res.getClassification());
        else System.out.println("No Naval Vessel is available with the specified purpose");
    }
    public static int findAvgVoyagesByPct(Vessel[] vessels, int percentage){
        int avg=0, count=0;
        for(int i=0;i< vessels.length;i++){
            int percent=(vessels[i].getNoOfVoyagesCompleted() * 100)/vessels[i].getNoOfVoyagesPlanned();
            if(percent>=percentage){
                avg+=vessels[i].getNoOfVoyagesCompleted();
                count++;
            }
        }
        return avg/count;
    }
    public static Vessel findVesselByGrade(Vessel[] vessels, String purpose){
        Vessel temp=null;
        for(int i=0;i< vessels.length;i++){
            if(vessels[i].getPurpose().equalsIgnoreCase(purpose)){
            int percent=(vessels[i].getNoOfVoyagesCompleted() * 100)/vessels[i].getNoOfVoyagesPlanned();
            if(percent==100) vessels[i].setClassification("Star");
            else if(percent>80 && percent<=99) vessels[i].setClassification("Leader");
            else if(percent>55 && percent<=79) vessels[i].setClassification("Inspirer");
            else vessels[i].setClassification("Striver");

            temp=vessels[i];
            return temp;
            }
        }
        return null;
    }
}
class Vessel{
    private int vesselId;
    private String vesselName;
    private int noOfVoyagesPlanned;
    private int noOfVoyagesCompleted;
    private String purpose;
    private String classification;

    public int getVesselId() {
        return vesselId;
    }

    public void setVesselId(int vesselId) {
        this.vesselId = vesselId;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public int getNoOfVoyagesPlanned() {
        return noOfVoyagesPlanned;
    }

    public void setNoOfVoyagesPlanned(int noOfVoyagesPlanned) {
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
    }

    public int getNoOfVoyagesCompleted() {
        return noOfVoyagesCompleted;
    }

    public void setNoOfVoyagesCompleted(int noOfVoyagesCompleted) {
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public Vessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
        this.purpose = purpose;
    }
}