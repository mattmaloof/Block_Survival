import java.awt.*;
import java.util.Random;

public class EnemyBossBullet2 extends GameObject{

    private Handler handler;
    Random r = new Random();

    public EnemyBossBullet2(int x, int y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = (r.nextInt(5 - -5) + -5);
        velY = 5;
    }

    public Rectangle getBounds(){
        return new Rectangle((int)x, (int)y, 12, 12);
    }

    public void tick() {
        x += velX;
        y += velY;

        if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
        if(x <= 0 || x >= Game.WIDTH - 16) velX *= -1;

        handler.addObject(new Trail((int)x, (int)y, ID.Trail, Color.blue, 12, 12, 0.02f, handler));
    }

    public void render(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect((int)x, (int)y, 12, 12);
    }
}
