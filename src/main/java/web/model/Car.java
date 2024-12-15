package web.model;

public class Car {

    private String vendor;
    private String model;
    private int year;


    public Car(String vendor, String model, int year) {
        this.vendor = vendor;
        this.model = model;
        this.year = year;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int Year) {
        this.year = year;
    }
}
