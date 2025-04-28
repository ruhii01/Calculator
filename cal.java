class calc{
    int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
    int mul(int a,int b){
        return a*b;
    }
    int div(int a,int b){
        return a/b;
    }
    
}
public class cal {
    public static void main(String[] args) {
        calc c=new calc();
        System.out.println("addition"+c.add(9, 8));
        System.out.println("subtraction"+c.sub(7, 8));
        System.out.println("multiplication"+c.mul(9, 8));
        System.out.println("division"+c.div(7, 8));
    }
}
