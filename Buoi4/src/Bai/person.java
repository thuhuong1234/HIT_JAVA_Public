package Bai;

public class person {

	private String name;
	private int age;
	private String address;
	
	public void coTheDiHoc() {
		System.out.println("Co the di hoc");
	} 
	//contructor
	public person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address=address;
	}
	
	//getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
		person p1 = new person("mAilInh",12,"hAnOi");
//		p1.setName("Huong");
//		p1.setAge(14);
//		p1.setAddress("Hai Duong");
	
		System.out.println("Ban: " + p1.getName());
		System.out.println("Tuoi: " + p1.getAge());
		System.out.println("Dia chi: " + p1.getAddress());
		p1.coTheDiHoc();
	}

}
