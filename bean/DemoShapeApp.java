package com.nissan.bean;

import com.nissan.bean.Rectangle;
import com.nissan.bean.Shape;
import com.nissan.bean.Square;



public class DemoShapeApp
{
    public static void main(String[] args) {
        
        Shape shapeOne = new Shape();
        
        Square squareArea = new Square(10);
        
        System.out.println("Area is : " + squareArea);
    }
    
    //Custom Method
    public static void calculateArea(Shape shape)
    {
        System.out.println("Area of Shape : " + shape.area());
    }
    
    public static void calculateArea(Rectangle rectangle)
    {
        System.out.println("Area of Rectangle : " + rectangle.area());
    }
    
    public static void calculateArea(Square square)
    {
        System.out.println("Area of Square : " + square.area());
    }
}