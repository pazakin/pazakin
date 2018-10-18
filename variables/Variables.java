package pl.pazakin.variables;

public class Variables {
    public static void main(String[] args) {
        byte b = 127;
        byte b1 = -128;
        short s = Short.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        Integer integer = 2;
        int su = i + 1;
        long l = Long.MAX_VALUE;

        float f = 0.0f;

        char c = 'f';
        String str = "Hello Java";

        boolean boo = true;
        boolean bo = false;

        System.out.println(l);
        System.out.println(i);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(su);
        System.out.println(boo);

        //********************************//

        System.out.println("Sum : " + b + b1);
        System.out.println("Sum : " + (b + b1));

        int x = 2 + 3;
        int x1 = x + b;
        System.out.println(x1);
        double dd1 = 7;
        double dd2 = 3;
        double ddw = dd1 / dd2;
        System.out.println(ddw);

        int r = x1 % x;
        System.out.println(r);

        int i1 = 10;
        int i2 = 20;
        int i3 = 30;
        int i4 = 40;
        System.out.println(i1++);
        System.out.println(++i2);
        System.out.println(i3--);
        System.out.println(--i4);
        System.out.println(i1++);

        x += 5; // x = x + 5
        x -= 5;
        x /= 5;
        x *= 5;
        x %= 5;
        System.out.println("-------------");
        System.out.println(x);


    }
}
