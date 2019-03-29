package lab2_5;

public class USChef implements Chef{
    public Rice cookedRice(){
        return new USRice();
    }
    public Noodles cookedNoddles(){
        return new USNoodles();
    }
}
