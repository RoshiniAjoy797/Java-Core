package Constructor_Chaining;

public class Driver {
	 public static void main(String[] args) {
	        WorkingCar workingCar = new WorkingCar("ROAD", "Mercedes-Benz", "AMG GT Coupe", 105, 1600, 200);
	        System.out.println(workingCar);
	        FaultyCar faultyCar = new FaultyCar("Road", "BMW", "Latest model", 200, 340, 3000);
	       System.out.println(faultyCar);
	    }

}
