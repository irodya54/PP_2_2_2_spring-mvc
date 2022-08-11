package web.model;

public class Cars {
    private String brand;
    private String model;
    private String gosNumber;

    public Cars() {
    }

    public Cars(String brand, String model, String gosNumber) {
        this.brand = brand;
        this.model = model;
        this.gosNumber = gosNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGosNumber() {
        return gosNumber;
    }

    public void setGosNumber(String gosNumber) {
        this.gosNumber = gosNumber;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", gosNumber='" + gosNumber + '\'' +
                '}';
    }
}
