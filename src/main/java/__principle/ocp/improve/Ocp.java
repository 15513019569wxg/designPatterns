package __principle.ocp.improve;

/**
 * @author capensis
 */
public class Ocp {

	public static void main(String[] args) {
		GraphicEditor graphicEditor = new GraphicEditor();
		graphicEditor.drawShape(new Rectangle());
		graphicEditor.drawShape(new Circle());
		graphicEditor.drawShape(new Triangle());
		graphicEditor.drawShape(new OtherGraphic());
	}

}

/** 这是一个用于绘图的类 [使用方] */
class GraphicEditor {
	/** 接收Shape对象，调用draw方法 */
	public void drawShape(AbstractShape s) {
		s.draw();
	}
}

abstract class AbstractShape {
	int mType;
	/**
	 * 抽象方法
	 */
	public abstract void draw();
}

class Rectangle extends AbstractShape {
	Rectangle() {
		super.mType = 1;
	}

	@Override
	public void draw() {
		System.out.println(" 绘制矩形 ");
	}
}

class Circle extends AbstractShape {
	Circle() {
		super.mType = 2;
	}
	@Override
	public void draw() {
		System.out.println(" 绘制圆形 ");
	}
}

/** 新增画三角形 */
class Triangle extends AbstractShape {
	Triangle() {
		super.mType = 3;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(" 绘制三角形 ");
	}
}

/** 新增一个图形 */
class OtherGraphic extends AbstractShape {
	OtherGraphic() {
		super.mType = 4;
	}

	@Override
	public void draw() {
		System.out.println(" 绘制其它图形 ");
	}
}
