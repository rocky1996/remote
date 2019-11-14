package com.acat.mongo.impl;

import com.acat.mongo.CarRepository;
import com.acat.mongo.entity.CarEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-11-14
 */
@Service("carRepository")
public class CarRepositoryImpl implements CarRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void insertCarEntity(CarEntity carEntity) {
        mongoTemplate.insert(carEntity);
    }
}
