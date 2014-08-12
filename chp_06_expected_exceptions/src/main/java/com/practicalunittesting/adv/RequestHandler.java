package com.practicalunittesting.adv;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class RequestHandler {

    private final RequestProcessor requestProcessor;

    public RequestHandler(final RequestProcessor requestProcessor) {
        this.requestProcessor = requestProcessor;
    }

    public void handle(final Request request) throws InvalidRequestException {
        if (invalidRequest(request)) {
            throw new InvalidRequestException();
        }
        requestProcessor.process(request);
    }

    private boolean invalidRequest(final Request request) {
        return true;  //To change body of created methods use File | Settings | File Templates.
    }
}
