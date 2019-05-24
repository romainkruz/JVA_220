package com.example.demineur;

import java.io.IOException;

import javax.swing.ImageIcon;

import com.example.util.ResourceUtility;

public class Jeu {

	// public ImageIcon iconeVide = ResourceUtility.loadImage("images/vide.png");
	// public ImageIcon iconeMine = ResourceUtility.loadImage("images/mine.png");
	private ImageIcon[] figures = loadImages();

	public Jeu() throws IOException {
	}

	public ImageIcon[] loadImages() throws IOException {
		ImageIcon[] images = new ImageIcon[2];
		images[0] = ResourceUtility.loadImage("images/vide.png");
		images[1] = ResourceUtility.loadImage("images/mine.png");
		images[0].setDescription("Vide");
		images[1].setDescription("Mine");
		return images;
	}

}