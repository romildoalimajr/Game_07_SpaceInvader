package net.kalangos.graficos;

import java.awt.Font;
import java.awt.Graphics;

public class UI {

	public static int seconds = 0;
	public static int minutes = 0;
	public static int frames = 0;

	public void tick() {
		frames++;
		if (frames == 60) {
			// passou um segundo
			frames = 0;
			seconds++;
			if (seconds == 60) {
				seconds = 0;
				minutes++;
				if (UI.minutes % 1 == 0) {

				}
			}
		}

	}

	public void render(Graphics g) {
/*
		String formatTime = "";
		if (minutes < 10) {
			formatTime += "0" + minutes + ":";
		} else {
			formatTime += minutes + ":";
		}

		if (seconds < 10) {
			formatTime += "0" + seconds;
		} else {
			formatTime += seconds;
		}

		g.setFont(new Font("arial", Font.BOLD, 23));
		g.drawString(formatTime, 14, 30);
		*/
	}

}
