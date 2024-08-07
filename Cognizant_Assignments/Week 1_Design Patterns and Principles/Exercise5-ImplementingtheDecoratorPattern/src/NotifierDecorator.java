public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrapNotifier;

    public NotifierDecorator(Notifier notifier){
        this.wrapNotifier=notifier;
    }
        @Override
        public void send(String message){
            wrapNotifier.send( message);
        }
    }

