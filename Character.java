class Character {
    private final String name;
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Character(String name, 
                     AttackStrategy attackStrategy, 
                     DefenseStrategy defenseStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }

    public void performAttack() {
        System.out.print(name + " → ");
        attackStrategy.attack();
    }

    public void performDefense() {
        System.out.print(name + " → ");
        defenseStrategy.defend();
    }

    public void introduce() {
        System.out.println("I am " + name + "!");
    }

    public void setAttackStrategy(AttackStrategy newAttackStrategy) {
        this.attackStrategy = newAttackStrategy;
    }

    public void setDefenseStrategy(DefenseStrategy newDefenseStrategy) {
        this.defenseStrategy = newDefenseStrategy;
    }
}