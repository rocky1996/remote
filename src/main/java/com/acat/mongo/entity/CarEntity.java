package com.acat.mongo.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-11-14
 */
@Setter
@Getter
@ToString
@Document(collection = "acat_car")
@CompoundIndexes({
        @CompoundIndex(name = "id_carName",def="{'id':1,'carName':1}")
})
public class CarEntity {

    /**
     * 汽车id
     */
    @Id
    private String id;

    /**
     * 汽车名字
     */
    private String carName;

    /**
     * 汽车年限
     */
    private String carYear;

    /**
     * 汽车数量
     */
    private String carNum;

    /**
     * 汽车产地
     */
    private String carArea;
}
