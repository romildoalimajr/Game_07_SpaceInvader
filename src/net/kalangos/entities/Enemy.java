package net.kalangos.entities;

import java.awt.image.BufferedImage;

import net.kalangos.main.Game;

public class Enemy extends Entity{

	public Enemy(double x, double y, int width, int height, double speed, BufferedImage sprite) {
		super(x, y, width, height, speed, sprite);
		// TODO Auto-generated constructor stub
	}
	
	public void tick() {
		y += speed;
		if(y >= Game.HEIGHT) {
			Game.entities.remove(this);
			return;
		}
	}
	
	

}
