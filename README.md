# CaseOpener

**CaseOpener** is a Minecraft Forge mod inspired by CS-style cases.  
The mod focuses on the **emotion of opening a case**, not on farming or economy.

Cases are designed as **events** — with visuals, sounds, and anticipation — rather than as a source of grind or resources.

---

## 🎯 Core Idea

> A case is not just loot.  
> A case is a moment.

CaseOpener brings CS-like case opening into Minecraft with:
- weighted drops
- clean architecture
- future support for animations, sounds, and visual effects
- experimental “event cases” without items

The goal is to recreate the **feeling of opening a case**, not to introduce an economy system.

---

## ⚙️ Technical Overview

- **Minecraft:** Java Edition  
- **Mod Loader:** Forge  
- **Version:** 1.20.1  
- **Language:** Java  

The project is built with a strong focus on:
- separation of responsibilities
- safe registries
- readable and maintainable code
- no hidden logic in GUI or visuals

---

## 🧩 How the Case System Works

The system is split into clear layers:
Case Item (player interaction)
↓
CaseType (what case is this?)
↓
CaseLootRegistry (which pool belongs to this case?)
↓
DropRoller (weighted random selection)
↓
DropEntry (result)
↓
ItemStack is created and given to the player

### Important design rule
**The drop is decided BEFORE any animation or GUI.**  
Visuals never affect logic.

---

## 📦 Project Structure

net.superbia.caseopener
│
├── items
│ ├── ModeItems # Item registration
│ └── custom
│ ├── CaseItem # Case logic (right-click)
│ └── KnifeItem # Knife item base
│
├── loot
│ ├── DropEntry # Drop data (item, rarity, weight)
│ ├── DropRoller # Weighted random algorithm
│ ├── CaseLootRegistry # CaseType → Drop pool
│ └── pools # Drop pools per case
│
├── common
│ ├── cases
│ │ └── CaseType # All case types
│ └── rarity
│ └── Rarity # Drop rarities
│
├── events
│ └── ModCreativeTabs # Creative tab
│
└── CaseOpener # Main mod class

---

## 🎲 Drop System

- Each case has its own **drop pool**
- Each drop is described by `DropEntry`
- Drop chances are based on **weights**, not percentages
- The algorithm uses a **roulette-style weighted random**

This ensures:
- predictable balancing
- easy tuning
- no duplicated random logic

---

## 🧠 Design Principles

- ❌ No economy
- ❌ No player trading market
- ❌ No punishment mechanics
- ❌ No forced grind

- ✅ Emotion first
- ✅ Visual and sound feedback
- ✅ Clean architecture
- ✅ Easy future expansion

---

## 🧪 Current State

✅ Core logic completed  
✅ Case opening works  
✅ Weighted drops implemented  
✅ Safe inventory handling  
✅ Fully commented core classes  

The mod is currently in **core-complete / feature-expansion phase**.

---

## 🛠 Planned Features

- Case opening GUI (CS-style scrolling animation)
- Sounds based on rarity
- Visual screen effects
- Atmospheric messages
- Experimental “event cases” (buffs / debuffs, no items)
- Optional lore descriptions for items

---

## 🚫 Explicitly Excluded Features

These ideas are intentionally **not part of the mod**:

- Player-driven economy
- Dynamic market prices
- Trading skins for resources
- Combat-affecting debuffs
- Long or harmful negative effects

---

## 📌 Philosophy

> Fewer features — better experience.  
> One strong emotion is better than ten generic mechanics.

---

## 🧑‍💻 Development Notes

This mod is a learning project with a strong emphasis on:
- understanding Forge architecture
- writing safe and maintainable code
- avoiding “magic” logic
- documenting intent for future development

---

## 📜 License

Specify your license here (MIT, All Rights Reserved, etc.)

---

## ❤️ Final Note

CaseOpener is not about “winning” loot.  
It’s about the moment when the case opens.

Enjoy the click.
