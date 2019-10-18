package com.x5kids.NasaProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NasaProjectController {

    @Autowired
    private FlareDriver flareDriver;
    @RequestMapping(value = "/getFlareResponse", method = RequestMethod.GET)
    public FlareResponse getFlareResponse() {
        return this.flareDriver.getNumberOfFlares();
    }


}
