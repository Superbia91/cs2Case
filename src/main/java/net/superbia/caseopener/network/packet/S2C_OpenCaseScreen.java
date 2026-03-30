package net.superbia.caseopener.network.packet;

public class S2C_OpenCaseScreen {
    // Packet: сервер -> клиент.

// Отправляется после того, как сервер сделал roll дропа.

// Схема работы:
// 1) сервер роллит награду
// 2) создаёт CaseOpenSession
// 3) отправляет клиенту данные для GUI
// 4) клиент открывает CaseOpenScreen
// 5) запускается анимация

// Здесь будет:
// - openId (идентификатор открытия)
// - данные для анимации (список предметов / winner)
// - encode / decode
// - handle (открытие Screen на клиенте)
}
