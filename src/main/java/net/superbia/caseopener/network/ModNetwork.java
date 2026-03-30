package net.superbia.caseopener.network;

public class ModNetwork {


// Главный класс сети мода.

// Нужен для регистрации и хранения всех packet'ов.

// Схема работы:
// 1) создаётся network channel
// 2) здесь регистрируются все packets
// 3) через этот класс packets отправляются клиенту/серверу

// Здесь будет:
// - SimpleChannel (канал сети)
// - protocol version
// - registerPackets()
// - sendToServer(...)
// - sendToPlayer(...)

// NOTE:
// Все C2S и S2C packets должны регистрироваться только здесь.
// Это центральная точка всей сетевой логики.

}
