public class Method_overloading {
    int add(int a,int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Method_overloading obj=new Method_overloading();
        System.out.println(obj.add(10,5));
        System.out.println(obj.add(1.2, 3.5));
        System.out.println(obj.add(12, 12, 12));
    }
}
