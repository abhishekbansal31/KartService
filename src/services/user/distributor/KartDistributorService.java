package services.user.distributor;

import data.kart.KartDistributable;
import data.user.distributor.Distributable;

public class KartDistributorService implements KartDistributorServiceInterface {

    public void addDistributorToKart(KartDistributable kart, Distributable distributor) {
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

    public Distributable getDistributorFromKart(KartDistributable kart, long distributorId) {
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

    public void updateDistributorToKart(KartDistributable kart, Distributable distributor) {
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

    public void deleteDistributorToKart(KartDistributable kart, Distributable distributor) {
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
