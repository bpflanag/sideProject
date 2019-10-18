package com.x5kids.NasaProject;

import org.springframework.web.bind.annotation.*;

@RestController
public class NasaProjectController {

//    @ResponseBody
    @GetMapping("/getNearEarthObjectCount")
    public int getNearEarthObjectCount() {
        return 10;
    }
}
