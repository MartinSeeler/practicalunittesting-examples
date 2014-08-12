package com.practicalunittesting;

import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class RaceResultsServiceFirstAndSecondTest {

    public void subscribedClientShouldReceiveMessage() {
        final RaceResultsService raceResults = new RaceResultsService();
        final Client client = mock(Client.class);
        final Message message = mock(Message.class);

        raceResults.addSubscriber(client);
        raceResults.send(message);

        verify(client).receive(message);
    }

    public void messageShouldBeSentToAllSubscribedClients() {
        final RaceResultsService raceResults = new RaceResultsService();
        final Client clientA = mock(Client.class);
        final Client clientB = mock(Client.class);
        final Message message = mock(Message.class);

        raceResults.addSubscriber(clientA);
        raceResults.addSubscriber(clientB);
        raceResults.send(message);
        verify(clientA).receive(message);
        verify(clientB).receive(message);
    }
}
