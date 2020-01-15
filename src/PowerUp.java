import java.awt.*;

public class PowerUp extends GameObject{

    private Handler handler;

    public PowerUp(int x, int y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = 2;
        velY = 2;
    }

    public Rectangle getBounds(){
        return new Rectangle((int)x, (int)y, 5, 5);
    }

    public void tick() {
        x += velX;
        y += velY;

        if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
        if(x <= 0 || x >= Game.WIDTH - 16) velX *= -1;

        handler.addObject(new Trail((int)x, (int)y, ID.Trail, Color.magenta, 3, 3, 0.002f, handler));
    }

    public void render(Graphics g) {
        g.setColor(Color.pink);
        g.fillRect((int)x, (int)y, 5, 5);
    }
}
