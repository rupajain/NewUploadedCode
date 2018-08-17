package designpatternproj;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory shapFactory=FactoryProducer.getFactory("SHAPE");
		Shape shape1=shapFactory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2=shapFactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3=shapFactory.getShape("SQUARE");
		shape3.draw();
		
		AbstractFactory colorFactory=FactoryProducer.getFactory("COLOR");
		Color color1=colorFactory.getColor("RED");
		color1.fill();
		
		Color color2=colorFactory.getColor("BLUE");
		color2.fill();
	}

}
