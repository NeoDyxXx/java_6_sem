public class Program {
    public static void main (String args[]) {
        System.out.println("Hello Java!");
        
        int a1 = 5, b1 = 6;
        float a2 = 2.12f, b2 = 3142.234f;
        double a3, b3;
        a3 = 324.324;
        b3 = 342423.234123;

        System.out.println(a1 ^ 2 - b1 ^ 2);
        System.out.println(Math.pow(a2, 3) - Math.pow(b2, 3));
        System.out.println(Math.pow(a3, 3) - Math.pow(b3, 3));

        char a = 'K', b = 'R';
        System.out.println(a - b);
        System.out.println(a + b);
    }
}