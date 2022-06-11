package com.kartService.services.user.consumer;

import java.util.Map;

import com.kartService.data.kart.KartCommercial;
import com.kartService.data.user.consumer.Consumable;

public class KartConsumerService implements KartConsumerServiceInterface {

    @Override
    public Map<Long, Consumable> getConsumers(KartCommercial kart) {
        try {
            if(kart!=null) {
                return kart.getConsumers();
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Consumable getConsumer(KartCommercial kart, long consumerId) {
        try {
            if(kart!=null) {
                if(kart.getConsumers().get(consumerId)!=null) {
                    return kart.getConsumers().get(consumerId);
                } else {
                    throw new Exception("Consumer does not exist.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void addConsumer(KartCommercial kart, Consumable consumer) {
        try {
            if(kart!=null && consumer!=null) {
                if(kart.getConsumers().get(consumer.getId())==null) {
                    kart.getConsumers().put(consumer.getId(), consumer);
                } else {
                    throw new Exception("Consumer exists already.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateConsumer(KartCommercial kart, Consumable consumer) {
        try {
            if(kart!=null && consumer!=null) {
                if(kart.getConsumers().get(consumer.getId())!=null) {
                    kart.getConsumers().put(consumer.getId(), consumer);
                } else {
                    throw new Exception("Consumer does not exist.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteConsumer(KartCommercial kart, long consumerId) {
        try {
            if(kart!=null) {
                if(kart.getConsumers().get(consumerId)!=null) {
                    kart.getConsumers().remove(consumerId);
                } else {
                    throw new Exception("Consumer does not exist.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
