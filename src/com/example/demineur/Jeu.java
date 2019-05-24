package com.example.demineur;

import java.io.IOException;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

import javax.swing.ImageIcon;

import com.example.util.ResourceUtility;

public class Jeu {

	int rows = 4;
	int cols = 3;

	private ImageIcon[][] figures = loadImages();

	public Jeu() throws IOException {
	}

	public ImageIcon[][] loadImages() throws IOException {
		ImageIcon[][] images = ResourceUtility
				.splitImageIcon(ResourceUtility.loadBufferedImage("images/butterfly2.png"), rows, cols);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				images[i][j].setDescription(String.valueOf(i) + "-" + String.valueOf(j));
				// System.out.println(images[i][j].getDescription());
			}
		}

		return images;
	}

	public Deque<ImageIcon> creerPioche() {
		LinkedList<ImageIcon> tabList = new LinkedList<>();

		// Afficher la liste
		for (int k = 0; k < 2; k++) {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					tabList.add(figures[i][j]);
					// System.out.println(figures[i][j]);
				}
			}
		}
		Collections.shuffle(tabList);
		return tabList;
	}

}