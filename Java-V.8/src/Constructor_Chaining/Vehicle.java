package Constructor_Chaining;

public class Vehicle {
	private String canBeDrivenOn;
	
	public Vehicle(String canBeDrivenOn) {
		System.out.println("Inside vechile constructor");
		this.canBeDrivenOn = canBeDrivenOn;
		   System.out.println("canBeDrivenOn="+ canBeDrivenOn);
	}
	// Getters
    public String getCanBeDrivenOn() {
        return canBeDrivenOn;
    }
}
