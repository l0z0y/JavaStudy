# Java

## 标准输出

```java
print					//不换行输出 
println					//换行输出
System.out.println(); 	//换行空输出
```

## 包

### 包的概述和使用

其实就是文件夹

作用：对类进行分类管理

#### **包的定义格式**

格式： package包名：（多级包用分开）

范例： package con. thelma

#### **带包的Java类编译和执行**

##### 手动建包：

按照以前的格式编诨ava文件			javac Helloworld. java
手动创建包										 在E盘建立文件夹com然后在com下建立文件夹 
把 class文件放到包的最里面		    把 Helloworld. class.文件放到com下的 新建文件夹下
带包执行											 java com. xxxxx Helloworld

##### 自动建包：

javac-d. Hello World. jav

java com. xxx.Helloworld

### 导包

#### 导包的概述和使用

使用不同包下的类时，使用的时候要写类的全路径，写起来太麻烦了为了简化帯包的操作，Java就提供了导包的功能

##### 导包的格式

格式： import包名









## Random-随机数

```java
int randNumber =rand.nextInt(MAX - MIN + 1) + MIN; // randNumber 将被赋值为一个 MIN 和 MAX 范围内的随机数
```

## ArrayList

ArrayList <E>  E - 此列表中元素的类型

### 常用方法

```java
//顺序添加元素
list.add("asdasd"); 	 list.add("java");		 list.add("git"); 
```

```java
//指定位置添加元素  add( int index , E element )  
	list.add(2,"github");				// 	[asdasd,java,github,git]
```

```java
//删除指定的元素，返回 boolean，删除成功返回ture，失败返回false  
	list.remove("asdasd");				//返回值ture	[java,github,git]
	list.remove("gitee");				//返回值false
```

```java
//删除指定索引处的元素，返回被删除的元素
	list.remove(1);						//删除索引为 1 的元素 返回github	[java,git]
```

```java
//修改指定索引处的元素,返回被修改的元素
	list.set(1, "zzz");					//修改索引为 1 的元素 返回git  	[java,zzz]
```

```java
//返回指定索引处的元素
	list.get(1);						//返回索引为 1 的元素 zzz 		 [java,zzz]
```

```java
//返回集合中元素的个数
	list.size();						//返回值 2 
```

```java
//遍历集合通用格式，通过size（）获取集合长度
	for (int i = 0; i < list.size();i++){
    	String s =list.get(i);
    	System.out.println(s);
	}
```

## 继承

### 格式

 public class子类名 **extends**父类名{ }

范例： public class Zi **extends** Fu{ }

Fu:是父类，也被称为基类、超类

Zi:是子类，也被称为派生类

#### 范例

```java
public class Fu {
    public void shows(){
        System.out.println("show ");
    }
}
```

```java
public class Zi extends Fu{
    public void  method(){
        System.out.println("method");
    }
}
```

```java
public class Demo1 {
    public static void main(String[] args) {
        Fu f = new Fu();
        f.shows();			//输出 show
        Zi z=new Zi();
        z.method();			//输出 method
        
        //extend继承后 z 可调用Fu中的方法
        z.shows();			//输出 show
    }
}
```

### 继承中的访问特点

#### 在子类方法中访问一个变量

1. 子类局部范围找
2. 子类成员范围找
3. 父类成员范围找
4. 如果都没有就报错

#### 范例

```java
public class Fu {
    public int age = 20;
}
```

```java
public class Zi extends Fu{
    public String name = "lzy";
    public int age = 30;			
    public void  show(){		        						
        System.out.println(name);			//int age = 40  ; 
        System.out.println(age);	
    }
}
```

```java
public class Demo2 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show(); 		//输出“lzy” 30 	   //输出“lzy”，40
    }
}
```

#### 继承中构造方法的访问特点

**子类中所有的构造方法默认都会访问父类中无参的构造方法为什么呢？**

1. 因为子类会继承父类中的数据，可能不会使用父类的数据。所以，子类初始化之前，一定要先完成父类数据的初始化
2. 每一个子类构造方法的第一条语句默认都是： super()

**如果父类中没有无参构造方法，只有带参构造方法，该怎么呢？**

1. 通过使用 super关键字去显示的用父类的带参构造方法
2. 在父类中自己提供一个无参构造方法

​    **推荐：自己给出无参构造方法**

#### 继承中成员方法的访向特点

**通过子类对象访问一个方法**

1. 子类成员范围找
2. 父类成员范围找
3. 如果都没有就报错(不考虑父亲的父亲。)

### super

格式：super.xx

super关键字的用法和this关键字的用法相似

this:代表本类对象的引用

[^this]: this关键字指向调用该方法的对象一般我们是在当前类中使用this关键字所以我们常说this代表本类对象的引用

super:代表父类存储空间的标识（可以理解为父类对象引用）

| 关键词 |           访问成员变量            |         访问构造方法         |              访问成员方法               |
| ------ | :-------------------------------: | :--------------------------: | :-------------------------------------: |
| this   | this.成员变量---访问本类成员变量  | this(..)---访问本类构造方法  |  this.成员方法(...)---访问本类成员方法  |
| super  | super.成员变量---访问父类成员变量 | super(..)---访问父类构造方法 | super.成员方法（...)---访问父类成员方法 |

### 方法重写

**方法重写概述**

子类中出现了和父类中一模一样的方法声明

**方法重写的应用**

当子类需要父类的功能，而功能主体子类有自己特有内容时，可以重写父类中的方法，这样，即沿袭了父类的功能，又定义了子类特有的内容

**@Override**
是一个注解
可以帮助我们检查重写方法的方法声明的正确性

**方法重写注意事项**

1. 私有方法不能被重写（父类私有成员子类是不能继承的）
2. 子类方法访问权限不能更低( public>默认>私有)

### Java中継承的注意事项

1. Java中类只支持单继承，不支持多继承
2. Java中类支持多层继承
3. 私有方法不能被重写（父类私有成员子类是不能继承的）
4. 子类方法访问权限不能更低( public>默认>私有)

## 修饰符

### 权限修饰符

|  修饰符   | 同一个类中 | 同一个包中子类无关类 | 不同包的子类 | 不同包的无关类 |
| :-------: | :--------: | :------------------: | :----------: | :------------: |
|  private  |     ✓      |                      |              |                |
|   默认    |     ✓      |          ✓           |              |                |
| protected |     ✓      |          ✓           |      ✓       |                |
|  public   |     ✓      |          ✓           |      ✓       |       ✓        |

### 状态修饰符

#### final

final关键字是最终的意思，可以修饰成员方法，成员变量，类

##### final修饰的特点

1. 修饰方法：表明该方法是最终方法，不能被重写
2. 修饰变量：表明该变量是常量，不能再次被斌值
3. 修饰类：表明该类是最终类，不能被继承

##### final修饰局部变量

1. 变量是基本类型：final修饰指的是基本类型的数据值不能发生改变
2. 变量是引用类型：final修饰指的是**引用类型的地址值**不能发生改变，但是地址里面的**内容**是可以发生改变的

#### static

static关键字是静态的意思，可以修饰成员方法，成员变量

##### static修饰的特点

1. **被类的所有对象共享**,这也是我们判断是否使用静态关键字的条件
2. 可以通过类名调用,也可以通过对象名调用      **推荐使用类名调用**

##### static访问特点

**非静态的成员方法**

1. 能访问静态的成员变量
2. 能访问非静态的成员变量
3. 能访可静态的成员方法
4. 能访回非静态的成员方法

**静态的成员方法**

1. 能访问静态的成员变量
2. 能访静态的成员方法

总结成一句话就是：**静态成员方法只能访问静态成员**



























## IDea

```java
ifn：可生成 if(xxx = null)
类似的：
inn ：可生成 if(xxx != null) 或 xxx. nn 或 xxx.null
```

```java
prsf：可生成 private static final
类似的：
psf ：可生成 public static final
psfi ：可生成 public static final int
psfs ：可生成 public static final String
```

