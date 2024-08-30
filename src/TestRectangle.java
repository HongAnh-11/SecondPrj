/*
 * @ (#) TestRectangle.java   1.0     8/30/2024
 *
 *Copyright (c) 2024 IUH. All rights reserved
 */


/*
 * @discription:
 * @author: Nguyen Hong Anh
 * @date: 8/30/2024
 * @version:     1.0
 */

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(20.0,4.0);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
    }
}
