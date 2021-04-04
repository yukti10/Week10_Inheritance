package lambton.vehicle;

import lambton.base.IDisplay;

public abstract class Vehicle implements IDisplay {
    String vin;
    String brand;
    boolean isInsured;

    public Vehicle(String vin, String brand, boolean isInsured) {
        this.vin = vin;
        this.brand = brand;
        this.isInsured = isInsured;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isInsured() {
        return isInsured;
    }

    public void setInsured(boolean insured) {
        isInsured = insured;
    }
    public abstract String getType();
}
