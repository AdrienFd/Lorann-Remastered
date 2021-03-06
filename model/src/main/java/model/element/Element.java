package model.element;

import java.awt.Image;

import contract.model.IElement;
import contract.model.ISprite;
import contract.model.Permeability;

public class Element implements IElement{

	/** The sprite. */
    private ISprite       sprite;

    /** The permeability. */
    private Permeability permeability;

    /**
     * Instantiates a new element.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     */
    public Element(final ISprite sprite, final Permeability permeability) {
        this.setSprite(sprite);
        this.setPermeability(permeability);
    }

    /**
     * Get the sprite
     */
    @Override
    public final ISprite getSprite() {
        return this.sprite;
    }

    /**
     * Sets the sprite.
     *
     * @param sprite2
     *            the new sprite
     */
    protected final void setSprite(final ISprite sprite2) {
        this.sprite = sprite2;
    }

    /**
     * get the permeability
     */
    @Override
    public final Permeability getPermeability() {
        return this.permeability;
    }

    /**
     * Sets the permeability.
     *
     * @param permeability
     *            the new permeability
     */
    
    public void setPermeability(final Permeability permeability) {
        this.permeability = permeability;
    }

    /**
     * get the image of the sprite
     */
    @Override
    public final Image getImage() {
        return this.getSprite().getImage();
    }
}
