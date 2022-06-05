package services.distributor;

import data.distributor.DistributorItemOrder;
import data.kart.KartDistributor;

public class KartDistributorService implements KartDistributorServiceInterface {

    public void addDistributorToKart(KartDistributor kart, DistributorItemOrder distributor) {
        try {
            if(kart!=null && distributor!=null) {
                if(kart.getDistributors().get(distributor.getId())==null) {
                    kart.getDistributors().put(distributor.getId(), distributor);
                } else {
                    throw new Exception("DistributorItemOrder exists already.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public DistributorItemOrder getDistributorFromKart(KartDistributor kart, long distributorId) {
        try {
            if(kart!=null) {
                if(kart.getDistributors().get(distributorId)!=null) {
                    return kart.getDistributors().get(distributorId);
                } else {
                    throw new Exception("DistributorItemOrder does not exist.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void updateDistributorToKart(KartDistributor kart, DistributorItemOrder distributor) {
        try {
            if(kart!=null && distributor!=null) {
                if(kart.getDistributors().get(distributor.getId())!=null) {
                    kart.getDistributors().put(distributor.getId(), distributor);
                } else {
                    throw new Exception("DistributorItemOrder does not exist.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteDistributorToKart(KartDistributor kart, DistributorItemOrder distributor) {
        try {
            if(kart!=null && distributor!=null) {
                if(kart.getDistributors().get(distributor.getId())!=null) {
                    kart.getDistributors().remove(distributor.getId());
                } else {
                    throw new Exception("DistributorItemOrder does not exist.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
