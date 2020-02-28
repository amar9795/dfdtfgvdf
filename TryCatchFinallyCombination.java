package Question1;

public class TryCatchFinallyCombination {
    public static void main(String[] args) {
        try {
            int array[] = new int[20];
            // array[20] = 100/0;
             System.out.println(array[50]);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmatic exception");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bound Exception");
        }
        finally {
            System.out.println("Finally Execute Everytime");
        }
    }
}
