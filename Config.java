import java.util.concurrent.ThreadLocalRandom;
public class Config
{
    public int a, b, c, d;
    public Config(){a = ThreadLocalRandom.current().nextInt(1, 7); b = ThreadLocalRandom.current().nextInt(1, 7); c = ThreadLocalRandom.current().nextInt(1, 7); d = ThreadLocalRandom.current().nextInt(1, 7);}
    
    public void setConfig(int a, int b, int c, int d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public int numberBlack(int gA, int gB, int gC, int gD)
    {
        int countBlack = 0;
        if (this.a == gA) countBlack++;
        if (this.b == gB) countBlack++;
        if (this.c == gC) countBlack++;
        if (this.d == gD) countBlack++;
        return countBlack;
    }
    
    public int numberRed(int gA, int gB, int gC, int gD)
    {
        int countRed = 0;
        for(int j = 1; j <= 6; j++)
        {
            int countGuess = 0, countActual = 0;
            if (gA == j) ++countGuess;
            if (gB == j) countGuess++;
            if (gC == j) ++countGuess;
            if (gD == j) countGuess++; //now countGuess = number of guesses that equal j
            
            if (this.a == j) countActual++;
            if (this.b == j) ++countActual;
            if (this.c == j) countActual++;
            if (this.d == j) ++countActual;//now countActual = number of guesses that equal j
            
            countRed += Math.min(countGuess, countActual);
        } //now count = total number of correct colors in the wrong and right place
        return countRed - this.numberBlack(gA, gB, gC, gD);
    }
    
    public String actConfig()
    {
        return "" + this.a + " " + this.b + " " + this.c + " " + this.d;
    }
}
