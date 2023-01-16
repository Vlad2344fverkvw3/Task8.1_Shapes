package com.riznyk.com.shapes;


import com.riznyk.com.shapes8_1.*;

public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeUtil shapeUtil = new ShapeUtil();
        shapeUtil.showShapeName(circle);
        ////////////////////////////
        Shape triangle = new Triangle();
        shapeUtil.showShapeName(triangle);
        ///////////////////////////
        Shape elips = new Ellips();
        shapeUtil.showShapeName(triangle);
        //////////////////////////
        Shape quad = new Quad();
        shapeUtil.showShapeName(elips);
        //////////////////////////
        Shape rectangular = new Rectangular();
        shapeUtil.showShapeName(rectangular);
    }
}
