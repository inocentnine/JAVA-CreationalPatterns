package lab2_5;

public class SouthChef implements Chef{
    public Rice cookedRice(){
        return new SouthRice();
    }
    public Noodles cookedNoddles(){
        return new SouthNoodles();
    }
}
