package com.cybertek.tests.Homeworks.assignment14_oop;

import java.util.Arrays;

public class Q13_Color {
    //rgb array with 3 ints is used to hold r,g,b values
    private int[] rgb = new int[3];

    /**
     * Available colors - ready with rgb code
     */

    public final static int[] WHITE     = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY      = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY  = new int[]{64, 64, 64};
    public final static int[] BLACK     = new int[]{0, 0, 0};
    public final static int[] RED       = new int[]{255, 0, 0};
    public final static int[] PINK      = new int[]{255, 175, 175};
    public final static int[] ORANGE    = new int[]{255, 200, 0};
    public final static int[] YELLOW    = new int[]{255, 255, 0};
    public final static int[] GREEN     = new int[]{0, 255, 0};
    public final static int[] MAGENTA   = new int[]{255, 0, 255};
    public final static int[] CYAN      = new int[]{0, 255, 255};
    public final static int[] BLUE      = new int[]{0, 0, 255};


    /**
     * Public constructor accepts 3 ints that represent color code.
     * assign 3 int parameters to rgb array indexes(0,1,2)
     * @param r
     * @param g
     * @param b
     */
    public Q13_Color(int r, int g, int b){
        //TODO
        rgb[0] = r;
        rgb[1] = g;
        rgb[2] = b;
    }

    /**
     * Public no- args constructor: sets default color as "white" (255,255,255)
     * try to use this() keyword to call above constructor to set white color
     */
    public Q13_Color() {
        this(255,255,255);
    }

    /**
     * Override toString(from Object class).
     * Provides string description of the color like "red" ,"blue" based on
     * rgb value.
     * Compare value of rgb array with static color code arrays
     * and find out what color it is. Arrays.equals(arr1,arr2) is easiest way
     * to compare 2 int arrays
     * @returns a String color name like
     * "white" or "blue"
     * If rgb values does not match any available combinations, return "n/a"
     *
     * Ex:
     * Color color = new Color();
     * System.out.println(color.toString() ) ; // prints "white"
     *
     * Color color = new Color(255, 0, 0);
     * System.out.println(color.toString() ) ; // prints "red"
     *
     * Color color4 = new Color(192, 192, 192);
    System.out.println(color4 ) ; // prints "light gray"
     */
    public String toString() {

        if(Arrays.equals(this.rgb,WHITE)) return "WHITE";
        else if (Arrays.equals(this.rgb,LIGHT_GRAY)) return "LIGHT_GRAY";
        else if (Arrays.equals(this.rgb,GRAY)) return "GRAY";
        else if (Arrays.equals(this.rgb,DARK_GRAY)) return "DARK_GRAY";
        else if (Arrays.equals(this.rgb,BLACK)) return "BLACK";
        else if (Arrays.equals(this.rgb,RED)) return "RED";
        else if (Arrays.equals(this.rgb,PINK)) return "PINK";
        else if (Arrays.equals(this.rgb,ORANGE)) return "ORANGE";
        else if (Arrays.equals(this.rgb,YELLOW)) return "YELLOW";
        else if (Arrays.equals(this.rgb,GREEN)) return "GREEN";
        else if (Arrays.equals(this.rgb,MAGENTA)) return "MAGENTA";
        else if (Arrays.equals(this.rgb,CYAN)) return "CYAN";
        else if (Arrays.equals(this.rgb,BLUE)) return "BLUE";
        else return "n/a";
    }

    public static void main(String[] args) {

        Q13_Color q13Color = new Q13_Color();
        System.out.println(q13Color.toString() ) ; // prints "white"

        Q13_Color q13Color1 = new Q13_Color(255, 0, 0);
        System.out.println(q13Color1.toString() ) ; // prints "red"

        Q13_Color q13Color3 = new Q13_Color(255, 44, 88);
        System.out.println(q13Color3.toString() ) ; // prints "n/a"

        Q13_Color q13Color4 = new Q13_Color(192, 192, 192);
        System.out.println(q13Color4) ; // prints "light gray"

    }
}
