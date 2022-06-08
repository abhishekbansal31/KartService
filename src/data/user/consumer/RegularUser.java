package data.user.consumer;

import data.user.UserAbstract;

public class RegularUser extends UserAbstract {

    public RegularUser(String name, String address, String phone) {
        this.setId(getNextId());
        this.setName(name);
        this.setAddress(address);
        this.setPhone(phone);
    }
    
}
