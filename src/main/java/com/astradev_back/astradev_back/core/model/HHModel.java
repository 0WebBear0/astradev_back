package com.astradev_back.astradev_back.core.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HHModel {
    private String word;
    private int founds;
    private double maxSal;
    private double minSal;
    private double avgSal;

    public HHModel(String word, int founds, double maxSal, double minSal, double avgSal) {
        this.word = word;
        this.founds = founds;
        this.maxSal = maxSal;
        this.minSal = minSal;
        this.avgSal = avgSal;
    }
}