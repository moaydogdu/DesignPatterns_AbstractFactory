package cpu;

public class AmdCpu implements Cpu {
    private static final String CPU_BRAND = "INTEL";
    private final String cpuModel;
    private final String cpuFrequency;
    private final String manifacturer;

    public AmdCpu(String cpuModel, String cpuFrequency, String manifacturer){
        this.cpuModel = cpuModel;
        this.cpuFrequency = cpuFrequency;
        this.manifacturer = manifacturer;
    }

    @Override
    public void cpuRender() {
        System.out.println("Rendering on CPU (AMD)");
    }

    @Override
    public String toString() {
        return CPU_BRAND+" "+cpuModel.toUpperCase()+" @"+cpuFrequency.toUpperCase()+" powered by "+manifacturer;
    }
}
