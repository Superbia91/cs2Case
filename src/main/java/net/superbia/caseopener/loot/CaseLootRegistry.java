package net.superbia.caseopener.loot;

import net.superbia.caseopener.common.cases.CaseType;
import net.superbia.caseopener.loot.pools.*;

import java.util.List;
import java.util.Map;

public class CaseLootRegistry {

   public static final Map<CaseType, List<DropEntry>> registryPools = Map.of(
            CaseType.GAMMA_2CASE, Gamma2Pool.DROPS,
           CaseType.KILOWATT_CASE, DreamsNightmaresPool.DROPS,//TODO внимательно на пул
           CaseType.REVOLUTION_CASE, RevolutionCasePool.DROPS,
           CaseType.DREAMS_AND_NIGHTMARES_CASE,DreamsNightmaresPool.DROPS,
           CaseType.CHROMA_CASE, ChromePool.DROPS_CHROME,
           CaseType.SPECTRUM_CASE, SpectrumTwo.DROPS_SPECTRUM_TWO
    );

   public static List<DropEntry> giveMeAPoolByCaseType(CaseType caseType){
       if(caseType == null ){
           return List.of();
       }else return registryPools.getOrDefault(caseType,List.of());


   }


}
