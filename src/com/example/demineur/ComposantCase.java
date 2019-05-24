package com.example.demineur;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JToggleButton;
import javax.swing.border.Border;

public class ComposantCase extends JToggleButton {
	private ComposantCase[] voisins = new ComposantCase[8];

	public ComposantCase() {
		super();
		Border lineBorder = BorderFactory.createLineBorder(Color.GRAY, 1);
		setBorder(lineBorder);
		setOpaque(true);
	}

	public ComposantCase getVoisin(IndexVoisin iv) {
		return voisins[iv.ordinal()];
	}

	public ComposantCase setVoisin(IndexVoisin iv, ComposantCase c) {
		return voisins[iv.ordinal()];
	}
}

enum IndexVoisin {
	VOISIN_NORD, VOISIN_NORD_EST, VOISIN_EST, VOISIN_SUD_EST, VOISIN_SUD, VOISIN_SUD_OUEST, VOISIN_OUEST,
	VOISIN_NORD_OUEST;
}