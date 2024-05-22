package xplore;

import java.util.Arrays;
import java.util.Scanner;

public class medicineByPrice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Medicine[] medicines = new Medicine[4];
        for(int i=0;i<4;i++){
            medicines[i]=new Medicine(sc.next(), sc.next(), sc.next(), sc.nextInt());
        }
        String disease=sc.next();
        Integer[] ans= getPriceByDisease(medicines, disease);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    public static Integer[] getPriceByDisease(Medicine[] medicines, String disease){
        Integer[] ans=new Integer[0];
        for(int i=0;i<medicines.length;i++){
            if(medicines[i].getDisease().equalsIgnoreCase(disease)){
                ans= Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1]= medicines[i].getPrice();
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}
class Medicine{
    private String MedicineName;
    private String batch;
    private String disease;
    private int price;

    public String getMedicineName() {
        return MedicineName;
    }

    public void setMedicineName(String medicineName) {
        MedicineName = medicineName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Medicine(String medicineName, String batch, String disease, int price) {
        MedicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }
}
