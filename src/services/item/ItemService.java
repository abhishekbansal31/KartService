package services.item;

import data.distributor.DistributorItemOrder;
import data.item.ItemCost;

public class ItemService implements ItemServiceInterface {

    public void addItemToDistributor(DistributorItemOrder distributor, ItemCost item) {
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

    public ItemCost getItemFromDistributor(DistributorItemOrder distributor, long itemId) {
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

    public void updateItemToDistributor(DistributorItemOrder distributor, ItemCost item) {
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

    public void deleteItemFromDistributor(DistributorItemOrder distributor, ItemCost item) {
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
