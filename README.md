

# CaseOpener

**CaseOpener** is a Minecraft Forge mod that brings CS-style case opening into Minecraft — focused on **emotion, anticipation, and experience**, not economy or grind.

This mod treats cases as **interactive events**, combining logic, visuals, and sound into a single meaningful moment.

> A case is not just loot.
> A case is a moment.



## ✨ Features

* 🎲 Weighted drop system with predictable balancing
* 🧱 Clean, layered architecture
* 🧠 Safe and deterministic drop logic
* 🔊 Designed for future sound and visual feedback
* 🎬 Built for animation-driven case opening
* 🧪 Experimental support for event-based cases (non-item outcomes)

---

## ⚙️ Technical Details

| Property     | Value                  |
| ------------ | ---------------------- |
| Game         | Minecraft Java Edition |
| Loader       | Forge                  |
| Version      | 1.20.1                 |
| Language     | Java                   |
| Architecture | Modular, layered       |

Core engineering goals:

* clear separation of responsibilities
* deterministic and safe logic
* maintainable and readable code
* no logic hidden inside GUI or rendering

---

## 🧩 Architecture Overview

The case opening pipeline follows a strict logical flow:

```
CaseItem (player interaction)
    ↓
CaseType (case identity)
    ↓
CaseLootRegistry (drop pool lookup)
    ↓
DropRoller (weighted random selection)
    ↓
DropEntry (selected result)
    ↓
ItemStack creation and delivery
```

### Critical Rule

**The drop is always determined BEFORE any animation or visual feedback.**

Visuals reflect the result — they never influence it.

This guarantees:

* deterministic behavior
* no visual manipulation
* safe and predictable logic

---

## 📦 Project Structure

```
net.superbia.caseopener
│
├── CaseOpener.java            # Main mod entry point
│
├── items
│   ├── ModItems.java         # Item registry
│   └── custom
│       ├── CaseItem.java     # Case opening logic
│       └── KnifeItem.java    # Base knife item
│
├── loot
│   ├── DropEntry.java        # Drop definition
│   ├── DropRoller.java      # Weighted random algorithm
│   ├── CaseLootRegistry.java # Case → pool mapping
│   └── pools                 # Case-specific drop pools
│
├── common
│   ├── cases
│   │   └── CaseType.java     # Case definitions
│   └── rarity
│       └── Rarity.java      # Drop rarity system
│
└── events
    └── ModCreativeTabs.java # Creative tab
```

---

## 🎲 Drop System

Each case has its own drop pool consisting of `DropEntry` objects.

Each entry contains:

* item reference
* rarity
* weight

The selection uses a **roulette-style weighted random algorithm**, ensuring:

* easy balancing
* consistent probability behavior
* centralized drop logic
* no duplicated random implementations

---

## 🧠 Design Philosophy

CaseOpener intentionally avoids traditional progression mechanics.

Not included:

* ❌ Player economy
* ❌ Trading systems
* ❌ Market mechanics
* ❌ Resource farming
* ❌ Punishment systems

Core priorities:

* ✅ Emotional experience
* ✅ Anticipation and tension
* ✅ Visual and sound feedback
* ✅ Clean and expandable architecture

---

## 🧪 Current Status

**Core System: Complete**

Implemented:

* ✅ Case opening logic
* ✅ Weighted drop system
* ✅ Case registry system
* ✅ Safe inventory handling
* ✅ Fully structured architecture

Current phase:

**Feature Expansion**

---

## 🛠 Planned Features

* CS-style scrolling animation GUI
* Rarity-based sound system
* Screen visual effects
* Atmospheric feedback messages
* Event cases (buffs, debuffs, special effects)
* Lore and descriptive metadata

---

## 🚫 Explicitly Excluded

The following features are intentionally out of scope:

* Player-driven economy
* Market simulation
* Dynamic pricing
* Resource trading systems
* Harmful or punishing mechanics

CaseOpener is an **experience system**, not an economy system.

---

## 🧑‍💻 Development Goals

This project focuses on mastering:

* Forge architecture
* safe system design
* clean code principles
* modular game systems
* maintainable project structure

---

## 📜 License

Specify your license here.

Examples:

* MIT License (recommended for open source)
* All Rights Reserved
* Custom License

---

## ❤️ Philosophy

CaseOpener is not about getting items.

It’s about:

* anticipation
* suspense
* and the moment the case opens.

---

If you want, I can also make a **AAA-level GitHub README** with:

* badges (Forge, version, status)
* preview GIF section
* installation guide
* developer guide
* architecture diagram

That would make the project look like a professional public mod instantly.
