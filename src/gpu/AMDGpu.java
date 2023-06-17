package gpu;

public class AMDGpu implements Gpu {
    private static final String GPU_BRAND = "AMD";
    private final String gpuModel;
    private final String manifacturer;
    public AMDGpu(
            String gpuModel,
            String manifacturer
    ){
        this.gpuModel = gpuModel;
        this.manifacturer = manifacturer;
    }

    @Override
    public void gpuRender() {
        System.out.println("Rendering on GPU (AMD)");
    }

    @Override
    public String toString() {
        return GPU_BRAND+" "+gpuModel.toUpperCase()+" powered by "+manifacturer;
    }
}
