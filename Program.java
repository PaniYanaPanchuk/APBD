import javax.print.DocFlavor.STRING;

public class Program
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        for (int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }

        int age = 19;

        if (age > 18)
        {
            System.out.println("You are adult");
        }
        else
        {
            System.out.println("You are child");
        }

        int[] tab = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(avaregeValue(tab));

        String str = "PJATK";
        
        System.out.println(maxValue(tab));
    }

    public static int avaregeValue(int[] tab)
    {
        int value = 0;

        int tmp = tab[0];

        for (int i = 0; i < tab.length; i++)
        {
            value += tab[i];
        }

        return value;
    }

    public static int maxValue(int[] tab)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max)
                max = tab[i];
        }

        return max;
    }
}