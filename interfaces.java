interface Bicycle{
    public float applyBrake(float b);
    public float speedUp(float i);
}
class BSA implements Bicycle{
    float speed=2;
    public float applyBrake(float b){
        speed=speed-b;
        return speed;
    }
    public float speedUp(float i){
        speed=speed+i;
        return speed;
    }
}
public class interfaces {
    public static void main(String[] args){
        BSA ob=new BSA();
        System.out.println("Speed after applying brakes = "+ob.applyBrake(1));
        System.out.println("Speed after speedup = "+ob.speedUp(1));
    }
}
