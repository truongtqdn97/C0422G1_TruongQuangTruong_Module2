package ss4.bai_tap.FanPackage;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");
        fan1.setOn(true);

        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5.0);

        System.out.println("Fan 1: "+ fan1.toString());
        System.out.println("Fan 2: "+ fan2.toString());
    }
}
