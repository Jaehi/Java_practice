package GameLevel;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        AdvencedLevel aLevel = new AdvencedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        SuperLevel sLevel  = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);
    }
}
