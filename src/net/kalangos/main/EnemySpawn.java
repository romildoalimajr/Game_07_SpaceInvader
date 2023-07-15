package net.kalangos.main;

import net.kalangos.entities.Enemy;
import net.kalangos.entities.Entity;

public class EnemySpawn {

	public int targetTime = 60 * 5;
	public int currentTime = 0;

	public void tick() {
		currentTime++;
		if (currentTime == targetTime) {
		//	targetTime = Entity.rand.nextInt(100);
			if (Entity.rand.nextInt(2) % 2 == 0) {
				currentTime = 0;
				int yy = 0;
				int xx = Entity.rand.nextInt(Game.WIDTH - 16);
				Enemy enemy = new Enemy(xx, yy, 16, 16, Entity.rand.nextInt(3-1)+1, Game.spritesheet.getSprite(16, 0, 16, 16));
				Game.entities.add(enemy);
			}else {
				currentTime = 0;
				int yy = 0;
				int xx = Entity.rand.nextInt(Game.WIDTH - 16);
				Enemy enemy = new Enemy(xx, yy, 16, 16, 1, Game.spritesheet.getSprite(32, 0, 16, 16));
				Game.entities.add(enemy);
			}
		}
	}
}
