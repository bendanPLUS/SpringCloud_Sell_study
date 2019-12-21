package com.imooc.product.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import java.util.List;

/**
 * Created by 廖师兄
 * 2017-12-09 22:11
 */
@Data
@Builder(toBuilder=true)
public class ProductVO {

    @JsonProperty("foods")
    List<ProductInfoVO> productInfoVOList;
    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;

    @Tolerate
    public ProductVO(){}
}
