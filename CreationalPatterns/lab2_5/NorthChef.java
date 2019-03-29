package lab2_5;

public class NorthChef implements Chef{
    public Rice cookedRice(){
        return new NorthRice();
    }
    public Noodles cookedNoddles(){
        return new NorthNoodles();
    }
}
