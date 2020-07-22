package com.bhuviits.martinborruel.controller;

import com.bhuviits.martinborruel.services.FileOperations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    FileOperations fileOp = new FileOperations();

    @GetMapping("/connected")
    public ResponseEntity<String> checkConnection(@RequestParam(value="origin", required = true)  String origin,
                                                  @RequestParam(value="destination", required = true) String destination ){
        return ResponseEntity.status(HttpStatus.OK)
                .body(fileOp.checkCitiesConnection(origin, destination));
    }
}
