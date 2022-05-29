package services.item;

import data.distributor.DistributorItemOrderInterface;
import data.item.ItemCostInterface;

public class ItemService implements ItemServiceInterface {

    public void addItemToDistributor(DistributorItemOrderInterface distributor, ItemCostInterface item) {
        try {
            if(item!=null && distributor!=null) {
                if(distributor.getItems().get(item.getId())==null) {
                    distributor.getItems().put(item.getId(), item);
                } else {
                    throw new Exception("ItemCostInterface exists already.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ItemCostInterface getItemFromDistributor(DistributorItemOrderInterface distributor, long itemId) {
        try {
            if(distributor!=null) {
                if(distributor.getItems().get(itemId)!=null) {
                    return distributor.getItems().get(itemId);
                } else {
                    throw new Exception("ItemCostInterface does not exist.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void updateItemToDistributor(DistributorItemOrderInterface distributor, ItemCostInterface item) {
        try {
            if(item!=null && distributor!=null) {
                if(distributor.getItems().get(item.getId())!=null) {
                    distributor.getItems().put(item.getId(), item);
                } else {
                    throw new Exception("ItemCostInterface exists already.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteItemFromDistributor(DistributorItemOrderInterface distributor, ItemCostInterface item) {
        try {
            if(item!=null && distributor!=null) {
                if(distributor.getItems().get(item.getId())!=null) {
                    distributor.getItems().remove(item.getId());
                } else {
                    throw new Exception("ItemCostInterface does not exist.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
