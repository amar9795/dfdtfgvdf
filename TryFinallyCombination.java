package Question1;

public class TryFinallyCombination {
    public static void main(String[] args) {
        try {
            int array[] = new int[20];
            // array[20] = 100/0;
            System.out.println(array[50]);
        }
        finally {
            System.out.println("Finally Execute Everytime");
        }
    }
}
