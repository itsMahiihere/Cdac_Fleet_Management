package com.example.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Models.CarTypeMaster;
import com.example.Services.CarTypeMasterService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/cartype")
@CrossOrigin(origins = "http://localhost:3000")
public class CarTypeMasterController {

    @Autowired
    private CarTypeMasterService carTypeMasterService;

//    @PutMapping("/updateCarType/{customerId}")
//    public String updateCarTypeForCustomer(@PathVariable Long customerId, @PathVariable Long newCarTypeId) {
//        return carTypeMasterService.updateCarTypeForCustomer(customerId, newCarTypeId);
//    }

    @GetMapping("/id/{carTypeId}")
    public ResponseEntity<CarTypeMaster> getTypeByTypeId(@PathVariable("carTypeId") Long carTypeId) {
        return carTypeMasterService.getTypeByTypeId(carTypeId)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }



    @GetMapping("/all")
    public List<CarTypeMaster> getAllTypes() {
        return carTypeMasterService.getAllTypes();
    }
}

