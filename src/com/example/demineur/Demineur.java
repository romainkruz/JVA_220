package com.example.demineur;

import java.awt.Container;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.example.swing.FrameForDemoMaker;

public class Demineur extends FrameForDemoMaker {
	private static final int NB_MINES = 5;
	private static final int TAILLE = 10;

	public Demineur() throws IOException {
		super("Démineur");
		setDefaultBounds(100, 100, 900, 600);
	}

	@Override
	public void init(JFrame frame) {
		Container cp = frame.getContentPane();
		cp.setLayout(new GridLayout(TAILLE, TAILLE));
		for (int i = 0; i < TAILLE; i++) {
			for (int j = 0; j < TAILLE; j++) {
				ComposantCase composantCase = new ComposantCase();
				cp.add(composantCase);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Demineur example = new Demineur();
		SwingUtilities.invokeLater(example);
	}
}
