package factory;

import computer.Computer;
import computer.Desktop;
import cpu.AmdCpu;
import cpu.Cpu;
import cpu.IntelCpu;
import gpu.AMDGpu;
import gpu.Gpu;
import gpu.NvidiaGpu;

public class MsiComputerFactory implements ComputerFactory {
    public static final String COMPANY_NAME = "MSI";

    @Override
    public Computer createComputer(
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
        } else if (cpuBrand.equalsIgnoreCase("AMD")) {
            return new AmdCpu(cpuModel, cpuFrequency,COMPANY_NAME);
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
