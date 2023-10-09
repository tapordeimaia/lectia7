package calculator;

public class Cpu {
    private Brand brand;
    private String denumire;
    public Cpu(Brand brand, String denumire){
        this.brand = brand;
        this.denumire = denumire;
    }
    public Brand getBrand(){
        return brand;
    }
}
