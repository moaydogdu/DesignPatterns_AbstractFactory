package computer;

import cpu.Cpu;
import gpu.Gpu;

public class Desktop implements Computer {
    private Cpu cpu;
    private Gpu gpu;


    public Desktop(Cpu cpu, Gpu gpu){
        this.cpu = cpu;
        this.gpu = gpu;
    }

    public Gpu getGpu() {
        return this.gpu;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer Specs: [CPU -> "+this.cpu+"] and [GPU -> "+this.gpu+"]";
    }
}
