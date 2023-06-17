package gpu;

public class NvidiaGpu implements Gpu{
    private static final String GPU_BRAND = "NVIDIA";
    private final String gpuModel;
    private final String manifacturer;


    public NvidiaGpu(
            String gpuModel,
            String manifacturer
    ){
        this.gpuModel = gpuModel;
        this.manifacturer = manifacturer;
    }
    @Override
    public void gpuRender() {
        System.out.println("Rendering on GPU (NVIDIA)");
    }

    @Override
    public String toString() {
        return GPU_BRAND+" "+gpuModel.toUpperCase()+" powered by "+manifacturer;
    }
}
