package net.superbia.caseopener.loot;

import java.util.List;

/**
 * DropRoller — класс, отвечающий за выбор одного дропа из пула по весам.
 *
 * Здесь реализована логика:
 * List<DropEntry> → один случайно выбранный DropEntry
 *
 * Класс НЕ знает:
 * - про кейсы
 * - про игроков
 * - про ItemStack
 *
 * Он работает только с данными (DropEntry).
 */
public class DropRoller {

    /**
     * Выполняет ролл дропа по весам.
     *
     * @param Listweight список возможных дропов (пул кейса)
     * @return выбранный DropEntry
     */
    public static DropEntry giveDropRoll(List<DropEntry> Listweight) {

        double totalWeight = 0.0;

        // 1. Считаем суммарный вес всех DropEntry.
        // Это будет верхняя граница для генерации случайного числа.
        for (DropEntry i : Listweight) {
            totalWeight += i.weight;
        }

        // 2. Генерируем случайное число в диапазоне [0, totalWeight).
        double random = Math.random() * totalWeight;

        // Запасной вариант (на случай пограничных ситуаций).
        // По факту сюда попадёт последний элемент списка.
        DropEntry lastChoice = null;

        // 3. Проходим по всем вариантам дропа.
        // На каждом шаге вычитаем вес текущего DropEntry.
        // Как только random становится <= 0 —
        // текущий DropEntry считается выбранным.
        for (DropEntry givenChoice : Listweight) {
            random -= givenChoice.weight;

            if (random <= 0.0) {
                return givenChoice;
            }

            lastChoice = givenChoice;
        }

        // 4. Защита от теоретических крайних случаев:
        // если по какой-то причине random не стал <= 0,
        // возвращаем последний элемент пула.
        return lastChoice;
    }
}
