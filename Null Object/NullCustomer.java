/**
 * NullCustomer
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    };

    @Override
    public boolean isNill() {
        return true;
    };
}