package com.acat.mongo;

import com.acat.mongo.entity.CarEntity;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-11-14
 */
public interface CarRepository {

    /**
     * 批量插入
     * @param carEntity
     */
    void insertCarEntity(CarEntity carEntity);

}
