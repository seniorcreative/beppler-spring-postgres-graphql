package com.seniorcreative.Beppler.service.tradetype;

import com.seniorcreative.Beppler.dto.TradeTypeInput;
import com.seniorcreative.Beppler.entity.TradeType;

import java.util.List;

public interface TradeTypeService {

    TradeType add(TradeTypeInput tradeTypeInput);

    TradeType getById(Long id);

    List<TradeType> get(Integer skip, Integer limit);
}