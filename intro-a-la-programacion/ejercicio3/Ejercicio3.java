public class Ejercicio3 {

    //The function receive 3 integers and add it returning the result
    public static int addNumbers(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {

        //Print in the console the result of adding 3 numbers
        System.out.println(addNumbers(1, 5, 10));

        //Instance a car, add a new door and print the number of doors
        var myCar = new Car();
        myCar.addDoor();
        System.out.println(myCar.getDoors());
    }
}

//Class of Car
class Car {
    //Attributes
    private int doors = 4;

    //Methods
    //This method add a new door to the car
    public void addDoor(){
        this.doors++;
    }

    //Return the number of doors
    public int getDoors(){
        return this.doors;
    }
}
