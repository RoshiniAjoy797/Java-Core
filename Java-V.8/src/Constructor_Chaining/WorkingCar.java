package Constructor_Chaining;

public class WorkingCar  extends Car{

    private int daysLeftUntilService;

    public WorkingCar(String canBeDrivenOn, String brand, String model,
    		int horses, int engineVolume, int daysLeftUntilService) {
    	
        super(canBeDrivenOn, brand, model, horses, engineVolume);
        System.out.println("Inside WorkingCar constructor");
        
        this.daysLeftUntilService = daysLeftUntilService;
        System.out.println("canBeDrivenOn="+ canBeDrivenOn +", Brand="+
        brand+", Model="+model+", Horses="+horses+", EngineVolume="
        		+engineVolume+", DaysLeftUntilService="+daysLeftUntilService);
        
    }
    @Override
    public String toString() {
        return "WorkingCar Details -> " +
                "canBeDrivenOn='" + getCanBeDrivenOn() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", horses=" + getHorses() +
                ", engineVolume=" + getEngineVolume() +
                ", daysLeftUntilService=" + daysLeftUntilService ;
    }

}
