package com.glorydream.chain;


import lombok.Getter;

/**
 * @author coryjia@gmail.com
 * @date 5/3/20 11:24 AM
 */

@Getter
public class Request {
    /**
     * The type of this request, used by each item in the chain to see if they should or can handle
     * this particular request
     */
    private final RequestType requestType;

    /**
     * A description of the request
     */
    private final String requestDescription;

    /**
     * Indicates if the request is handled or not. A request can only switch state from unhandled to handled,
     * there's no way to 'unhandle' a request.
     */
    private boolean handled;

    /**
     * Create a new request of the given type and accompanied description
     *
     * @param requestType        The type of request
     * @param requestDescription The description of the request
     */
    public Request(final RequestType requestType, final String requestDescription) {
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    public void markHandled() {
        this.handled = true;
    }

    public boolean isHandled() {
        return this.handled;
    }

    @Override
    public String toString() {
        return requestDescription;
    }
}
