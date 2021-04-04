package lambton.vehicle;

import lambton.utils.Color;

public class Car extends Vehicle{
    Color color;

    public Car(String vin, String brand, boolean isInsured, Color color) {
        super(vin, brand, isInsured);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void display() {
        System.out.println("Vehicle Type:"+this.getType());
        System.out.println("Vehicle number:"+this.getVin());
        System.out.println("Vehicle Brand:"+this.getBrand());
        System.out.println("Vehicle is Insured? : "+this.isInsured());
        System.out.println("Vehicle color: "+this.getColor());
    }

    @Override
    public String getType() {
        return Car.class.getSimpleName();
    }
}
