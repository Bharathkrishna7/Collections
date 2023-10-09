package multiLevelInheritance;

public class Parent extends GrandParent {
	
	int bikes=2;
	int plotes=1;
	
	void ParentProperty() {
		System.out.println("--------------------");
		System.out.println("parent have "+bikes+" bikes");
		System.out.println("parent is having "+plotes+" plote");
	}
	public static void main(String[]args) {
		Parent ob=new Parent();
		ob.Grandproperty();
		ob.ParentProperty();
		
}
}