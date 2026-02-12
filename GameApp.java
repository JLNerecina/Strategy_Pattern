public class GameApp {
    public static void main(String[] args) {
        Character knight = Knight.create();
        Character wizard = Wizard.create();
        Character archer = Archer.create();

        System.out.println("=== Game characters ready ===\n");

        knight.introduce();
        knight.performAttack();
        knight.performDefense();
        System.out.println();

        wizard.introduce();
        wizard.performAttack();
        wizard.performDefense();
        System.out.println();

        archer.introduce();
        archer.performAttack();
        archer.performDefense();
        System.out.println();

        System.out.println("Knight finds a magic scroll...");
        knight.setDefenseStrategy(new MagicBarrierDefense());
        knight.performDefense();
    }
}