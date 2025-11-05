public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    public Car(String make,String model,int year,double price){
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
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

    public void setYear(int year) {
        if (year>2025||year<2015){
            System.err.println("братан, подумай ещё");
            return;
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            System.err.println("сколько-сколько стоит?");
            return;
        }
        this.price = price;
    }

    void getCarDetails(){
        System.out.println(String.format("Марка: %s, Модель: %s, Цена: %.2f ,Год выпуска: %d",
                make,model,price,year));
    }
}
