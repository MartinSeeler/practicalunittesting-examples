package com.practicalunittesting;

import org.testng.annotations.Test;

import static org.mockito.Mockito.*;

public class MessengerTest {

    private static final String CLIENT_EMAIL = "some@email.com";
    private static final String MSG_CONTENT = "Dear John! You are fired.";

    @Test
    public void shouldSendEmail() {
        final Template template = mock(Template.class);
        final Client client = mock(Client.class);
        final MailServer mailServer = mock(MailServer.class);
        final TemplateEngine templateEngine = mock(TemplateEngine.class);

        final Messenger sut = new Messenger(mailServer, templateEngine);

        when(client.getEmail()).thenReturn(CLIENT_EMAIL);
        when(templateEngine.prepareMessage(template, client)).thenReturn(MSG_CONTENT);

        sut.sendMessage(client, template);

        verify(mailServer).send(CLIENT_EMAIL, MSG_CONTENT);
    }
}
