package net.superbia.caseopener.loot;

import net.superbia.caseopener.common.cases.CaseType;
import net.superbia.caseopener.loot.pools.Gamma2Pool;

import java.util.List;
import java.util.Map;

public class CaseLootRegistry {

   public static final Map<CaseType, List<DropEntry>> registryPools = Map.of(
            CaseType.GAMMA_2CASE, Gamma2Pool.DROPS
    );

   public static List<DropEntry> giveMeAPoolByCaseType(CaseType caseType){
       if(caseType == null ){
           return List.of();
       }else return registryPools.get(caseType);


   }


}
