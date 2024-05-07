package homework;

public class Exercise11_TwoRockets {

    public static void main(String[] args) {
        Cone();
        Divider();
        Body();
        Text();
        Body();
        Divider();
        Cone();
    }

    public static void Cone() {
        System.out.println("   /\\       /\\   ");
        System.out.println("  /  \\     /  \\  ");
        System.out.println(" /    \\   /    \\ ");
        System.out.println("/      \\ /      \\");
    }

    public static void Divider() {
        System.out.println("+------+ +------+");
    }

    public static void Body() {
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
    }

    public static void Text() {
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }
}
