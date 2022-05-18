package com.seniorcreative.Beppler.resolver.tradetype;

import com.seniorcreative.Beppler.dto.TradeTypeInput;
import com.seniorcreative.Beppler.entity.TradeType;
import com.seniorcreative.Beppler.service.tradetype.TradeTypeService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TradeTypeMutationResolver implements GraphQLMutationResolver {

    private final TradeTypeService tradeTypeService;

    public TradeType addTradeType(TradeTypeInput tradeTypeInput) {
        return tradeTypeService.add(tradeTypeInput);
    }
}