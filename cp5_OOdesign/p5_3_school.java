package p5_3;

class Person{
	public int age;
	public String name;
	private String gender;
	public Person(int age, String name,String gender){
		this.age = age;
		this.name = name;
		this.gender = gender;
		System.out.println("构造了一个人");
	}
	public String getGender(){
		return this.gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public void walk(){
		System.out.println("一个人正在走");
	}
}

class Teacher extends Person{
	public String subject;
	public Teacher(int age,String name,String gender,String subject){
		super(age,name,gender);
		this.subject = subject;
		System.out.println("成功构造了老师");
	}
	public void teaching(){
		System.out.println("老师在教"+this.subject);
	}
}
class Master extends Teacher{
	public String temper;
	public Master(int age,String name,String gender,String subject,String temper){
		super(age,name,gender,subject);
		this.temper = temper;
		System.out.println("成功构造了班主任");
		this.age = 18;
		System.out.println("班主任永远"+this.age+"岁");
	}
	public void teaching(){
		System.out.println("班主任在教"+this.subject);
	}
}
class School{
	public Person[] people = new Person[]{};
	public Teacher[] teachers = new Teacher[]{};
	public Master[] masters = new Master[]{};
	public School(Person[] people,Teacher[] teachers, Master[] masters){
		this.people = people;
		this.teachers = teachers;
		this.masters = masters;
		System.out.println("教师搭建完成");
	}
	public int[] count(){
		//新建数组，指定了具体内容不用加数字
		int[] count = new int[]{this.people.length,
			this.teachers.length,this.masters.length};
		return count;
	}
}

public class p5_3_school{
	public static void main(String[] args) {
		Person p1 = new Person(18,"p1","m");
		Person p2 = new Person(19,"p2","m");
		Person p3 = new Person(12,"p3","f");
		Teacher t1 = new Teacher(22,"t1","f","math");
		Teacher t2 = new Teacher(24,"t2","f","english");
		Master m1 = new Master(28,"m1","f","chinese","good");
		p1.walk();
		t1.teaching();
		m1.teaching();
		Person[] p = new Person[]{p1,p2,p3};
		Teacher[] t = new Teacher[]{t1,t2};
		Master[] m = new Master[]{m1};
		School s = new School(p,t,m);
		int[] count = s.count();
		System.out.println("学校有普通职工"+count[0]+"人，普通老师"+count[1]+
			"人,班主任"+count[2]+"人。");
	}
} 