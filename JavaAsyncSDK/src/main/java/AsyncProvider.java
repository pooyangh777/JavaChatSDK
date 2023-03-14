public interface AsyncProvider {
    AsyncProviderListener listener = null;
    void connect();
    void close();
    void send(String message);
}