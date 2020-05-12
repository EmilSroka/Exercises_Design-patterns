package pl.emilsroka.adapter.end;

import pl.emilsroka.adapter.end.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
    GmailClient client;

    GmailAdapter(GmailClient client){
        this.client = client;
    }

    @Override
    public void downloadEmails() {
        client.connect();
        client.getEmails();
        client.disconnect();
    }
}
