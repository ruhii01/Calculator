class calc{
    int a;
    int b;
    calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
    int div(){
        return a/b;
    }
    void display(){
        System.out.println("the two no are"+a+"and"+b);
    }
}
public class cal {
    public static void main(String[]args){
        calc c=new calc(5,8);
        c.display();
        System.out.println(c.add());
        System.out.println(c.sub());
        System.out.println(c.mul());
        System.out.println(c.div());
        

    }
}




