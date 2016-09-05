package org.sopin;

/**
 * Created by konstantin on 7/17/16.
 */
public class CellNet {

    private Cell cursor;

    CellNet() {
        this.cursor = new Cell();
    }

    public Integer getWidth()
    {
        Integer count = 1;
        while (this.moveLeft()) {}
        while (this.moveRight()) {
            count++;
        }
        return count;
    }

    public Integer getHeight()
    {
        Integer count = 1;
        while (this.moveUp()) {}
        while (this.moveDown()) {
            count++;
        }
        return count;
    }

    public void addLeftColumn() {
        while (this.moveLeft()) {}
        while (this.moveUp()) {}
        while (this.moveDown()) {
            this.cursor.setLeft(new Cell());
        }

    }

    public void addRightColumn() {
        while (this.moveRight()) {}
        while (this.moveUp()) {}
        while (this.moveDown()) {
            this.cursor.setRight(new Cell());
        }
    }

    public void addTopRow() {
        while (this.moveUp()) {}
        while (this.moveLeft()) {}
        while (this.moveRight()) {
            this.cursor.setUp(new Cell());
        }
    }

    public void addBottomRow() {
        while (this.moveDown()) {}
        while (this.moveLeft()) {}
        while (this.moveRight()) {
            this.cursor.setDown(new Cell());
        }
    }

    private boolean moveUp() {
        if (null == this.cursor.getUp()) {
            return false;
        }
        this.cursor = this.cursor.getUp();
        return true;
    }

    private boolean moveDown() {
        if (null == this.cursor.getDown()) {
            return false;
        }
        this.cursor = this.cursor.getDown();
        return true;
    }

    private boolean moveLeft() {
        if (null == this.cursor.getLeft()) {
            return false;
        }
        this.cursor = this.cursor.getLeft();
        return true;
    }

    private boolean moveRight() {
        if (null == this.cursor.getRight()) {
            return false;
        }
        this.cursor = this.cursor.getRight();
        return true;
    }
}
