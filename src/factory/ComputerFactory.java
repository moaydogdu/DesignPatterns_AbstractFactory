package factory;

import computer.Computer;
import cpu.Cpu;
import gpu.Gpu;

public interface ComputerFactory {
    public Computer createComputer(
            String cpuBrand,
            String cpuModel,
            String cpuFrequency,
            String gpu,
            String gpuModel
    );
    Cpu createCpu(String cpuBrand, String cpuModel, String cpuFrequency);
    Gpu createGpu(String gpuBrand, String gpuModel);

}
