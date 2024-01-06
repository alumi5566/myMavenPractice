package org.example5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Intel implements MobileCPU {

    public void process() {
        System.out.println("Intel CPU example5");
    }
}
