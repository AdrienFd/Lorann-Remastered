package model.element.motionless;

import contract.model.ISprite;
import contract.model.Permeability;
import model.element.Sprite;

public class Tile extends MotionlessElement {
	   /** The Constant SPRITE. */
    private static final ISprite SPRITE = new Sprite(' ', "BlackTile.jpg");

    /**
     * Instantiates a new tile.
     */
    Tile() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
