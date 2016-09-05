package org.sopin;


public class Cell {

    private Integer id;

    private Cell up;
    private Cell right;
    private Cell down;
    private Cell left;

    private Character symbol;

    private Boolean isHorizontalFree;
    private Boolean isVerticalFree;

    private String name;

    public Cell() {
        this.setHorizontalFree(true);
        this.setVerticalFree(true);

        this.up = null;
        this.right = null;
        this.down = null;
        this.left = null;

        this.symbol = null;

        this.name = "net";
    }

    public Cell(String name) {
        this();
        this.name = name;
    }

    public Boolean canPut(Character ch, Integer direction)
    {
        if (this.isHorizontalFree() && this.isVerticalFree()) {
            return true;
        }

        if (!this.isHorizontalFree() && !this.isVerticalFree()) {
            return false;
        }

//        if (direction == DIRECTION_HORIZONTAL && this.isHorizontalFree()) {
//            return EMPTY_SYMBOL == symbol || ch == symbol;
//        }
//
//        if (direction == DIRECTION_VERTICAL && this.isVerticalFree()) {
//            return EMPTY_SYMBOL == symbol || ch == symbol;
//        }

        return false;
    }


    public Cell getUp() {
        return up;
    }

    public void setUp(Cell up) {
        if (up == null || null != this.getUp()) {
            return;
        }
        this.up = up;
        up.setDown(this);

        if (null != this.getLeft()) {
            up.setLeft(this.getLeft().getUp());
            this.getLeft().setUp(up.getLeft());
        }

        if (null != this.getRight()) {
            up.setRight(this.getRight().getUp());
            this.getRight().setUp(up.getRight());
        }
    }

    public Cell getRight() {
        return right;
    }

    public void setRight(Cell right) {
        if (null == right || null != this.getRight()) {
            return;
        }
        this.right = right;
        right.setLeft(this);

        if (null != this.getUp()) {
            right.setUp(this.getUp().getRight());
            this.getUp().setRight(right.getUp());
        }

        if (null != this.getDown()) {
            right.setDown(this.getDown().getRight());
            this.getDown().setRight(right.getDown());
        }
    }

    public Cell getDown() {
        return down;
    }

    public void setDown(Cell down) {
        if (null == down || null != this.getDown()) {
            return;
        }
        this.down = down;
        down.setUp(this);

        if (null != this.getLeft()) {
            down.setLeft(this.getLeft().getDown());
            this.getLeft().setDown(down.getLeft());
        }

        if (null != this.getRight()) {
            down.setRight(this.getRight().getDown());
            this.getRight().setDown(down.getRight());
        }
    }

    public Cell getLeft() {
        return left;
    }

    public void setLeft(Cell left) {
        if (null == left || null != this.left) {
            return;
        }
        this.left = left;
        left.setRight(this);

        if (null != this.getUp()) {
            left.setUp(this.getUp().getLeft());
            this.getUp().setLeft(left.getUp());
        }

        if (null != this.getDown()) {
            left.setDown(this.getDown().getLeft());
            this.getDown().setLeft(left.getDown());
        }
    }

    public Character getSymbol() {
        return symbol;
    }

    public void setSymbol(Character symbol) {
        this.symbol = symbol;
    }

    public Boolean isHorizontalFree() {
        return isHorizontalFree;
    }

    public void setHorizontalFree(Boolean horizontalFree) {
        isHorizontalFree = horizontalFree;
    }

    public Boolean isVerticalFree() {
        return isVerticalFree;
    }

    public void setVerticalFree(Boolean verticalFree) {
        isVerticalFree = verticalFree;
    }

    public String getName()
    {
        return name;
    }
}
