class Archer {
    public static Character create() {
        return new Character(
            "Archer",
            new ShootArrow(),
            new DodgeDefense()
        );
    }
}