package net.kalangos.entities;

import java.awt.image.BufferedImage;

import net.kalangos.main.Game;

public class Enemy extends Entity{
	
	public int life = 3;

	public Enemy(double x, double y, int width, int height, double speed, BufferedImage sprite) {
		super(x, y, width, height, speed, sprite);
		// TODO Auto-generated constructor stub
	}
	
	public void tick() {
		y += speed;
		if(y >= Game.HEIGHT) {
			Game.life--;
			Game.entities.remove(this);
			return;
		}
		
		for(int i = 0; i < Game.entities.size(); i++) {
			Entity e = Game.entities.get(i);
			if(e instanceof Bullet) {
				if(Entity.isColidding(this, e)) {
					life--;
					Game.entities.remove(e);
					if(life == 0) {
						Explosion explosion = new Explosion(x, y, 16,16,0,null);
						Game.entities.add(explosion);
						Game.score++;
						Game.entities.remove(this);
						return;
					}
					break;
				}
			}
		}
	}
	
	

}
