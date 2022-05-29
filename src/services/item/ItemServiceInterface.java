package services.item;

import data.distributor.DistributorItemOrderInterface;
import data.item.ItemCostInterface;

public interface ItemServiceInterface {
    void addItemToDistributor(DistributorItemOrderInterface distributor, ItemCostInterface item);
    ItemCostInterface getItemFromDistributor(DistributorItemOrderInterface distributor, long itemId);
    void updateItemToDistributor(DistributorItemOrderInterface distributor, ItemCostInterface item);
    void deleteItemFromDistributor(DistributorItemOrderInterface distributor, ItemCostInterface item);
}
