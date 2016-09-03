import java.util.concurrent.ThreadLocalRandom;
public class Config
{
    private int a, b, c, d;
    public Config()
    {
        a = ThreadLocalRandom.current().nextInt(1, 7);
        b = ThreadLocalRandom.current().nextInt(1, 7);
        c = ThreadLocalRandom.current().nextInt(1, 7);
        d = ThreadLocalRandom.current().nextInt(1, 7);
    }
    
    public void setConfig(int a, int b, int c, int d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
     public int getA()
    {
        return this.a;
    }
    
    public int getB()
    {
        return this.b;
    }
    
    public int getC()
    {
        return this.c;
    }
    
    public int getD()
    {
        return this.d;
    }
    
    
    public int numberBlack(int gA, int gB, int gC, int gD)
    {
        int count = 0;
        if (this.a == gA) count++;
        if (this.b == gB) count++;
        if (this.c == gC) count++;
        if (this.d == gD) count++;
        return count;
    }
    
    public int numberRed(int gA, int gB, int gC, int gD)
    {
        int min1 = Math.min(number1(this.a, this.b, this.c, this.d), number1(gA, gB, gC, gD));
        int min2 = Math.min(number2(this.a, this.b, this.c, this.d), number2(gA, gB, gC, gD));
        int min3 = Math.min(number3(this.a, this.b, this.c, this.d), number3(gA, gB, gC, gD));
        int min4 = Math.min(number4(this.a, this.b, this.c, this.d), number4(gA, gB, gC, gD));
        int min5 = Math.min(number5(this.a, this.b, this.c, this.d), number5(gA, gB, gC, gD));
        int min6 = Math.min(number6(this.a, this.b, this.c, this.d), number6(gA, gB, gC, gD));
        return min1 + min2 + min3 + min4 + min5 + min6 - this.numberBlack(gA, gB, gC, gD);
    }
    
    
    
    public static int number1(int w, int x, int y, int z)
    {
        int count = 0;
        if (w == 1) count++;
        if (x == 1) count++;
        if (y == 1) count++;
        if (z == 1) count++;
        return count;
    }
    public static int number2(int w, int x, int y, int z)
    {
        int count = 0;
        if (w == 2) count++;
        if (x == 2) count++;
        if (y == 2) count++;
        if (z == 2) count++;
        return count;
    }
    public static int number3(int w, int x, int y, int z)
    {
        int count = 0;
        if (w == 3) count++;
        if (x == 3) count++;
        if (y == 3) count++;
        if (z == 3) count++;
        return count;
    }
    public static int number4(int w, int x, int y, int z)
    {
        int count = 0;
        if (w == 4) count++;
        if (x == 4) count++;
        if (y == 4) count++;
        if (z == 4) count++;
        return count;
    }
    public static int number5(int w, int x, int y, int z)
    {
        int count = 0;
        if (w == 5) count++;
        if (x == 5) count++;
        if (y == 5) count++;
        if (z == 5) count++;
        return count;
    }
    public static int number6(int w, int x, int y, int z)
    {
        int count = 0;
        if (w == 6) count++;
        if (x == 6) count++;
        if (y == 6) count++;
        if (z == 6) count++;
        return count;
    }
    
    public String actConfig()
    {
        return "" + this.getA() + " " + this.getB() + " " + this.getC() + " " + this.getD();
    }
   
    
    
}