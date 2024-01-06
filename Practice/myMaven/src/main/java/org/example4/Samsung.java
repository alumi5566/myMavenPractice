package org.example4;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
    @Autowired
    // will check the AppConfig
    MobileCPU cpu;

    public MobileCPU getCup() {
        return cpu;
    }

    public void setCup(MobileCPU cup) {
        this.cpu = cup;
    }

    public void config(){
        System.out.println("Samsung Class");
        cpu.process();
    }
}
