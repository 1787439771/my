package zc;

public abstract class Animal
{
	private String name; 	// 名字
	private int sex; 		// 性别
	private int age; 		// 年龄
	private int height; 	// 身高
	private int weight; 	// 体重

	public abstract void say(); // 动物的叫声

	public void test()
	{
		System.out.println("这是Animal里面的普通方法");
	}

	public Animal()
	{
		// 不能创建抽象类的对象，如果其继承的类没有定义构造方法，那么会调用这个类的构造方法
		System.out.println("您创建了一只动物，请给它补充相关资料");
	}

	public Animal(String name, int sex, int age, int height, int weight)
	{
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.weight = weight;
		System.out.println(this);
	}

	@Override
	public String toString()
	{
		String sex;
		if (this.sex == 1)
		{
			sex="男生";
		}
		else 
		{
			sex="女生";
		}
		return "我的名字叫" + name + ",我是"+ sex + ",今年" + age + "岁,身高" + height + "公分,体重" + weight + "斤";
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getSex()
	{
		return sex;
	}

	public void setSex(int sex)
	{
		this.sex = sex;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public int getWeight()
	{
		return weight;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}

}
