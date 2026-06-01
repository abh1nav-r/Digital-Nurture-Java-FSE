public class car_class {
    String model="model_name";
        int year=2006;
        String make="make";
        void displayDetails(){
            System.out.println(make);
            System.out.println(year);
            System.out.println(model);
        }
    public static void main(String args[]){
        car_class obj=new car_class();
        obj.displayDetails();
    }
}
