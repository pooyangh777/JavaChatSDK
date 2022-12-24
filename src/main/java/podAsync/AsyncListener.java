package podAsync;

import podAsync.model.AsyncState;

public interface AsyncListener {
    void onReceivedMessage(String textMessage);

    void onStateChanged(AsyncState state);

    void onError(Exception exception);
}
