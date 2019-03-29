package lab2_7;

public class Painter {
    private PersonBuilder pb;

    public void setPersonBuilder(PersonBuilder pb){
        this.pb=pb;
    }

    public Person construct(){
        pb.buildHead();
        pb.buildBody();
        pb.buildArm();
        pb.buildLeg();
        return pb.getPerson();
    }
}
