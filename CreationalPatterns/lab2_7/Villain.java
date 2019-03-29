package lab2_7;

public class Villain {
    public static void main(String[] args){
        PersonBuilder pb=(PersonBuilder)XMLUtil.getBean();
        //绘画程序是指挥者
        Painter painter=new Painter();
        //绘画程序准备绘画小人
        painter.setPersonBuilder(pb);
        //小人完成
        Person person=painter.construct();

        System.out.println("小人构成：");
        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getArm());
        System.out.println(person.getLeg());
    }
}
