package services.distributor;

import data.distributor.Distributor;
import data.kart.KartInterface;

public class DistributorService implements DistributorServiceInterface {

    public void addDistributorToKart(KartInterface kart, Distributor distributor) {
        try {
            if(kart!=null && distributor!=null) {
                if(kart.getDistributors().get(distributor.getId())==null) {
                    kart.getDistributors().put(distributor.getId(), distributor);
                } else {
                    throw new Exception("Distributor exists already.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Distributor getDistributorFromKart(KartInterface kart, long distributorId) {
        try {
            if(kart!=null) {
                if(kart.getDistributors().get(distributorId)!=null) {
                    return kart.getDistributors().get(distributorId);
                } else {
                    throw new Exception("Distributor does not exist.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void updateDistributorToKart(KartInterface kart, Distributor distributor) {
        try {
            if(kart!=null && distributor!=null) {
                if(kart.getDistributors().get(distributor.getId())!=null) {
                    kart.getDistributors().put(distributor.getId(), distributor);
                } else {
                    throw new Exception("Distributor does not exist.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteDistributorToKart(KartInterface kart, Distributor distributor) {
        try {
            if(kart!=null && distributor!=null) {
                if(kart.getDistributors().get(distributor.getId())!=null) {
                    kart.getDistributors().remove(distributor.getId());
                } else {
                    throw new Exception("Distributor does not exist.");
                }
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
