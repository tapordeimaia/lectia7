package calculator;

public class Calculator {
    private Cpu cpu;
    private Gpu gpu;
    public Calculator(Cpu cpu, Gpu gpu){
        if (validateCPUandGPU(cpu, gpu)){
        this.cpu = cpu;
        this.gpu = gpu;} else {
            System.out.println("Componentele nu sunt compatibile");
        }
    }
    public Cpu getCpu(){
        return cpu;
    }

    private boolean validateCPUandGPU(Cpu cpu, Gpu gpu){
        return cpu.getBrand()==gpu.getBrand();
    }
    public Gpu getGpu(){
        return gpu;
    }
    public void setGpu(Gpu gpu){
        if (validateCPUandGPU(cpu, gpu)){
            this.cpu = cpu;
            this.gpu = gpu;} else {
            System.out.println("Componentele nu sunt compatibile");
        }
    }
}
