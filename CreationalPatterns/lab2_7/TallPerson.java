package lab2_7;

public class TallPerson extends PersonBuilder{
    public void buildHead() { person.setHead("Thead"); }

    public void buildBody() {
        person.setBody("Tbody");
    }

    public void buildArm() {
        person.setArm("Tarm");
    }

    public void buildLeg() {
        person.setLeg("Tleg");
    }
}
