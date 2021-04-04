package lambton.vehicle;

public class MotorCycle extends Vehicle{
    int noOfSeats;

    public MotorCycle(String vin, String brand, boolean isInsured, int noOfSeats) {
        super(vin, brand, isInsured);
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String getType() {
        return MotorCycle.class.getSimpleName();
    }

    @Override
    public void display() {
        System.out.println("Vehicle Type:"+this.getType());
        System.out.println("Vehicle number:"+this.getVin());
        System.out.println("Vehicle Brand:"+this.getBrand());
        System.out.println("Vehicle is Insured? : "+this.isInsured());
        System.out.println("Vehicle Number of Seats: "+this.getNoOfSeats());
    }
}
