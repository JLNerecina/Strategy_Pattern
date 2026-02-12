class Wizard {
    public static Character create() {
        return new Character(
            "Wizard",
            new CastSpell(),
            new MagicBarrierDefense()
        );
    }
}