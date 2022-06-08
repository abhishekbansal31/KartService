package data.user.consumer;


public class PremiumUser extends Consumable {

    public PremiumUser(String name, String address, String phone) {
        this.setId(getNextId());
        this.setName(name);
        this.setAddress(address);
        this.setPhone(phone);
    }
    
}
