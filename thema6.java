import java.util.ArrayList;
import java.util.List;

public class Pond
{
    List<Duck> ducks = new ArrayList();

    public Pond(List<Duck> ducks)
    {
        this.ducks = ducks;
    }

    public void removeDuck(String duck)
    {
        for (Duck d : ducks)
            if (d.toString().equals(duck)) ducks.remove(duck);
    }

    public static void main(String[] args)
    {
        // 1o lathos dilosi listas

        List<Duck> d = new ArrayList<Duck>()
        {
            {
                add(new Duck("Quacker"));
                add(new Duck("Tzim"));
                add(new Duck("Sam"));
            }
        };

        new Pond(d).removeDuck("Sam");
    }
}

    // akiro static edo pera
    static class Duck
    {
        String name;

        public Duck(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return this.name;
        }
    }
