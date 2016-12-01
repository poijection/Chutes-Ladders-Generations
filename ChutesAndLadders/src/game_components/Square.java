package game_components;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Square extends JPanel {

	private int squareIndex;
	private JLabel imgPlayer;
	private JLabel imgPlayer2;

	public Square(int index) {
		this.squareIndex = index;
		this.imgPlayer = new JLabel();
		this.imgPlayer2 = new JLabel();
	}

	public void drawLadder() {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("images/ladders/bottom_1.gif"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Image dimg = img.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(dimg);
		JLabel imgLadder = new JLabel(imageIcon);
		imgLadder.setHorizontalAlignment(SwingConstants.LEFT);
		imgLadder.setVerticalAlignment(SwingConstants.BOTTOM);
		this.add(imgLadder, BorderLayout.WEST);
	}

	public void drawLadderTop() {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("images/ladders/top_1.gif"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Image dimg = img.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(dimg);
		JLabel imgLadderTop = new JLabel(imageIcon);
		imgLadderTop.setHorizontalAlignment(SwingConstants.LEFT);
		imgLadderTop.setVerticalAlignment(SwingConstants.BOTTOM);
		this.add(imgLadderTop, BorderLayout.WEST);
	}

	public void drawPlayer(int i) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("images/players/player" + (i + 1) + ".gif"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Image dimg = img.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(dimg);
		if ((this.imgPlayer.getIcon() == null) && (this.imgPlayer2.getIcon() == null)) {
			this.imgPlayer.setIcon(imageIcon);
			this.add(this.imgPlayer, BorderLayout.NORTH);
		} else if ((this.imgPlayer.getIcon() != null) && (this.imgPlayer2.getIcon() == null)) {
			// this.imgPlayer.setIcon(null);
			this.imgPlayer2.setIcon(imageIcon);
			this.add(this.imgPlayer2, BorderLayout.NORTH);
		} else if ((this.imgPlayer.getIcon() == null) && (this.imgPlayer2.getIcon() != null)) {
			// this.imgPlayer2.setIcon(null);
			this.imgPlayer.setIcon(imageIcon);
			this.add(this.imgPlayer, BorderLayout.NORTH);
		} else {

		}
	}

	public void drawSnakeHead() {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("images/snakes/1.gif"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Image dimg = img.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(dimg);
		JLabel imgSnake = new JLabel(imageIcon);
		imgSnake.setHorizontalAlignment(SwingConstants.LEFT);
		imgSnake.setVerticalAlignment(SwingConstants.TOP);
		this.add(imgSnake, BorderLayout.WEST);
	}

	public void drawSnakeHead2() {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("images/snakes/2.gif"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Image dimg = img.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(dimg);
		JLabel imgSnake = new JLabel(imageIcon);
		imgSnake.setHorizontalAlignment(SwingConstants.LEFT);
		imgSnake.setVerticalAlignment(SwingConstants.TOP);
		this.add(imgSnake, BorderLayout.WEST);
	}

	public int getIndex() {
		return this.squareIndex;
	}

	public void removePlayer() {
		if ((this.imgPlayer.getIcon() != null) && (this.imgPlayer2.getIcon() != null)) {
			// this.imgPlayer.setIcon(null);
			this.imgPlayer2.setIcon(null);
		} else if ((this.imgPlayer2.getIcon() == null) && (this.imgPlayer.getIcon() != null)) {
			this.imgPlayer.setIcon(null);
		}
		/*
		 * else if ((this.imgPlayer.getIcon() == null) &&
		 * (this.imgPlayer2.getIcon() != null)) { this.imgPlayer2.setIcon(null);
		 * } else if ((this.imgPlayer.getIcon() != null) &&
		 * (this.imgPlayer2.getIcon() != null)) { this.imgPlayer.setIcon(null);
		 * this.imgPlayer2.setIcon(null); }
		 */
	}

	public void setIndex(int i) {
		this.squareIndex = i;
	}

}
