class Knight {
    public static Character create() {
        return new Character(
            "Knight",
            new SwingSword(),
            new ShieldDefense()
        );
    }
}

