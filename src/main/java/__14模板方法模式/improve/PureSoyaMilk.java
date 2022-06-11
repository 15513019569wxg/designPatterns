package __14模板方法模式.improve;

public class PureSoyaMilk extends SoyaMilk{

	@Override
	void addCondiments() {
		//空实现
	}

	@Override
	boolean customerWantCondiments() {
		return false;
	}

}

