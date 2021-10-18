public class ColorFactory extends AbstractFactory
{

    @Override
    Color getColor(String color) {

        if(color == null)
        {
            return null;
        }
        else if (color.equalsIgnoreCase("Red"))
        {
            return new Red();
        }
        else if (color.equalsIgnoreCase("Green"))
        {
            return new Green();
        }
        else if (color.equalsIgnoreCase("Blue"))
        {
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        // TODO Auto-generated method stub
        return null;
    }

}
