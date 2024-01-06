package org.example5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Amd implements MobileCPU {
    public void process() {
        System.out.println("AMD CPU example5");
    }
}
