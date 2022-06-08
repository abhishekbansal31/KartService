package services.item;

import data.item.ItemSellable;
import data.user.distributor.Distributable;

public class ItemService implements ItemServiceInterface {

    public void addItemToDistributor(Distributable distributor, ItemSellable item) {
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

    public ItemSellable getItemFromDistributor(Distributable distributor, long itemId) {
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

    public void updateItemToDistributor(Distributable distributor, ItemSellable item) {
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

    public void deleteItemFromDistributor(Distributable distributor, ItemSellable item) {
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
