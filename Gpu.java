package calculator;

public class Gpu {
    private Brand brand;
    private String denumire;
    public Gpu(Brand brand, String denumire){
        this.brand = brand;
        this.denumire = denumire;
    }
    public Brand getBrand(){
        return brand;
    }
}
