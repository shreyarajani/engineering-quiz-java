package com.revinate.requestbin.bin.model;

import org.apache.commons.lang3.NotImplementedException;
import java.util.Collection;

/**
 * Skeleton class for the Bin entity.
 * {
 *     "id": "29211f0f-cff1-4d9e-b80d-5c5acab8e5b9",
 *     "requests": [{
 *          <<Request>>
 *     }],
 * }
 *
 * Add whatever you feel is missing.
 * */
public class Bin {

    public String getId(){
        throw new NotImplementedException("To be implemented");
    }

    public Collection<Request> getRequests() {
        throw new NotImplementedException("To be implemented");
    }

    public void addRequest(Request request) {
        throw new NotImplementedException("To be implemented");
    }
}
