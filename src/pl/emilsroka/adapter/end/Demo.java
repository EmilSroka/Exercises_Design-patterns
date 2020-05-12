package pl.emilsroka.adapter.end;

import pl.emilsroka.adapter.end.Gmail.GmailClient;

public class Demo {
  public static void main(String [] args){
    show();
  }

  public static void show() {
    var client = new EmailClient();
    client.addProvider(new GmailAdapter(new GmailClient()));
    client.downloadEmails();
  }
}
