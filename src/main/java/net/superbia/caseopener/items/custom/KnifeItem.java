package net.superbia.caseopener.items.custom;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;

// Класс KnifeItem — базовый класс для всех ножей в моде.
// Используется как обёртка над SwordItem, чтобы:
// 1) логически отделить ножи от обычных мечей
// 2) упростить расширение логики ножей в будущем
//    (анимации, особые эффекты, кастомное поведение и т.п.)
public class KnifeItem extends SwordItem {

    // Конструктор ножа.
    // На данный момент полностью повторяет SwordItem,
    // но вынесен в отдельный класс для архитектурной чистоты
    // и возможного расширения в будущем.
    public KnifeItem(Tier tier,
                     int attackDamageBonus,
                     float attackSpeed,
                     Item.Properties properties) {
        super(tier, attackDamageBonus, attackSpeed, properties);
    }
}
