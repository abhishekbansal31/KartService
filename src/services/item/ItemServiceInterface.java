package services.item;

import data.item.ItemSellable;
import data.user.distributor.Distributable;

public interface ItemServiceInterface {
    void addItemToDistributor(Distributable distributor, ItemSellable item);
    ItemSellable getItemFromDistributor(Distributable distributor, long itemId);
    void updateItemToDistributor(Distributable distributor, ItemSellable item);
    void deleteItemFromDistributor(Distributable distributor, ItemSellable item);
}
