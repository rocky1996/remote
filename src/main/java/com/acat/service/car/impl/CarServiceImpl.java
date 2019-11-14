package com.acat.service.car.impl;

import com.acat.mongo.CarRepository;
import com.acat.mongo.entity.CarEntity;
import com.acat.service.car.CarService;
import com.acat.service.car.dto.CarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-11-14
 */
@Service("carService")
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public void addCar(CarDto carDto) {

        CarEntity carEntity = new CarEntity();
        carEntity.setId(UUID.randomUUID().toString());
        carEntity.setCarName(carDto.getCarName());
        carEntity.setCarArea(carDto.getCarArea());
        carEntity.setCarNum(carDto.getCarNum());
        carEntity.setCarYear(carDto.getCarYear());

        carRepository.insertCarEntity(carEntity);
    }
}
