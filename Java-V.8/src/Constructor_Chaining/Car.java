package Constructor_Chaining;

public class Car extends Vehicle {
	 	private String brand;
	    private String model;
	    private int horses;
	    private int engineVolume;
	    
	    public Car(String canBeDrivenOn, String brand, String model, int horses) {
	    	super(canBeDrivenOn);
	    	System.out.println("Inside car Cons: - 4 params");
	    	this.brand = brand;
	    	this.model = model;
	        this.horses = horses;
	        System.out.println("canBeDrivenOn="+ canBeDrivenOn +", Brand="+
	                brand+", Model="+model+", Horses="+horses);
	    }
	    public Car(String canBeDrivenOn, String brand, String model, int horses, int engineVolume) {
	        this(canBeDrivenOn, brand, model, horses);
	        System.out.println("Inside Car Constructor - 5 params");
	        this.engineVolume = engineVolume;
	        System.out.println("canBeDrivenOn="+ canBeDrivenOn +", Brand="+
	                brand+", Model="+model+", Horses="+horses+", EngineVolume="
	                		+engineVolume);
}
	 

	    public String getBrand() {
	        return brand;
	    }

	    public String getModel() {
	        return model;
	    }

	    public int getHorses() {
	        return horses;
	    }

	    public int getEngineVolume() {
	        return engineVolume;
	    }
}
