package com.rezahdrm.structural.facade;

public class ComputerFacade {
    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public ComputerFacade() {
        this.cpu = new CPU("AMD", "Ryzen 5", "Socket AM4", "4.2 GHz");
        this.memory = new Memory("Corsair", 16, "DDR4 SDRAM");
        this.hardDrive = new HardDrive("Seagate", "ST8000DM004", 4);
    }

    public void start() {
        cpu.freeze();
        memory.load(12000L, hardDrive.read(100,150));
        cpu.jump(0x14525);
        cpu.execute();
    }
}
