package com.seniorcreative.Beppler.dto;

import com.seniorcreative.Beppler.entity.enums.Currency;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Setter
@Getter
public class ListingInput {

    private String title;

    private String description;

    private Float price;

    @Enumerated(EnumType.STRING)
    @Column(length = 5)
    private Currency currency;

    private Long tradeTypeId;

}
