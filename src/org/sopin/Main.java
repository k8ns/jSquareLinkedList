package org.sopin;

public class Main {

    public static void main(String[] args) {

        Cell c00 = new Cell("00");
        Cell c01 = new Cell("01");
        Cell c02 = new Cell("02");
        Cell c03 = new Cell("03");
        Cell c04 = new Cell("04");
        Cell c05 = new Cell("05");

        Cell c10 = new Cell("10");
        Cell c11 = new Cell("11");
        Cell c12 = new Cell("12");
        Cell c13 = new Cell("13");
        Cell c14 = new Cell("14");
        Cell c15 = new Cell("15");

        Cell c20 = new Cell("20");
        Cell c21 = new Cell("21");
        Cell c22 = new Cell("22");
        Cell c23 = new Cell("23");
        Cell c24 = new Cell("24");
        Cell c25 = new Cell("25");

        Cell c30 = new Cell("30");
        Cell c31 = new Cell("31");
        Cell c32 = new Cell("32");
        Cell c33 = new Cell("33");
        Cell c34 = new Cell("34");
        Cell c35 = new Cell("35");

        Cell c40 = new Cell("40");
        Cell c41 = new Cell("41");
        Cell c42 = new Cell("42");
        Cell c43 = new Cell("43");
        Cell c44 = new Cell("44");
        Cell c45 = new Cell("45");

        Cell c50 = new Cell("50");
        Cell c51 = new Cell("51");
        Cell c52 = new Cell("52");
        Cell c53 = new Cell("53");
        Cell c54 = new Cell("54");
        Cell c55 = new Cell("55");
/*
        c10.setRight(c11);
        c11.setRight(c12);
        c12.setRight(c13);
        c13.setRight(c14);
        c14.setRight(c15);

        c13.setUp(c03);

        c12.setUp(c02);
        c14.setUp(c04);

        System.out.println(c03.getLeft().getName());
        System.out.println(c03.getRight().getName());

        c02.setLeft(c01);
        c04.setRight(c05);

        System.out.println(c11.getUp().getName());
        System.out.println(c15.getUp().getName());
        System.out.println(c01.getDown().getName());
        System.out.println(c05.getDown().getName());

        c01.setLeft(c00);

        c20.setRight(c21);
        c21.setRight(c22);
        c22.setRight(c23);
        c23.setRight(c24);
        c24.setRight(c25);

        c20.setUp(c10);

        System.out.println(c15.getDown().getName());
        System.out.println(c25.getUp().getName());
        */

        /*
                  << << <<
        c00     c01 c02 c03
        c10 c11     c12 c13
        c20 c21 c22     c23
        c30 c31 c32 c33
        */

        c00.setDown(c10);
        c10.setRight(c11);
        c10.setDown(c20);
        c11.setDown(c21);
        c21.setRight(c22);
        c20.setDown(c30);
        c30.setRight(c31);
        c31.setRight(c32);
        c32.setRight(c33);

        c01.setRight(c02);
        c02.setRight(c03);
        c02.setDown(c12);
        c12.setRight(c13);
        c13.setDown(c23);

        c00.setRight(c01);

        System.out.println(c33.getUp().getName());
    }
}
