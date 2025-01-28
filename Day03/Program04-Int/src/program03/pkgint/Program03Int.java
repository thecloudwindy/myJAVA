package program03.pkgint;
public class Program03Int {
    public static void main(String[] args) {
        System.out.println("Min Value of Integer Type: " + minValue());
        System.out.println("Max Value of Integer Type: " + maxValue());
    }
    
    public static int minValue() {
        int minInt = Integer.MIN_VALUE;
        return minInt;
    }
    
    public static int maxValue() {
        int maxInt = Integer.MAX_VALUE;
        return maxInt;
    }
}
