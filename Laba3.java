public class Laba3 {
    public static void main(String[] args) {
        for (int perv = 1; perv < 11; perv++) {
            for (int two = 1; two < 11; two++) {
                int tab = perv * two;
                System.out.println(perv + "*" + two + "=" + tab);
            }
            System.out.println(" ");
        }
    }
}