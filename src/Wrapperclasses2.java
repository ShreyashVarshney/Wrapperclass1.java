public class Wrapperclasses2 {
    public static void main(String[] args) {
        int a = 5;
        double b = 5.66;
        Integer abc =  Integer.valueOf(a);
        Double def  = Double.valueOf(b);
        if (abc instanceof Integer){
            System.out.println("An object of Integer is created.");
        }
        if (def instanceof Double){
            System.out.println("An object of Double is creted.");
        }
    }
}
