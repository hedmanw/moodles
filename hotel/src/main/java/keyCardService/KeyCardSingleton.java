package keyCardService;

/**
 * Created by wilhelm 2014-12-15.
 */
public class KeyCardSingleton {
    private static KeyCardSingleton ourInstance = new KeyCardSingleton();
    public KeyCardsProvides KEY_CARDS_PROVIDES;

    public static KeyCardSingleton getInstance() {
        return ourInstance;
    }

    private KeyCardSingleton() {
    }
}
