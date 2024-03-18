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
    }

    public static int avaregeValue(int[] tab)
    {
        int value = 0;

        for (int i = 0; i < tab.length; i++)
        {
            value += tab[i];
        }

        return value;
    }
}