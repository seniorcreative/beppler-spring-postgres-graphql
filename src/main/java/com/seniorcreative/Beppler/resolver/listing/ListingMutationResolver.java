package com.seniorcreative.Beppler.resolver.listing;

import com.seniorcreative.Beppler.dto.ListingInput;
import com.seniorcreative.Beppler.entity.Listing;
import com.seniorcreative.Beppler.service.listing.ListingService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ListingMutationResolver implements GraphQLMutationResolver {

    private final ListingService listingService;

    public Listing addListing(ListingInput listingInput) {
        return listingService.add(listingInput);
    }
}