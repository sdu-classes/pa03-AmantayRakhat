public class Calculator {
    private int x;
    private int y;
    public Calculator(int x,int y){
        this.x=x;
        this.y=y;

    }
    public Calculator(Object o1,Object o2){
        if(!(o1 instanceof Integer)){
            throw new NumberFormatException("This is not Integer");
        }
    }
    public void Add(){
        if(this.x<0 || this.y<0){
            throw new ArithmeticException(String.format("One of the number is negative: %d or %d",this.x,this.y));
        }
        System.out.println(this.x+this.y);
    }
    public void Subtract(){
        if(this.x<0 || this.y<0){
            throw new ArithmeticException(String.format("One of the number is negative: %d or %d",this.x,this.y));
        }
        System.out.println(this.x-this.y);
    }
    public void Multiplication(){
        if(this.x==0 || this.y==0){
            throw new ArithmeticException(String.format("One of the number is zero: %d or %d",this.x,this.y));
        }
        System.out.println(this.x*this.y);
    }
    public void Division(){
        if(this.x==0 || this.y==0){
            throw new ArithmeticException(String.format("One of the number is zero: %d or %d",this.x,this.y));
        }
        System.out.println(this.x/this.y);
    }


}
