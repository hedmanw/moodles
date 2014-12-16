package bankingService;

/**
 * Created by wilhelm 2014-12-15.
 */
public class BankingSingleton {
    private static BankingSingleton ourInstance = new BankingSingleton();
    public AdministratorProvides ADMINISTRATOR_PROVIDES;
    public CustomerProvides CUSTOMER_PROVIDES;

    public static BankingSingleton getInstance() {
        return ourInstance;
    }

    private BankingSingleton() {
    }
}
