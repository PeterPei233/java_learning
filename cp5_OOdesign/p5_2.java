package p5_2;

class Student{
	private String name;
	private int age;
	public char gender;
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
public class p5_2{
	static String search(Student[] students,String name){
			String out ="";
			int i = 1;
			for(Student s: students){
				if(s.getName()==name){
					out+="找到第"+i+"为名叫"+name+"的同学，年龄"+
					s.getAge()+"岁,是"+s.gender+"同学\n";
					i++;
				}
			}
			if(i==1) return "没找到";
			else return out;
		}
	public static void main(String[] args) {
		Student a = new Student("黎明",18,'男');
		Student b = new Student("哈哈",28,'女');
		Student c = new Student("牛魔",38,'男');
		Student d = new Student("小刚",58,'女');
		Student e = new Student("小刚",18,'女');
		Student f = new Student("小刚",20,'男');
		Student[] list = new Student[]{a,b,c,d,e,f};
		System.out.println(search(list,"小刚"));
	}
}
