package pr1;
class Car{
    String color;
    int seats;
    Car(){
        seats = 4;    
    }
    public void start() {
        System.out.println("car go ");
    }
}
public class Constr1 {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Car audi = new Car();
       
        audi.color = "black";
        System.out.println(audi.color);
        System.out.println(audi.seats);
        Car bmw = new Car();
        bmw.color =  "white";
        bmw.seats = 3;
        System.out.println(bmw.color);
        System.out.println(bmw.seats);
    }
}
// 1. name must be same as the class name
//2. if we don't give constructor , then constructor wil be automatically created
//. set default values
//default , parameterised
