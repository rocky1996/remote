package com.acat.service.car.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-11-14
 */
@Setter
@Getter
@ToString
public class CarDto {

    /**
     * 汽车名字
     */
    @NotBlank(message = "汽车名字不能为空")
    private String carName;

    /**
     * 汽车年限
     */
    @NotBlank(message = "汽车年限不能为空")
    private String carYear;

    /**
     * 汽车数量
     */
    @NotBlank(message = "汽车数量不能为空")
    private String carNum;

    /**
     * 汽车产地
     */
    @NotBlank(message = "汽车地区不能为空")
    private String carArea;

}
