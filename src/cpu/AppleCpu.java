package cpu;

public class AppleCpu implements Cpu {
    private static final String CPU_BRAND = "Apple Slicon";
    private static final String MANIFACTURER = "Apple";
    private final String cpuModel;
    private final String cpuFrequency;


    public AppleCpu(String cpuModel, String cpuFrequency){
        this.cpuModel = cpuModel;
        this.cpuFrequency = cpuFrequency;
    }
    @Override
    public void cpuRender() {
        System.out.println("Rendering on CPU (Apple Slicon)");
    }

    @Override
    public String toString() {
        return CPU_BRAND+" "+cpuModel.toUpperCase()+" @"+cpuFrequency.toUpperCase()+" powered by "+MANIFACTURER;
    }
}
