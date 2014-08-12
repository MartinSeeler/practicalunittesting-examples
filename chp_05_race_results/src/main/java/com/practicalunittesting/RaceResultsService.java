package com.practicalunittesting;

import java.util.Collection;
import java.util.HashSet;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class RaceResultsService {

    private final Collection<Client> clients = new HashSet<Client>();

    public void addSubscriber(final Client client) {
        clients.add(client);
    }

    public void send(final Message message) {
        for (final Client client : clients) {
            client.receive(message);
        }
    }

    public void removeSubscriber(final Client client) {
        clients.remove(client);
    }
}
