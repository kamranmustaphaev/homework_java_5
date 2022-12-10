
public class Main {


    public static void main(String[] args) {
        int y = 4;
        int x = 3;
        double z = powerMethod(x, y);
        double sqrt = sqrt3Method(x);
        System.out.println("sqrt = " + z);
        System.out.println("sqrt = " + sqrt);


    }

    private static double sqrt3Method(int x) {
        double z = 1./3.;
        return powerMethod(x, (int) z);
    }

    private static double powerMethod(int x, int y) {

        return Math.pow(x, y);
    }
}