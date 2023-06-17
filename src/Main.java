import computer.Computer;
import computer.Desktop;
import cpu.Cpu;
import factory.AppleComputerFactory;
import factory.ComputerFactory;
import factory.MsiComputerFactory;
import gpu.Gpu;

public class Main {
    public static void main(String[] args) {
        //Client Side.

        ComputerFactory msiComputerFactory =
            new MsiComputerFactory();

        //Creating CPU Part.
        Cpu intelCoreI5 = msiComputerFactory
                .createCpu("INTEL","i5 13600k","5.20ghz");
        intelCoreI5.cpuRender();
        System.out.println(intelCoreI5);


        //Creating GPU Part.
        Gpu rtx3060 = msiComputerFactory.createGpu("NVIDIA","rtx 3060");
        rtx3060.gpuRender();
        System.out.println(rtx3060);


        //Creating Computer.
        Computer msiRaiderG65 = msiComputerFactory
                .createComputer("INTEL","i7 13700K","5.50 ghz","nvidia","rtx 3070");
        System.out.println(msiRaiderG65);

        //Creating another Computer Factory (Apple)
        ComputerFactory appleComputerFactory = new AppleComputerFactory();

        //Creating Apple Computer.
        Computer macbookAir13_2020 = appleComputerFactory
                .createComputer("Apple","M1","3.50 ghz","amd","VEGA56");
        System.out.println(macbookAir13_2020);


    }
}


