package net.superbia.caseopener.network.packet;

public class C2S_FinishCaseOpen {
    // Packet: клиент -> сервер.

// Отправляется, когда анимация открытия кейса закончилась.

// Схема работы:
// 1) клиент закончил анимацию
// 2) отправляет openId на сервер
// 3) сервер находит CaseOpenSession
// 4) выдаёт награду игроку
// 5) удаляет session

// Здесь будет:
// - openId (какое открытие завершилось)
// - encode / decode (сериализация данных)
// - handle (серверная обработка)
}
