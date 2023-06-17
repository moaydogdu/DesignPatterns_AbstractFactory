package factory;

import computer.Desktop;
import cpu.AppleCpu;
import cpu.Cpu;
import cpu.IntelCpu;
import gpu.AMDGpu;
import gpu.Gpu;
import gpu.NvidiaGpu;

public class AppleComputerFactory implements ComputerFactory{
    public static final String COMPANY_NAME = "Apple";

    @Override
    public Desktop createComputer(
            String cpuBrand,
            String cpuModel,
            String cpuFrequency,
            String gpu,
            String gpuModel
    ){
        return new Desktop(
                createCpu(cpuBrand,cpuModel,cpuFrequency),
                createGpu(gpu,gpuModel)
        );
    }

    @Override
    public Cpu createCpu(String cpuBrand, String cpuModel, String cpuFrequency) {
        if (cpuBrand.equalsIgnoreCase("INTEL")) {
            return new IntelCpu(cpuModel, cpuFrequency,COMPANY_NAME);
        } else if (cpuBrand.equalsIgnoreCase("Apple")) {
            return new AppleCpu(cpuModel, cpuFrequency);
        } else {
            return null;
        }
    }

    @Override
    public Gpu createGpu(String gpuBrand, String gpuModel) {
        if (gpuBrand.equalsIgnoreCase("NVIDIA")) {
            return new NvidiaGpu(gpuModel,COMPANY_NAME);
        } else if (gpuBrand.equalsIgnoreCase("AMD")) {
            return new AMDGpu(gpuModel,COMPANY_NAME);
        } else {
            return null;
        }
    }
}
