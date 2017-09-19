public class Main
{
    static void method(int val, int[] IntArr, String s)
    {
        int j = 1/ val;
        char ch;

        try
        {
            ch = s.charAt(0);
            if (val == 10) j = IntArr[3];
        }

        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Array error");
            throw new Error();
        }

        catch (ArithmeticException ex)
        {
            System.out.println("Arithmetic error");
        }

        catch (NullPointerException ex)
        {
            System.out.println("Null Pointer exception");
            throw new Error();
        }

        finally
        {
            System.out.println("finally");
        }

        System.out.println("After try block");
    }

    public static void main(String[] s)
    {
        int[] arr = {5, 10, 15};

//         method(0,arr, "Hello"); // 1

         method(10,arr, ""); // 2

//         method(10,arr, "ΒΒ!"); //3

//         method(10,arr,null); //4

    }
}
