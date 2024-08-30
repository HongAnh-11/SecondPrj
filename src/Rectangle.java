/*
 * @ (#) Rectangle.java   1.0     8/30/2024
 *
 *Copyright (c) 2024 IUH. All rights reserved
 */


/*
 * @discription:
 * @author: Nguyen Hong Anh
 * @date: 8/30/2024
 * @version:     1.0
 */

public class Rectangle {
    private double lenght;
    private double width;

    public Rectangle() {
        this.lenght=0.0;
        this.width=0.0;
    }
    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public void setLenght(double lenght) {
        if(lenght < 0) {
            throw new IllegalArgumentException("Lenght must be greater than 0");
        }
        this.lenght = lenght;
    }

    public void setWidth(double width) {
        if(width < 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return lenght * width;
    }

    public double getPerimeter() {
        return 2 * (lenght + width);
    }

}
