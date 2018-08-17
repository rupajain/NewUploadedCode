package designpatternproj;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shape) {
		
		if(shape==null)
		{
			return null;
		}
		// TODO Auto-generated method stub
		if(shape.equalsIgnoreCase("CIRCLE"))
		{
			return new Circle();
		}
		if(shape.equalsIgnoreCase("RECTANGLE"))
		{
			return new Rectangle();
		}
		if(shape.equalsIgnoreCase("SQUARE"))
		{
			return new Square();
		}
		return null;
	}

}
