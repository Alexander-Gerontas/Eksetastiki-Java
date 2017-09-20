
interface Operations
{
    int operation(String s, int... x);
}

public class Main implements Operations
{
    public int operation(String action, int... x)
    {
        int sum = x[0];
        for (int i = 1; i < x.length; i++) sum += (action.equals("add")) ? x[i] : -x[i];
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println(new Main().operation("add", 500, 20, 40));
        System.out.println(new Main().operation("add", 500, 20, 40, 40, 100));
        System.out.println(new Main().operation("subtract", 500, 20));
        System.out.println(new Main().operation("subtract", 500, 10, 10, 30, 50, 100));
    }
}
