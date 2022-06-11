package com.kartService.services.user.distributor;

import java.util.Map;

import com.kartService.data.kart.KartCommercial;
import com.kartService.data.user.distributor.Distributable;

public class KartDistributorService implements KartDistributorServiceInterface {

    public Map<Long, Distributable> getDistributorsFromKart(KartCommercial kart) {
        try {
            if(kart!=null) {
                return kart.getDistributors();
            } else {
                throw new Exception("Invalid inputs.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Distributable getDistributor(KartCommercial kart, long distributorId) {
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

    public void addDistributorToKart(KartCommercial kart, Distributable distributor) {
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

    public void updateDistributorToKart(KartCommercial kart, Distributable distributor) {
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

    public void deleteDistributorToKart(KartCommercial kart, long distributorId) {
        try {
            if(kart!=null) {
                if(kart.getDistributors().get(distributorId)!=null) {
                    kart.getDistributors().remove(distributorId);
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
