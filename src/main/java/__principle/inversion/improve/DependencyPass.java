package __principle.inversion.improve;

/**
 * @author capensis
 */
public class DependencyPass {

	public static void main(String[] args) {
		ChangHong changHong = new ChangHong();
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.open(changHong);

		//通过构造器进行依赖传递
		OpenAndClose openAndClose = new OpenAndClose(changHong);
		openAndClose.open();
		//通过setter方法进行依赖传递
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.setTv(changHong);
//		openAndClose.open();

	}

}

/**
 * 方式1： 通过接口传递实现依赖
 * 开关的接口
 */
// interface IOpenAndClose {
//	/**
//	 * 抽象方法,接收接口
//	 */
// 	void open(ITV tv);
// }
//
///**
// * 接口
// */
// interface ITV {
//	/**
//	 * 播放功能
//	 */
// 	void play();
// }
//
/**
 * 实现ITV接口的类
 */
 class ChangHong implements ITV {
	@Override
	public void play() {
		System.out.println("长虹电视机，打开");
	}
 }

/**
 * 实现接口
 */
// class OpenAndClose implements IOpenAndClose{
//	 @Override
//	 public void open(ITV tv){
//	 	tv.play();
//	 }
// }


/**
 * 方式2: 通过构造方法依赖传递
 */
interface IOpenAndClose {
	/**抽象方法 */
	void open();
}

interface ITV {
	/**
	 * 播放
	 */
	void play();
}

class OpenAndClose implements IOpenAndClose {
	public ITV tv;
	public OpenAndClose(ITV tv) {
		this.tv = tv;
	}
	@Override
	public void open() {
		tv.play();
	}
}


// 方式3 , 通过setter方法传递
//interface IOpenAndClose {
//	void open();
//
//	void setTv(ITV tv);
//}
//
//interface ITV {
//	void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//	private ITV tv;
//
//	public void setTv(ITV tv) {
//		this.tv = tv;
//	}
//
//	public void open() {
//		this.tv.play();
//	}
//}
//
//class ChangHong implements ITV {
//
//	@Override
//	public void play() {
//		// TODO Auto-generated method stub
//		System.out.println("长虹电视机，打开");
//	}
//
//}