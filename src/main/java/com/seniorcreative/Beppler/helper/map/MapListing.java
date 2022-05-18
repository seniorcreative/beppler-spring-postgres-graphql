package com.seniorcreative.Beppler.helper.map;

import com.seniorcreative.Beppler.dto.ListingInput;
import com.seniorcreative.Beppler.entity.Listing;
import com.seniorcreative.Beppler.entity.TradeType;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MapListing {

    public Listing mapInputToListing(ListingInput listingInput, TradeType tradeType) {
        Listing listing = new Listing();

        listing.setTitle(listingInput.getTitle());
        listing.setDescription(listingInput.getDescription());
        listing.setPrice(listingInput.getPrice());
        listing.setCurrency(listingInput.getCurrency());
        listing.setCreatedAt(new Date());
        listing.setTradeType(tradeType);

        return listing;
    }
}
