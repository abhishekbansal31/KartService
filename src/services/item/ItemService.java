package services.item;

import data.distributor.Distributor;
import data.item.ItemCost;

public class ItemService implements ItemServiceInterface {

    public void addItemToDistributor(Distributor distributor, ItemCost item) {
        try {
            if(item!=null && distributor!=null) {
                if(distributor.getItems().get(item.getId())==null) {
                    distributor.getItems().put(item.getId(), item);
                } else {
                    throw new Exception("ItemCost exists already.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ItemCost getItemFromDistributor(Distributor distributor, long itemId) {
        try {
            if(distributor!=null) {
                if(distributor.getItems().get(itemId)!=null) {
                    return distributor.getItems().get(itemId);
                } else {
                    throw new Exception("ItemCost does not exist.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void updateItemToDistributor(Distributor distributor, ItemCost item) {
        try {
            if(item!=null && distributor!=null) {
                if(distributor.getItems().get(item.getId())!=null) {
                    distributor.getItems().put(item.getId(), item);
                } else {
                    throw new Exception("ItemCost exists already.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteItemFromDistributor(Distributor distributor, ItemCost item) {
        try {
            if(item!=null && distributor!=null) {
                if(distributor.getItems().get(item.getId())!=null) {
                    distributor.getItems().remove(item.getId());
                } else {
                    throw new Exception("ItemCost does not exist.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
