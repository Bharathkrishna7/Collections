package multiLevelInheritance;

public class Child extends Parent {
	
	int laps=2;
	int mobiles=4;
	
	void ChildProperty() {
		System.out.println("==================");
		System.out.println("child having "+laps+" laptops");
		System.out.println("child is having "+mobiles+" mobilphones");
	}
	public static void main(String[]args) {
		Child ob=new Child();
		ob.Grandproperty();
		ob.ParentProperty();
		ob.ChildProperty();
	}
}
