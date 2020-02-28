package Question1;

public class ExceptionPropagationAmongManyMethods {

      void first(){
            int a = 50/0;
        }
       void second(){
            first();
        }
       void third(){
            try {
                second();
            }
            catch (Exception e){
                System.out.println("Exception handled");
            }
        }

    public static void main(String[] args) {
        ExceptionPropagationAmongManyMethods exc = new ExceptionPropagationAmongManyMethods();
        exc.third();
        System.out.println("Continue");
    }

}
