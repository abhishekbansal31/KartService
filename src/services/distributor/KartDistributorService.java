package services.distributor;

import data.distributor.DistributorItemOrderInterface;
import data.kart.KartInterface;

public class KartDistributorService implements KartDistributorServiceInterface {

    public void addDistributorToKart(KartInterface kart, DistributorItemOrderInterface distributor) {
        try {
            if(kart!=null && distributor!=null) {
                if(kart.getDistributors().get(distributor.getId())==null) {
                    kart.getDistributors().put(distributor.getId(), distributor);
                } else {
                    throw new Exception("DistributorItemOrderInterface exists already.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public DistributorItemOrderInterface getDistributorFromKart(KartInterface kart, long distributorId) {
        try {
            if(kart!=null) {
                if(kart.getDistributors().get(distributorId)!=null) {
                    return kart.getDistributors().get(distributorId);
                } else {
                    throw new Exception("DistributorItemOrderInterface does not exist.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void updateDistributorToKart(KartInterface kart, DistributorItemOrderInterface distributor) {
        try {
            if(kart!=null && distributor!=null) {
                if(kart.getDistributors().get(distributor.getId())!=null) {
                    kart.getDistributors().put(distributor.getId(), distributor);
                } else {
                    throw new Exception("DistributorItemOrderInterface does not exist.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteDistributorToKart(KartInterface kart, DistributorItemOrderInterface distributor) {
        try {
            if(kart!=null && distributor!=null) {
                if(kart.getDistributors().get(distributor.getId())!=null) {
                    kart.getDistributors().remove(distributor.getId());
                } else {
                    throw new Exception("DistributorItemOrderInterface does not exist.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
