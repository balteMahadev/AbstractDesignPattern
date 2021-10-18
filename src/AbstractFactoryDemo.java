class AbstractFactoryPatternDemo{

    public static void main(String[] args)
    {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape s1 = shapeFactory.getShape("circle");
        s1.draw();
        Shape s2 = shapeFactory.getShape("Square");
        s2.draw();
        Shape s3 = shapeFactory.getShape("Reactangle");
        s3.draw();
        AbstractFactory colorFatory = FactoryProducer.getFactory("color");
        Color c1 = colorFatory.getColor("Red");
        c1.fill();
        Color c2 = colorFatory.getColor("Green");
        c2.fill();
        Color c3 = colorFatory.getColor("Blue");
        c3.fill();


    }

}
