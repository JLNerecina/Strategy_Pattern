# Strategy Pattern – Game Characters 

A clean, well-structured demonstration of the **Strategy Design Pattern** in Java, applied to a simple game character system.

This project refactors a tightly-coupled character class (with if-else conditionals) into a flexible, extensible design using **composition over inheritance**.

## Features

- Interchangeable behaviors at runtime (core benefit of Strategy pattern)
- Separate `AttackStrategy` and `DefenseStrategy` interfaces
- Concrete strategies: Sword swing, Spell cast, Arrow shoot + Shield, Dodge, Magic Barrier
- Knight, Wizard, Archer implemented via composition (no class inheritance for characters)
- Runtime behavior change example (e.g., Knight learns magic barrier)
- No if-else hell – fully adheres to Open/Closed Principle

## UML Class Diagram

![Strategy Pattern UML – Game Characters]((https://github.com/JLNerecina/Strategy_Pattern/blob/main/Strategy%20Pattern%20UML%20Diagram.png))


## Project Structure

```
src/
├── AttackStrategy.java          (interface)
├── DefenseStrategy.java         (interface)
├── SwingSword.java
├── CastSpell.java
├── ShootArrow.java
├── ShieldDefense.java
├── DodgeDefense.java
├── MagicBarrierDefense.java
├── Character.java               (context class)
├── Knight.java                  (static factory)
├── Wizard.java
├── Archer.java
└── GameApp.java                 (demo / main)
```

## How to Run

```bash
# Clone the repo
git clone https://github.com/YOUR-USERNAME/strategy-pattern-game-characters.git

# Navigate to src folder (or adjust path)
cd strategy-pattern-game-characters/src

# Compile & run
javac *.java
java GameApp

```

## Sample Output:

``` java
I am Knight!
Knight → Knight swings a mighty sword!
Knight → Blocking with a heavy shield!

I am Wizard!
Wizard → Wizard unleashes a powerful spell!
Wizard → Raising a glowing magic barrier!

I am Archer!
Archer → Archer releases a sharp arrow!
Archer → Dodging with quick reflexes!

Knight finds a magic scroll...
Knight → Raising a glowing magic barrier!

```

## Why This Matters
This project demonstrates key OOP principles:

Encapsulation of algorithms (strategies)
Favor composition over inheritance
Open/Closed Principle (extend behavior without modifying existing code)
Dependency Injection (constructor-based strategy assignment)

Great for learning behavioral design patterns, refactoring legacy code, and building flexible game systems.

## Technologies

Java (JDK 8 or higher)
No external dependencies

## Notes 
- Feel free to fork, star ⭐ or use as reference for your own design pattern studies!
- Made with 💻 by John Lian R. Nerecina
- New Era University
- Software Engineering 2
