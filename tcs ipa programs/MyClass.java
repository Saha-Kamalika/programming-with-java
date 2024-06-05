import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop[] laps = new Laptop[4];

        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            int e = sc.nextInt(); sc.nextLine();
            laps[i] = new Laptop(a, b, c, d, e);
        }

        String brand1 = sc.nextLine();
        String os = sc.nextLine();

        int ans = countOfLaptopsByBrand(laps, brand1);
        if (ans == 0) {
            System.out.println("The given brand is not available");
        } else {
            System.out.println(ans);
        }

        Laptop[] anss = searchLaptopByOsType(laps, os);
        if (anss.length == 0) {
            System.out.println("The given os is not available");
        } else {
            ArrayList<Laptop> list = new ArrayList<Laptop>();
            for (int i = 0; i < anss.length; i++) {
                list.add(anss[i]);
            }
            Collections.sort(list);
            for (Laptop laptop : list) {
                System.out.println(laptop.laptopId);
                System.out.println(laptop.rating);
            }
        }
    }

    public static int countOfLaptopsByBrand(Laptop[] laps, String brand) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (laps[i].brand.equalsIgnoreCase(brand) && laps[i].rating > 3) {
                count++;
            }
        }
        return count;
    }

    public static Laptop[] searchLaptopByOsType(Laptop[] laps, String os) {
        Laptop[] ans = new Laptop[0];
        for (int i = 0; i < 4; i++) {
            if (laps[i].osType.equalsIgnoreCase(os)) {
                ans = Arrays.copyOf(ans, ans.length + 1);
                ans[ans.length - 1] = laps[i];
            }
        }
        return ans;
    }
}

class Laptop implements Comparable<Laptop> {
    int laptopId;
    String brand;
    String osType;
    double price;
    int rating;

    public Laptop(int laptopId, String brand, String osType, double price, int rating) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public int compareTo(Laptop l) {
        if (this.laptopId < l.laptopId) {
            return 1;
        } else if (this.laptopId > l.laptopId) {
            return -1;
        } else {
            return 0;
        }
    }
}