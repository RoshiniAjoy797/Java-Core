package Constructor_Chaining;

public class FaultyCar extends Car{
	 private int moneyNeededToFix;

	    public FaultyCar(String canBeDrivenOn, String brand, String model, int horses, int engineVolume, 
	    		int moneyNeededToFix) {
	        super(canBeDrivenOn, brand, model, horses, engineVolume);
	        System.out.println("Inside Faulty Car constructor");
	        this.moneyNeededToFix = moneyNeededToFix;
	        System.out.println("canBeDrivenOn="+ canBeDrivenOn +", Brand="+
	                brand+", Model="+model+", Horses="+horses+", EngineVolume="
	                		+engineVolume+", moneyNeededToFix="+moneyNeededToFix);
	    }
	    @Override
	    public String toString() {
	    	super.toString();
	        return "FaultyCar Details -> " + "canBeDrivenOn=" + getCanBeDrivenOn()+
	                ", brand=" + getBrand() +
	                ", model=" + getModel() +
	                ", horses=" + getHorses() +
	                ", engineVolume=" + getEngineVolume() +
	                ", moneyNeededToFix=" + moneyNeededToFix ;
	    }

}
