package net.superbia.caseopener.loot;

import net.superbia.caseopener.common.cases.CaseType;
import net.superbia.caseopener.loot.pools.*;

import java.util.List;
import java.util.Map;

/**
 * Реестр пулов дропа для кейсов.
 *
 * Этот класс связывает:
 * CaseType (тип кейса)
 * →
 * конкретный пул дропа (List<DropEntry>)
 *
 * Используется в CaseItem при открытии кейса,
 * чтобы по типу кейса получить список возможных наград.
 *
 * ВАЖНО:
 * - реестр НЕ содержит логики ролла
 * - реестр НЕ знает про игроков или мир
 * - он только возвращает данные
 */
public class CaseLootRegistry {

    /**
     * Основная карта соответствия:
     * CaseType → пул дропа
     *
     * Каждый пул — это List<DropEntry>,
     * заранее описанный в соответствующем классе (Gamma2Pool, ChromePool и т.д.)
     *
     * Map используется вместо if/switch,
     * чтобы упростить расширение и поддержку.
     */
    public static final Map<CaseType, List<DropEntry>> registryPools = Map.of(
            CaseType.GAMMA_2CASE, Gamma2Pool.DROPS,
            CaseType.KILOWATT_CASE, KilowattPool.DROPS_KILOWATT,
            CaseType.REVOLUTION_CASE, RevolutionCasePool.DROPS,
            CaseType.DREAMS_AND_NIGHTMARES_CASE, DreamsNightmaresPool.DROPS,
            CaseType.CHROMA_CASE, ChromePool.DROPS_CHROME,
            CaseType.SPECTRUM_CASE, SpectrumTwo.DROPS_SPECTRUM_TWO
    );

    /**
     * Возвращает пул дропа по типу кейса.
     *
     * Принципы метода:
     * - никогда не возвращает null
     * - если тип кейса не найден или равен null —
     *   возвращается пустой список
     *
     * Это позволяет безопасно использовать метод
     * без дополнительных проверок на null.
     */
    public static List<DropEntry> giveMeAPoolByCaseType(CaseType caseType) {
        if (caseType == null) {
            return List.of();
        }
        return registryPools.getOrDefault(caseType, List.of());
    }
}
