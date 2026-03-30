package net.superbia.caseopener.common.open;

public class CaseOpenSessionManager {
    // Хранит все активные открытия кейсов на сервере.

// Схема работы:
// 1) при открытии кейса создаётся CaseOpenSession
// 2) Session сохраняется здесь
// 3) после окончания анимации сервер получает session
// 4) выдаёт награду и удаляет её

// Здесь будет:
// - список / map активных session
// - поиск session по игроку или openId
// - удаление после завершения или таймаута
}
