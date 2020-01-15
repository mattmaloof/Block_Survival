import java.util.Random;

public class Spawn {

    private Handler handler;
    private HUD hud;
    private Random r = new Random();

    private int scoreKeep = 0;
    public static STATE gameState = STATE.Menu;

    public Spawn(Handler handler, HUD hud){
        this.handler = handler;
        this.hud = hud;
    }

    public void tick() {
        scoreKeep++;

        if (scoreKeep >= 200) {
            scoreKeep = 0;
            hud.setLevel(hud.getLevel() + 1);

            if (hud.getLevel() == 2) {
                handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
            } else if (hud.getLevel() == 3) {
                handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
            } else if (hud.getLevel() == 4) {
                handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
            } else if (hud.getLevel() == 5) {
                handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
            } else if (hud.getLevel() == 6) {
                handler.addObject(new PowerUp(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.PowerUp, handler));
                handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
            } else if (hud.getLevel() == 7) {
                handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
            } else if (hud.getLevel() == 10) {
                handler.clearEnemies();
                handler.addObject(new EnemyBoss((Game.WIDTH / 2) - 48, -160, ID.EnemyBoss, handler));
            } else if (hud.getLevel() == 17) {
                handler.addObject(new PowerUp2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.PowerUp2, handler));
            } else if (hud.getLevel() == 20) {
                handler.clearEnemies();
                for (int i = 0; i < 3; i++) {
                    handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
                }
            } else if (hud.getLevel() == 21) {
                for (int i = 0; i < 3; i++) {
                    handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
                }
                handler.addObject(new PowerUp(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.PowerUp, handler));
            } else if (hud.getLevel() == 22) {
                handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
            } else if (hud.getLevel() == 23) {
                handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
            } else if (hud.getLevel() == 24) {
                for (int i = 0; i < 3; i++) {
                    handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
                }
            } else if (hud.getLevel() == 27) {
                handler.clearEnemies();
                for (int i = 0; i < 3; i++) {
                    handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
                }
                handler.addObject(new PowerUp(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.PowerUp, handler));
            } else if (hud.getLevel() == 30) {
                handler.clearEnemies();
                handler.addObject(new EnemyBoss2((Game.WIDTH / 2) - 48, -160, ID.EnemyBoss, handler));
            } else if (hud.getLevel() == 35) {
                for (int i = 0; i < 5; i++) {
                    handler.addObject(new PowerUp2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.PowerUp2, handler));
                    handler.addObject(new PowerUp(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.PowerUp, handler));
                }
            } else if (hud.getLevel() == 40) {
                handler.clearEnemies();
                gameState = STATE.Menu;
            }
        }
    }
}
