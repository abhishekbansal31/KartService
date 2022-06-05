package services.item;

import data.distributor.DistributorItemOrder;
import data.item.ItemCost;

public interface ItemServiceInterface {
    void addItemToDistributor(DistributorItemOrder distributor, ItemCost item);
    ItemCost getItemFromDistributor(DistributorItemOrder distributor, long itemId);
    void updateItemToDistributor(DistributorItemOrder distributor, ItemCost item);
    void deleteItemFromDistributor(DistributorItemOrder distributor, ItemCost item);
}
