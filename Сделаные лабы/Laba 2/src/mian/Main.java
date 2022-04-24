package mian;

public class Main {
    public static void main(String[] args) {

        int[] xx = new int[10];

        for (int i = 0; i < xx.length; i++) {
            xx[i] = i;
        }
        for (int i = 0; i < xx.length; i++) {
            System.out.println(xx[i]);
        }

        System.out.println("--------------------------");

        int[][] xxx = new int[5][5];
        for (int i = 0; i < xxx.length; i++) {
            for (int j = 0; j < xxx[i].length; j++) {
                xxx[i][j] = i + j;
            }
        }
        for (int i = 0; i < xxx.length; i++) {
            for (int j = 0; j < xxx[i].length; j++) {
                System.out.println(xxx[i][j]);
            }
        }

        System.out.println("--------------------------");

        int a = 3;
        int b = 5;

        System.out.println(a >>> b);
        System.out.println(a <<= b);
        System.out.println(a ^= b);
        System.out.println(a & b);
        System.out.println(~a);

        System.out.println("--------------------------");

        boolean c;

        c = true || false;
        System.out.println(c);
        c = true && false;
        System.out.println(c);

        System.out.println("--------------------------");

        for (int i = 0; i < 5; i++)
        {
            System.out.print("/");
        }
        System.out.println();

        int i = 0;
        while (true){
            if (i == 5)
                break;
            System.out.print("/");
            i++;
        }
        System.out.println();

        i = 0;
        do {
            System.out.print("/");
            i++;
        } while (i != 5);
        System.out.println();

        switch (i)
        {
            case 1: System.out.print("Hello"); break;
            case 5: System.out.print("Hello5"); break;
            default: break;
        }

        System.out.println("--------------------------");

        exStatic.ExMethod();
        System.out.println(exStatic.str);

        System.out.println(true == true ? "Hello" : "world");
    }
}
