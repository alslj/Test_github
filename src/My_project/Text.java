package My_project;

public class Text {
	public static void main(String[] args) {
		System.out.print("hhhhhhh");
		lilei ll = new lilei();
		ll.Call();
		ll.llac.Eat();
		ll.llac.Relax();
	}

}

class lilei{
	Lilei_Action llac = new Lilei_Action();
	String name = "lilei";
	public void Call () {
		System.out.print(name);
	}
}


