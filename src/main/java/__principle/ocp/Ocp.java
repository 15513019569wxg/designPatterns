package __principle.ocp;



/**
 * @author capensis
 */
public class Ocp {
	public static void main(String[] args) {
		//使用看看存在的问题
		GraphicEditor graphicEditor = new GraphicEditor();
		graphicEditor.drawShape(new Rectangle());
		graphicEditor.drawShape(new Circle());
		graphicEditor.drawShape(new Triangle());
	}

}

/**这是一个用于绘图的类 [使用方] */
class GraphicEditor {
	/** 接收Shape对象，然后根据type，来绘制不同的图形 */
	public void drawShape(Shape s) {
		if (s.mType == 1) {
			drawRectangle();
		} else if (s.mType == 2) {
			drawCircle();
		} else if (s.mType == 3) {
			drawTriangle();
		}
	}

	/** 绘制矩形 */
	public void drawRectangle() {
		System.out.println(" 绘制矩形 ");
	}

	/** 绘制圆形 */
	public void drawCircle() {
		System.out.println(" 绘制圆形 ");
	}
	
	/** 绘制三角形 */
	public void drawTriangle() {
		System.out.println(" 绘制三角形 ");
	}
}

/** Shape类，基类 */
class Shape {
	int mType;
}

class Rectangle extends Shape {
	Rectangle() {
		super.mType = 1;
	}
}

class Circle extends Shape {
	Circle() {
		super.mType = 2;
	}
}

/** 新增画三角形 */
class Triangle extends Shape {
	Triangle() {
		super.mType = 3;
	}
}
