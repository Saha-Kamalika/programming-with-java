
interface MyStart{
    void takeSnap();
    void recordVdo();
    private void greet(){
        System.out.println("\nGood morning");
    }
    default void record4k(){
        greet();
        System.out.println("Recording in 4k");
    }
}
interface MyNetworks{
    String[] net();
    void getNet(String n);

}
class MySmart implements MyStart,MyNetworks{
    public void takeSnap(){
        System.out.println("Taking a Snap....");
    }
    public void recordVdo(){
        System.out.println("Recording video....");
    }
    public String[] net(){
        System.out.println("The netowrks are: ");
        String[] n={"kamalika", "kamal", "alo", "srijit"};
        for(String n1: n)
            System.out.print(n1+" ");
        return n;
    }
    public void getNet(String n){
        System.out.println("Connecting to "+n);
    }

}
class defaultMethods{
    public static void main(String[] args)
    {
        MySmart ms=new MySmart();
        ms.net();
        ms.record4k();
        ms.getNet("kamalika");

    }
}
