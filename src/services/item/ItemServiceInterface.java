package services.item;

import data.distributor.Distributor;
import data.item.ItemCost;

public interface ItemServiceInterface {
    void addItemToDistributor(Distributor distributor, ItemCost item);
    ItemCost getItemFromDistributor(Distributor distributor, long itemId);
    void updateItemToDistributor(Distributor distributor, ItemCost item);
    void deleteItemFromDistributor(Distributor distributor, ItemCost item);
}
