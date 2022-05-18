package com.seniorcreative.Beppler.helper.map;

import com.seniorcreative.Beppler.dto.TradeTypeInput;
import com.seniorcreative.Beppler.entity.TradeType;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MapTradeType {

    public TradeType mapInputToTradeType(TradeTypeInput tradeTypeInput) {
        TradeType tradeType = new TradeType();

        tradeType.setName(tradeTypeInput.getName());
        tradeType.setCreatedAt(new Date());

        return tradeType;
    }
}