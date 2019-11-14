package com.acat.controller;

import com.acat.service.car.CarService;
import com.acat.service.car.dto.CarDto;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-11-14
 */
@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/v1/addCar")
    public void addCar(@Valid @RequestBody CarDto carDto){
        System.out.println(JSON.toJSONString(carDto));
        carService.addCar(carDto);
    }

}
