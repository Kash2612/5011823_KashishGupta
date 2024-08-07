public class TestDecorator {
    public static void main(String[] args) {
        Notifier notify = new EmailNotifier();
        notify.send("Test mail");

        Notifier smsNotify=new SMSNotifierDecorator(notify);
        smsNotify.send("Test email with SMS.");

        Notifier slackNotify=new SlackNotifierDecorator(smsNotify);
        slackNotify.send("Test email with SMS and Slack.");
    }
}
