package com.example.carte;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Deque;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

import com.example.swing.FrameForDemoMaker;
import com.example.util.ResourceUtility;

public class CarteApp extends FrameForDemoMaker {
	private static final int ROW_COUNT = 4;
	private static final int COLUMN_COUNT = 6;
	private ImageIcon dosCarte = ResourceUtility.loadImage("images/dos.png");

	private Jeu jeu = new Jeu();

	EtatMemoire etatMemoire = new EtatMemoire();

	public CarteApp() throws IOException {
		super("Mémoire");
		setDefaultBounds(100, 100, 900, 600);
	}

	@Override
	public void init(JFrame frame) {
		Container cp = frame.getContentPane();
		cp.setLayout(new GridLayout(ROW_COUNT, COLUMN_COUNT));

		Deque<ImageIcon> pioche = jeu.creerPioche();
		while (!pioche.isEmpty()) {
			cp.add(createButton(pioche));
		}
	}

	public JComponent createButton(Deque<ImageIcon> pioche) {
		ImageIcon imageIcon = pioche.pop(); // Récupération depuis la pioche
		JToggleButton button = new JToggleButton(dosCarte);
		button.putClientProperty("carte", imageIcon.getDescription());
		button.setSelectedIcon(imageIcon);
		button.setDisabledIcon(imageIcon);
		button.setDisabledSelectedIcon(imageIcon);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(button.getClientProperty("carte"));
				etatMemoire.nouveauBoutonSelectionne(button);
			}
		});
		return button;
	}

	public static void main(String[] args) throws IOException {
		CarteApp example = new CarteApp();
		SwingUtilities.invokeLater(example);
	}
}