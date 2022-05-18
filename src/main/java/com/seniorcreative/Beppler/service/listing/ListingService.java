package com.seniorcreative.Beppler.service.listing;

import com.seniorcreative.Beppler.dto.ListingInput;
import com.seniorcreative.Beppler.entity.Listing;

import java.util.List;

public interface ListingService {

    Listing add(ListingInput listingInput);

    Listing getById(Long id);

    List<Listing> get(Integer skip, Integer limit);
}