public class Main {
    public static void main(String[] args) {
        try {
            Calculator ca = new Calculator("5.2", 7);
            ca.Add();
            ca.Subtract();
            ca.Multiplication();
            ca.Division();
        }catch (RuntimeException r){
            System.out.println(r.getMessage());
        }
        Calculator cal=null;
        try{
            cal=new Calculator(3,4);
            cal.Add();
            cal.Subtract();
            cal.Multiplication();
            cal.Division();
        }catch (ArithmeticException exc){
            System.out.println(exc.getMessage());
            System.exit(1);
        }
    }
}
