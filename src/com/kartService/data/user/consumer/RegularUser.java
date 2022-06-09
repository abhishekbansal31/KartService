package com.kartService.data.user.consumer;


public class RegularUser extends Consumable {

    public RegularUser(String name, String address, String phone) {
        this.setId(getNextId());
        this.setName(name);
        this.setAddress(address);
        this.setPhone(phone);
    }
    
}
