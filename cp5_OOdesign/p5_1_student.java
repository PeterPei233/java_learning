package p5_1;

class Student{
	private String name;
	private static int age;
	private char gender;
	public Student(String name,int age,char gender){
		System.out.println("构造了一个姓名为"+name+",年龄为"+age+"的"+"学生");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void setName(String name){
		this.name =  name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	public Student(){
		System.out.println("This student is a secret.");
	}
	private void eat(String food){
		System.out.println("我吃了"+food);
	}
	public void sleepandEat(String food){
		this.eat(food);
		System.out.println("我睡了一大觉");
	}
}
public class p5_1_student{
	public static void main(String[] args) {
		Student a = new Student("黎明",18,'男');
		a.sleepandEat("龙虾");
		a.setName("haha");
		a.setAge(99);
		System.out.println(a.getName()+"年龄"+a.getAge());
		Student b = new Student();
		System.out.println("b的名字是"+b.getName()+"年龄"+b.getAge());
	}
}
