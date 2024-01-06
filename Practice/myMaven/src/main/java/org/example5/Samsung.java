package org.example5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
    @Autowired
    @Qualifier("amd")
    // will check the AppConfig
    MobileCPU cpu;

    public MobileCPU getCup() {
        return cpu;
    }

    public void setCup(MobileCPU cup) {
        this.cpu = cup;
    }

    public void config(){
        System.out.println("Samsung Class example 5");
        cpu.process();
    }
}
