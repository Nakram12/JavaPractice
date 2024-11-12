package JavaConceptsProgram;

//Interface defining common behaviors for all vehicles
interface Vehicle {
 void start(); // Abstract method to start the vehicle
 void stop();  // Abstract method to stop the vehicle
}

//Class implementing the Vehicle interface
class Car implements Vehicle {
 @Override
 public void start() {
     System.out.println("Car is starting with a key.");
 }

 @Override
 public void stop() {
     System.out.println("Car is stopping with brakes.");
 }
}

//Another class implementing the Vehicle interface
class Bike implements Vehicle {
 @Override
 public void start() {
     System.out.println("Bike is starting with a kick.");
 }

 @Override
 public void stop() {
     System.out.println("Bike is stopping with brakes.");
 }


 
 public static void main(String[] args) {
     // Using the interface reference to hold a Car object
     Vehicle myCar = new Car();
     myCar.start();
     myCar.stop();

     System.out.println();

     // Using the interface reference to hold a Bike object
     Vehicle myBike = new Bike();
     myBike.start();
     myBike.stop();
 }
}
