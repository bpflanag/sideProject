package com.x5kids.NasaProject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class FlareDriverImpl implements FlareDriver {
    @Override
    public int getNumberOfFlares() {
        return 0;
    }
}
