# **IDea**

```java
ifn		可生成 if(xxx = null)
类似的:
inn		可生成 if(xxx != null) 或 xxx. nn 或 xxx.null
```

```java
prsf	可生成 private static final
类似的:
psf		可生成 public static final
psfi	可生成 public static final int
psfs	可生成 public static final String
```

**查看方法的源码 选中方法 按下 Ctrl+B**

**快速跳转高亮代码 Shift + F2**





# JavaSE

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



## break语句

### 实现 goto 的功能（break 带标签）

break 语句可以实现 goto 的功能，并且 Java 定义了 break 语句的一种扩展形式来处理退出嵌套很深的循环这个问题。

通过使用扩展的 break 语句，可以终止执行一个或者几个任意代码块，这些代码块不必是一个循环或一个 switch 语句的一部分。同时这种扩展的 break 语句带有标签，可以明确指定从何处重新开始执行。

break 除了具有 goto 退出深层循环嵌套作用外，还保留了一些程序结构化的特性。

标签 break 语句的通用格式如下：

```java
break label;
```

label 是标识代码块的标签。当执行这种形式的 break 语句时，控制权被传递出指定的代码块。被加标签的代码块必须包围 break 语句，但是它不需要直接包围 break 的块。也就是说，**可以使用一个加标签的 break 语句来退出一系列的嵌套块，但是不能使用 break 语句将控制权传递到不包含 break 语句的代码块**。

用标签（label）可以指定一个代码块，标签可以是任何合法有效的 Java 标识符，后跟一个冒号。**加上标签的代码块可以作为 break 语句的对象，使程序在加标签的块的结尾继续执行**。

#### break label

```java
public class GotoDemo {
    public static void main(String[] args) {
        label: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println(j);
                if (j % 2 != 0) {
                    break label;
                }
            }
        }
    }
}
```

以上程序的执行结果为：

```java
0
1
```

这里的 label 是标签的名称，可以为 Java 语言中任意合法的标识符。标签语句必须和循环匹配使用，使用时书写在对应的循环语句的上面，**标签语句以冒号结束。如果需要中断标签语句对应的循环，可以采用 break 后面跟标签名的方式**。

如在上面代码中，当 j 为 1 时，“j%2!=0”条件表达式成立，则 label 标签所代表的最外层循环终止。

**注意：通常紧跟 break 之后的标签，必须在 break 所在循环的外层循环之前定义才有意义。**



## continue语句

continue 语句类似于 break 语句，但它只能出现在循环体中。**它与 break 语句的区别在于：continue 并不是中断循环语句，而是中止当前迭代的循环，进入下一次的迭代。**简单来讲，continue 是忽略循环语句的当次循环。**

注意：**continue 语句只能用在 while 语句、for 语句或者 foreach 语句的循环体之中，在这之外的任何地方使用它都会引起语法错误。**

在循环体中使用 continue 语句有两种方式可以带有标签，也可以不带标签。语法格式如下：

```java
continue //不带标签
continue label //带标签，label是标签名
```

#### continue label

```java
public static void main(String[] args) {
    label1: for (int x = 0; x < 5; x++) {
        for (int y = 5; y > 0; y--) {
            if (y == x) {
                continue label1;
            }
            System.out.println(x+","+y);
        }
    }
    System.out.println("Game Over!");
}
```

默认情况下，continue 只会跳出最近的内循环（代码第 3 行的 for 循环），如果要跳出代码第 2 行的外循环，可以为外循环添加一个标签 label1，然后在第 5 行的 continue 语句后面指定这个标签 label1，这样当条件满足执行 continue 语句时，程序就会跳转出外循环。

程序运行结果如下：

0,5  0,4  0,3  0,2  0,1  1,5  1,4  1,3  1,2  2,5  2,4  2,3  3,5  3,4  4,5
Game Over!

当y==x时 执行 continue label1; 跳到  label1: for (int x = 0; x < 5; x++) 继续执行，输出语句被跳过因此下面的内容没有输出

1,1  2,2  3,3  4,4



## Random-随机数

```java
int randNumber =rand.nextInt(MIN,MAX) + X; // randNumber 将被赋值为一个 (MIN,MAX)+X 范围内的随机数
```



## StringBuffer类

在 [Java](http://c.biancheng.net/java/) 中，除了通过 String 类创建和处理字符串之外，还可以使用 StringBuffer 类来处理字符串。StringBuffer 类可以比 String 类更高效地处理字符串。

因为 StringBuffer 类是可变字符串类，创建 StringBuffer 类的对象后可以随意修改字符串的内容。每个 StringBuffer 类的对象都能够存储指定容量的字符串，如果字符串的长度超过了 StringBuffer 类对象的容量，则该对象的容量会自动扩大。



### 创建 StringBuffer 类

StringBuffer 类提供了 3 个构造方法来创建一个字符串，如下所示：

- StringBuffer() 构造一个空的字符串缓冲区，并且初始化为 16 个字符的容量。
- StringBuffer(int length) 创建一个空的字符串缓冲区，并且初始化为指定长度 length 的容量。
- StringBuffer(String str) 创建一个字符串缓冲区，并将其内容初始化为指定的字符串内容 str，字符串缓冲区的初始容量为 16 加上字符串 str 的长度。

#### **范例**

```java
// 定义一个空的字符串缓冲区，含有16个字符的容量
StringBuffer str1 = new StringBuffer();

// 定义一个含有10个字符容量的字符串缓冲区
StringBuffer str2 = new StringBuffer(10);

// 定义一个含有(16+4)的字符串缓冲区，"青春无悔"为4个字符
StringBuffer str3 = new StringBuffer("青春无悔");
/*
*输出字符串的容量大小
*capacity()方法返回字符串的容量大小
*/
System.out.println(str1.capacity());    // 输出 16
System.out.println(str2.capacity());    // 输出 10
System.out.println(str3.capacity());    // 输出 20
```

上述代码声明了 3 个 StringBuffer 对象 str1、str2 和 str3，并分别对其进行初始化。**str1.capacity()** 用于查看 str1 的容量，接着以同样的方式对 str2 和 str3 进行容量查看的操作。



### 追加字符串

StringBuffer 类的 append() 方法用于向原有 StringBuffer 对象中追加字符串。该方法的语法格式如下：

```java
StringBuffer 对象.append(String str)
```

该方法的作用是追加内容到当前 StringBuffer 对象的末尾，类似于字符串的连接。调用该方法以后，StringBuffer 对象的内容也发生了改变

#### append(String str)

```java
// 创建一个 StringBuffer 对象
StringBuffer buffer = new StringBuffer("hello,");    
// 向 StringBuffer 对象追加 str 字符串
String str = "World!";buffer.append(str);    
 // 输出：Hello,World!
System.out.println(buffer.substring(0));   
```



### 替换字符

StringBuffer 类的 setCharAt() 方法用于在字符串的指定索引位置替换一个字符。该方法的语法格式如下：

```java
StringBuffer 对象.setCharAt(int index, char ch);
```

该方法的作用是修改对象中索引值为 index 位置的字符为新的字符 ch

#### setCharAt(int index, char ch)

```java
StringBuffer sb = new StringBuffer("hello");
sb.setCharAt(1,'E');
System.out.println(sb);    // 输出：hEllo
sb.setCharAt(0,'H');
System.out.println(sb);    // 输出：HEllo
sb.setCharAt(2,'p');
System.out.println(sb);    // 输出：HEplo
```



### 反转字符串

StringBuffer 类中的 reverse() 方法用于将字符串序列用其反转的形式取代。该方法的语法格式如下：

```java
StringBuffer 对象.reverse();
```

#### reverse()

```java
StringBuffer sb = new StringBuffer("java");
sb.reverse();
System.out.println(sb);    // 输出：avaj
```



### 删除字符串

#### 1. deleteCharAt() 方法

deleteCharAt() 方法用于移除序列中指定位置的字符，该方法的语法格式如下：

```java
StringBuffer 对象.deleteCharAt(int index);
```

deleteCharAt() 方法的作用是删除指定位置的字符，然后将剩余的内容形成一个新的字符串。例如：

```java
StringBuffer sb = new StringBuffer("She");
sb.deleteCharAt(2);
System.out.println(sb);    // 输出：Sh
```

执行该段代码，将字符串 sb 中索引值为 2 的字符删除，剩余的内容组成一个新的字符串，因此对象 sb 的值为 Sh。

#### 2. delete() 方法

delete() 方法用于移除序列中子字符串的字符，该方法的语法格式如下：

```
StringBuffer 对象.delete(int start,int end);
```

其中，start 表示要删除字符的起始索引值（包括索引值所对应的字符），end 表示要删除字符串的结束索引值（不包括索引值所对应的字符）。该方法的作用是删除指定区域以内的所有字符，例如：

```java
StringBuffer sb = new StringBuffer("hello jack");
sb.delete(2,5);
System.out.println(sb);    // 输出：he jack
sb.delete(2,5);
System.out.println(sb);    // 输出：heck
```

执行该段代码，将字符串“hello jack”索引值为 2（包括）到索引值为 5（不包括）之间的所有字符删除，因此输出的新的字符串的值为“he jack”。





## ArrayList

ArrayList <E>  E - 此列表中元素的类型

### 常用方法

#### list.add(E element)

```java
//顺序添加元素
list.add("asdasd"); 	 list.add("java");		 list.add("git"); 
```

#### list.add( int index , E element )

```java
//指定位置添加元素  add( int index , E element )  
	list.add(2,"github");				// 	[asdasd,java,github,git]
```

#### list.remove(E element)

```java
//删除指定的元素，返回 boolean，删除成功返回ture，失败返回false  
	list.remove("asdasd");				//返回值ture	[java,github,git]
	list.remove("gitee");				//返回值false
```

#### list.add(int index)

```java
//删除指定索引处的元素，返回被删除的元素
	list.remove(1);						//删除索引为 1 的元素 返回github	[java,git]
```

#### list.set( int index , E element )

```java
//修改指定索引处的元素,返回被修改的元素
	list.set(1, "zzz");					//修改索引为 1 的元素 返回git  	[java,zzz]
```

#### list.get(int index)

```java
//返回指定索引处的元素
	list.get(1);						//返回索引为 1 的元素 zzz 		 [java,zzz]
```

#### list.size()

```java
//返回集合中元素的个数
	list.size();						//返回值 2 
```

#### 遍历集合

```java
//遍历集合通用格式，通过size（）获取集合
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

##### 范例

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
是一个注解，可以帮助我们检查重写方法的方法声明的正确性

**方法重写注意事项**

1. 私有方法不能被重写（父类私有成员子类是不能继承的）
2. 子类方法访问权限不能更低( public>默认>私有)



### Java中继承的注意事项

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



## 多态

### 多态概述

同一个对象，在不同时刻表现出来的不同形态

举例：猫

我们可以说猫是猫：猫cat=new猫（）

我们也可以说猫是动物：动物 animal=new猫（）

这里猫在不同的时刻表现出来了不同的形态，这就是多态

#### 多态的前提和体现

1. 有继承/实现关系
2. 有方法重写
3. 有父类引用指向子类对象



### 多态中成员访问特点

- **成员变量**：编译看左边，执行看左边
- **成员方法**：编译看左边，执行看右边

**为什么成员变量和成员方法的访问不一样呢**？

因为成员方法有重写，而成员变量没有



### 多态的好处和弊端

多态的好处：提高了程序的扩展性
具体体现：定义方法的时候，使用父类型作为参数，将来在使用的时候，使用具体的子类型参与操作

多态的弊端：不能使用子类的特有功能



### 多态中的转型

- **向上转型**

​			从子到父

​			父类引用指向子类对象

- **向下转型**

​			从父到子

​			父类引用转为子类对象



## 抽象类

### 抽象类的特点

- **抽象类和抽象方法必须使用** abstract关键字修饰

​			public abstract class:类名{ }

​			public abstract void eat（）；

- **抽象类中不一定有抽象方法**，有抽象方法的类一定是抽象类

- **抽象类不能实例化**

​			抽象类如何实例化呢？参照多态的方式。通过子类对象实例化，这叫抽象类多态

- **抽象类的子类**

​			要么重写抽象类中的所有抽象方法

​			要么是抽象类



### 抽象类的成员特点

- **成员变量**

  ​	可以是变量

  ​	也可以是常量

- **构造方法**

  ​	有构造方法，但是不能实例化

  ​	那么，构造方法的作用是什么呢？用于子类访可父类数据的初始化

- 成员方法

  ​	可以有抽象方法：限定子类必须完成某些动作

  ​	也可以有非抽象方法：提高代码复用性



## 接口

### 接口概述

接口就是一种公共的规范标准，只要符合规范标准，大家都可以通用

Java中的接口更多的体现在对行为的抽象



### 接口的特点

- **接口用关键字** **interfaced** **修饰**

​			public interface接口名{}

- **类实现接口用** implements表示

​			public class类名 implements接口名{}

- **接口不能实例化**

​			接口如何实例化呢？

​			参照多态的方式，通过实现类对象实例化，这叫接口多态

​			多态的形式：具体类多态，抽象类多态，接口多态

​			多态的前提：有继承或者实现关系；有方法重写：有父（类/接口）引用指向(子/实现）类对象

- **接口的实现类**

​			要么重写接口中的所有抽象方法

​			要么是抽象类



### 接口的成员特点

- **成员变量**

​			只能是常量
​			默认修饰符： public static final

- **构造方法**

  ​	接口没有构造方法，因为接口主要是对行为进行抽象的，是没有具体存在个类如果没有父类，默认继承自  Objec类

- **成员方法**

  ​	只能是抽象方法

  ​	默认修饰符； public abstract 



### 类和接口的关系

- **类和类的关系**

​			继承关系，只能单继承，但是可以多层继承

- **类和接口的关系**

​			实现关系，可以单实现，也可以多实现，还可以在继承一个类的同时实现多个接口

- **接口和接口的关系**

​			继承关系，可以单继承，也可以多继承



### 抽象类和接口的区别

**成员区别**

抽象类				变量常量；有构造方法；有抽象方法也有非抽象方法
接口					常量；抽象方法

**关系区别**	

类与类				继承单继承

类与接口			实现，可以单实现，也可以多实现

接口与接口		继承，单继承，多继承

**设计理念区别**

抽象类				对类抽象，包括属性、行为
​接口					对行为抽象，主要是行为



## 形参和返回值

### 类名作为形参和返回值

- 方法的形参是类名，其实需要的是该关的对象

- 方法的返回值是类名，其实返回的是该类的对象



### 抽象类名作为形参和返回值

- 方法的形参是抽象类名，其实需要的是该抽象类的子类对象

- 方法的返回值是抽象类名，其实返回的是该抽象类的子类对象



### 接口名作为形参和返回值

- 方法的形参是接口名，其实需要的是该接口的实现类对象
- 方法的返回值是接口名，其实返回的是该接口的实现类对象



## 内部类

### 内部类概述

内部类：就是在一个类中定义一个类。举例：在一个类A的内部定义一个类B,类B就被称为内部类

#### 内部类的定义格式格式

```java
public class 类名{
    修饰符 class 类名{
    }
}
```

##### **范例**

```java
public class Outer{
	public class Inner{
    
	}
} 
```



### 内部类的访可特点

- 内部类可以直接访问外部类的成员，包括私有

- 外部类要访问内部类的成员，必须创建对象



### 成员内部类

按照内部类在类中定义的位置不同，可以分为如下两种形式

- 在类的成员位置：成员内部类

- 在类的局部位置：局部内部类

成员内部类，外界如何创建对象使用呢？

- 格式：外部类名内部类名对象名=外部类对象内部类对象

- 范例： `Outer. Inner oi= new Outer().new Inner();`



### 局部内部类

局部内部类是在方法中定义的类，所以外界是无法直接使用，需要在方法内部创建对象并使用

该类可以直接访问外部类的成员，也可以询可方法内的局部变量



### 匿名內部类

前提：存在一个类或者接口，这里的类可以是具体类也可以是抽象类

- 格式

```java
new 类名或者接口名(){
    重写方法;
};
```

- 范例

```java
new Inter (){
	public void show(){
	 @Override
     public void show() {
                System.out.println("匿名内部类");
        };
	}
}
```

**调用show()方法**

- 范例

```java
// 接口名为Inter ，即将该匿名内部类赋值给该接口类对象  由该类对象调用重写后的方法
Inter i = new Inter(){
    @Override
    public void show() {
        System.out.println("匿名内部类");
    }
};
i.show();
```

**返回类型为接口名或类名  可赋值给该类对象  由该类对象调用方法**

**本质：是一个继承了该类或者实现了该接口的子类匿名*对象***

直接使用匿名内部类  只需要在调用 带**类型 对象**方法时输入 **new 该类型（）** 便可

```java
//接口
public interface Jump {
    void jump();
}

//调用接口Jump类的对象
public class Operate {
    public void  method(Jump j){
        j.jump();
    }
}

public static void main(String[] args) {
        Operate o = new Operate();
    	// 调用方法时括号中输入new Jump()自动生成
        o.method(new Jump() {
            @Override
            public void jump() {
                重写方法；
            }
        });

    }
```



## Math

### Math类概述

Math包含执行基本数字运算的方法

没有构造方法，如何使用类中的成员呢？

看类的成员是否都是静态的，如果是，通过类名就可以直接调用



### Math类的常用方法

| 方法名                                         | 说明                                                         |
| ---------------------------------------------- | :----------------------------------------------------------- |
| public static int abs(int a）                  | 返回参数的绝对值                                             |
| public static double ceil(double a)            | 返回大于或等于参数的最小double值，等于一个整数    即**向上取整** |
| public static double floor(double a）          | 返回小于或等于参数的最大double值，等于一个整数    即**向下去整** |
| public static int round(float a)               | 按照四舍五入返回最接近参数的int                              |
| public static int max(int a, int b)            | 返回两个int值中的较大值                                      |
| public static int min(int a, int b)            | 返回两个int值中的较小值                                      |
| public static double pow( double a, double b） | 返回a的b次的值                                               |
| ublic static double random（）                 | 返回值为 在[0.0,1.0)区间 double的正值，即**随机在[0.0,1.0)区间取值** |

#### BigDecimal

用来对超过16位有效位的数进行精确的运算。双精度浮点型变量double可以处理16位有效数。在实际应用中，需要对更大或者更小的数进行运算和处理。float和double只能用来做科学计算或者是工程计算，在商业计算中要用java.math.BigDecimal。BigDecimal所创建的是对象，我们不能使用传统的+、-、*、/等算术运算符直接对其对象进行数学运算，而必须调用其相对应的方法。方法中的参数也必须是BigDecimal的对象。构造器是类的特殊方法，专门用来创建对象，特别是带有参数的对象。



##### **构造BigDecimal 对象常用方法**

**1、方法一**

```java
BigDecimal BigDecimal(double d); //不允许使用
```

**2、方法二**

```java
BigDecimal BigDecimal(String s); //常用,推荐使用 
```

**3、方法三**

```java
static BigDecimal valueOf(double d); //常用,推荐使用　
```

**注意：**

　　**1. double 参数的构造方法,不允许使用!!!!因为它不能精确的得到相应的值，值会变大;**
　　**2. String 构造方法是完全可预知的: 写入 new BigDecimal("0.1") 将创建一个 BigDecimal,它正好等于预期的0.1; 因此,通常建议优先使用 String 构造方法;**
　　**3. 静态方法 valueOf(double val) 内部实现,仍是将 double 类型转为 String 类型; 这通常是将 double(或float)转化为 BigDecimal 的首选方法;**



##### 方法描述

```java
add(BigDecimal)   BigDecimal对象中的值相加，然后返回这个对象。 

subtract(BigDecimal) BigDecimal对象中的值相减，然后返回这个对象。 

multiply(BigDecimal)  BigDecimal对象中的值相乘，然后返回这个对象。 

divide(BigDecimal)   BigDecimal对象中的值相除，然后返回这个对象。

abs()  BigDecimal对象中的值取绝对值，然后返回这个对象。

toString()     将BigDecimal对象的数值转换成字符串。 

doubleValue()    将BigDecimal对象中的值以双精度数返回。 

floatValue()     将BigDecimal对象中的值以单精度数返回。 

longValue()     将BigDecimal对象中的值以长整数返回。 

intValue()     将BigDecimal对象中的值以整数返回。
```

**这里有一点需要注意的是除法运算divide.**

BigDecimal除法可能出现不能整除的情况，比如 4.5/1.3，

这时会报错java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.

其实divide方法有可以传三个参数

```java
public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode) 
```

Bigdecimal. setscale（）

用于格式化小数点setscale(1)表示保留一位小数，默认用四舍五入方式

setscale(1 Bigdecimal. ROUND_DOWN)

直接删除多余的小数位，如2.35会变成2.3

setscale(1 Bigdecimal. ROUND_UP)

进位处理，2.35变成2.4
setscale(1, Big Decimal. ROUND_HALF_UP)

四舍五入，2.35变成2.4
sescaler(1. Bigdecimal. ROUND_HALF_DOWN)

四舍五入，2,35变成2.3,如果是5则向下舍









## System

### System类概述

System包含几个有用的类字段和方法，它不能被实例化



### System类的常用方法

| 方法名                               | 说明                                       |
| ------------------------------------ | ------------------------------------------ |
| public static void exit (int status) | 终止当前运行的java虚拟机，非零表示异常终止 |
| public static long currenTimeMilis() | 返回当前时间（以毫秒为单位）               |

System.currenTimeMillis( ) 可用于计算一段代码运行所耗时间

#### System.currenTimeMillis( )

```java
public static void main(String[] args) {
//计算程序耗时
long start = System.currentTimeMillis();
for (int i = 0; i < 10000; i++) {
    System.out.println(i);
}
long end = System.currentTimeMillis();
System.out.println(end - start+"毫秒");
}
```



## Object

### Object类的概述

Object是类层次结构的根，每个类都可以将 Object作为超类。所有类都直接或者间接的继承自该类

构造方法： public Object( )

回想面向对象中，为什么说子类的构造方法默认访可的是父类的无参构方法名造方法？

因为它们的顶级父类只有无参构造方法



### Object类的常用方法

| 方法名                             | **说明**                                                   |
| ---------------------------------- | ---------------------------------------------------------- |
| public String tostring             | 返回对象的字符串表示形式。建议所有子类重写该方法，自动生成 |
| public boolean equals( Object obj) | 比较对象是否相等。默认比较地址，重写可以比较内容，自动生成 |



## 基本类型包装类

**包装类是什么，目的是什么？**
	基本数据类型对应的引用类型。
	实现了一切皆对象。
	后期集合和泛型不支持基本类型，只能使用包装类。

**为什么提供包装类？**
Java为了实现一切皆对象，为8种基本类型提供了对应的引用类型。

后面的集合和泛型其实也只能支持包装类型，不支持基本数据类型。

| 基本数据类型 |  包装类   |
| :----------: | :-------: |
|     byte     |   Byte    |
|    short     |   Short   |
|     int      |  Integer  |
|     long     |   Long    |
|    float     |   Float   |
|    double    |  Double   |
|     char     | Character |
|   boolean    |  Boolean  |



### 包装类的特有功能

包装类的变量的默认值可以是null,容错率更高。

**可以把基本类型的数据转换成字符串类型（用处不大）**
①调用 tostring（）方法得到字符串结果。
②调用 Integer. tostring（基本类型的数据）。
**可以把字符串类型的数值转換成真实的数据类型（真的很有用）**
① Integer. parseint(“字符串类型的整数”)
② Double. parsedouble(“字符串类型的小数")。



###  Integer类的概述和使用

Integer:包装一个对象中的原始类型int的值

| 方法名                                  | 说明                                    |
| --------------------------------------- | --------------------------------------- |
| public Integer(int value)               | 根据int值创建 Integer对象（过时）       |
| public Integer(String s)                | 根据 String值创建 Integer对象（过时）   |
| public static Integer valueOf(int i)    | 返回表示指定的int值的 Integer实例       |
| public static Integer valueOf(String s) | 返回一个保存指定值的 Integer对象 String |



### int和 String的相互转换

基本类型包装类的最常见操作就是：用于基本类型和字符串之间的相互转换

#### int转换为 String

public static String valueOf(int i) 返回int参数的字符串表示形式。该方法是 String类中的方法	

##### **String.valueOf**(int z)

```java
// int 转换为string  String.valueOf(int z)
int z = 100 ;
String c = String.valueOf(z);
System.out.println(c);
//输出100 	100为String 类型
```

#### String转换为int

public static int pareseInt( String s) 将字符串解析为int类型。该方法是 Integer类中的方法 

#####  **Integer.parseInt**(String s )

```java
// string 转换为 int  Integer.parseInt(String s )
//Integer.valueOf(String s ) 也可以
String s = "100" ;
int x = Integer.parseInt(s);
System.out.println(x);
//输出为 100   100为Int 类型
```



### 自动装箱和拆箱

装箱：把基本数据类型转换为对应的包装类类型

拆箱：把包装类类型转焕为对应的基本数据类型

自动装箱：基本类型的数据和变量可以直接賦值给包装类型的变量。

自动拆箱：包装类型的变量可以直接赋值给基本数据类型的变量。

```java
Integer i=100;          //自动装箱1+=200
i+ = 200;               //i=i+200自动拆箱      i +200  是自动装箱   i = i + 200 是自动装箱
```

注意：在使用包装类类型的时候，如果做操作，最好先判断是否为null  我们推荐的是，只要是对象，在使用前就必须进行不为null的判断



## 日期类

### Date类

#### 概述和构造方法

Date代表了一个特定的时间，精确到毫秒

| 方法名                  | 说明                                                         |
| ----------------------- | ------------------------------------------------------------ |
| public Date( )          | 分配一个Date对象，并初始化，以使它代表它被分配的时间，精确到毫秒 |
| public Date( long date) | 分配一个Date对象，井将具初始化为表示从标基时间起指定的毫秒数 |

##### Date( )

```java
public static void main(String[] args) {
    // 输出当前时间
    Date d = new Date();
    System.out.println(d);
    
    // 输出标基时间后的 date 时间
    long date =1000*60*60;
    Date d2 = new Date(date);
    System.out.println(d2);

}
```



#### Date类的常用方法

| 方法名                         | 说明                                             |
| ------------------------------ | ------------------------------------------------ |
| public long getTime( )         | 获取的是日期对象从1970年1月1日000000到现在的毫秒 |
| public void setTime(long time) | 设置标基时间后的毫秒值                           |

##### getTime()和setTime(long time)

```java
public static void main(String[] args) {
    Date c = new Date();
    
    // c.getTime() 获取当前时间与标基时间的差值 毫秒
    System.out.println(c.getTime());

    System.out.println(c);
	//设置标基时间后的 date 毫秒  
    // long date =1000*60*60;
    
    //System.currentTimeMillis() 获取当前时间与标基时间的差值 毫秒  c.getTime() 也可实现
    // 设置标基时间后的 date 毫秒 即当前时间
    long date = System.currentTimeMillis();
    c.setTime(date);
    System.out.println(c);
}
```



### SimpleDateFormat类

Simpledateformat是一个具体的类，用于以区域设置数感的方式格式化和解析日期，重点学习日期格式化和解析

日期和时间格式由日期和时间模式字符串指定，在日期和时间模式字符串中，从 A 到 Z 以及从 a 到  z 的字母被解程为表示日期或时可字符串的组件的模式字母

常用的模式字母及对应关系如下：

|  y   |  M   |  d   |  H   |  m   |  s   |
| :--: | :--: | :--: | :--: | :--: | :--: |
|  年  |  月  |  日  |  时  |  分  |  秒  |



#### SimpleDateFormat的构造方法

| 方法名                                  | 说明                                                     |
| --------------------------------------- | -------------------------------------------------------- |
| public SimpleDateFormat( )              | 构造一个 Simpledateformat,使用默认模式和日期格式         |
| public SimpleDateFormat(String pattern) | 构造一个 Simpledateformatf使用给定的模式和默认的日明格式 |

##### SimpleDateFormat( )

```java
SimpleDateFormat sdf = new SimpleDateFormat();
SimpleDateFormat zxc = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
```



#### 格式化(从Date到 String)

public final String format( Date date)；将日期格式化成日期/时间字符串

##### format( Date date)

```java
public static void main(String[] args){
    
	Date d =new Date();
    //输出默认格式的日期 2021/11/12 下午5:34 为String类型
	SimpleDateFormat sdf = new SimpleDateFormat();
	String s =sdf.format(d);
	System.out.println(s);
    
    //输出给出格式的日期 2021年11月12日 17:34 为String类型
	SimpleDateFormat zxc = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
	String z = zxc.format(d);
	System.out.println(z);
}
```



#### 解析(从 String到Date)

public Date parse( String source)；从给定字符串的开始解析文本以生成日期

##### Date parse( String source)

```java
public static void main(String[] args) throws ParseException {
    
    //给出字符串要与给出的格式相匹配  否则会报错
	String ss = "20480809111111" ;
	SimpleDateFormat cc = new SimpleDateFormat("yyyyMMddHHmmss");
	Date w = cc.parse(ss);
    //输出Sun Aug 09 11:11:11 CST 2048 为Date类型
    System.out.println(w);
}
```



### Calendar类概述

Calendar为某时刻和一组日历字段之间的转换提供了ー些方法，井为操作日历字段提供了一些方法

Calendar提供了一个类方法 getinstance用于获取 Calendar对象，其日历字段已使用当前日期和时间初始化



#### Calendar.getlnstance()

```java
Calendar rightNow= Calendar.getlnstance();
```



### Calendar的常用方法

| 方法名                                               | 说明                                                   |
| ---------------------------------------------------- | ------------------------------------------------------ |
| public int get(int field)                            | 返回给定日历字段的值                                   |
| public abstract void add(int field, int amount)      | 根据日历的规则，将指定的时间量添加或减去给定的日历字段 |
| public final void set(int year, int month, int date) | 设置当前日历的年月日                                   |

#### get(int field)

```java
// get(int field) 
public static void main(String[] args) {
    //多态的形式 获取对象
    Calendar ca = Calendar.getInstance();
    int i = ca.get(Calendar.YEAR);
    // MONTH默认从0开始，所以通常要加一 
    int i1 = ca.get(Calendar.MONTH) + 1;
    int i2 = ca.get(Calendar.DATE);
    int i3 = ca.get(Calendar.HOUR);
    int i4 = ca.get(Calendar.MINUTE);
    //输出结果为   2021 11 12 6 22
    System.out.println(i + " " + i1 + " " + i2 + " " + i3 + " " + i4);
}
```

**MONTH默认从0开始，所以通常要加一**

#### add(int filed , int amount)

```java
// add(int filed , int amount)  将指定的时间量添加或减去给定的日历字段
public static void main(String[] args) {
    
    Calendar ca = Calendar.getInstance();
    // YEAR+10 
	ca.add(Calendar.YEAR,10);
    //MONTH + (-2)
	ca.add(Calendar.MONTH,-2);
	int i5 = ca.get(Calendar.YEAR);
	int i6 = ca.get(Calendar.MONTH)+1;
    //输出结果为2031 9
	System.out.println(i5+" "+i6);
}
```

#### set(int year, int month ,int date)

```java
public static void main(String[] args) {
    
    Calendar ca = Calendar.getInstance();
	//set(int year, int month ,int date) 设置当前日历的年月日
    //月份下标从0开始赋值月份要-1  set(2022,11,12)是设置日历为2022.12.12
	ca.set(2022,11,12);
	int i7 = ca.get(Calendar.YEAR);
	int i9 = ca.get(Calendar.MONTH) + 1;
	int i8 = ca.get(Calendar.DATE);
    //输出结果 2022 12 12
	System.out.println(i7+" "+i8+" "+i9);
	
    //在设置好的日历上修改 而不是当前日期
	ca.add(Calendar.YEAR,5);
	ca.add(Calendar.MONTH,-4);
	ca.add(Calendar.DATE,5);
	int ii1 = ca.get(Calendar.YEAR);
	int ii2 = ca.get(Calendar.MONTH) + 1;
	int ii3 = ca.get(Calendar.DATE);
    //输出结果 2027 8 17
	System.out.println(ii1 + " "+ii2 + " "+ii3);
}
```

**月份下标从0开始赋值月份要-1  set(2022,11,12)是设置日历为2022.12.12**



## 正则表达式

### **正则表示**

正则表达式可以用一些规定的字符来制定规则，并用来校验数据格式的合法性。

### 正则表达式的使用详解

**字符串对象提供了匹配正则表达式的方法**

判断是否匹配正则表达式，匹配返回true，不匹配返回false

```java
public boolean matches(String regex);
```

#### String.matches（）

```java
//输出 ture
System.out.println("454363zzz".matches("\\w{6,10}"));

//输出false
System.out.println("qweqweqwe".matches("\\W{6,10}"));

```



#### **字符类(默认匹配一个字符)**

**[abc]**     只能是a, b, 或c

**[^abc]**     除了a, b, c之外的任何字符

**[a-zA-Z]**        a到z A到Z，包括（范围）

**[a-d [m-p] ]**     a到d，或m通过p：（[a-dm-p]联合）

**[a-z&& [def] ]**     d, e, 或f(交集)

**[a-z&&[ ^bc] ]**     a到z，除了b和c

**[a-z&&[ ^m-p] ]**   a到z，除了m到p;



#### **预定义的字符类(默认匹配一个字符)**

**.** 			   任何字符

**\d** 			一个数字： [0-9]

**\D** 			非数字： [  ^0-9 ]

**\s** 			 一个空白字符： [ \t\n\x0B\f\r]

**\S**	 		 非空白字符： [ ^\s]

**\w** 			[a-zA-Z_0-9] 英文、数字、下划线

**\W** 	   	 [ ^\w] 一个非单词字符



#### **贪婪的量词（配合匹配多个字符）**

**X? X** 			一次或根本不

**X* X**			零次或多次

**X+ X** 			一次或多次

**X {n} X**			正好n次

**X {n, } X**			至少n次

**X {n,m} X**			至少n但不超过m次



### 正则表达式在方法中的应用

| 方法名                                               | 说明                                                         |
| :--------------------------------------------------- | ------------------------------------------------------------ |
| public String replaceAll(String regex,String newStr) | 按照正则表达式匹配的内容进行替换                             |
| public String[] split(String regex)：                | 按照正则表达式匹配的内容进行分割字符串，反回一个字符串数组。 |

#### split（）和replaceAll

```java
public static void main(String[] args) {
    String name = "燕国asdasdasdfasd小小小asdasdasd乘车";

    // \\w+ 是一次或多次 匹配
    String[] arr = name.split("\\w+");
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    System.out.println();

    //name.replaceAll 是匹配字符并替换
    String arr1 = name.replaceAll("\\w+"," ");
    //输出 燕国 小小小 乘车
    System.out.println(arr1);
}
```

### 正则表达式写规则

#### 范例

```java
public static void main(String[] args) {
    String information = "来黑马程序学习Java,电话020-43422424，或者联系邮箱" +
            "itcast@itcast.cn,电话18762832633，0203232323" +
            "邮箱bozai@itcast.cn，400-100-3233 ，4001003232";

    //定义规则 字符串形式
    String regex = "(\\w{1,30}@[a-zA-Z0-9]{2,10}(\\.[a-zA-Z0-9]{2,10}){1,10})" +
            "|(1[3-9]\\d{9})|(0\\d{2,6}-)?\\d{5,20}|"+"(400-?\\d{3,9}-?\\d{3,9})";


    // 将规则编译成匹配对象
    Pattern pattern = Pattern.compile(regex);

    //得到一个容器匹配对象
    Matcher matcher=pattern.matcher(information);

    while(matcher.find()){
        String information1 = matcher.group();
        System.out.println(information1);
```

## Arrars

### Arrays类的概述和常用方法

| 方法名                                                       | 说明                                             |
| ------------------------------------------------------------ | ------------------------------------------------ |
| public static String toString(类型[] a)                      | 返回数组的内容（字符串形式）                     |
| public  static void sort(类型[] a)                           | 对数组进行默认升序排序                           |
| public  static <T>void sort(类型[] a, Comparator<?  super <T>  c) | 使用比较器对象自定义排序                         |
| public  static int binarySearch(int[] a,  int key)           | 二分搜索数组中的数据，存在返回索引，不存在返回-1 |

#### toString

**范例**

```java
public static void main(String[] args) {

    int[] arr = {5, 8, 4, 7, 9, 6, 2, 1, 1, 2};
    // 输出 [5,8,4,7,9,6,2,1,1,2]  该结果为字符串
    System.out.println(Arrays.toString(arr));
}

```

**工具类的设计思想**

构造方法用 private 修饰

修饰成员用 public static 修饰



#### 排序

将一组数据按照固定的规则进行排列

##### 快速排序

首先是最简单的Array.sort，直接进行排序：

```java
public static void main(String[] args) {
  int[] arr = {4,3,5,1,7,9,3};
    
  // 快速排序法 使用 Arrays 类中的 sort 方法 
  // Arrays.sort( int [] )
  Arrays.sort(arr);
  for (int i : arr){  // for增强 同于for( int i =0 ; i<arr.length; i++ ; )
   	System.out.println(i);
  }
```

点击运行即可输出已排序的数组数字。

##### 部分排序法

使用Array.sort还可进行选择想要排序的部分数字，如将下角标编号为1~4的数字进行排序，其他数字顺序不变。

```java
public static void main(String[] args) {
  
  int[] arr = {4,3,5,1,2,9,3,0};
  
  Arrays.sort(arr,1,4);
  
  for (int i = 0;i<arr.length;i++){
   System.out.print(arr[i]+",");
  }
 }
```

输出结果为：4,1,3,5,2,9,3,0,   可见仅下标为1~4的数字进行了排序。

##### 冒泡排序

冒泡排序：一种排序的方式，对要进行排序的数据中相的据进行两两比較，将较大的数据放在后面，依次对所有的数据进行操作，直至所有数据按要求完成排序

```java
 public static void main(String[] args) {
 
  int[] arr = {5, 8, 4, 7, 9, 6, 2, 1, 1, 2};
  
  // 冒泡排序法 从下到上，两两进行比较，越小的越往上，从而形成由小到大的排序
     
        int cout = 0;
     //外循环为排序趟数，len个数进行len-1趟
        for (int i = 0; i < arr.length - 1; i++) {   
            //内循环为每趟比较的次数，第i趟比较len-i次
            for (int j = 0; j < arr.length - 1; j++) {
               // 相邻元素比较，若逆序则交换（升序为左大于右，降序反之）
                if (arr[j] > arr[j + 1]) { 
                    cout = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = cout;
                }
            }
        }
        for (int i : arr ) {
            System.out.print(arr[i] + ",");
        }

```



#### 二分查找

二分查询性能好，二分查找的前提是必须是排好序的数据。

二分查找正常的检索条件应该是**开始位置min <= 结束位置max**

**二分查找相当于每次去掉一半的查找范围**

二分搜索数组中的数据，存在返回索引，不存在返回-1   

##### Arrays.binarySearch(int index , key)

```java
//二分查找 返回索引 int类型  位置= 索引+1
int z = Arrays.binarySearch(arr,8);
System.out.println(z+1);
```

##### **二分查找的实现步骤**

- 定义变量记录左边和右边位置。

- 使用while循环控制查询（条件是左边位置<=右边位置）

- 循环内部获取中间元素索引

- 判断当前要找的元素如果大于中间元素，左边位置=中间索引+1

- 判断当前要找的元素如果小于中间元素，右边位置=中间索引-1

- 判断当前要找的元素如果等于中间元素，返回当前中间元素索引。



#### 自定义排序 

##### **自定义排序规则**

**设置Comparator接口对应的比较器对象，来定制比较规则**

如果认为左边数据 大于 右边数据 返回正整数

如果认为左边数据 小于 右边数据 返回负整数

如果认为左边数据 等于 右边数据 返回0

##### Arrays.sort(int[ ], new Comparator<Integer>()

```java
 public static void main(String[] args) {
        // sort 默认升序排序
        int[] arr = {1231, 2, 1, 2, 12, 4, 8, 4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println();
        //自定义比较器对象，只能支持引用类型的排序
        Integer[] arr1 = {1231, 2, 1, 2, 12, 4, 8, 4};
        /**
         * 参数一 排序的数组必须是引用类型的元素
         * 参数二 匿名内部类对象，代表了一个比较器对象
         */
        Arrays.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //默认升序
//                return o1 - o2;
                //降序
                return o2 - o1;
            }
        });
     //输出[1231, 12, 8, 4, 4, 2, 2, 1]
        System.out.println(Arrays.toString(arr1));
     
```

##### double类型的自定义排序

**比较 double类型只能用Double.compare(double 1 ,double2)**

**double 1 小于double 2 返回值为1 大于则为-1，为1 则为升序，-1 则为降序**

##### Double.compare

```java
 Student [] student =new Student[3];
        student[0]=new Student(15,"lzy",177.2);
        student[1]=new Student(19,"lzx",167.2);
        student[2]=new Student(12,"lzz",197.2);
        System.out.println(Arrays.toString(student));
        Arrays.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //升序
//                return o1.getAge()- o2.getAge();
                //降序
//                return o2.getAge()-o1.getAge();
                //比较 double类型只能用Double.compare(double 1 ,double2)
                //double 1 小于double 2 返回值为1 大于则为-1
                return Double.compare(o1.getHeight() ,o2.getHeight());
            }
        });
//输出	[Student{age=19, name='lzx', height=167.2}, 	Student{age=15, name='lzy', height=177.2}, 			Student{age=12, name='lzz', height=197.2}]
        System.out.println(Arrays.toString(student));
```



## **可变参数**

可变参数用在形参中可以接收多个数据。

可变参数的格式：数据类型...参数名称

### **可变参数的作用**

传输参数非常灵活，方便。可以不传输参数，可以传输1个或者多个，也可以传输一个数组

可变参数在方法内部本质上就是一个**数组**。



### **可变参数的注意事项**

1.一个形参列表中可变参数只能有一个

2.可变参数必须放在形参列表的最后面

### 范例

```java
public static void main(String[] args) {
    // 1、不传参数
    sum();
    // 2、可以传输一个参数
    sum(10);
    // 3、可以传输多个参数
    sum(10, 20, 30);
    // 4、可以传输一个数组
    sum(new int[]{10, 20, 30, 40, 50});
}

/**
   注意：一个形参列表中只能有一个可变参数,可变参数必须放在形参列表的最后面
 * @param nums
 */
public static void sum(  int...nums){
    // 注意：可变参数在方法内部其实就是一个数组。 nums
    System.out.println("元素个数：" + nums.length);
    System.out.println("元素内容：" + Arrays.toString(nums));
}
```



## 集合工具类Collections

java.utils.Collections:是集合工具类

作用：Collections并不属于集合，是用来操作集合的工具类。

### **Collections常用的API**

| 方法名称                                                     | 说明                   |
| ------------------------------------------------------------ | ---------------------- |
| public static <T> boolean  addAll(Collection<? super T> c, T... elements) | 给集合对象批量添加元素 |
| public static void shuffle(List<?> list)                     | 打乱List集合元素的顺序 |

```java
Collections.addAll(list, "aaaaa", "aaaaaz", "lzy");
```

```java
Collections.shuffle(list);
```

#### Collections排序相关API

使用范围：只能对于**List集合**的排序。

**排序方式** 1：

| 方法名称                                  | 说明                         |
| ----------------------------------------- | ---------------------------- |
| public static <T> void sort(List<T> list) | 将集合中元素按照默认规则排序 |

```java
List<Integer> in = new ArrayList<>();
Collections.addAll(in, 20, 22, 88, 1, 20);
Collections.sort(in);
```

注意：本方式不可以直接对自定义类型的List集合排序，除非自定义类型实现了比较规则Comparable接口

**排序方式** 2：

| 方法名称                                                     | 说明                         |
| ------------------------------------------------------------ | ---------------------------- |
| public static <T> void sort(List<T> list，Comparator<? super T> c) | 将集合中元素按照指定规则排序 |







## 集合

### 集合的概述

集合和数组都是容器。

**数组的特点**

数组定义完成并启动后，**类型确定、长度固定**。

适合元素的个数和类型确定的业务场景，不适合做需要增删数据操作。

**集合的特点**

集合的大小不固定，启动后可以动态变化，类型也可以选择不固定。集合更像气球。

集合非常适合做元素的增删操作。



#### **1、数组和集合的元素存储的个数问题。**

**数组定义后类型确定，长度固定**

**集合类型可以不固定，大小是可变的。**

#### 2、数组和集合存储元素的类型问题。

**数组可以存储基本类型和引用类型的数据。**

**集合只能存储引用数据类型的数据。**

#### 3、数组和集合适合的场景

**数组适合做数据个数和类型确定的场景。**

**集合适合做数据个数不确定，且要做增删元素的场景。**



### **集合类体系结构**

lCollection单列集合，每个元素（数据）只包含一个值。

lMap双列集合，每个元素包含两个值（键值对）。

#### Collection集合特点

**List系列集合**：添加的元素是有序、可重复、有索引。

ArrayList、LinekdList ：有序、可重复、有索引。

**Set系列集合**：添加的元素是无序、不重复、无索引。

HashSet: 无序、不重复、无索引；LinkedHashSet: **有序**、不重复、无索引。

TreeSet：**按照大小默认升序排序、**不重复、无索引。

##### **集合对于泛型的支持**

 集合都是支持泛型的，可以在编译阶段约束集合只能操作某种数据类型

```java
Collection<String> lists = new ArrayList<String>();
Collection<String> lists = new ArrayList<>(); 
// JDK 1.7开始后面的泛型类型申明可以省略不写
```

**注意：集合和泛型都只能支持引用数据类型，不支持基本数据类型，所以集合中存储的元素都认为是对象。**

**如果集合中要存储基本类型的数据怎么办？**  

```java
//存储基本类型使用包装类
Collection<Integer> lists = new ArrayList<>();
Collection<Double> lists = new ArrayList<>();
```

##### 1、集合的代表是？

**Collection接口。**

##### 2、Collection集合分了哪2大常用的集合体系？

**List系列集合：添加的元素是有序、可重复、有索引。**

**Set系列集合：添加的元素是无序、不重复、无索引。**

##### 3、如何约定集合存储数据的类型，需要注意什么？

**集合支持泛型。**

**集合和泛型不支持基本类型，只支持引用数据类型。**



### Collection体系的特点、使用场景总结

1.如果希望元素可以重复，又有索引，索引查询要快

**用 Array List集合，基于数组的。（用的最多）**

2.如果希望元素可以重复，又有索引，增删首尾操作快

**用 Linked List集合，基于链表的**

3.如果希望增删改査都快，但是元素不重复、无序、无索引。

**用 Hashset集合，基于哈希表的。**

4.如果希望增删改査都快，但是元素不重复、有序、无索引

**用 Linkedhashset集合，基于哈希表和双链表。**

5.如果要对对象进行排序。

**用 Treeset集合，基于红黑树。后续也可以用List集合实现排序**



### Collection集合常用API

**Collection集合**

Collection是单列集合的祖宗接口，它的功能是**全部单列集合**都可以继承使用的。

| 方法名称                             | 说明                             |
| ------------------------------------ | -------------------------------- |
| public  boolean add(E e)             | 把给定的对象添加到当前集合中     |
| public  void clear()                 | 清空集合中所有的元素             |
| public  boolean remove(E e)          | 把给定的对象在当前集合中删除     |
| public  boolean contains(Object obj) | 判断当前集合中是否包含给定的对象 |
| public  boolean isEmpty()            | 判断当前集合是否为空             |
| public  int size()                   | 返回集合中元素的个数。           |
| public  Object[] toArray()           | 把集合中的元素，存储到数组中     |

#### 范例

```java
public static void main(String[] args) {
    Collection<String> list = new ArrayList<String>();
    //list.add(E e) 添加元素
    list.add("aaaaa");
    list.add("早早早");
    list.add("java");
    list.add("xczxczx");
    list.add("cccc");
    list.add("java");
    System.out.println(list);
    
    // list.isEmpty() 判断集合是否为空 返回boolean
    System.out.println(list.isEmpty());  // false
    System.out.println();

    // list.contains( e )判断集合中是否包含某个元素  返回boolean
    System.out.println(list.contains("java"));  //true
    System.out.println(list.contains("ja"));	// false
    System.out.println(list.contains("早早早")); //true

    // list.remove( e ) 删除某个元素 如果该元素有多个则删除该元素的第一个 返回boolean
    System.out.println(list.remove("zzzz"));    // false
    System.out.println(list.remove("java"));	// true
    System.out.println(list);

    // Object [] arrs = list.toArray() 集合转换为数组
    Object [] arrs = list.toArray();
    System.out.println(Arrays.toString(arrs));

    System.out.println();

    // list.addAll(list2) 集合合并 将集合list2的元素拷贝到集合list中你list2的元素不会消失
    Collection<String> list2 = new ArrayList<String>();
    list2.add("git");
    list2.add("github");

    list.addAll(list2);
    System.out.println(list);
    System.out.println(list2);
    //  [aaaaa, 早早早, xczxczx, cccc, java, git, github]
	//	[git, github]
    
    // list.clear() 清空集合
    list.clear();
    System.out.println(list);

}
```



### Collection集合的遍历方式

#### 方式一  迭代器

**迭代器遍历概述**

遍历就是一个一个的把容器中的元素访问一遍。 

迭代器在Java中的代表是**Iterator**，迭代器是**集合的专用遍历方式**。

Collection集合获取迭代器

| 方法名称                        | 说明                                                        |
| ------------------------------- | ----------------------------------------------------------- |
| **Iterator<E>**  **iterator()** | 返回集合中的迭代器对象，该迭代器对象默认指向当前集合的0索引 |

```java
Iterator<String> it  = s.iterator();
```

##### Iterator中的常用方法

| 方法名称          | 说明                                                         |
| ----------------- | ------------------------------------------------------------ |
| boolean hasNext() | 询问当前位置是否有元素存在，存在返回true ,不存在返回false    |
| E  next()         | 获取当前位置的元素，并同时将迭代器对象移向下一个位置，注意防止取出越界。 |

##### 范例

```java
public static void main(String[] args) {
        Collection<String> s = new ArrayList<>();
        s.add("lzy");
        s.add("lzz");
        s.add("lzx");
        s.add("lzc");
        s.add("lzv");
        System.out.println(s);


        //Iterator<String> it  = s.iterator() 得到当前集合的迭代器对象
        Iterator<String> it = s.iterator();
		
    	// 用while循环遍历 it.hasNext()  询问当前位置是否有元素存在，存在返回true ,不存在返回false  再用it.next 取出元素
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        
        System.out.println();
        System.out.println(s);

    }
```

##### 1、迭代器的默认位置在哪里。

Iterator<E> iterator()：得到迭代器对象，默认指向当前集合的索引0

##### 2、迭代器如果取元素越界会出现什么问题。

会出现NoSuchElementException异常



#### 方式二：增强for循环

##### 增强for循环

```java
for(元素数据类型 变量名 : 数组或者Collection集合) {
  //在此处使用变量即可，该变量就是元素
}
```

增强for循环：既可以遍历集合也可以遍历数组。

```java
Collection<String> list = new ArrayList<>();
 for(String ele : list) {
   System.out.println(ele);
 }
```



#### 方式三 Lambda表达式遍历集合

```java
//结合lambda遍历集合

default void forEach(Consumer<? super T> action)；
```

```java
Collection<String> lists = new ArrayList<>();
...
 lists.forEach(new Consumer<String>() {
   @Override
   public void accept(String s) {
     System.*out*.println(s);
   }
 });
```



### List系列集合

#### **List系列集合特点**

ArrayList、LinekdList ：有序，可重复，有索引。

有序：存储和取出的元素顺序一致

有索引：可以通过索引操作元素

可重复：存储的元素可以重复



#### List集合特有方法

| 方法名称                       | 说明                                   |
| ------------------------------ | :------------------------------------- |
| void add(int  index,E element) | 在此集合中的指定位置插入指定的元素     |
| E remove(int  index)           | 删除指定索引处的元素，返回被删除的元素 |
| E set(int index,E  element)    | 修改指定索引处的元素，返回被修改的元素 |
| E get(int  index)              | 返回指定索引处的元素                   |



#### List的实现类的底层原理

ArrayList底层是基于数组实现的，根据查询元素快，增删相对慢。

LinkedList底层基于双链表实现的，查询元素慢，增删首尾元素是非常快的

##### ArrayList集合底层原理

ArrayList底层是基于数组实现的：根据索引定位元素快，增删需要做元素的移位操作。

第一次创建集合并添加第一个元素的时候，在底层创建一个默认长度为10的数组。

##### LinkedList集合的底层原理

**LinkedList的特点**

底层数据结构是双链表，查询慢，首尾操作的速度是极快的，所以多了很多首尾操作的特有API。

**LinkedList集合的特有功能**

| 方法名称                   | 说明                                     |
| -------------------------- | ---------------------------------------- |
| public  void addFirst(E e) | 在该列表开头插入指定的元素               |
| public  void addLast(E e)  | 将指定的元素追加到此列表的末尾           |
| public  E getFirst()       | 返回此列表中的第一个元素                 |
| public  E getLast()        | 返回此列表中的最后一个元素               |
| public  E removeFirst()    | 从此列表中删除并返回被删除的第一个元素   |
| public  E removeLast()     | 从此列表中删除并返回被删除的最后一个元素 |

##### 范例

```java
public static void main(String[] args) {
    LinkedList <String> s = new LinkedList<>();
    s.add("lzy");
    s.add("lzz");
    s.add("lzx");
    s.add("lzc");
    s.add("lzv");
    System.out.println(s);

    System.out.println();
    // 在该列表开头插入指定的元素
    s.addFirst("zzz");
    // 将指定的元素追加到此列表的末尾 
    s.addLast("ssss");
    System.out.println(s);
    // 返回此列表中的最后一个元素    
    System.out.println(s.getLast());
    // 返回此列表中的第一个元素
    System.out.println(s.getFirst());
    System.out.println();
    // 从此列表中删除并返回被删除的第一个元素  
    System.out.println(s.removeFirst());
    System.out.println(s);
    // 从此列表中删除并返回被删除的最后一个元素  
    System.out.println(s.removeLast());
    System.out.println(s);
    
}
```



### Set系列集合

#### Set系列集系概述

##### Set系列集合特点

无序：存取顺序不一致

不重复：可以去除重复

无索引：没有带索引的方法，所以不能使用普通for循环遍历，也不能通过索引来获取元素。

##### Set集合实现类特点

HashSet : 无序、不重复、无索引。

LinkedHashSet：**有序**、不重复、无索引。

TreeSet：**排序**、不重复、无索引。

Set集合的功能上基本上与Collection的API一致。



### HashSet元素无序的底层原理：哈希表

HashSet集合底层采取**哈希表**存储的数据。

哈希表是一种对于增删改查数据性能都较好的结构



#### **哈希表的组成**

JDK8之前的，底层使用**数组**+链表组成

JDK8开始后，底层采用**数组**+链表+红黑树组成



#### **哈希值**

是JDK根据对象的**地址**，按照某种规则算出来的int类型的**数值**。



#### **Object**类的API

public int hashCode()：返回对象的哈希值



#### **对象的哈希值特点**

同一个对象多次调用hashCode()方法返回的哈希值是相同的

默认情况下，不同对象的哈希值是不同的。

**哈希表是一种对于增删改查数据性能都较好的结构**

#### 哈希表的详细流程

**① 创建一个默认长度16，默认加载因为0.75的数组，数组名table**

**② 根据元素的哈希值跟数组的长度计算出应存入的位置**

**③ 判断当前位置是否为null，如果是null直接存入，如果位置不为null，表示有元素， 则调用equals方法比较属性值，如果一样，则不存，如果不一样，则存入数组。**

**④ 当数组存满到16\*0.75=12时，就自动扩容，每次扩容原先的两倍**



#### HashSet元素去重复的底层原理

①创建一个默认长度16的数组，数组名table

②根据元素的**哈希值**跟**数组的长度**求余计算出应存入的位置（哈希算法）

③判断当前位置是否为null，如果是null直接存入

**④如果位置不为null，表示有元素，则调用equals方法比较**

**⑤如果一样，则不存，如果不一样，则存入数组，**

**结论：如果希望Set集合认为2个内容一样的对象是重复的，必须重写对象的hashCode()和equals()方法**

**如果希望Set集合认为2个内容相同的对象是重复**

**重写对象的hashCode和equals方法。**



### 实现类：LinkedHashSet

#### **LinkedHashSet**集合概述和特点

**有序**、不重复、无索引。

l这里的有序指的是保证存储和取出的元素顺序一致

**原理**：底层数据结构是依然哈希表，只是每个元素又额外的多了一个双链表的机制记录存储的顺序。



### 实现类：TreeSet

#### TreeSet集合概述和特点

不重复、无索引、可排序

可排序：按照元素的大小默认升序（有小到大）排序。

TreeSet集合底层是基于**红黑树的数据结构**实现排序的，增删改查性能都较好。

**注意：TreeSet集合是一定要排序的，可以将元素按照指定的规则进行排序。**

#### **TreeSet集合默认的规则**

对于数值类型：Integer , Double，官方默认按照大小进行升序排序。

对于字符串类型：默认按照首字符的编号升序排序。

对于自定义类型如Student对象，TreeSet无法直接排序

**想要使用TreeSet存储自定义类型，需要制定排序规则**

##### **自定义排序规则**

TreeSet集合存储对象的的时候有2种方式可以设计自定义比较规则

**方式一**

让自定义的类（如学生类）**实现Comparable**接口**重写里面的compareTo方法**来定制比较规则。

###### **范例**

```java
 @Override
    public int compareTo(Apple o) {
        //会去掉重复项
//        return (int) (this.price - o.price);
        //不会去掉重复项
        return  (this.price - o.price)>=0?1:-1;

    }
```

**方式二**

**TreeSet集合有参数构造器，可以设置Comparator接口对应的比较器对象，来定制比较规则。**

###### 范例

```java
//TreeSet集合存储的对象有实现比较规则，集合也自带比较器，默认使用集合自带的比较器排序
Set<Apple> a = new TreeSet<>(new Comparator<Apple>() {
    @Override
    public int compare(Apple o1, Apple o2) {
        return  (o1.getPrice() - o2.getPrice())<=0?1:-1;
    }
});
```

##### **关于返回值的规则**

如果认为第一个元素大于第二个元素返回正整数即可。

如果认为第一个元素小于第二个元素返回负整数即可。

如果认为第一个元素等于第二个元素返回0即可，此时Treeset集合只会保留一个元素，认为两者重复

**如果TreeSet集合存储的对象有实现比较规则，集合也自带比较器，默认使用集合自带的比较器排序**



## Map集合体系

### **Map集合概述和使用**

Map集合是一种双列集合，每个元素包含两个数据。

Map集合的每个元素的格式：key=value(键值对元素)。

Map集合也被称为“**键值对集合**”。

#### Map集合整体格式

Collection集合的格式: [元素1,元素2,元素3..]

Map集合的完整格式：{key1=value1 , key2=value2 , key3=value3 , ...}

```java
Map<String, Integer> map = new HashMap<>();
```

Map集合是什么？使用场景是什么样的？

**Map集合是键值对集合**

**Map集合非常适合做类购物车这样的业务场景。**



### Map集合体系特点

**使用最多的Map集合是HashMap。**

重点掌握**HashMap , LinkedHashMap , TreeMap。**

Map集合的特点都是由键决定的。

Map集合的键是无序,不重复的，无索引的，值不做要求（可以重复）。

Map集合后面重复的键对应的值会覆盖前面重复键的值。

Map集合的键值对都可以为null。

#### **Map**集合实现类特点

HashMap:元素按照键是无序，不重复，无索引，值不做要求，基于哈希表（与Map体系一致）

LinkedHashMap:元素按照键是**有序**，不重复，无索引，值不做要求，基于哈希表

TreeMap：元素只能按照键**排序**，不重复，无索引的，值不做要求，可以做排序

### Map集合常用API

Map是双列集合的祖宗接口，它的功能是全部双列集合都可以继承使用的。

| 方法名称                            | 说明                                  |
| ----------------------------------- | ------------------------------------- |
| V  put(K key,V value)               | 添加元素                              |
| V  remove(Object key)               | 根据键删除键值对元素                  |
| void  clear()                       | 移除所有的键值对元素                  |
| boolean containsKey(Object key)     | 判断集合是否包含指定的键  返回boolean |
| boolean containsValue(Object value) | 判断集合是否包含指定的值  返回boolean |
| boolean isEmpty()                   | 判断集合是否为空  返回boolean         |
| int  size()                         | 集合的长度，也就是集合中键值对的个数  |
| Set<K>  keySet()                    | 获取所有键的集合                      |
| Collection < V > values（）         | 获取所有键的值的集合                  |
| V  puAll( V )                       | 合并集合                              |

#### 范例

```java
	Map<String, Integer> map = new HashMap<>();
    map.put("nike", 111);
    map.put("sss", 1);
    map.put("vvv", 111);
    map.put("sss", 111);
    map.put("zzz", 111);
    System.out.println(map);
	map.remove("zzz");
	System.out.println(map.containsKey("sss"));
	System.out.println(map.containsValue("111"));
	System.out.println(map.size());

	Set<String> set = map.keySet();
	System.out.println(set);
	Collection<Integer> value =map.values();
	System.out.println(value);

	map.clear();
	System.out.println();
	System.out.println(map.isEmpty());

 	Map<String, Integer> map1 = new HashMap<String, Integer>();
	Map<String, Integer> map2 = new HashMap<String, Integer>();
	map1.put("zzvz", 12);
 	map1.put("zcz", 14);
	map1.put("zxz", 11);

	map2.put("zxc", 11);
	map2.put("zxz", 12);
	map2.put("zxq", 11);
	map1.putAll(map2);
	System.out.println(map1);
```

**输出**

```java
{sss=111, nike=111, vvv=111, zzz=111}
true
false
3
[sss, nike, vvv]
[111, 111, 111]
true
{zcz=14, zxq=11, zxc=11, zzvz=12, zxz=12}
```



### Map集合的遍历

#### Map集合的遍历方式一：键找值

**Map集合的遍历方式有：3种。**

方式一：键找值的方式遍历：先获取Map集合全部的键，再根据遍历键找值。

先获取Map集合的全部键的Set集合。

遍历键的Set集合，然后通过键提取对应值。

| 方法名称           | 说明             |
| ------------------ | ---------------- |
| Set<K>  keySet()   | 获取所有键的集合 |
| V  get(Object key) | 根据键获取值     |

```java
public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("nike", 111);
    map.put("sss", 1);
    map.put("vvv", 111);
    map.put("sss", 111);
    map.put("zzz", 111);
    System.out.println(map);

    Set<String> keys = map.keySet();

    for (String key : keys) {
        System.out.println(map.get(key));
    }

}
```



#### Map集合的遍历方式二：键值对

方式二：键值对的方式遍历，把“键值对“看成一个整体，难度较大。

先把Map集合转换成Set集合，Set集合中每个元素都是键值对实体类型了。

遍历Set集合，然后提取键以及提取值。

| 方法名称                       | 说明                     |
| ------------------------------ | ------------------------ |
| Set<Map.Entry<K,V>> entrySet() | 获取所有键值对对象的集合 |
| K getKey()                     | 获得键                   |
| V getValue()                   | 获取值                   |



#### Map集合的遍历方式三：lambda表达式

方式三：JDK 1.8开始之后的新技术：Lambda表达式。

| 方法名称                                                     | 说明                  |
| ------------------------------------------------------------ | --------------------- |
| default void forEach(BiConsumer<?  super  K,  ? super  V>  action) | 结合lambda遍历Map集合 |

```java
maps.forEach((k , v) -> {System.out.println(k +"----->" + v);});

maps = {huawei=1000, 手表=10, 生活用品=10, iphoneX=100}
```

```java
map.forEach(new BiConsumer<String, Integer>() {
    @Override
    public void accept(String s, Integer integer) {
        System.out.println( s +" "+ integer);
    }
});

map.forEach((s,integer) -> System.out.println(s + " " + integer));
```



### Map集合的实现类HashMap

#### HashMap的特点

HashMap是Map里面的一个实现类。特点都是由键决定的：无序、不重复、无索引

没有额外需要学习的特有方法，直接使用Map里面的方法就可以了。

HashMap跟HashSet底层原理是一模一样的，都是哈希表结构，只是HashMap的每个元素包含两个值而已。

**Set系列集合的底层就是Map实现的，只是Set集合中的元素只要键数据，不要值数据而已**

```java
public HashSet() {
   map = new HashMap<>();
 }
```



#### HashMap的特点和底层原理

由键决定：无序、不重复、无索引。HashMap底层是哈希表结构的。

依赖hashCode方法和equals方法保证**键**的唯一。

如果**键**要存储的是自定义对象，需要重写hashCode和equals方法。

基于哈希表。增删改查的性能都较好。



### Map集合的实现类LinkedHashMap

#### LinkedHashMap集合概述和特点

**由键决定：有序**、不重复、无索引。

这里的有序指的是保证存储和取出的元素顺序一致

**原理**：底层数据结构是依然哈希表，只是每个键值对元素又额外的多了一个双链表的机制记录存储的顺序。



### Map集合的实现类TreeMap

#### **TreeMap集合概述和特点**

由键决定特性：不重复、无索引、可排序

可排序：按照键数据的大小默认升序（有小到大）排序。**只能对键排序。**

**注意：TreeMap集合是一定要排序的，可以默认排序，也可以将键按照指定的规则进行排序**

TreeMap跟TreeSet一样底层原理是一样的。

**TreeMap集合自定义排序规则有2种**

类实现Comparable接口，重写比较规则。

集合自定义Comparator比较器对象，重写比较规则。













### 集合的并发修改异常问题

迭代器遍历集合且直接用集合删除元素的时候可能出现。

增强for循环遍历集合且直接用集合删除元素的时候可能出现。

原因是删除元素后位置会发生变化，从而产生错误

迭代器遍历集合但是用迭代器自己的删除方法操作可以解决。

使用for循环遍历并删除元素不会存在这个问题。



#### 迭代器范例

```java
Iterator<String> it = s.iterator();
while (it.hasNext()) {
    String z = it.next();
    if ("lzz".equals(z)) {
        //报错
        //s.remove("lzz");
        //使用迭代器删除当前位置的元素，保证不后移，能够成功遍历到全部元素
        it.remove();
    }
}
```



#### for循环范例

```java
 public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("lzy");
        s.add("lzz");
        s.add("lzz");
        s.add("lzx");
        s.add("lzc");
        s.add("lzv");
        System.out.println(s);   
         //从后往前删除 被删元素后的元素往前移 不受影响
         for (int i = s.size()-1; i >=0; i--) {
            if (s.get(i).equals("lzz")) {
                s.remove("lzz");
           }
        }
     	//从前往后删 删完之后目标位置减一 被删元素后的元素位置向前移
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).equals("lzz")) {
                s.remove("lzz");
                i--;              
            }
        }
```



## **不可变集合**

不可变集合，就是不可被修改的集合。

集合的数据项在创建的时候提供，并且在整个生命周期中都不可改变。否则报错。

### **为什么要创建不可变集合**

如果某个数据不能被修改，把它防御性地拷贝到不可变集合中是个很好的实践。

或者当集合对象被不可信的库调用时，不可变形式是安全的。

### **如何创建不可变集合？**

在List、Set、Map接口中，都存在of方法，可以创建一个不可变的集合

| 方法名称                                  | 说明                               |
| ----------------------------------------- | ---------------------------------- |
| static  <E> List<E> of(E…elements)        | 创建一个具有指定元素的List集合对象 |
| static  <E> Set<E> of(E…elements)         | 创建一个具有指定元素的Set集合对象  |
| static <K  , V>  Map<K，V> of(E…elements) | 创建一个具有指定元素的Map集合对象  |

这个集合不能添加，不能删除，不能修改

```java
public static void main(String[] args) {
        // 1、不可变的List集合
        List<Double> lists = List.of(569.5, 700.5, 523.0,  570.5);
        // lists.add(689.0);
        // lists.set(2, 698.5);
        // System.out.println(lists);
        double score = lists.get(1);
        System.out.println(score);

        // 2、不可变的Set集合
        Set<String> names = Set.of("迪丽热巴", "迪丽热九", "马尔扎哈", "卡尔眨巴" );
        // names.add("三少爷");
        System.out.println(names);

        // 3、不可变的Map集合
        Map<String, Integer> maps = Map.of("huawei",2, "Java开发", 1 , "手表", 1);
        // maps.put("衣服", 3);
        System.out.println(maps);
```



## Stream流

### Stream流的概述

在Java 8中，得益于Lambda所带来的函数式编程， 引入了一个全新的Stream流概念。

**目的：用于简化集合和数组操作的API。**

### Stream流式思想的核心

1.先得到集合或者数组的Stream流（就是一根传送带）

2.把元素放上去

3.然后就用这个Stream流简化的API来方便的操作元素

#### 范例

```java
public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    Collections.addAll(names, "张三丰","张无忌","周芷若","赵敏","张强");
    System.out.println(names);
    names.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
}
```



### Stream流的获取

#### Stream流的三类方法

**获取Stream流**

创建一条流水线，并把数据放到流水线上准备进行操作

**中间方法**

流水线上的操作。一次操作完毕之后，还可以继续进行其他操作。

**终结方法**

一个Stream流只能有一个终结方法，是流水线上的最后一个操作

**Stream操作集合或者数组的第一步是先得到Stream流，然后才能使用流的功能。**

#### **集合获取Stream流的方式**

可以使用Collection接口中的默认方法stream()生成流

| 名称                        | 说明                       |
| --------------------------- | -------------------------- |
| default  Stream<E> stream() | 获取当前集合对象的Stream流 |

##### 范例

```java
 /** --------------------Collection集合获取流-------------------------------   */
        Collection<String> list = new ArrayList<>();
        Stream<String> s =  list.stream();
```



#### 数组获取Stream流的方式

| 名称                                              | 说明                            |
| ------------------------------------------------- | ------------------------------- |
| public  static <T>  Stream<T>  stream(T[]  array) | 获取当前数组的Stream流          |
| public  static<T>  Stream<T>  of(T...  values)    | 获取当前数组/可变数据的Stream流 |

##### 范例

```java
  /** ---------------------数组获取流------------------------------   */
        String[] names = {"赵敏","小昭","灭绝","周芷若"};
        Stream<String> nameStream = Arrays.stream(names);
        Stream<String> nameStream2 = Stream.of(names);
```



#### Map获取Stream流的方式

```java
 /** --------------------Map集合获取流-------------------------------   */
        Map<String, Integer> maps = new HashMap<>();

        // 键流
    Stream<String> keyStream = maps.keySet().stream();
        // 值流
    Stream<Integer> valueStream = maps.values().stream();
        // 键值对流（拿整体）
    Stream<Map.Entry<String,Integer>> keyAndValueStream =  maps.entrySet().stream();

```



### Stream流的常用API

#### Stream流的常用API(中间操作方法)

| 名称                                                 | 说明                                           |
| ---------------------------------------------------- | ---------------------------------------------- |
| Stream<T>  filter(Predicate<?  super  T>  predicate) | 用于对流中的数据进行**过滤。**                 |
| Stream<T>  limit(long maxSize)                       | 获取前几个元素                                 |
| Stream<T>  skip(long n)                              | 跳过前几个元素                                 |
| Stream<T>  distinct()                                | 去除流中重复的元素。依赖(hashCode和equals方法) |
| static  <T> Stream<T> concat(Stream  a, Stream b)    | **合并**a和b两个流为一个流                     |

中间方法也称为非终结方法，调用完成后返回新的Stream流可以继续使用，支持链式编程。

在Stream流中无法直接修改集合、数组中的数据。

#### Stream流的常见终结操作方法

| 名称                           | 说明                         |
| ------------------------------ | ---------------------------- |
| void  forEach(Consumer action) | 对此流的每个元素执行遍历操作 |
| long count()                   | 返回此流中的元素数           |

**终结操作方法，调用完成后流就无法继续使用了，原因是不会返回Stream了。**

##### 范例

```java
 public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张三丰");

        //forEach : 逐一处理(遍历)
        list.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();

        //count：统计个数 -- long count();
        long count = list.stream().filter(s -> s.length() == 3).count();
        System.out.println(count);

        // 过滤
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.print(s + " "));
        System.out.println();

        //limit : 取前几个元素
        list.stream().limit(2).forEach(s -> System.out.print(s + " "));
        System.out.println();

        //skip : 跳过前几个
        list.stream().skip(2).forEach(s -> System.out.print(s + " "));
        System.out.println();

        // map加工方法: 第一个参数原材料  -> 第二个参数是加工后的结果。
        // 给集合元素的前面都加上一个：zz
        list.stream().map(s -> "zz" + s).forEach(s-> System.out.print(s+" "));
        System.out.println();

        // 需求：把所有的名称 都加工成一个学生对象。
        list.stream().map(s->new Student(s)).forEach(s-> System.out.print(s + " "));
//        list.stream().map(Student::new).forEach(System.out::println);
        System.out.println();
        // 合并流。
        Stream<String> s1 =list.stream().filter(s->s.startsWith("张"));
        Stream<String> s2 =Stream.of("java","zzz");
        Stream<String> s3 =Stream.concat(s1,s2);
        s3.forEach(s-> System.out.print(s+" "));

        System.out.println();
        // distinct()
        list.stream().distinct().forEach(s-> System.out.print(s+" "));


        

    }
```

**输出**

```java
张无忌 周芷若 赵敏 张强 张三丰 张三丰 
4
张无忌 张强 张三丰 张三丰 
张无忌 周芷若 
赵敏 张强 张三丰 张三丰 
zz张无忌 zz周芷若 zz赵敏 zz张强 zz张三丰 zz张三丰 
Student{name='张无忌'} Student{name='周芷若'} Student{name='赵敏'} Student{name='张强'} Student{name='张三丰'} Student{name='张三丰'} 
张无忌 张强 张三丰 张三丰 java zzz 
张无忌 周芷若 赵敏 张强 张三丰 
```

### 收集Stream流

**收集Stream流的含义**：就是把Stream流操作后的结果数据转回到集合或者数组中去。

Stream流：方便操作集合/数组的**手段**。

集合/数组：才是开发中的**目的**。

#### Stream流的收集方法

| 名称                           | 说明                         |
| ------------------------------ | ---------------------------- |
| R collect(Collector collector) | 开始收集Stream流，指定收集器 |

#### Collectors工具类提供了具体的收集方式

| 名称                                                         | 说明                   |
| ------------------------------------------------------------ | ---------------------- |
| public static <T> Collector toList()                         | 把元素收集到List集合中 |
| public static <T> Collector toSet()                          | 把元素收集到Set集合中  |
| public static Collector toMap(Function keyMapper  , Function valueMapper) | 把元素收集到Map集合中  |
| Object [] arr = s2.toArray();                                | 把元素收集到数组中     |

##### 范例

```java
public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");
		
    // 把元素收集到List集合中  
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        List<String> zhangList = s1.collect(Collectors.toList());
        System.out.println(zhangList);

    //把元素收集到数组中
        Stream<String> s2 = list.stream().filter(s -> s.startsWith("张"));
//        String[]arr = s2.toArray(value ->new String[value]); ;
        Object [] arr = s2.toArray();
        System.out.println(Arrays.toString(arr));
```









## 常见数据结构

### **数据结构概述**

数据结构是计算机底层存储、组织数据的方式。是指数据相互之间是以什么方式排列在一起的。

通常情况下，精心选择的数据结构可以带来更高的运行或者存储效率

#### **常见的数据结构**

栈	队列	数组	链表	二叉树	二叉查找树	平衡二叉树	红黑树



### 常见数据结构之栈

**后进先出，先进后出**

**数据进入栈模型的过程称为：进栈**

**数据离开栈模型的过程称为：弹出栈**



### **常见数据结构之队列**

**先进先出，后进后出**

**数据从后端进入队列模型的过程称为：入队列**

**数据从前端离开队列模型的过程称为：出队列**



### **常见数据结构之数组**

**查询速度快：**查询数据通过地址值和索引定位，查询任意数据耗时相同**。**（元素在内存中是连续存储的）

**删除效率低：**要将原始数据删除，同时后面每个数据前移。

**添加效率极低：**添加位置后的每个数据后移，再添加元素。



### **常见数据结构之链表**

**链表中的元素是游离存储的，每个元素节点包含数据值和下一个元素的地址**。

**链表查询慢。无论查询哪个数据都要从头开始找**

**链表增删相对快**



### 二叉树、 二叉查找树

**只能有一个根节点**，每个节点最多支持2个直接子节点。

**节点的度：** 节点拥有的子树的个数，二叉树的度不大于2 叶子节点 度为0的节点，也称之为终端结点。

**高度：**叶子结点的高度为1，叶子结点的父节点高度为2，以此类推，根节点的高度最高。

**层：**根节点在第一层，以此类推

**兄弟节点 ：**拥有共同父节点的节点互称为兄弟节点

**二叉查找树又称二叉排序树或者二叉搜索树。**

**特点：**

1，每一个节点上最多有两个子节点

2，左子树上所有节点的值都小于根节点的值

3，右子树上所有节点的值都大于根节点的值

**目的：提高检索数据的性能**

#### **二叉树查找树添节点**

##### **规则：**

   **小的存左边**

   **大的存右边**

   **一样的不存**

#### **二叉树查找存在的问题：**

**出现瘸子现象，导致查询的性能与单链表一样，查询速度变慢！**

##### **平衡二叉树**

**平衡二叉树是在满足查找二叉树的大小规则下，让树尽可能矮小，以此提高查数据的性能。**

##### **要求**

**任意节点的左右两个子树的高度差不超过1，任意节点的左右两个子树都是一颗平衡二叉树**



### 红黑树

#### **红黑规则**

每一个节点或是红色的，或者是黑色的，**根节点必须是黑色。**

如果某一个节点是红色，那么它的子节点必须是黑色(**不能出现两个红色节点相连的情况**)。

**对每一个节点，从该节点到其所有后代叶节点的简单路径上，均包含相同数目的黑色节点。**

#### **添加节点**

添加的节点的颜色，可以是红色的，也可以是黑色的。

默认用红色效率高。

红黑树不是高度平衡的，它的平衡是通过"红黑规则"进行实现的

**红黑树增删改查的性能都很好**



### **各种数据结构的特点和作用**

队列：先进先出，后进后出。

栈：后进先出，先进后出。

数组：内存连续区域，查询快，增删慢。

链表：元素是游离的，查询慢，首尾操作极快。

二叉树：永远只有一个根节点, 每个结点不超过2个子节点的树。

查找二叉树：小的左边，大的右边，但是可能树很高，查询性能变差。

平衡查找二叉树：让树的高度差不大于1，增删改查都提高了。

红黑树（就是基于红黑规则实现了自平衡的排序二叉树）



## 泛型

### **泛型概述**

泛型：是JDK5中引入的特性，可以在编译阶段约束操作的数据类型，并进行检查。

泛型的格式：<数据类型>; 注意：泛型只能支持引用数据类型。

集合体系的全部接口和实现类都是支持泛型的使用的。

#### **泛型的好处**

统一数据类型。

把运行时期的问题提前到了编译期间，避免了强制类型转换可能出现的异常，因为编译阶段类型就能确定下来



### 自定义泛型类

#### 泛型类的概述

定义类时同时定义了泛型的类就是泛型类。

泛型类的格式：修饰符 class 类名<泛型变量>{ }

**范例**

```java
public class MyArrayList<T> { }
```

此处泛型变量**T**可以随便写为任意标识，常见的如E、T、K、V等

**作用**：编译阶段可以指定数据类型，类似于集合的作用。

#### 泛型类的核心思想

把出现泛型变量的地方全部替换成传输的真实数据类型



### 自定义泛型方法

#### 泛型方法的概述

定义方法时同时定义了泛型的方法就是泛型方法。

泛型方法的格式：**修饰符 <泛型变量> 方法返回值 方法名称(形参列表){}**

```java
 public <T> void show(T t) { }
```

**作用**：方法中可以使用泛型接收一切实际类型的参数，方法更具备通用性。



### 自定义泛型接口

#### 泛型接口的概述

使用了泛型定义的接口就是泛型接口。

泛型接口的格式：修饰符 interface 接口名称<泛型变量>{}

```java
public interface Data<E>{}
```

**作用**：泛型接口可以约束实现类，实现类可以在实现接口的时候传入自己操作的数据类型这样重写的方法都将是针对于该类型的操作

#### 范例

```java
public class StudentDemo implements Data<Student>{
    @Override
    public void add(Student element) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Student element) {

    }

    @Override
    public Student query(int id) {
        return null;
    }
}
```



### 泛型通配符、上下限

#### **通配符**： ?

**?**  可以在“使用泛型”的时候代表一切类型。

**E T K V** 是在定义泛型的时候使用的

虽然BMW和BENZ都继承了Car但是ArrayList< BMW >和ArrayList< BENZ >与ArrayList< Car >没有关系的！!

#### **泛型的上下限：**

**? extends Car**  ： ？必须是Car或者其子类  泛型上限

**? super Car**       ?  必须是Car或者其父类  泛型下限

##### 范例

```java
public static void main(String[] args) {
        ArrayList<Bwm> c = new ArrayList<>();
        c.add(new Bwm());
        c.add(new Bwm());
        c.add(new Bwm());
        go(c);

        ArrayList<Banz> z = new ArrayList<>();
        z.add(new Banz());
        z.add(new Banz());
        z.add(new Banz());
        go(z);
        ArrayList<Dog> d = new ArrayList<>();
        d.add(new Dog());
        d.add(new Dog());
        d.add(new Dog());
        // dog 类不继承 Car
//        go(d);


    }
	// Car 或Car的子类才可调用
    public static void go(ArrayList<? extends Car> c) {

    }
}

class Car {

}

class Dog {

}

class Bwm extends Car {

}

class Banz extends Car {
    
}
```



## 异常处理

### 异常概述、体系

#### **什么是异常？**

异常是程序在“编译”或者“执行”的过程中可能出现的问题，**注意**：语法错误不算在异常体系中。 



比如:数组索引越界、空指针异常、 日期格式化异常

#### **为什么要学习异常**

异常一旦出现了，如果没有提前处理，程序就会退出JVM虚拟机而终止.



研究异常并且避免异常，然后提前处理异常，体现的是程序的安全, 健壮性。

#### **异常体系**

**Error**：

系统级别问题、JVM退出等，代码无法控制。

**Exception**：java.lang包下，称为异常类，它表示程序本身可以处理的问题

**RuntimeException**及其子类：运行时异常，编译阶段不会报错。 (空指针异常，数组索引越界异常) 

除**RuntimeException**之外所有的异常：编译时异常，编译期必须处理的，否则程序

不能通过编译。 (日期格式化异常)

#### **编译时异常和运行时异常**

编译时异常就是在编译的时候出现的异常，

运行时异常就是在运行时出现的异常。



### 常见运行时异常

#### **运行时异常示例**

数组索引越界异常: ArrayIndexOutOfBoundsException

空指针异常 : NullPointerException，直接输出没有问题，但是调用空指针的变量的功能就会报错。

数学操作异常：ArithmeticException

类型转换异常：ClassCastException

数字转换异常： NumberFormatException



### 常见编译时异常

不是**RuntimeException**或者其子类的异常，编译阶就报错，必须处理，否则代码不通过

**编译时异常：继承自Exception的异常或者其子类**

**编译阶段报错，必须处理，否则代码不通过。**

### 异常的默认处理流程

①默认会在出现异常的代码那里自动的创建一个异常对象：**ArithmeticException**。

②异常会从方法中出现的点这里抛出给调用者，调用者最终抛出给JVM虚拟机。

③虚拟机接收到异常对象后，先在控制台直接输出异常栈信息数据。

④直接从当前执行的异常点干掉当前程序。

后续代码没有机会执行了，因为程序已经死亡



### 编译时异常的处理机制

出现异常直接抛出去给调用者，调用者也继续抛出去。

出现异常自己捕获处理，不麻烦别人。

前两者结合，出现异常直接抛出去给调用者，调用者捕获处理

#### **异常处理方式1 —— throws**

throws：用在方法上，可以将方法内部出现的异常抛出去给本方法的调用者处理。

这种方式并不好，发生异常的方法自己不处理异常，如果异常最终抛出去给虚拟机将引起程序死亡。

```java
方法 throws Exception{
 }
```

#### **异常处理方式2—— try…catch…**

监视捕获异常，用在方法内部，可以将方法内部出现的异常直接捕获处理。

这种方式还可以，发生异常的方法自己独立完成异常的处理，程序可以继续往下执行。

```java
try{   
    // 可能出现异常的代码！
	}catch (Exception e){
    e.printStackTrace(); // 直接打印异常栈信息
}
Exception可以捕获处理一切异常类型！
```

#### **异常处理方式3 ——前两者结合**

方法直接将异通过throws抛出去给调用者

调用者收到异常后直接捕获处理。



**在开发中按照规范来说第三种方式是最好的：底层的异常抛出去给最外层，最外层集中捕获处理。**

**实际应用中，只要代码能够编译通过，并且功能能完成，那么每一种异常处理方式似乎也都是可以的。**



### 运行时异常的处理机制

运行时异常编译阶段不会出错，是运行时才可能出错的，所以编译阶段不处理也可以。

按照规范建议还是处理：建议在最外层调用处集中捕获处理即可



### 异常处理使代码更稳健的案例

```java
 public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("请您输入合法的价格：");
                String priceStr = sc.nextLine();
                // 转换成double类型的价格
                double price = Double.valueOf(priceStr);

                // 判断价格是否大于 0
                if(price > 0) {
                    System.out.println("定价：" + price);
                    break;
                }else {
                    System.out.println("价格必须是正数~~~");
                }
            } catch (Exception e) {
                System.out.println("用户输入的数据有毛病，请您输入合法的数值，建议为正数~~");
            }
        }
    }
```

当priceStr存入任何数据都能继续运行 直到输入正数

如果没有try/catch 当priceStr存入字符便会出错

## 日志框架

### 日志技术的概述

![image-20211117203633412](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211117203633412.png)

#### **日志技术具备的优势**

可以将系统执行的信息选择性的记录到指定的位置（控制台、文件中、数据库中）。

可以随时以**开关**的形式控制是否记录日志，无需修改源代码。

|          | **输出语句**               | **日志技术**                         |
| -------- | :------------------------- | ------------------------------------ |
| 输出位置 | 只能是控制台               | 可以将日志信息写入到文件或者数据库中 |
| 取消日志 | 需要修改代码，灵活性比较差 | 不需要修改代码，灵活性比较好         |
| 多线程   | 性能较差                   | 性能较好                             |

### 日志技术体系

**日志规范大多是一些接口，提供给实现框架去设计的。**

**常见的规范是：**

**Commons Logging**

**Simple Logging Facade for Java**

![image-20211117203943616](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211117203943616.png)



**日志规范：**一些接口，提供给日志的实现框架设计的标准。

**日志框架：**牛人或者第三方公司已经做好的日志记录实现代码，后来者直接可以拿去使用。

因为对Commons Logging的接口不满意，有人就搞了SLF4J。因为对Log4j的性能不满意，有人就搞了Logback。

### Logback概述

**Logback日志框架**

Logback是由log4j创始人设计的另一个开源日志组件，性能比log4j要好

Logback是基于slf4j的日志规范实现的框架。

**Logback主要分为三个技术模块**：

 **logback-core**： logback-core 模块为其他两个模块奠定了基础，必须有。

 **logback-classic**：它是log4j的一个改良版本，同时它完整实现了slf4j API。

 **logback-access** 模块与 Tomcat 和 Jetty 等 Servlet 容器集成，以提供 HTTP 访问日志功能



### Logback快速入门

在项目下新建文件夹lib，导入Logback的相关jar包到该文件夹下，并添加到项目依赖库中去。

将Logback的核心配置文件logback.xml直接拷贝到src目录下（必须是src下）。

在代码中获取日志的对象

public static final Logger *LOGGER* = LoggerFactory.*getLogger*("类对象");

#### 范例

```java
public static Logger logger = LoggerFactory.getLogger("Demo.class");

public static void main(String[] args) {
    try {
        logger.debug("开始了");
        logger.info("ccc");
        int a = 10;
        int b = 0;
        logger.trace("a" + a);
        logger.trace("b" + b);
        System.out.println(a / b);
    } catch (Exception e) {
        e.printStackTrace();
        logger.error("异常"+e);
    }

}
```

### Logback配置详解-输出位置、格式设置

Logback日志系统的特性都是通过核心配置文件logback.xml控制的。

**Logback日志输出位置、格式设置：**

通过logback.xml 中的< append >标签可以设置输出位置和日志信息的详细格式。

通常可以设置2个日志输出位置：一个是控制台、一个是系统文件中

**输出到控制台的配置标志**

```java
<appender name="CONSOLE"class="ch.qos.logback.core.ConsoleAppender">
```

**输出到系统文件的配置标志**

```java
<appender name="FILE"class="ch.qos.logback.core.rolling.RollingFileAppender">
```

### Logback配置详解-日志级别设置

**日志级别**

级别程度依次是：TRACE< DEBUG< INFO<WARN<ERROR ; 默认级别是debug（忽略大小写），对应其方法。

作用：用于控制系统中哪些日志级别是可以输出的，只输出级别不低于设定级别的日志信息。

ALL  和 OFF分别是打开全部日志信息，及关闭全部日志信息。

**具体在< root level="INFO">标签的level属性中设置日志级别**

```java
<root level=“INFO">
   <appender-ref ref="CONSOLE"/>
   <appender-ref ref="FILE" />
 </root>
```

## File、方法递归、IO流

1.先要定位文件

File类可以定位文件：进行删除、获取文本本身信息等操作**。**

**但是不能读写文件内容。**

2、读写文件数据

IO流技术可以对硬盘中的文件进行读写

3、今日总体学习思路

**先学会使用File类定位文件以及操作文件本身**

**然后学习IO流读写文件数据。**

![image-20211118211907209](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211118211907209.png)

## File

### **File类概述**

File类在包java.io.File下、代表操作系统的文件对象（文件、文件夹）。

File类提供了诸如：定位文件，获取文件本身的信息、删除文件、创建文件（文件夹）等功能

### File类创建对象

| 方法名称                                      | 说明                                               |
| --------------------------------------------- | -------------------------------------------------- |
| **public** File(String  pathname)             | 根据文件路径创建文件对象                           |
| **public** File(String  parent, String child) | 从父路径名字符串和子路径名字符串创建文件对象       |
| **public** File(File parent, String child)    | 根据父路径对应文件对象和子路径名字符串创建文件对象 |

#### 范例

```java
// 根据文件路径创建文件对象
File file1= new File("C:\\code")
// 根据父路径对应文件对象和子路径名字符串创建文件对象
File file2 = new File(2,"www")
```

File对象可以定位文件和文件夹

File封装的对象仅仅是一个路径名，这个路径可以是存在的，也可以是不存在的。

### **绝对路径和相对路径**

#### 绝对路径：

从盘符开始

```java
File file1 = new File(“D:\\theima\\a.txt”);
```

#### 相对路径：

不带盘符，默认直接到当前工程下的目录寻找文件

```java
File file3 = new File(“模块名\\a.txt”);
```

File类的作用？

**创建对象定位文件，可以删除、获取文件信息等。但是不能读写文件内容。**

2、File类构建对象的方式 ？

**File file = new File(“文件/文件/绝对路径/相对路径”);**

3、绝对路径和相对路径是什么样的？

**绝对路径是带盘符的，依赖当前系统。**

**相对路径是不带盘符的，默认相对到工程下开始寻找文件。**



### File类的常用API

#### 判断文件类型、获取文件信息

| 方法名称                         | 说明                                       |
| -------------------------------- | ------------------------------------------ |
| public  boolean isDirectory()    | 测试此抽象路径名表示的File是否为文件夹     |
| public  boolean isFile()         | 测试此抽象路径名表示的File是否为文件       |
| public  boolean  exists()        | 测试此抽象路径名表示的File是否存在         |
| public  String getAbsolutePath() | 返回此抽象路径名的绝对路径名字符串         |
| public  String getPath()         | 将此抽象路径名转换为路径名字符串           |
| public  String getName()         | 返回由此抽象路径名表示的文件或文件夹的名称 |
| public  long lastModified()      | 返回文件最后修改的时间毫秒值               |

##### 范例

```java
public static void main(String[] args) {
        File file = new File("C:\\code\\data.log");

        // file.isDirectory() 测试此抽象路径名表示的File是否为文件夹 返回boolean
        System.out.println(file.isDirectory());
        //file.isFile()  测试此抽象路径名表示的File是否为文件  返回boolean
        System.out.println(file.isFile());
        //file.exists()  测试此抽象路径名表示的File是否存在 返回boolean
        System.out.println(file.exists());
        // file.getAbsoluteFile() 返回此抽象路径名的绝对路径名字符串
        System.out.println(file.getAbsoluteFile());
        //  file.getPath() 将此抽象路径名转换为路径名字符串
        System.out.println(file.getPath());
        //file.getName() 返回由此抽象路径名表示的文件或文件夹的名称
        System.out.println(file.getName());
        //file.lastModified() 返回文件最后修改的时间毫秒值
        System.out.println(file.lastModified());
        Date data = new Date(file.lastModified());
        SimpleDateFormat simpledataformat = new
        SimpleDateFormat("YY年MM月dd日 HH:mm:ss");
        System.out.println("最后一次修改的时间是：" + simpledataformat.format(data));


    }
```

##### 输出

```java
false
true
true
C:\code\data.log
C:\code\data.log
data.log
1637155753944
最后一次修改的时间是：21年11月17日 21:29:13

```



#### 创建文件、删除文件功能

| 方法名称                       | 说明                 |
| ------------------------------ | -------------------- |
| public boolean createNewFile() | 创建一个新的空的文件 |
| public boolean mkdir()         | 只能创建一级文件夹   |
| public boolean mkdirs()        | 可以创建多级文件夹   |

| 方法名称                 | 说明                                   |
| ------------------------ | -------------------------------------- |
| public  boolean delete() | 删除由此抽象路径名表示的文件或空文件夹 |

delete方法默认只能删除文件和空文件夹。

delete方法直接删除不走回收站

##### 范例

```java
   public static void main(String[] args) {

// file1.mkdir() 创建单级文件夹
    File file1 = new File("C:\\code\\log");
    System.out.println("单级文件夹创建：" + file1.mkdir());

    //file2.createNewFile() 创建一个新的空的文件
    File file2 = new File("C:\\code\\log.txt");
    try {
        System.out.println(file2.createNewFile());
    } catch (IOException e) {
        e.printStackTrace();
    }

    // 创建多级文件夹
    File file3 = new File("C:\\code\\log1\\zz");
    System.out.println("多级文件夹创建：" + file3.mkdirs());

    //删除由此抽象路径名表示的文件或空文件夹   默认只能删除文件和空文件夹
    System.out.println("删除"+file1.delete());
    System.out.println("删除"+file2.delete());
    System.out.println("删除"+file3.delete());

}
```



### 遍历文件夹

#### File类的遍历功能

| 方法名称                        | 说明                                                         |
| ------------------------------- | ------------------------------------------------------------ |
| public String[] list()          | 获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回。 |
| public File[] listFiles()(常用) | 获取当前目录下所有的"一级文件对象"到一个文件**对象数组**中去返回（重点） |

**只能遍历当前文件夹对象下的一级文件对象。**

##### **listFiles方法注意事项：**

当调用者**不存在**时，返回null

当调用者是一个**文件**时，返回null

当调用者是一个**空文件夹**时，返回一个**长度为0**的数组

当调用者是一个有**内容的文件夹**时，将里面所有文件和文件夹的路径放在File数组中返回

当调用者是一个有**隐藏文件的文件夹**时，将里面所有文件和文件夹的路径放在File**数组**中返回，包含隐藏内容

当调用者是一个**需要权限才能进入的文件夹**时，返回null

#### File类相关的API的练习题

需求1：统计一个文件夹中每种文件的个数并打印。

①打印格式如下：

② txt:3个

③ doc:4个

④ jpg:6个

需求2：将某个文件夹下的一级文件对象，按照最近修改时间降序展示，并显示修改时间。

①打印格式如下：

② aaa.txt: 2021-03-22 10:23:23

③ dlei.doc: 2021-03-21 8:23:23

④ meinv.jpg:6个 2008-11-11 11:11:11

```java
public static void main(String[] args) {
        File file = new File("C:\\code");
        File[] s = file.listFiles();
        Date a = new Date();
        SimpleDateFormat simpledataformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Arrays.sort(s, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return o2.lastModified() - o1.lastModified() >= 0 ? 1 : -1;
            }
        });
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i] +"\t\t\t\t"+simpledataformat.format(s[i].lastModified()));

        }

        Map<String, Integer> map = new HashMap<>();
        for (File file1 : s) {
            if (file1.isFile()) {
                String name = file1.getName();
                String[] split = name.split("\\w+\\.");
                if (map.containsKey(split[1])) {
                    Integer count = map.get(split[1]);
                    count = count + 1;
                    map.put(split[1], count);
                } else {
                    map.put(split[1], 1);
                }
            }
        }
        System.out.println(map);


    }
```



## 方法递归

### 递归概述

#### 什么是方法递归?

方法直接调用自己或者间接调用自己的形式称为方法递归（ recursion）。

递归做为一种[算法](https://baike.baidu.com/item/算法)在[程序设计语言](https://baike.baidu.com/item/程序设计语言)中广泛应用。

#### **递归的形式**

直接递归：方法自己调用自己。

间接递归：方法调用其他方法，其他方法又回调方法自己。

**方法递归存在的问题？**

递归如果没有控制好终止，会出现递归死循环，导致栈内存溢出现象



### 递归的算法流程、核心要素

**递归解决问题的思路：**

把一个复杂的问题层层转化为一个**与原问题相似的规模较小**的问题来求解。

**递归算法三要素大体可以总结为：**

**递归的公式：** **f(n) = f(n-1) \* n;**

**递归的终结点：f(1)** 

**递归的方向必须走向终结点：**

```java
public class DiGuiDemo01 {
   public static void main(String[] args) {
     int result = f(5);
     System.out.println("5的阶乘是："+ result);
   }
   public static int f(int n) {
    if(n == 1) {
       return 1;
     } else {
       return n*f(n - 1);
     }
   }
 }
```

#### 非规律化递归案例-文件搜索

需求：文件搜索、从C:盘中，搜索出某个文件名称并输出绝对路径。

分析：

①先定位出的应该是一级文件对象

②遍历全部一级文件对象，判断是否是文件

③如果是文件，判断是否是自己想要的

④如果是文件夹，需要继续递归进去重复上述过程

#### 范例

```java
 public static void main(String[] args) {
        // 2、传入目录 和  文件名称
        searchFile(new File("D:/") , "eDiary.exe");
    }

    /**
     * 1、搜索某个目录下的全部文件，找到我们想要的文件。
     * @param dir  被搜索的源目录
     * @param fileName 被搜索的文件名称
     */
    public static void searchFile(File dir,String fileName){
        // 3、判断dir是否是目录
        if(dir != null && dir.isDirectory()){
            // 可以找了
            // 4、提取当前目录下的一级文件对象
            File[] files = dir.listFiles(); // null  []
            // 5、判断是否存在一级文件对象，存在才可以遍历
            if(files != null && files.length > 0) {
                for (File file : files) {
                    // 6、判断当前遍历的一级文件对象是文件 还是 目录
                    if(file.isFile()){
                        // 7、是不是咱们要找的，是把其路径输出即可
                        if(file.getName().contains(fileName)){
                            System.out.println("找到了：" + file.getAbsolutePath());
                            // 启动它。
                            try {
                                Runtime r = Runtime.getRuntime();
                                r.exec(file.getAbsolutePath());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }else {
                        // 8、是文件夹，需要继续递归寻找
                        searchFile(file, fileName);
                    }
                }
            }
        }else {
            System.out.println("对不起，当前搜索的位置不是文件夹！");
        }
    }
```



#### 非规律化递归案例-啤酒问题

需求：啤酒2元1瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶，

请问10元钱可以喝多少瓶酒，剩余多少空瓶和盖子。

答案：15瓶 3盖子 1瓶子

#### 范例

```java
public class Beer {
    
        // 定义一个静态的成员变量用于存储可以买的酒数量

        public static int totalNumber;
        public static int lastBottleNumber;
        public static int lastCoverNumber;


        public static void main(String[] args) {
            // 1、拿钱买酒
            buy(10);
            System.out.println("总数：" + totalNumber);
            System.out.println("剩余盖子数：" + lastCoverNumber);
            System.out.println("剩余瓶子数：" + lastBottleNumber);
        }

        public static void buy(int money){
            // 2、看可以立马买多少瓶
            int buyNumber = money / 2;
            totalNumber += buyNumber;

            // 3、把盖子 和瓶子换算成钱
            // 统计本轮总的盖子数  和 瓶子数
            int coverNumber = lastCoverNumber + buyNumber;
            int bottleNumber = lastBottleNumber + buyNumber;

            // 统计可以换算的钱
            int allMoney = 0;
            if(coverNumber >= 4){
                allMoney += (coverNumber / 4) * 2;
            }
            lastCoverNumber = coverNumber % 4;

            if(bottleNumber >= 2){
                allMoney += (bottleNumber / 2) * 2;
            }
            lastBottleNumber = bottleNumber % 2;

            if(allMoney >= 2){
                buy(allMoney);
            }

           
        }
    }
```



### 删除文件夹

需求：删除非空文件夹

分析：

①：File默认不可以删除非空文件夹

②：我们需要遍历文件夹，先删除里面的内容，再删除自己。

```java
public class Remove {
    public static void main(String[] args) {

        File file = new File("C:\\code\\log1");
        remove(file);
    }
    public static void remove(File s) {
        if (s.isDirectory()) {
            File[] z = s.listFiles();
            for (File file : z) {
                if (file.isFile()) {
                    file.delete();
                } else {
                    remove(file);
                }
            }
        } else if (s.isFile()) {
            System.out.println("输如有误");
        }
        try {
            s.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```



## 字符集

### 常见字符集介绍

计算机底层不可以直接存储字符的。计算机中底层只能存储**二进制(0、1)**

二进制是可以转换成十进制的

![image-20211119152407903](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211119152407903.png)

#### **ASCII字符集：**

ASCII(American Standard Code for Information Interchange，美国信息交换标准代码)：包括了数字、英文、符号

ASCII使用1个字节存储一个字符，一个字节是8位，总共可以表示128个字符信息，对于英文，数字来说是够用的。

![image-20211119152455169](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211119152455169.png)

#### **GBK：**

window系统默认的码表。兼容ASCII码表，也包含了几万个汉字，并支持繁体汉字以及部分日韩文字

**注意：GBK是中国的码表，一个中文以两个字节的形式存储。但不包含世界上所有国家的文字**

#### **Unicode码表：**

**unicode**（又称统一码、万国码、单一码）是计算机科学领域里的一项业界字符编码标准。

容纳世界上大多数国家的所有常见文字和符号。

由于Unicode会先通过UTF-8，UTF-16，以及 UTF-32的编码成二进制后再存储到计算机，其中最为常见的就是UTF-8。

**注意**

Unicode是万国码，以UTF-8编码后一个中文一般以**三个字节**的形式存储。

UTF-8也要兼容ASCII编码表。

技术人员都应该使用UTF-8的字符集编码。

编码前和编码后的字符集需要一致，否则会出现中文乱码。

![image-20211119152627352](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211119152627352.png)

1.字符串常见的字符底层组成是什么样的？

**英文和数字等在任何国家的字符集中都占1个字节**

**GBK字符中一个中文字符占2个字节**

**UTF-8编码中一个中文1般占3个字节**

2.编码前的字符集和编码好的字符集有什么要求？

**必须一致，否则会出现中文字符乱码**

**英文和数字在任何国家的编码中都不会乱码**



### 字符集的编码、解码操作

#### **String编码**

| 方法名称                             | 说明                                                         |
| ------------------------------------ | ------------------------------------------------------------ |
| byte[ ] getBytes( )                  | 使用平台的默认字符集将该  String编码为一系列字节，将结果存储到新的字节数组中 |
| byte[ ] getBytes(String charsetName) | 使用指定的字符集将该 String编码为一系列字节，将结果存储到新的字节数组中 |

#### **String解码**

| 构造器                                    | 说明                                                         |
| ----------------------------------------- | ------------------------------------------------------------ |
| String(byte[ ] bytes)                     | 通过使用平台的默认字符集解码指定的字节数组来构造新的  String |
| String(byte[ ] bytes, String charsetName) | 通过指定的字符集解码指定的字节数组来构造新的 String          |

##### 范例

```java
public static void main(String[] args) throws UnsupportedEncodingException {
    String s = "我是zwww";

     // 1、编码：把文字转换成字节（使用指定的编码）
    byte[] bytes = s.getBytes("UTF-8");
    System.out.println(bytes.length);
    System.out.println(Arrays.toString(bytes));

    // 2、解码：把字节转换成对应的中文形式（编码前 和 编码后的字符集必须一致，否则乱码 ）

    String rs = new String(bytes, "UTF-8");
    System.out.println(rs);

}
```



## **IO流概述**

**IO流也称为输入、输出流，就是用来读写数据的。**

**I表示intput**，是数据从硬盘文件读入到内存的过程，称之输入，负责读。

**lO表示output**，是内存程序的数据从内存到写出到硬盘文件的过程，称之输出，负责写。

![image-20211119155852048](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211119155852048.png)

### **总结流的四大类:**

**字节输入流**：以内存为基准，来自磁盘文件/网络中的数据**以字节的形式读入**到内存中去的流称为字节输入流。

**字节输出流**：以内存为基准，把内存中的数据**以字节写出**到磁盘文件或者网络中去的流称为字节输出流。

**字符输入流**：以内存为基准，来自磁盘文件/网络中的数据**以字符的形式读入**到内存中去的流称为字符输入流。

**字符输出流**：以内存为基准，把内存中的数据**以字符写出**到磁盘文件或者网络介质中去的流称为字符输出流。

**字节流:   字节输入流，字节输出流（读写字节数数据的）**

**字符流：字符输入流，字符输出流（读写字符数据的）**

![image-20211119160024910](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211119160024910.png)

## 字节流的使用

### 文件字节输入流：每次读取一个字节

![image-20211119160216126](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211119160216126.png)

**文件字节输入流，一个一个字节读数据到内存**

**文件字节输入流：FileInputStream**

作用：以内存为基准，把磁盘文件中的数据以字节的形式读取到内存中去

| 构造器                                   | 说明                               |
| ---------------------------------------- | :--------------------------------- |
| public  FileInputStream(File file)       | 创建字节输入流管道与源文件对象接通 |
| public  FileInputStream(String pathname) | 创建字节输入流管道与源文件路径接通 |

| 方法名称           | 说明                                               |
| ------------------ | :------------------------------------------------- |
| public int  read() | 每次读取一个字节返回，如果字节已经没有可读的返回-1 |

#### 范例

```java
File file = new File("C:\\code\\data.log");
System.out.println(file.exists());
FileInputStream fileInputStream = new FileInputStream(file);
int b = 0;
while (b!=-1) {

     b = fileInputStream.read();

    System.out.print((char) b);
}
System.out.println();
```

#### 每次读取一个字节存在什么问题？

**性能较慢**

**读取中文字符输出无法避免乱码问题。**



### 文件字节输入流：每次读取一个字节数组

**文件字节输入流，一个个字节数组读数据到内存**

**文件字节输入流：FileInputStream**

作用：以内存为基准，把磁盘文件中的数据以字节的形式读取到内存中去。

| 方法名称                            | 说明                                                   |
| ----------------------------------- | ------------------------------------------------------ |
| public **int**  read(byte[] buffer) | 每次读取一个字节数组返回，如果字节已经没有可读的返回-1 |

#### 范例

```java
FileInputStream fileInputStream2 = new FileInputStream(file);
byte[] buffer = new byte[3];
int len = 0;
while (len != -1) {
    len = fileInputStream2.read(buffer);
    //String s = new String(buffer);  通过使用平台的默认字符集解码指定的字节数组来构造新的  String
    String s = new String(buffer);
    System.out.print(s);

}
```

#### 每次读取一个字节数组存在什么问题？

**读取的性能得到了提升**

**读取中文字符输出无法避免乱码问题。**



### 文件字节输入流：一次读完全部字节

1.如何使用字节输入流读取中文内容输出不乱码呢？

**定义一个与文件一样大的字节数组，一次性读取完文件的全部字节。**

2、直接把文件数据全部读取到一个字节数组可以避免乱码，是否存在问题？

**如果文件过大，字节数组可能引起内存溢出。**

#### **方式一**

 自己定义一个字节数组与文件的大小一样大，然后使用读取字节数组的方法，一次性读取完成

| 方法名称                        | 说明                                                   |
| ------------------------------- | ------------------------------------------------------ |
| public int  read(byte[] buffer) | 每次读取一个字节数组返回，如果字节已经没有可读的返回-1 |

##### 范例

```java
FileInputStream fileInputStream4 = new FileInputStream(file);
//创建一个和文件直接一样的数组
byte[] bytes2 =new byte[(int) file.length()];
fileInputStream4.read(bytes2);
String z = new String(bytes2);
System.out.println(z);
```

#### **方式二**

官方为字节输入流InputStream提供了如下API可以直接把文件的全部数据读取到一个字节数组中

| 方法名称                                        | 说明                                                         |
| ----------------------------------------------- | ------------------------------------------------------------ |
| public byte[] readAllBytes() throws IOException | 直接将当前字节输入流对应的文件对象的字节数据装到一个字节数组返回 |

##### 范例

```java
FileInputStream fileInputStream3 = new FileInputStream(file);
//fileInputStream3.readAllBytes()  直接将当前字节输入流对应的文件对象的字节数据装到一个字节数组返回
byte[] bytes = fileInputStream3.readAllBytes();
System.out.println(new String(bytes));
```

1.如何使用字节输入流读取中文内容输出不乱码呢？

**一次性读取完全部字节。**

**可以定义与文件一样大的字节数组读取，也可以使用官方API**

2.直接把文件数据全部读取到一个字节数组可以避免乱码，是否存在问题？

**如果文件过大，定义的字节数组可能引起内存溢出。**



### 文件字节输出流：写字节数据到文件

**文件字节输出流，写字节读数据到磁盘文件**

**文件字节输出流：FileOutputStream**

作用：以内存为基准，把内存中的数据以字节的形式写出到磁盘文件中去的流

| 构造器                                                   | 说明                                           |
| -------------------------------------------------------- | ---------------------------------------------- |
| public FileOutputStream(File file)                       | 创建字节输出流管道与源文件对象接通             |
| public FileOutputStream(File file，boolean append)       | 创建字节输出流管道与源文件对象接通，可追加数据 |
| public FileOutputStream(String filepath)                 | 创建字节输出流管道与源文件路径接通             |
| public FileOutputStream(String filepath，boolean append) | 创建字节输出流管道与源文件路径接通，可追加数据 |

#### **文件字节输出流的API**

| 方法名称                                             | 说明                         |
| ---------------------------------------------------- | ---------------------------- |
| public void write(int a)                             | 写一个字节出去               |
| public void write(byte[] buffer)                     | 写一个字节数组出去           |
| public void write(byte[] buffer , int pos , int len) | 写一个字节数组的一部分出去。 |

#### **流的关闭与刷新** 

| 方法    | 说明                                                         |
| ------- | ------------------------------------------------------------ |
| flush() | 刷新流，还可以继续写数据                                     |
| close() | 关闭流，释放资源，但是在关闭之前会先刷新流。一旦关闭，就不能再写数据 |

字节输出流如何实现写出去的数据能换行

**os.write(“\r\n”.getBytes())**

如何让写出去的数据能成功生效？

**flush()刷新数据**

**close()方法是关闭流，关闭包含刷新，关闭后流不可以继续使用了。**

##### 范例

```java
//创建字节输出流管道与源文件对象接通，可追加数据
FileOutputStream f1 = new FileOutputStream(file,true);
String w = "我是lzy";

// 将字符串w编码为字节数组
byte [] vv = w.getBytes();

//  f1.write(vv) 写一个字节数组出去
f1.write(vv);
//f1.write('a') 写一个字节进去
f1.write('a');
// 换行
f1.write("\t\n".getBytes());
//刷新数据流
f1.flush();
//写数组的一部分
byte[] buffer3 = {'a',97, 98, 99};
f1.write(buffer3, 0 , 3);
f1.write("\r\n".getBytes());
```

#### 文件拷贝

![image-20211119172358828](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211119172358828.png)

1.字节流适合做一切文件数据的拷贝吗？

**任何文件的底层都是字节，拷贝是一字不漏的转移字节，只要前后文件格式、编码一致没有任何问题。**

##### 范例

```java
public static void main(String[] args) {
        try {
            // 1、创建一个字节输入流管道与原视频接通
            InputStream is = new FileInputStream("file-io-app/src/out04.txt");

            // 2、创建一个字节输出流管道与目标文件接通
            OutputStream os = new FileOutputStream("file-io-app/src/out05.txt");

            // 3、定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的字节数。
            while ((len = is.read(buffer)) != -1){
                os.write(buffer, 0 , len);
            }
            System.out.println("复制完成了！");

            // 4、关闭流。
            os.close();
            is.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
```



## 资源释放的方式

### try-catch-finally

**finally**：在异常处理时提供finally块来执行所有清除操作，比如说IO流中的释放资源

特点：被**finally控制的语句最终一定会执行**，除非JVM退出

异常处理标准格式：**try….catch…finally**

#### 范例

```java
public static void main(String[] args) {
        try {
            // 1、创建一个字节输入流管道与原视频接通
            FileInputStream is = new FileInputStream("C:\\code\\data.log");
            // 2、创建一个字节输出流管道与目标文件接通
            FileOutputStream os = new FileOutputStream("C:\\code\\zzz.log");
            // 3、定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的字节数。
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("复制完成了！");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 无论代码是正常结束，还是出现异常都要最后执行这里
            System.out.println("========finally=========");
        }
        System.out.println(test(10, 0));
    }

    public static int test(int a, int b) {
        try {
            int c = a / b;
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return -111111; // 计算出现bug.
        } finally {
            // 哪怕上面有return语句执行，也必须先执行完这里才可以！
            System.out.println("--finally--");

        }
    }
```

### try-with-resource

try-catch-resource的作用

**自动释放资源、代码简洁**

![image-20211119174014882](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211119174014882.png)

JDK 7 以及 JDK 9的()中只能放置资源对象，否则报错

什么是资源呢？

资源都是实现了Closeable/AutoCloseable接口的类对象

```java
public abstract class InputStream implements Closeable {}
```

```java
public abstract class OutputStream implements Closeable, Flushable{} 
```

## 拷贝文件夹

需求：将某个磁盘的文件夹拷贝到另一个文件夹下去，包括文件夹中的全部信息

分析：

①：IO默认不可以拷贝文件夹

②：我们需要遍历文件夹，如果是文件则拷贝过去，如果是文件夹则要进行1-1创建，继续复制内容。

## 字符流

1.字节流读取中文输出会存在什么问题？

**会乱码。或者内存溢出。**

2.读取中文输出，哪个流更合适，为什么？

**字符流更合适，最小单位是按照单个字符读取的。**



### 文件字符输入流

**文件字符输入流，一个一个字符读数据到内存**

**文件字节输出流，写字符读数据到磁盘文件**

#### **文件字符输入流：Reader**

作用：以内存为基准，把磁盘文件中的数据以字符的形式读取到内存中去。

| 构造器                              | 说明                               |
| ----------------------------------- | ---------------------------------- |
| public **FileReader**(File file)    | 创建字符输入流管道与源文件对象接通 |
| public FileReader(String  pathname) | 创建字符输入流管道与源文件路径接通 |

| 方法名称                            | 说明                                                         |
| ----------------------------------- | ------------------------------------------------------------ |
| public int **read**()               | 每次读取一个字符返回，如果字符已经没有可读的返回-1           |
| public int  read(**char[]** buffer) | 每次读取一个字符数组，返回读取的字符个数，如果字符已经没有可读的返回-1 |

##### 范例

```java
public static void main(String[] args) throws IOException {
        File file = new File("C:\\code\\data.log");
        FileReader s = new FileReader(file);
        int z = 0;
        try {
            while ((z = s.read()) != -1) {
                System.out.print((char) z);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();

        FileReader s1 = new FileReader(file);
        char [] b = new char[3];
        while (s1.read(b)!=-1) {

            String st = new  String(b);
            System.out.print(st);
        }
    }
```

字符流的好处。每次读取一个字符存在什么问题？

**读取中文字符不会出现乱码（如果代码文件编码一致）**

**性能较慢**

每次读取一个字符数组的优势？

**读取的性能得到了提升**

**读取中文字符输出不会乱码**



### 文件字符输出流

**文件字符输出流：FileWriter**

作用：以内存为基准，把内存中的数据以字符的形式写出到磁盘文件中去的流

| 构造器                                                 | 说明                                           |
| ------------------------------------------------------ | ---------------------------------------------- |
| public **FileWriter**(File file)                       | 创建字符输出流管道与源文件对象接通             |
| public **FileWriter**(File file，boolean append)       | 创建字符输出流管道与源文件对象接通，可追加数据 |
| public **FileWriter**(String filepath)                 | 创建字符输出流管道与源文件路径接通             |
| public **FileWriter**(String filepath，boolean append) | 创建字符输出流管道与源文件路径接通，可追加数据 |

#### **文件字符输出流的API**

| 方法名称                                       | 说明                 |
| ---------------------------------------------- | -------------------- |
| void  **write**(int c)                         | 写一个字符           |
| void  **write**(char[] cbuf)                   | 写入一个字符数组     |
| void  **write**(char[] cbuf, int off, int len) | 写入字符数组的一部分 |
| void  **write(**String str)                    | 写一个字符串         |
| void  **write**(String str, int off, int len)  | 写一个字符串的一部分 |

#### **流的关闭与刷新** 

| 方法    | 说明                                                         |
| ------- | ------------------------------------------------------------ |
| flush() | 刷新流，还可以继续写数据                                     |
| close() | 关闭流，释放资源，但是在关闭之前会先刷新流。一旦关闭，就不能再写数据 |

实现写出去的数据换行

**fw.write(“\r\n”)**



### 字节流、字符流如何选择使用？

**字节流适合做一切文件数据的拷贝（音视频，文本）**

**字节流不适合读取中文内容输出**

**字符流适合做文本文件的操作（读，写）**

#### 范例

```java
public static void main(String[] args) throws IOException {
        FileWriter s = new FileWriter(new File("C:\\code\\data.log"),true);
        s.write('z');
        s.write("\r\n");
        String st = "我是lzy" ;
        s.write(st);
        s.write("\r\n");
        char[]ch ={95,96,97,94};
        s.write(ch);
        s.write("\r\n");
        s.write(ch,0,3);
        s.flush();

        FileInputStream in = new FileInputStream(new File("C:\\code\\data.log"));
        byte[] buffer = in.readAllBytes();
        System.out.println(new String(buffer));

    }
```



## 缓冲流

### 缓冲流概述

缓冲流也称为高效流、或者高级流。之前的字节流可以称为原始流

**作用：缓冲流自带缓冲区、可以提高原始字节流、字符流读写数据的性能**

![image-20211118212048505](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211118212048505.png)

![image-20211118212243175](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211118212243175.png)

### 字节缓冲流

字节缓冲输入流： Bufferedinputstream 提高字节输入流读取数据的性能，读写功能上并无变化

字节缓冲输出流： Bufferedoutputstream 提高字节输出流读取数据的性能，读写功能上并无变化。

#### 字节缓冲流性能优化原理

字节缓冲输入流自带了8KB缓冲池，以后我们直接从缓冲池读取数据，所以性能较好。
字节缓冲输出流自带了8KB缓冲池，数据就直接写入到缓冲池中去，写数据性能极高了。

| 构造器                                           | 说明                                                         |
| ------------------------------------------------ | ------------------------------------------------------------ |
| public Bufferedinputstream(**Inputstream** is）  | 可以把低级的字节输入流包装成一个高级的缓冲字节输入流管道，从而提高字节输入流读数据的性能 |
| public Bufferedoutputstream(**Outputstream** os) | 可以把低级的字节输出流包装成一个高级的缓冲字节输出流，从而提高写数据的性能 |

```java
		InputStream in = new FileInputStream("C:\\code\\data.log");
        // a.把原始的字节输入流包装成高级的缓冲字节输入流
        InputStream ins = new BufferedInputStream(in);
        OutputStream os = new FileOutputStream("C:\\code\\data.log");
        // b.把字节输出流管道包装成高级的缓冲字节输出流管道
        OutputStream bos = new BufferedOutputStream(os);
```

##### 范例

```java
public static void main(String[] args) {
    try {
        InputStream in = new FileInputStream("C:\\code\\data.log");
        // a.把原始的字节输入流包装成高级的缓冲字节输入流
        InputStream ins = new BufferedInputStream(in);
        OutputStream os = new FileOutputStream("C:\\code\\data.log");
        // b.把字节输出流管道包装成高级的缓冲字节输出流管道
        OutputStream bos = new BufferedOutputStream(os);
        long timeMillis = System.currentTimeMillis();
        File s = new File("C:\\code\\444");
        File z = new File("C:\\code\\www");
        copy(s,z);
        long timeMillis2 = System.currentTimeMillis();
        System.out.println(timeMillis2-timeMillis);

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}

public static void copy(File s, File z) {
    // 1、判断源目录是否存在
    if (s != null && s.exists() && s.isDirectory()) {
        // 2、目标目录需要创建一下  D:\new\resources
        if (z.exists() && z.isDirectory()) {
            // 3、提取原目录下的全部一级文件对象
            File[] files = s.listFiles();
            // 4、判断是否存在一级文件对象
            if (files != null && files.length > 0) {
                // 5、遍历一级文件对象
                for (File file : files) {
                    // 6、判断是文件还是文件夹，是文件直接复制过去
                    if (file.isFile()) {
                        copyFile(file, new File(z, file.getName()));
                    } else {
                        // 7、当前遍历的是文件夹，递归复制
                        copy(file, z);
                    }
                }

            }
        } else {
            z.mkdirs();
            copy(s, z);
        }

    }
}

private static void copyFile(File s, File d) {
    try (
            InputStream in = new FileInputStream(s);
            // a.把原始的字节输入流包装成高级的缓冲字节输入流
            InputStream ins = new BufferedInputStream(in);
            OutputStream os = new FileOutputStream(d);
            // b.把字节输出流管道包装成高级的缓冲字节输出流管道
            OutputStream bos = new BufferedOutputStream(os);
    ) {
        // 3、定义一个字节数组转移数据
        byte[] buffer = new byte[1024];
        int len; // 记录每次读取的字节数。
        while ((len = ins.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
```

**建议使用字节缓冲输入流、字节缓冲输出流，结合字节数组的方式，目前来看是性能最优的组合。**



### 字符缓冲流

字符缓冲输入流： Buffered Reader

字符缓冲輸出流： Bufferedwriter

字符缓冲输入流：BufferedReader。

**作用：提高字符输入流读取数据的性能，除此之外多了按照行读取数据的功能。**

| 构造器                               | 说明                                                         |
| ------------------------------------ | ------------------------------------------------------------ |
| public  BufferedReader(**Reade**r r) | 可以把低级的字符输入流包装成一个高级的缓冲字符输入流管道，从而提高字符输入流读数据的性能 |

**字符缓冲输入流新增功能**

| 方法                          | 说明                                                 |
| ----------------------------- | ---------------------------------------------------- |
| public  **String** readLine() | 读取一行数据返回，如果读取没有完毕，无行可读返回null |



#### **字符缓冲输出流**

字符缓冲输出流：BufferedWriter。

作用：提高字符输出流写取数据的性能，除此之外多了换行功能

| 构造器                               | 说明                                                         |
| ------------------------------------ | ------------------------------------------------------------ |
| public BufferedWriter(**Writer**  w) | 可以把低级的字符输出流包装成一个高级的缓冲字符输出流管道，从而提高字符输出流写数据的性能 |

**字符缓冲输出流新增功能**

| 方法                   | 说明     |
| ---------------------- | -------- |
| public  void newLine() | 换行操作 |

##### 范例

```java
 public static void main(String[] args) throws IOException {
        // 1、创建一个字符输出流管道与目标文件接通
        // 覆盖管道，每次启动都会清空文件之前的数据
        Writer fw = new FileWriter("C:\\code\\www.txt");
        //Writer fw = new FileWriter("io-app2/src/out02.txt", true); // 追加数据
        BufferedWriter bw = new BufferedWriter(fw);

//      a.public void write(int c):写一个字符出去
        bw.write(98);
        bw.write('a');
        bw.write('徐');
        bw.newLine(); // bw.write("\r\n"); // 换行

//       b.public void write(String c)写一个字符串出去
        bw.write("abc我是中国人");
        bw.newLine(); // bw.write("\r\n"); // 换行


//       c.public void write(char[] buffer):写一个字符数组出去
        char[] chars = "abc我是中国人".toCharArray();
        bw.write(chars);
        bw.newLine(); // bw.write("\r\n"); // 换行


//       d.public void write(String c ,int pos ,int len):写字符串的一部分出去
        bw.write("abc我是中国人", 0, 5);
        bw.newLine(); // bw.write("\r\n"); // 换行

//       e.public void write(char[] buffer ,int pos ,int len):写字符数组的一部分出去
        bw.write(chars, 3, 5);
        bw.newLine(); // bw.write("\r\n"); // 换行


        // fw.flush();// 刷新后流可以继续使用
        bw.close(); // 关闭包含刷新，关闭后流不能使用

    }
```



1.字符缓冲流为什么提高了操作数据的性能？

**字符缓冲流自带8K缓冲区**

**可以提高原始字符流读写数据的性能**

2.字符缓冲流的功能如何使用？

**public BufferedReader(Reader r)**

**性能提升了,多了readLine()按照行读取的功能**

**public BufferedWriter(Writer w)**

**性能提升了,多了newLine()换行的功能**



## 转换流

之前我们使用字符流读取中文是否有乱码？

**没有的，因为代码编码和文件编码都是UTF-8。**

2、如果代码编码和文件编码不一致，使用字符流直接读取还能不乱码吗？

**会乱码。**

**文件编码和读取的编码必须一致才不会乱码。**

### 字符输入转换流

1.如果代码编码和文件编码不一致，使用字符流直接读取还能不乱码吗？

**会乱码。**

2、如果如何解决呢？

**使用字符输入转换流**

**可以提取文件（GBK）的原始字节流，原始字节不会存在问题。**

**然后把字节流以指定编码转换成字符输入流，这样字符输入流中的字符就不乱码了**

字符输入转换流：InputStreamReader，可以把原始的字节流按照指定编码转换成字符输入流。

| 构造器                                                       | 说明                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| public InputStreamReader(**InputStream** is)                 | 可以把原始的字节流按照代码默认编码转换成字符输入流。几乎不用，与默认的FileReader一样。 |
| public InputStreamReader(**InputStream** is ，**String charset**) | 可以把原始的字节流按照指定编码转换成字符输入流，这样字符流中的字符就不乱码了**(重点)** |

1.字符输入转换流InputStreamReader作用：

**可以解决字符流读取不同编码乱码的问题**

**public InputStreamReader(InputStream is,String charset):**

**可以指定编码把原始字节流转换成字符流，如此字符流中的字符不乱码**

#### 范例

```java
 public static void main(String[] args) throws Exception {
        // 代码UTF-8   文件 GBK  "D:\\resources\\data.txt"
        // 1、提取GBK文件的原始字节流。   abc 我
        //                            ooo oo
        InputStream is = new FileInputStream("D:\\resources\\data.txt");
        // 2、把原始字节流转换成字符输入流
        // Reader isr = new InputStreamReader(is); // 默认以UTF-8的方式转换成字符流。 还是会乱码的  跟直接使用FileReader是一样的
        Reader isr = new InputStreamReader(is , "GBK"); // 以指定的GBK编码转换成字符输入流  完美的解决了乱码问题

        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
```

### 字符输出转换流

如果需要控制写出去的字符使用的编码，怎么办？

**可以把字符以指定编码获取字节后再使用字节输出流写出去：**

**“我爱你中国”.getBytes(编码)**

**也可以使用字符输出转换流实现。**

**字符输出转换流**

字符输入转换流：OutputStreamWriter，可以把字节输出流按照指定编码转换成字符输出流。

| 构造器                                                      | 说明                                                         |
| ----------------------------------------------------------- | ------------------------------------------------------------ |
| public OutputStreamWriter(OutputStream os)                  | 可以把原始的字节输出流按照代码默认编码转换成字符输出流。几乎不用。 |
| public OutputStreamWriter(OutputStream os，String  charset) | 可以把原始的字节输出流按照指定编码转换成字符输出流(重点)     |

#### 范例

```java
public static void main(String[] args) throws Exception {
        // 1、定义一个字节输出流
        OutputStream os = new FileOutputStream("io-app2/src/out03.txt");

        // 2、把原始的字节输出流转换成字符输出流
        // Writer osw = new OutputStreamWriter(os); // 以默认的UTF-8写字符出去 跟直接写FileWriter一样
        Writer osw = new OutputStreamWriter(os , "GBK"); // 指定GBK的方式写字符出去

        // 3、把低级的字符输出流包装成高级的缓冲字符输出流。
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("我爱中国1~~");
        bw.write("我爱中国2~~");
        bw.write("我爱中国3~~");

        bw.close();
    }
```

## **序列化对象**

### 对象序列化

作用：以内存为基准，把内存中的对象存储到磁盘文件中去，称为对象序列化。

使用到的流是对象字节输出流：ObjectOutputStream

| 构造器                                               | 说明                                       |
| ---------------------------------------------------- | ------------------------------------------ |
| public **ObjectOutputStream**(**OutputStream**  out) | 把低级字节输出流包装成高级的对象字节输出流 |

#### **ObjectOutputStream序列化方法**

| 方法名称                                          | 说明                                 |
| ------------------------------------------------- | ------------------------------------ |
| public final void **writeObject**(**Object** obj) | 把对象写出去到对象序列化流的文件中去 |

**对象如果要序列化，必须实现Serializable序列化接口。**

### 对象反序列化

使用到的流是对象字节输入流：ObjectInputStream

作用：以内存为基准，把存储到磁盘文件中去的对象数据恢复成内存中的对象，称为对象反序列化

| 构造器                                             | 说明                                       |
| -------------------------------------------------- | ------------------------------------------ |
| public **ObjectInputStream**(**InputStream**  out) | 把低级字节输如流包装成高级的对象字节输入流 |

**ObjectInputStream序列化方法**

| 方法名称                        | 说明                                                 |
| ------------------------------- | ---------------------------------------------------- |
| public  **Object readObject**() | 把存储到磁盘文件中去的对象数据恢复成内存中的对象返回 |

#### 范例

```java
/**
     对象如果要序列化，必须实现Serializable序列化接口。
     可以申明序列化的版本号码
     序列化的版本号与反序列化的版本号必须一致才不会出错！
     private static final long serialVersionUID = 1;
 */
public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s = new Student("lzy",22,4);
        ObjectOutputStream s1 = new ObjectOutputStream(new FileOutputStream("C:\\code\\www.txt"));
        s1.writeObject(s);
        s1.close();

        // 1、创建对象字节输入流管道包装低级的字节输入流管道
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("C:\\code\\www.txt"));

        // 2、调用对象字节输入流的反序列化方法
        Student s2 = (Student) is.readObject();

        System.out.println(s);
    }
```



## **打印流**

### PrintStream、PrintWriter

作用：打印流可以实现方便、高效的打印数据到文件中去。打印流一般是指：PrintStream，PrintWriter两个类。

可以实现打印什么数据就是什么数据，例如打印整数97写出去就是97，打印boolean的true，写出去就是true

#### **PrintStream**

| 构造器                                  | 说明                         |
| --------------------------------------- | ---------------------------- |
| public PrintStream(**OutputStream** os) | 打印流直接通向字节输出流管道 |
| public PrintStream(**File** f)          | 打印流直接通向文件对象       |
| public PrintStream(**String** filepath) | 打印流直接通向文件路径       |

| 方法                       | 说明                   |
| -------------------------- | ---------------------- |
| public void print(Xxx  xx) | 打印任意类型的数据出去 |

#### **PrintWriter**

| 构造器                                   | 说明                         |
| ---------------------------------------- | ---------------------------- |
| public PrintWriter(**OutputStream** os)  | 打印流直接通向字节输出流管道 |
| public PrintWriter (**Writer** w)        | 打印流直接通向字符输出流管道 |
| public PrintWriter (**File** f)          | 打印流直接通向文件对象       |
| public PrintWriter (**String** filepath) | 打印流直接通向文件路径       |

| 方法                       | 说明                   |
| -------------------------- | ---------------------- |
| public void print(Xxx  xx) | 打印任意类型的数据出去 |

##### 范例

```java
public static void main(String[] args) throws Exception {
        // 打印功能上与PrintStream的使用没有区别
        PrintWriter ps = new PrintWriter("C:\\code\\www.txt");
        ps.println(97);
        ps.println('a');
        ps.println(23.3);
        ps.println(true);
        ps.println("我是打印流输出的，我是啥就打印啥");

        ps.close();
    }
```



### **PrintStream PrintWriter区别**

打印数据功能上是一模一样的，都是使用方便，性能高效（核心优势）

PrintStream继承自字节输出流OutputStream，支持写字节数据的方法。

PrintWriter继承自字符输出流Writer，支持写字符数据出去。



### 输出语句的重定向

属于打印流的一种应用，可以把输出语句的打印位置改到文件。

```java
public static void main(String[] args) throws Exception {
    System.out.println("锦瑟无端五十弦");
    System.out.println("一弦一柱思华年");

    // 改变输出语句的位置（重定向）
    PrintStream ps = new PrintStream("C:\\code\\www.txt");
    // 把系统打印流改成我们自己的打印流
    System.setOut(ps);
	//打印到文件中
    System.out.println("庄生晓梦迷蝴蝶");
    System.out.println("望帝春心托杜鹃");
}
```



## **Properties**

![image-20211119234301795](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211119234301795.png)

### **Properties属性集对象**

其实就是一个Map集合，但是我们一般不会当集合使用，因为HashMap更好用

### **Properties核心作用：**

Properties代表的是一个属性文件，可以把自己对象中的键值对信息存入到一个属性文件中去。

属性文件：后缀是**.properties**结尾的文件,里面的内容都是 **key=value**，后续做系统配置信息的

### **Properties的API:**

| 构造器                                                   | 说明                                                         |
| :------------------------------------------------------- | :----------------------------------------------------------- |
| void load(**InputStream** inStream)                      | 从输入字节流读取属性列表（键和元素对）                       |
| void  load(**Reader** reader)                            | 从输入字符流读取属性列表（键和元素对）                       |
| void  store(**OutputStream** out, **String** comments)   | 将此属性列表（键和元素对）写入此  Properties表中，以适合于使用 load(InputStream)方法的格式写入输出字节流 |
| void  **store**(**Writer** writer, **String** comments)  | 将此属性列表（键和元素对）写入此  Properties表中，以适合使用 load(Reader)方法的格式写入输出字符流 |
| public **Object setProperty**(String  key, String value) | 保存键值对（put）                                            |
| public **String** **getProperty**(String  key)           | 使用此属性列表中指定的键搜索属性值  (get)                    |
| public **Set< String >** stringPropertyNames()           | 所有键的名称的集合 (keySet())                                |

**可以存储Properties属性集的键值对数据到属性文件中去：**

**void store(Writer** **writer, String comments)**

**可以加载属性文件中的数据到Properties对象中来：**

**void load(Reader reader)**

#### 范例

```java
 Properties的方法：
         -- public Object setProperty(String key, String value) ： 保存一对属性。  (put)
         -- public String getProperty(String key) : 使用此属性列表中指定的键搜索属性值 (get)
         -- public Set<String> stringPropertyNames() : 所有键的名称的集合  (keySet())
         -- public void store(OutputStream out, String comments): 保存数据到属性文件中去
         -- public void store(Writer fw, String comments): 保存数据到属性文件中去


```

```java
public static void main(String[] args) throws Exception {
    // 需求：使用Properties把键值对信息存入到属性文件中去。
    Properties properties = new Properties();
    properties.setProperty("admin", "123456");
    properties.setProperty("dlei", "003197");
    properties.setProperty("heima", "itcast");
    System.out.println(properties);

    /**
     参数一：保存管道 字符输出流管道
     参数二：保存心得
     */
    properties.store(new FileWriter("C:\\code\\www.txt")
            , "this is users!! i am very happy! give me 100!");

}
```



## 多线程

### **什么是线程？**

线程(thread)是一个程序内部的一条执行路径。

我们之前启动程序执行后，main方法的执行其实就是一条单独的执行路径。

程序中如果只有一条执行路径，那么这个程序就是单线程的程序。

### **多线程是什么？**

多线程是指从软硬件上实现多条执行流程的技术。



### 学习目标

![image-20211120133033315](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120133033315.png)



## **多线程的创建**

### 方式一：继承Thread类

**Thread类**

Java是通过java.lang.Thread 类来代表线程的。 

按照面向对象的思想，Thread类应该提供了实现多线程的方式。

#### 实现

①定义一个子类MyThread继承线程类java.lang.Thread，重写run()方法

②创建MyThread类的对象

③调用线程对象的start()方法启动线程（启动后还是执行run方法的）

##### 范例

```java
public static void main(String[] args) {
        // 3、new一个新线程对象
        Thread t = new MyThread();
        // 4、调用start方法启动线程（执行的还是run方法）
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出：" + i);
        }

    }
}

/**
   1、定义一个线程类继承Thread类
 */
class MyThread extends Thread{
    /**
       2、重写run方法，里面是定义线程以后要干啥
     */
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行输出：" + i);
        }
    }
```



#### **方式一优缺点**

优点：编码简单

缺点：线程类已经继承Thread，无法继承其他类，不利于扩展。

#### 思考

1、为什么不直接调用了run方法，而是调用start启动线程。

**直接调用run方法会当成普通方法执行，此时相当于还是单线程执行。**

**只有调用start方法才是启动一个新的线程执行。**

2、把主线程任务放在子线程之前了。

**这样主线程一直是先跑完的，相当于是一个单线程的效果了**

##### 

### 方式二：实现Runnable接口

①定义一个线程任务类MyRunnable实现Runnable接口，重写run()方法

②创建MyRunnable任务对象

③把MyRunnable任务对象交给Thread处理。

④调用线程对象的start()方法启动线程

| 构造器                                        | 说明                                         |
| --------------------------------------------- | -------------------------------------------- |
| public Thread(String name)                    | 可以为当前线程指定名称                       |
| public Thread(Runnable target)                | 封装Runnable对象成为线程对象                 |
| public Thread(Runnable target ，String name ) | 封装Runnable对象成为线程对象，并指定线程名称 |

#### 范例

```java
 public static void main(String[] args) {
        // 3、创建一个任务对象
        Runnable target = new MyRunnable();
        // 4、把任务对象交给Thread处理
        Thread t = new Thread(target);
        // Thread t = new Thread(target, "1号");
        // 5、启动线程
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行输出：" + i);
        }
    }
}

/**
   1、定义一个线程任务类 实现Runnable接口
 */
class MyRunnable  implements Runnable {
    /**
       2、重写run方法，定义线程的执行任务的
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程执行输出：" + i);
        }
    }
```



#### **方式二优缺点：**

优点：线程任务类只是实现接口，可以继续继承类和实现接口，扩展性强。

缺点：编程多一层对象包装，如果线程有执行结果是不可以直接返回的。

#### **实现Runnable接口(匿名内部类形式)**

①可以创建Runnable的匿名内部类对象。

②交给Thread处理。

③调用线程对象的start()启动线程。

##### 范例

```java
public static void main(String[] args) {
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程1执行输出：" + i);
                }
            }
        };
        Thread t = new Thread(target);
        t.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程2执行输出：" + i);
                }
            }
        }).start();

        new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程3执行输出：" + i);
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行输出：" + i);
        }
    }
```



### 方式三：实现Callable接口

1、前2种线程创建方式都存在一个问题：

**他们重写的run方法均不能直接返回结果。**

**不适合需要返回线程执行结果的业务场景。**

2、怎么解决这个问题呢？

**JDK 5.0提供了Callable和utureTask来实现。**

**这种方式的优点是：可以得到线程执行的结果。**



#### 实现

①得到任务对象

1.定义类实现Callable接口，重写call方法，封装要做的事情。

2.用FutureTask把Callable对象封装成线程任务对象。

②把线程任务对象交给Thread处理。

③调用Thread的start方法启动线程，执行任务

④线程执行完毕后、通过FutureTask的get方法去获取任务执行的结果。

#### **FutureTask的API**

| 方法名称                           | 说明                                 |
| ---------------------------------- | ------------------------------------ |
| public FutureTask<>(Callable call) | 把Callable对象封装成FutureTask对象。 |
| public V get() throws Exception    | 获取线程执行call方法返回的结果。     |

##### 范例

```java
public class ThreadDemo3 {
    public static void main(String[] args) {
        // 3、创建Callable任务对象
        Callable<String> call = new MyCallable(100);
        // 4、把Callable任务对象 交给 FutureTask 对象
        //  FutureTask对象的作用1： 是Runnable的对象（实现了Runnable接口），可以交给Thread了
        //  FutureTask对象的作用2： 可以在线程执行完毕之后通过调用其get方法得到线程执行完成的结果
        FutureTask<String> f1 = new FutureTask<>(call);
        // 5、交给线程处理
        Thread t1 = new Thread(f1);
        // 6、启动线程
        t1.start();


        Callable<String> call2 = new MyCallable(200);
        FutureTask<String> f2 = new FutureTask<>(call2);
        Thread t2 = new Thread(f2);
        t2.start();

        try {
            // 如果f1任务没有执行完毕，这里的代码会等待，直到线程1跑完才提取结果。
            String rs1 = f1.get();
            System.out.println("第一个结果：" + rs1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // 如果f2任务没有执行完毕，这里的代码会等待，直到线程2跑完才提取结果。
            String rs2 = f2.get();
            System.out.println("第二个结果：" + rs2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
    1、定义一个任务类 实现Callable接口  应该申明线程任务执行完毕后的结果的数据类型
 */
class MyCallable implements Callable<String>{
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }

    /**
       2、重写call方法（任务方法）
     */
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return "子线程执行的结果是：" + sum;
    }
}
```



#### **方式三优缺点：**

优点：线程任务类只是实现接口，可以继续继承类和实现接口，扩展性强。

**可以在线程执行完毕后去获取线程执行的结果。**

缺点：编码复杂一点。



## 3种方式对比

| 方式             | 优点                                                         | 缺点                                                   |
| ---------------- | ------------------------------------------------------------ | ------------------------------------------------------ |
| 继承Thread类     | 编程比较简单，可以直接使用Thread类中的方法                   | 扩展性较差，不能再继承其他的类，不能返回线程执行的结果 |
| 实现Runnable接口 | 扩展性强，实现该接口的同时还可以继承其他的类。               | 编程相对复杂，不能返回线程执行的结果                   |
| 实现Callable接口 | 扩展性强，实现该接口的同时还可以继承其他的类。可以得到线程执行的结果 | 编程相对复杂                                           |



## **Thread的常用方法**

Thread常用方法：**获取线程名称getName()、设置名称setName()、获取当前线程对象currentThread()。**

至于Thread类提供的诸如：**yield、join、interrupt、不推荐的方法 stop 、守护线程、线程优先级等线程的控制方法**

当有很多线程在执行的时候，我们怎么去区分这些线程呢？

**此时需要使用Thread的常用方法：getName()、setName()、currentThread()等。**



### Thread常用方法、构造器

| 方法名称                                | 说明                                          |
| --------------------------------------- | --------------------------------------------- |
| String  getName()                       | 获取当前线程的名称，默认线程名称是Thread-索引 |
| void  setName(String  name)             | 设置线程名称                                  |
| public  static Thread currentThread()： | 返回对当前正在执行的线程对象的引用            |
| public  static void sleep(long time)    | 让线程休眠指定的时间，单位为毫秒。            |
| public  void run()                      | 线程任务方法                                  |
| public  void start()                    | 线程启动方法                                  |

| 构造器                                         | 说明                                       |
| ---------------------------------------------- | ------------------------------------------ |
| public  Thread(String name)                    | 可以为当前线程指定名称                     |
| public  Thread(Runnable target)                | 把Runnable对象交给线程对象                 |
| public  Thread(Runnable target ，String name ) | 把Runnable对象交给线程对象，并指定线程名称 |



#### **Thread获取和设置线程名称**

| 方法名称                    | 说明                                                         |
| --------------------------- | ------------------------------------------------------------ |
| String  getName()           | 获取当前线程的名称，默认线程名称是Thread-索引                |
| void  setName(String  name) | 将此线程的名称更改为指定的名称，通过构造器也可以设置线程名称 |



#### **Thread类获得当前线程的对象**

| 方法名称                                | 说明                               |
| --------------------------------------- | ---------------------------------- |
| public  static Thread currentThread()： | 返回对当前正在执行的线程对象的引用 |

1、此方法是Thread类的静态方法，可以直接使用Thread类调用。

2、这个方法是在哪个线程执行中调用的，就会得到哪个线程对象。

##### 范例

```java
public class MethodDemo {

    public static void main(String[] args) {
        // t1.setName("1号");
        Thread t1 = new MyThread("1号");

        t1.start();
        System.out.println(t1.getName());
        // t2.setName("2号");
        Thread t2 = new MyThread("2号");
        t2.start();
        System.out.println(t2.getName());


        // 哪个线程执行它，它就得到哪个线程对象（当前线程对象）
        // 主线程的名称就叫main
        Thread m = Thread.currentThread();
        System.out.println(m.getName());
        m.setName("最牛的线程");

        for (int i = 0; i < 5; i++) {
            System.out.println( m.getName() + "输出：" + i);
        }
    }
    }

class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        // 为当前线程对象设置名称，送给父类的有参数构造器初始化名称
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println( Thread.currentThread().getName() + "输出：" + i);
        }
    }
}
```



#### **Thread类的线程休眠方法**

| 方法名称                             | 说明                                               |
| ------------------------------------ | -------------------------------------------------- |
| public  static void sleep(long time) | 让当前线程休眠指定的时间后再继续执行，单位为毫秒。 |

##### 范例

```java
public static void main(String[] args) throws Exception {
    for (int i = 1; i <= 5; i++) {
        System.out.println("输出：" + i);
        if(i == 3){
            // 让当前线程进入休眠状态
            Thread.sleep(3000);
        }
    }
}
```



## **线程安全**

### 线程安全问题是什么、发生的原因

#### **线程安全问题**

多个线程同时操作同一个共享资源的时候可能会出现业务安全问题，称为线程安全问题

#### 线程安全问题出现的原因

**存在多线程并发**

**同时访问共享资源**

**存在修改共享资源**



### 线程安全问题案例模拟

#### 取钱模型演示

需求：小明和小红是一对夫妻，他们有一个共同的账户，余额是10万元。

如果小明和小红同时来取钱，而且2人都要取钱10万元，可能出现什么问题呢

![image-20211120145926738](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120145926738.png)



##### 范例

```java
public class Demo {
    public static void main(String[] args) {
        Accout a =new Accout("acount",10000);
        new TreadWithdrawMoney(a , "zzz").start();
        new TreadWithdrawMoney(a , "ccc").start();


    }
}
```

```java
public class Accout {
    private String name;
    private int money;

    public Accout() {
    }

    public Accout(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public void drawMoney(int money) {
        // 0、先获取是谁来取钱，线程的名字就是人名
        String name = Thread.currentThread().getName();
        // 1、判断账户是否够钱
        if (this.money >= money) {
            // 2、取钱
            System.out.println(name + "来取钱成功，吐出：" + money);
            // 3、更新余额
            this.money -= money;
            System.out.println(name + "取钱后剩余：" + this.money);
        } else {
            // 4、余额不足
            System.out.println(name + "来取钱，余额不足！");
        }
    }
}
```

```java
public class DrawThread extends Thread {
    // 接收处理的账户对象
    private Account acc;
    public DrawThread(Account acc,String name){
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        // 取钱
        acc.drawMoney(100000);
    }
```

##### 输出

```java
zzz来取钱成功，吐出：10000
ccc来取钱成功，吐出：10000
zzz取钱后剩余：0
ccc取钱后剩余：-10000

```



## **线程同步**

### 线程同步的核心思想

**加锁**，把共享资源进行上锁，每次只能一个线程进入访问完毕以后解锁，然后其他线程才能进来

![image-20211120153609802](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120153609802.png)

### 方式一：同步代码块

作用：把出现线程安全问题的核心代码给上锁。

原理：每次只能一个线程进入，执行完毕后自动解锁，其他线程才可以进来执行

#### 格式

```java
synchronized(同步锁对象) {
    操作共享资源的代码(核心代码)
}
```

**锁对象用任意唯一的对象好不好呢?**

不好，会影响其他无关线程的执行。

#### **锁对象的规范要求**

规范上：建议使用共享资源作为锁对象。

对于**实例方法**建议使用**this**作为锁对象。

对于**静态方法**建议使用**字节码（类名.class）**对象作为锁对象

##### 范例

```java
public void drawMoney(double money) {
    // 1、拿到是谁来取钱
    String name = Thread.currentThread().getName();
    // 同步代码块
    // 小明 小红
    // this == acc 共享账户
    synchronized (this) {
        // 2、判断余额是否足够
        if(this.money >= money){
            // 钱够了
            System.out.println(name+"来取钱，吐出：" + money);
            // 更新余额
            this.money -= money;
            System.out.println(name+"取钱后，余额剩余：" + this.money);
        }else{
            // 3、余额不足
            System.out.println(name+"来取钱，余额不足！");
        }
    }
}
```



### 方式二：同步方法

作用：把出现线程安全问题的核心方法给上锁。

原理：每次只能一个线程进入，执行完毕以后自动解锁，其他线程才可以进来执行。

#### 格式

```java
修饰符 synchronized 返回值类型 方法名称(形参列表) {
		操作共享资源的代码
}

```

#### **同步方法底层原理**

同步方法其实底层也是有**隐式锁对象**的，只是锁的**范围是整个方法代码**。

如果方法是**实例方法**：同步方法**默认用this作为的锁对象**。但是代码要**高度面向对象**！

如果方法是**静态方法**：同步方法**默认用类名.class**作为的锁对象。

##### 范例

```java
public synchronized void drawMoney(double money) {
    // 1、拿到是谁来取钱
    String name = Thread.currentThread().getName();
    // 2、判断余额是否足够
    // 小明  小红
    if(this.money >= money){
        // 钱够了
        System.out.println(name+"来取钱，吐出：" + money);
        // 更新余额
        this.money -= money;
        System.out.println(name+"取钱后，余额剩余：" + this.money);
    }else{
        // 3、余额不足
        System.out.println(name+"来取钱，余额不足！");
    }
}
```



是同步代码块好还是同步方法好一点？

**同步代码块锁的范围更小，同步方法锁的范围更大。**



### 方式三：Lock锁

为了更清晰的表达如何加锁和释放锁，JDK5以后提供了一个新的锁对象Lock,更加灵活、方便
Lock实现提供比使用 synchronized方法和语句可以获得更广泛的锁定操作。
Lock是接口不能直接实例化，这里采用它的实现类 Reentrantlock来构建Lock锁对象。

| 方法名称               | 说明                   |
| ---------------------- | ---------------------- |
| public ReentrantLock() | 获得Lock锁的实现类对象 |

```java
// final修饰后：锁对象是唯一和不可替换的，非常专业
private final Lock lock = new ReentrantLock();
```



#### **Lock的API**

| 方法名称       | 说明   |
| -------------- | ------ |
| void lock()    | 获得锁 |
| void  unlock() | 释放锁 |

##### 范例

```java
public void drawMoney(double money) {
    // 1、拿到是谁来取钱
    String name = Thread.currentThread().getName();
    // 2、判断余额是否足够
    // 小明  小红
    lock.lock(); // 上锁
    try {
        if(this.money >= money){
            // 钱够了
            System.out.println(name+"来取钱，吐出：" + money);
            // 更新余额
            this.money -= money;
            System.out.println(name+"取钱后，余额剩余：" + this.money);
        }else{
            // 3、余额不足
            System.out.println(name+"来取钱，余额不足！");
        }
    } finally {
        lock.unlock(); // 解锁
    }

}
```



## **线程通信**

### 什么是线程通信、如何实现？

所谓线程通信就是线程间相互发送数据，线程间共享一个资源即可实现线程通信线程通信

### 常见形式

通过共享一个数据的方式实现。

根据共享数据的情況决定自己该怎么做，以及通知其他线程怎么做。

### 线程通信实际应用场景

生产者与消费者模型：生产者线程负责生产数据，消费者线程负责消费生产者产生的数据

要求：生产者线程生产完数据后唤醒消费者，然后等待自己，消费者消费完该数据后唤醒生产者，然后等待自己

### **线程通信案例模拟**

模拟客服系统，系统可以不断的接入电话 和 分发给客服。

![image-20211120160239776](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120160239776.png)



线程通信的前提：线程通信通常是在多个线程操作同一个共享资源的时候需要进行通信，且要保证线程安全



### **Object类的等待和唤醒方法：**

| 方法名称         |                             说明                             |
| ---------------- | :----------------------------------------------------------: |
| void  wait()     | 让当前线程等待并释放所占锁，直到另一个线程调用notify()方法或 notifyAll()方法 |
| void  notify()   |                    唤醒正在等待的单个线程                    |
| void notifyAll() |                    唤醒正在等待的所有线程                    |

上述方法应该使用当前同步锁对象进行调用。



## **线程池[重点]**

### 线程池概述

#### **什么是线程池？**

线程池就是一个可以复用线程的技术。

#### **不使用线程池的问题** 

如果用户每发起一个请求，后台就创建一个新线程来处理，下次新任务来了又要创建新线程，而创建新线程的开销是很大的，这样会严重影响系统的性能。

#### 工作原理

![image-20211120161526499](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120161526499.png)



当任务队列有任务排队时 工作线程会先处理先排队的任务，处理完之后按排队队列顺序执行任务



### 线程池实现的API、参数说明

#### 谁代表线程池？

JDK5.0起提供了代表线程池的接口： Executorservice

#### 如何得到线程池对象

方式一：使用 Executorservicel的实现类 Threadpoolexecutor自创建一个线程池对象
![image-20211120161648514](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120161648514.png)
方式二：使用 Executors（线程池的工具类)调用方法返回不同特点的线程池对象



#### **ThreadPoolExecutor**构造器的参数说明

```java
public ThreadPoolExecutor(int corePoolSize,                          						   int maximumPoolSize,
						  long keepAliveTime,
						  TimeUnit unit,
						  BlockingQueue<Runnable> workQueue,                          			 ThreadFactory threadFactory,                         					RejectedExecutionHandler handler) 

```

参数一：指定线程池的线程数量（核心线程）： corePoolSize	不能小于0

参数二：指定线程池可支持的最大线程数：maximumPoolSize  最大数量 >= 核心线程数量

参数三：指定临时线程的最大存活时间： keepAliveTime			不能小于0

参数四：指定存活时间的单位(秒、分、时、天)： unit				  时间单位

参数五：指定任务队列： workQueue											 不能为null

参数六：指定用哪个线程工厂创建线程： threadFactory				不能为null

参数七：指定线程忙，任务满的时候，新任务来了怎么办： handler		不能为null

##### 范例

```java
ExecutorService pools = new ThreadPoolExecutor(3, 5, 
8 , TimeUnit.SECONDS, new ArrayBlockingQueue<>(6),                     Executors.defaultThreadFactory() , new ThreadPoolExecutor.AbortPolicy());

```



### **线程池常见面试题**

#### **临时线程什么时候创建啊？**

新任务提交时发现核心线程都在忙，任务队列也满了，并且还可以创建临时线程，此时才会创建临时线程

#### **什么时候会开始拒绝任务？**

核心线程和临时线程都在忙，任务队列也满了，新的任务过来的时候才会开始任务拒绝。



### **ExecutorService的常用方法**

| 方法名称                                                     | 说明                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| void execute(Runnable command)                               | 执行任务/命令，没有返回值，一般用来执行  Runnable 任务       |
| Future< T >  submit(Callable< T > task)                      | 执行任务，返回未来任务对象获取线程结果，一般拿来执行  Callable 任务 |
| void  shutdown()                                             | 等任务执行完毕后关闭线程池                                   |
| [List](mk:@MSITStore:D:\course\jdk-11中文api修订版.CHM::/java.base/java/util/List.html)< Runnable> shutdownNow() | 立刻关闭，停止正在执行的任务，并返回队列中未执行的任务       |

#### **新任务拒绝策略**

| 策略                                   | 详解                                                         |
| -------------------------------------- | ------------------------------------------------------------ |
| ThreadPoolExecutor.AbortPolicy         | 丢弃任务并抛出RejectedExecutionException异常。**是默认的策略** |
| ThreadPoolExecutor.DiscardPolicy：     | 丢弃任务，但是不抛出异常  这是不推荐的做法                   |
| ThreadPoolExecutor.DiscardOldestPolicy | 抛弃队列中等待最久的任务  然后把当前任务加入队列中           |
| ThreadPoolExecutor.CallerRunsPolicy    | 由主线程负责调用任务的run()方法从而绕过线程池直接执行        |



### 线程池处理Runnable任务

**使用ExecutorService的方法：**

**void execute(Runnable target)**

#### 范例

```java
public static void main(String[] args) {
        // 1、创建线程池对象
        /**
         public ThreadPoolExecutor(int corePoolSize,
                                 int maximumPoolSize,
                                 long keepAliveTime,
                                 TimeUnit unit,
                                 BlockingQueue<Runnable> workQueue,
                                 ThreadFactory threadFactory,
                                 RejectedExecutionHandler handler)
         */
        ExecutorService pool = new ThreadPoolExecutor(3, 5 ,
                6, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5) , Executors.defaultThreadFactory(),
               new ThreadPoolExecutor.AbortPolicy() );

        // 2、给任务线程池处理。
        Runnable target = new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        // 创建临时线程
        pool.execute(target);
        pool.execute(target);
//        // 不创建，拒绝策略被触发！！！
//        pool.execute(target);

        // 关闭线程池（开发中一般不会使用）。
        // pool.shutdownNow(); // 立即关闭，即使任务没有完成，会丢失任务的！
        pool.shutdown(); // 会等待全部任务执行完毕之后再关闭（建议使用的）
    }
```



### 线程池处理Callable任务

**使用ExecutorService的方法：**

**Future< T > submit(Callable< T > command)**

#### 范例

```java
public static void main(String[] args) throws Exception {
        // 1、创建线程池对象
        /**
         public ThreadPoolExecutor(int corePoolSize,
                                 int maximumPoolSize,
                                 long keepAliveTime,
                                 TimeUnit unit,
                                 BlockingQueue<Runnable> workQueue,
                                 ThreadFactory threadFactory,
                                 RejectedExecutionHandler handler)
         */
        ExecutorService pool = new ThreadPoolExecutor(3, 5 ,
                6, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5) , Executors.defaultThreadFactory(),
               new ThreadPoolExecutor.AbortPolicy() );

        // 2、给任务线程池处理。
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));
        Future<String> f5 = pool.submit(new MyCallable(500));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
        System.out.println(f5.get());
    }
```



## Executors工具类实现线程池

### **Executors得到线程池对象的常用方法**

Executors：线程池的工具类通过调用方法返回不同类型的线程池对象

| 方法名称                                                     | 说明                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| public  static [ExecutorService](mk:@MSITStore:D:\course\jdk-11中文api修订版.CHM::/java.base/java/util/concurrent/ExecutorService.html) newCachedThreadPool() | 线程数量随着任务增加而增加，如果线程任务执行完毕且空闲了一段时间则会被回收掉。 |
| public static [ExecutorService](mk:@MSITStore:D:\course\jdk-11中文api修订版.CHM::/java.base/java/util/concurrent/ExecutorService.html) newFixedThreadPool(int nThreads) | 创建固定线程数量的线程池，如果某个线程因为执行异常而结束，那么线程池会补充一个新线程替代它。 |
| public  static [ExecutorService](mk:@MSITStore:D:\course\jdk-11中文api修订版.CHM::/java.base/java/util/concurrent/ExecutorService.html) newSingleThreadExecutor () | 创建只有一个线程的线程池对象，如果该线程出现异常而结束，那么线程池会补充一个新线程。 |
| public  static [ScheduledExecutorService](mk:@MSITStore:D:\course\jdk-11中文api修订版.CHM::/java.base/java/util/concurrent/ScheduledExecutorService.html) newScheduledThreadPool(int corePoolSize) | 创建一个线程池，可以实现在给定的延迟后运行任务，或者定期执行任务。 |

**注意：Executors的底层其实也是基于线程池的实现类ThreadPoolExecutor创建线程池对象的。**

#### 范例

```java
public static void main(String[] args) throws Exception {
        // 1、创建固定线程数据的线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);
		 ExecutorService z = Executors.newCachedThreadPool();
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable()); // 已经没有多余线程了
    }
```





### **Executors使用可能存在的陷阱**

大型并发系统环境中使用Executors如果不注意可能会出现系统风险

| 方法名称                                                     | 存在问题                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| public  static [ExecutorService](mk:@MSITStore:D:\course\jdk-11中文api修订版.CHM::/java.base/java/util/concurrent/ExecutorService.html) newFixedThreadPool(int nThreads) | 允许请求的任务队列长度是Integer.MAX_VALUE，可能出现OOM错误（ java.lang.OutOfMemoryError ） |
| public  static [ExecutorService](mk:@MSITStore:D:\course\jdk-11中文api修订版.CHM::/java.base/java/util/concurrent/ExecutorService.html) newSingleThreadExecutor() | 允许请求的任务队列长度是Integer.MAX_VALUE，可能出现OOM错误（ java.lang.OutOfMemoryError ） |
| public  static [ExecutorService](mk:@MSITStore:D:\course\jdk-11中文api修订版.CHM::/java.base/java/util/concurrent/ExecutorService.html) newCachedThreadPool() | 创建的线程数量最大上限是Integer.MAX_VALUE，  线程数可能会随着任务1:1增长，也可能出现OOM错误（ java.lang.OutOfMemoryError ） |
| public  static [ScheduledExecutorService](mk:@MSITStore:D:\course\jdk-11中文api修订版.CHM::/java.base/java/util/concurrent/ScheduledExecutorService.html) newScheduledThreadPool(int corePoolSize) | 创建的线程数量最大上限是Integer.MAX_VALUE，  线程数可能会随着任务1:1增长，也可能出现OOM错误（ java.lang.OutOfMemoryError ） |

![image-20211120180810917](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120180810917.png)

1.Executors工具类底层是基于什么方式实现的线程池对象？

**线程池ExecutorService的实现类：ThreadPoolExecutor**

2.Executors是否适合做大型互联网场景的线程池方案？

**不合适。**

**建议使用ThreadPoolExecuto来指定线程池参数，这样可以明确线程池的运行规则，规避资源耗尽的风险。**



## **定时器**

定时器是一种控制任务延时调用，或者周期调用的技术。作用：闹钟、定时邮件发送。

### 定时器的实现方式

方式一： Timer

方式二： Scheduled Executorservice

| 构造器          | 说明                |
| --------------- | ------------------- |
| public  Timer() | 创建Timer定时器对象 |

| 方法                                                         | 说明                                      |
| ------------------------------------------------------------ | ----------------------------------------- |
| public void schedule([TimerTask](file:///D:/course/%E5%9F%BA%E7%A1%80%E9%98%B6%E6%AE%B5/API%E6%96%87%E6%A1%A3/docs/api/java.base/java/util/TimerTask.html) task,  long delay, long period) | 开启一个定时器，按照计划处理TimerTask任务 |

#### 范例

```java
 public static void main(String[] args) {
        // 1、创建Timer定时器
        // 定时器本身就是一个单线程。

        Timer timer = new Timer();
        // 2、调用方法，处理定时任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行AAA~~~" + new Date());

            }
        }, 0, 2000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行BB~~~"+ new Date());
                System.out.println(10/0);
            }
        }, 0, 2000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行CCC~~~"+ new Date());
            }
        }, 0, 3000);
    }
```

### **Timer定时器的特点和存在的问题**

1、Timer是单线程，处理多个任务按照顺序执行，存在延时与设置定时器的时间有出入。

2、可能因为其中的某个任务的异常使Timer线程死掉，从而影响后续任务执行。



## **ScheduledExecutorService定时器**

| Executors的方法                                              | 说明           |
| ------------------------------------------------------------ | -------------- |
| public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize) | 得到线程池对象 |

### 范例

```java
// 1、创建ScheduledExecutorService线程池，做定时器
ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);
```



| ScheduledExecutorService的方法                               | 说明         |
| ------------------------------------------------------------ | ------------ |
| public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period,                              TimeUnit unit) | 周期调度方法 |

### **ScheduledExecutorService的优点**

基于线程池，某个任务的执行情况不会影响其他定时任务的执行。



## **并发、并行**

简单说说并发和并行的含义

**并发：CPU分时轮询的执行线程。**

**并行：同一个时刻同时在执行**

正在运行的程序（软件）就是个独立的进程，线程是属于进程的，多个线程其实是并发与并行同时进行的。

### 并发的理解：

CPU同时处理线程的数量有限。

CPU会**轮询**为系统的每个线程服务，由于CPU切换的速度很快，给我们的感觉这些线程在同时执行，这就是并发。

![image-20211120190305919](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120190305919.png)

### **并行的理解：**

在同一个时刻上，同时有多个线程在被CPU处理并执行。

![image-20211120190517514](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120190517514.png)

## **线程的生命周期**

### **线程的状态**

线程的状态：也就是线程从生到死的过程，以及中间经历的各种状态及状态转换。

理解线程的状态有利于提升并发编程的理解能力

### Java线程的状态

Java总共定义了6种状态

6种状态都定义在Thread类的内部枚举类中。

```
public class Thread{
     ...   
     public enum State { NEW,   	
     					 RUNNABLE, 
                         BLOCKED,    
                         WAITING,
                         TIMED_WAITING,   
                         TERMINATED;   
                         }
     ...
}
```



### **线程的6种状态总结**

![image-20211120190835150](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120190835150.png)





| 线程状态                | 描述                                                         |
| :---------------------- | ------------------------------------------------------------ |
| NEW(新建)               | 线程刚被创建，但是并未启动。                                 |
| Runnable(可运行)        | 线程已经调用了start()等待CPU调度                             |
| Blocked(锁阻塞)         | 线程在执行的时候未竞争到锁对象，则该线程进入Blocked状态。    |
| Waiting(无限等待)       | 一个线程进入Waiting状态，另一个线程调用notify或者notifyAll方法才能够唤醒 |
| Timed Waiting(计时等待) | 同waiting状态，有几个方法有超时参数，调用他们将进入Timed Waiting状态。带有超时参数的常用方法有Thread.sleep 、Object.wait。 |
| Teminated(被终止)       | 因为run方法正常退出而死亡，或者因为没有捕获的异常终止了run方法而死亡。 |



| 新建状态(NEW)              | 创建线程对象     |
| -------------------------- | ---------------- |
| 就绪状态( RUNNABLE)        | start方法        |
| 阻塞状态（ BLOCKED         | 无法获得锁对象   |
| 等待状态( WAITING)         | wait方法         |
| 计时等待（ TIMED WAITING） | sleep方法        |
| 结束状态( TERMINATED)      | 全部代码运行完毕 |



## 网络编程

### 网络通信基本模式

常见的通信模式有如下2种形式：Client-Server(CS) 、 Browser/Server(BS)

![image-20211120200300511](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120200300511.png)

![image-20211120200345117](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120200345117.png)

![image-20211120200359150](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120200359150.png)

## **网络通信三要素**

实现网络编程关键的三要素

IP地址：设备在网络中的地址，是唯一的标识

端口：应用程序在设备中唯一的标识。

协议：数据在网络中传输的规则，常见的协议有UDP协议和TCP协议。



### IP地址

IP( Internet Protocol):全称”互联网协议地址”，是分配给上网设备的唯一标志

常见的IP分类为：IPv4和IPV6

![image-20211120200555426](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120200555426.png)

IPv6：128位（16个字节），号称可以为地球每一粒沙子编号。

IPv6分成8个整数，每个整数用四个十六进制位表示， 数之间用冒号（：）分开。

![image-20211120200631585](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120200631585.png)

#### IP地址基本寻路

![image-20211120201737473](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120201737473.png)

#### IP地址形式：

公网地址、和私有地址（局域网使用）

192.168.开头的就是常见的局域网地址，范围即为192.168.0.0-192.168.255.255,专门为组织机构内部使用

#### IP常用命令：

ipconfig:查看本机IP地址

ping IP地址：检查网络是否连通

#### 特殊IP地址

本机IP:127.0.0.1或者 ocalhost:称为回送地址也可称本地回环地址，只会寻找当前所在本机

### **InetAddress** **的使用**

| 名称                                                         | 说明                                             |
| ------------------------------------------------------------ | ------------------------------------------------ |
| public static [InetAddress](mk:@MSITStore:D:\course\jdk-11中文api修订版.CHM::/java.base/java/net/InetAddress.html) getLocalHost() | 返回本主机的地址对象                             |
| public static  InetAddress getByName(String host)            | 得到指定主机的IP地址对象，参数是域名或者IP地址   |
| public String  getHostName()                                 | 获取此IP地址的主机名                             |
| public String  getHostAddress()                              | 返回IP地址字符串                                 |
| public boolean isReachable(int timeout)                      | 在指定毫秒内连通该IP地址对应的主机，连通返回true |

#### 范例

```java
/**
    目标：InetAddress类概述（了解）
         一个该类的对象就代表一个IP地址对象。

    InetAddress类成员方法：
         static InetAddress getLocalHost()
            * 获得本地主机IP地址对象。
         static InetAddress getByName(String host)
            * 根据IP地址字符串或主机名获得对应的IP地址对象。
         String getHostName()
            * 获得主机名。
         String getHostAddress()
            * 获得IP地址字符串。
 */
public class InetAddressDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.获取本机地址对象。
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        // 2.获取域名ip对象
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        // 3.获取公网IP对象。
        InetAddress ip3 = InetAddress.getByName("112.80.248.76");
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());

        // 4.判断是否能通： ping  5s之前测试是否可通 ip3.isReachable(5000)
        System.out.println(ip3.isReachable(5000));
    }
```



### 端口号

端口号：标识正在计算机设备上运行的进程（程序），被规定为一个16位的二进制，范围是0~65535

#### 端口类型

**周知端口**：0~1023,被预先定义的知名应用占用(如：HTTP占用80,FTP占用21)

**注册端口**：1024~49151,分配给用户进程或某些应用程序。（如： Tomcat占用8080, MYSQL占用3306)

**动态端口**：49152到65535,之所以称为动态端口，是因为它一般不固定分配某种进程，而是动态分配。

**注意**：我们自己开发的程序选择注冊端口，且ー个设备中不能出现两个程序的端口号一样，否则出错。



### 协议

#### **通信协议**

连接和通信数据的规则被称为网络通信协议

#### **网络通信协议有两套参考模型**

OSI参考模型：世界互联协议标准，全球通信规范，由于此模型过于理想化，未能在因特网上进行广泛推广

TCP/P参考模型(或TCP/Pか议)：事实上的国际标准。

| OSI参考模型 | TCP/IP参考模型  | 各层对应              | 面向操作                                                 |
| ----------- | :-------------- | --------------------- | -------------------------------------------------------- |
| 应用层      | 应用层          | HTTP、FTP、DNS、SMTP… | 应用程序需要关注的：浏览器，邮箱。程序员一般在这一层开发 |
| 表示层      | 应用层          | HTTP、FTP、DNS、SMTP… | 应用程序需要关注的：浏览器，邮箱。程序员一般在这一层开发 |
| 会话层      | 应用层          | HTTP、FTP、DNS、SMTP… | 应用程序需要关注的：浏览器，邮箱。程序员一般在这一层开发 |
| 传输层      | 传输层          | **TCP、UDP…**         | 选择使用的TCP , UDP协议                                  |
| 网络层      | 网络层          | IP、ICMP…             | 封装源和目标IP，进行路径选择                             |
| 数据链路层  | 数据链路层+物理 | 物理寻址、比特流…     | 物理设备中传输                                           |
| 物理层      | 数据链路层+物理 | 物理寻址、比特流…     | 物理设备中传输                                           |

#### **传输层的2个常见协议**

TCP( Transmission Control Protocol):传输控制协议

UDP( User Datagram Protoco1):用户数据报协议

#### TCP协议特点

使用TCP协议，必须双方先**建立连接，它是一种面向连接的可靠**通信协议

传输前，采用“三次握手”方式建立连接，所以是可靠的。在连接中可**进行大数据量**的传输。

**连接、发送数据都需要确认**，且传输完毕后，还需释放已建立的连接，**通信效率较低**。

#### **TCP协议通信场景**

对信息安全要求较高的场景，例如：文件下载、金融等数据通信。

#### **TCP三次握手确立连接**

![image-20211120204026956](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120204026956.png)

#### **TCP四次挥手断开连接**

![image-20211120204149700](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120204149700.png)

#### UDP协议：

UDP是一种**无连接、不可靠传输**的协议

将数据源P、目的地P和端口封装成数据包，不需要建立连接

每个数据包的大小限制在64KB内

发送不管对方是否准备好，接收方收到也不确认，故是不可靠的

可以广播发送，发送数据结束时无需释放资源，开销小，速度快。

#### UDP协议通信场景

语音通话，视频会话等。



## **UDP通信**

### **DatagramPacket：数据包对象**

| 构造器                                                       | 说明                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| public DatagramPacket(byte[] buf, int  length, InetAddress address,  int port) | 创建发送端数据包对象  buf：要发送的内容，字节数组  length：要发送内容的字节长度  address：接收端的IP地址对象  port：接收端的端口号 |
| public DatagramPacket(byte[] buf, int  length)               | 创建接收端的数据包对象  buf：用来存储接收的内容  length：能够接收内容的长度 |

### **DatagramPacket常用方法**

| 方法                   | 说明                     |
| ---------------------- | ------------------------ |
| public int getLength() | 获得实际接收到的字节个数 |

### **DatagramSocket：发送端和接收端对象**

| 构造器                          | 说明                                               |
| ------------------------------- | -------------------------------------------------- |
| public DatagramSocket()         | 创建发送端的Socket对象，系统会随机分配一个端口号。 |
| public DatagramSocket(int port) | 创建接收端的Socket对象并指定端口号                 |

### **DatagramSocket类成员方法**

| 方法                                  | 说明       |
| ------------------------------------- | ---------- |
| public void send(DatagramPacket dp)   | 发送数据包 |
| public void receive(DatagramPacket p) | 接收数据包 |

#### 范例

```java
/**
  接收端
 */
public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("=====服务端启动======");
        // 1、创建接收端对象：注册端口
        DatagramSocket socket = new DatagramSocket(8888);

        // 2、创建一个数据包对象接收数据
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        // 3、等待接收数据。
        socket.receive(packet);

        // 4、取出数据即可
        // 读取多少倒出多少
        int len = packet.getLength();
        String rs = new String(buffer,0, len);
        System.out.println("收到了：" + rs);

        // 获取发送端的ip和端口
        String ip  =packet.getSocketAddress().toString();
        System.out.println("对方地址：" + ip);

        int port  = packet.getPort();
        System.out.println("对方端口：" + port);

        socket.close();
    }
}
```

```java
/**
  发送端  一发 一收
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("=====客户端启动======");

        // 1、创建发送端对象：发送端自带默认的端口号
        DatagramSocket socket = new DatagramSocket(6666);

        // 2、创建一个数据包对象封装数据
        /**
         public DatagramPacket(byte buf[], int length,
         InetAddress address, int port)
         参数一：封装要发送的数据
         参数二：发送数据的大小
         参数三：服务端的主机IP地址
         参数四：服务端的端口
         */
        byte[] buffer = "我是一颗快乐的韭菜，你愿意吃吗？".getBytes();
        DatagramPacket packet = new DatagramPacket( buffer, buffer.length,
                InetAddress.getLocalHost() , 8888);

        // 3、发送数据出去
        socket.send(packet);

        socket.close();
    }
}

```



### UDP通信：多发多收

#### 范例

```java
/**
  发送端  多发 多收
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("=====客户端启动======");

        // 1、创建发送端对象：发送端自带默认的端口号（人）
        DatagramSocket socket = new DatagramSocket(7777);
        

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String msg = sc.nextLine();

            if("exit".equals(msg)){
                System.out.println("离线成功！");
                socket.close();
                break;
            }

            // 2、创建一个数据包对象封装数据（韭菜盘子）
            byte[] buffer = msg.getBytes();
            DatagramPacket packet = new DatagramPacket( buffer, buffer.length,
                    InetAddress.getLocalHost() , 8888);

            // 3、发送数据出去
            socket.send(packet);
        }

    }
}
```

```java
/**
  接收端
 */
public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("=====服务端启动======");
        // 1、创建接收端对象：注册端口（人）
        DatagramSocket socket = new DatagramSocket(8888);

        // 2、创建一个数据包对象接收数据（韭菜盘子）
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        while (true) {
            // 3、等待接收数据。
            socket.receive(packet);
            // 4、取出数据即可
            // 读取多少倒出多少
            int len = packet.getLength();
            String rs = new String(buffer,0, len);
            System.out.println("收到了来自：" + packet.getAddress() +", 对方端口是" + packet.getPort() +"的消息：" + rs);
        }
    }
}
```



### **UDP通信-广播、组播**

#### **UDP的三种通信方式**

单播：单台主机与单台主机之间的通信。

广播：当前主机与所在网络中的所有主机通信。

组播：当前主机与选定的一组主机的通信。

#### **UDP如何实现广播**

使用广播地址：255.255.255.255

具体操作：

**①发送端发送的数据包的目的地写的是广播地址、且指定端口。 （255.255.255.255 ,  9999）**

**②本机所在网段的其他主机的程序只要注册对应端口就可以收到消息了。（9999）**

##### 范例

```java
// 2、创建一个数据包对象封装数据
byte[] buffer = msg.getBytes();
DatagramPacket packet = new DatagramPacket( buffer, buffer.length,
        InetAddress.getByName("255.255.255.255") , 8888);
```



#### UDP如何实现组播

使用组播地址：224.0.0.0~239.255.255.255

##### 具体操作

**①发送端的数据包的目的地是组播IP(例如：224.0.1.1,端口：9999）**

**②接收端必须绑定该组播IP(224.0.1.1),端口还要注册发送端的目的端口9999,这样即可接收该组播消息。**

**③ Datagram Socket的子类 Multicastsocket可以在接收端绑定组IP。**

##### 范例

```java
byte[] buffer = msg.getBytes();
DatagramPacket packet = new DatagramPacket( buffer, buffer.length,
        InetAddress.getByName("224.0.1.1") , 8888);
```

```java
/ 注意：绑定组播地址
socket.joinGroup(new InetSocketAddress(InetAddress.getByName("224.0.1.1") , 8888),
        NetworkInterface.getByInetAddress(InetAddress.getLocalHost()));
```



1.如何实现广播，具体怎么操作？

**发送端目的IP使用广播IP： 255.255.255.255 9999。**

**所在网段的其他主机对应了端口（9999）即可接收消息。**

2.如何实现组播，具体怎么操作？

**发送端目的IP使用组播IP，且指定端口。**

**所在网段的其他主机注册了该组播IP和对应端口即可接收消息。**



## **TCP通信**

TCP是一种面向连接，安全、可靠的传输数据的协议 

传输前，采用“三次握手”方式，点对点通信，是可靠的 

在连接中可进行大数据量的传输 

![image-20211120214247430](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120214247430.png)

### Socket

| 构造器                                | 说明                                                         |
| ------------------------------------- | ------------------------------------------------------------ |
| public Socket(String host , int port) | 创建发送端的Socket对象与服务端连接，参数为服务端程序的ip和端口。 |

#### **Socket类成员方法**

| 方法                           | 说明               |
| ------------------------------ | ------------------ |
| OutputStream getOutputStream() | 获得字节输出流对象 |
| InputStream getInputStream()   | 获得字节输入流对象 |

### **ServerSocket(服务端)**

| 构造器                        | 说明           |
| ----------------------------- | -------------- |
| public ServerSocket(int port) | 注册服务端端口 |

#### ServerSocket类成员方法

| 方法                   | 说明                                                         |
| ---------------------- | ------------------------------------------------------------ |
| public Socket accept() | 等待接收客户端的Socket通信连接  连接成功返回Socket对象与客户端建立端到端通信 |



### **TCP通信-多发多收消息**

#### 范例

```java
/**
   目标：实现多发和多收
 */
public class ClientDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println("====客户端启动===");
            // 1、创建Socket通信管道请求有服务端的连接
            // public Socket(String host, int port)
            // 参数一：服务端的IP地址
            // 参数二：服务端的端口
            Socket socket = new Socket("127.0.0.1", 7777);

            // 2、从socket通信管道中得到一个字节输出流 负责发送数据
            OutputStream os = socket.getOutputStream();

            // 3、把低级的字节流包装成打印流
            PrintStream ps = new PrintStream(os);

            Scanner sc =  new Scanner(System.in);
            while (true) {
                System.out.println("请说：");
                String msg = sc.nextLine();
                // 4、发送消息
                ps.println(msg);
                ps.flush();
            }
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

```java
/**
   目标：开发Socket网络编程入门代码的服务端，实现接收消息
 */
public class ServerDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println("===服务端启动成功===");
            // 1、注册端口
            ServerSocket serverSocket = new ServerSocket(7777);
            while (true) {
                // 2、必须调用accept方法：等待接收客户端的Socket连接请求，建立Socket通信管道
                Socket socket = serverSocket.accept();
                // 3、从socket通信管道中得到一个字节输入流
                InputStream is = socket.getInputStream();
                // 4、把字节输入流包装成缓冲字符输入流进行消息的接收
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                // 5、按照行读取消息
                String msg;
                while ((msg = br.readLine()) != null){
                    System.out.println(socket.getRemoteSocketAddress() + "说了：: " + msg);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

1.多发多收是如何实现的

**客户端使用循环反复地发送消息。**

**服务端使用循环反复地接收消息。**

2.现在服务端为什么不可以同时接收多个客户端的消息。

**目前服务端是单线程的，每次只能处理一个客户端的消息。**



### **TCP通信-同时接受多个客户端消息**

**主线程定义了循环负责接收客户端Socket管道连接**

**每接收到一个Socket通信管道后分配一个独立的线程负责处理它**



#### 范例

```java
/**
   目标：实现服务端可以同时处理多个客户端的消息。
 */
public class ServerDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println("===服务端启动成功===");
            // 1、注册端口
            ServerSocket serverSocket = new ServerSocket(7777);
            // a.定义一个死循环由主线程负责不断的接收客户端的Socket管道连接。
            while (true) {
                // 2、每接收到一个客户端的Socket管道，交给一个独立的子线程负责读取消息
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress()+ "它来了，上线了！");
                // 3、开始创建独立线程处理socket
                new ServerReaderThread(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

```java
public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            // 3、从socket通信管道中得到一个字节输入流
            InputStream is = socket.getInputStream();
            // 4、把字节输入流包装成缓冲字符输入流进行消息的接收
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            // 5、按照行读取消息
            String msg;
            while ((msg = br.readLine()) != null){
                System.out.println(socket.getRemoteSocketAddress() + "说了：: " + msg);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了！！！");
        }
    }
}
```



### **TCP通信-使用线程池优化**

#### 范例

```java
public class ServerReaderRunnable implements Runnable{
    private Socket socket;
    public ServerReaderRunnable(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            // 3、从socket通信管道中得到一个字节输入流
            InputStream is = socket.getInputStream();
            // 4、把字节输入流包装成缓冲字符输入流进行消息的接收
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            // 5、按照行读取消息
            String msg;
            while ((msg = br.readLine()) != null){
                System.out.println(socket.getRemoteSocketAddress() + "说了：: " + msg);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了！！！");
        }
    }
}
```

```java
/**
   目标：实现服务端可以同时处理多个客户端的消息。
 */
public class ServerDemo2 {

    // 使用静态变量记住一个线程池对象
    private static ExecutorService pool = new ThreadPoolExecutor(300,
            1500, 6, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(2),     	                                 Executors.defaultThreadFactory(),
     new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        try {
            System.out.println("===服务端启动成功===");
            // 1、注册端口
            ServerSocket serverSocket = new ServerSocket(6666);
            // a.定义一个死循环由主线程负责不断的接收客户端的Socket管道连接。
            while (true) {
                // 2、每接收到一个客户端的Socket管道，
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress()+ "它来了，上线了！");

                // 任务对象负责读取消息。
                Runnable target = new ServerReaderRunnable(socket);
                pool.execute(target);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```



### **TCP**通信实战案例-模拟BS系统

![image-20211120231245134](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211120231245134.png)

#### 范例

```java
/**
 * @author li'zi'yao
 */
public class ThreadRunnable implements Runnable {
    private Socket socket;
    public ThreadRunnable(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {

        try {
            // 浏览器 已经与本线程建立了Socket管道
            // 响应消息给浏览器显示
            PrintStream ps = new PrintStream(socket.getOutputStream());
            // 必须响应HTTP协议格式数据，否则浏览器不认识消息
            // 协议类型和版本 响应成功的消息！
            ps.println("HTTP/1.1 200 OK");
            // 响应的数据类型：文本/网页
            ps.println("Content-Type:text/html;charset=UTF-8");
            // 必须发送一个空行
            ps.println();

            // 才可以响应数据回去给浏览器
            ps.println("<span style='color:red;font-size:90px'>《最牛的xxl》 </span>");
            ps.close();
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了！！！");
        }
    }
}
```



```java
public class Server {
    private static final ExecutorService pool = new ThreadPoolExecutor(3, 5, 5, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(7777);
            while (true) {
                Socket socket = ss.accept();
                System.out.println(socket.getRemoteSocketAddress() + "上线了");
                Runnable threadRunnable = new ThreadRunnable(socket);
                pool.execute(threadRunnable);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
```



#### TCP通信如何实现BS请求网页信息回来呢？

**客户端使用浏览器发起请求（不需要开发客户端）**

**服务端必须按照浏览器的协议规则响应数据。**

**浏览器使用什么协议规则呢？**

**HTTP协议（简单了解下）**



## 单元测试、反射、注解、动态代理

![image-20211121181306971](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211121181306971.png)

## **单元测试**

单元测试就是针对最小的功能单元编写测试代码，Java程序最小的功能单元是方法，因此，单元测试就是针对Java方法的测试，进而检查方法的正确性。



**目前测试方法是怎么进行的**，**存在什么问题**

只有一个main方法，如果一个方法的测试失败了，其他方法测试会受到影响。

无法得到测试的结果报告，需要程序员自己去观察测试是否成功。

无法实现自动化测试。

### JUnite单元测试框架

Junit是使用ava语言实现的单元测试框架，它是开源的，Java开发者都应当学习并使用∪nit编写单元测试

此外，几乎所有的IDE工具都集成了JUnit,这样我们就可以直接在IDE中编写并运行JUnit测试， Junit目前最新版本是5

### Junit优点

Junito可以灵活的选择执行哪些测试方法，可以一键执行全部测试方法。

Junit可以生成全部方法的测试报告。

单元测试中的某个方法测试失败了，不会影响其他测试方法的测试。



### JUnit单元测试的实现过程

**必须导入Junit框架的jar包。**

**定义的测试方法必须是无参数无返回值，且公开的方法。**

**测试方法使用@Test注解标记。**

#### JUnit测试某个方法，测试全部方法怎么处理？成功的标志是什么

**测试某个方法直接右键该方法启动测试。**

**测试全部方法，可以选择类或者模块启动。**

**红色失败，绿色通过。**



### **Junit常用注解**

| 注解         | 说明                                                         |
| ------------ | ------------------------------------------------------------ |
| @Test        | 测试方法                                                     |
| @Before      | 用来修饰实例方法，该方法会在每一个测试方法执行之前执行一次。 |
| @After       | 用来修饰实例方法，该方法会在每一个测试方法执行之后执行一次。 |
| @BeforeClass | 用来静态修饰方法，该方法会在所有测试方法之前只执行一次。     |
| @AfterClass  | 用来静态修饰方法，该方法会在所有测试方法之后只执行一次。     |

开始执行的方法:初始化资源。

执行完之后的方法:释放资源。

#### 范例

```java
/**
   测试类
 */
public class TestUserService {

    // 修饰实例方法的

    @Before
    public void before(){
        System.out.println("===before方法执行一次===");
    }

    @After
    public void after(){
        System.out.println("===after方法执行一次===");
    }

    // 修饰静态方法
    @BeforeClass
    public static void beforeClass(){
        System.out.println("===beforeClass方法执行一次===");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("===afterClass方法执行一次===");
    }


    /**
       测试方法
       注意点：
            1、必须是公开的，无参数 无返回值的方法
            2、测试方法必须使用@Test注解标记。
     */
    @Test
    public void testLoginName(){
        UserService userService = new UserService();
        String rs = userService.loginName("admin","123456");

        // 进行预期结果的正确性测试：断言。
        Assert.assertEquals("您的登录业务可能出现问题", "登录成功", rs );
    }

    @Test
    public void testSelectNames(){
        UserService userService = new UserService();
        userService.selectNames();
    }

}
```

```java
/**
   业务方法
 */
public class UserService {
    public String loginName(String loginName , String passWord){
        if("admin".equals(loginName) && "123456".equals(passWord)){
            return "登录成功";
        }else {
            return "用户名或者密码有问题";
        }
    }

    public void selectNames(){
        System.out.println(10/2);
        System.out.println("查询全部用户名称成功~~");
    }
}
```



## **反射**


反射是指对于任何一个 Class类，在"运行的时候"都可以直接得到这个类全部成分

在运行时，可以直接得到这个类的构造器对象： Constructor

在运行时，可以直接得到这个类的成员变量对象： Field

在运行时，可以直接得到这个类的成员方法对象： Method

这种运行时动态获取类信息以及动态调用类中成分的能力称为Java语言的反射机制。

### 反射的关键：

反射的第一步都是先得到编译后的 Classa类对象，然后就可以得到 Classe的全部成分。

```java
HelloWorld.java -> javac -> HelloWorld.class
Class c = HelloWorld.class;
```



### 反射获取类对象

#### **反射的第一步：获取Class类的对象**

![image-20211121185255548](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211121185255548.png)

![image-20211121185330901](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211121185330901.png)

![image-20211121185355225](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211121185355225.png)

**方式一：Class c1 = Class.forName(“全类名”);**

**方式二：Class c2 = 类名.class**

**方式三：Class c3 = 对象.getClass();**

##### 范例

```java
public static void main(String[] args) throws Exception {
    // 1、Class类中的一个静态方法：forName(全限名：包名 + 类名)
    Class c = Class.forName("com.itheima.d2_reflect_class.Student");
    // Student.class
    System.out.println(c);

    // 2、类名.class
    Class c1 = Student.class;
    System.out.println(c1);

    // 3、对象.getClass() 获取对象对应类的Class对象。
    Student s = new Student();
    Class c2 = s.getClass();
    System.out.println(c2);
}
```



#### **使用反射技术获取构造器对象并使用**

反射的第一步是先得到类对象，然后从类对象中获取类的成分对象。

Class类中用于获取构造器的方法

| 方法                                                         | 说明                                       |
| ------------------------------------------------------------ | ------------------------------------------ |
| Constructor<?>[ ]  getConstructors()                         | 返回所有构造器对象的数组（只能拿public的） |
| **Constructor<?>[ ]  getDeclaredConstructors()**             | 返回所有构造器对象的数组，存在就能拿到     |
| Constructor< T >  getConstructor(Class<?>...  parameterTypes) | 返回单个构造器对象（只能拿public的）       |
| Constructor< T > **getDeclaredConstructor**(Class<?>...  parameterTypes) | 返回单个构造器对象，存在就能拿到           |

获取构造器的作用依然是初始化一个对象返回。

##### 范例

```java
/**
    目标：反射_获取Constructor构造器对象.

    反射的第一步是先得到Class类对象。（Class文件）

    反射中Class类型获取构造器提供了很多的API:
         1. Constructor getConstructor(Class... parameterTypes)
            根据参数匹配获取某个构造器，只能拿public修饰的构造器，几乎不用！
         2. Constructor getDeclaredConstructor(Class... parameterTypes)
            根据参数匹配获取某个构造器，只要申明就可以定位，不关心权限修饰符，建议使用！
         3. Constructor[] getConstructors()
            获取所有的构造器，只能拿public修饰的构造器。几乎不用！！太弱了！
         4. Constructor[] getDeclaredConstructors()
            获取所有申明的构造器，只要你写我就能拿到，无所谓权限。建议使用！！
    小结：
        获取类的全部构造器对象： Constructor[] getDeclaredConstructors()
            -- 获取所有申明的构造器，只要你写我就能拿到，无所谓权限。建议使用！！
        获取类的某个构造器对象：Constructor getDeclaredConstructor(Class... parameterTypes)
            -- 根据参数匹配获取某个构造器，只要申明就可以定位，不关心权限修饰符，建议使用！

 */
public class TestStudent01 {
    // 1. getConstructors:
    // 获取全部的构造器：只能获取public修饰的构造器。
    // Constructor[] getConstructors()

    @Test
    public void getConstructors(){
        // a.第一步：获取类对象
        Class c = Student.class;
        // b.提取类中的全部的构造器对象(这里只能拿public修饰)
        Constructor[] constructors = c.getConstructors();
        // c.遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
        }
    }


    // 2.getDeclaredConstructors():
    // 获取全部的构造器：只要你敢写，这里就能拿到，无所谓权限是否可及。
    @Test
    public void getDeclaredConstructors(){
        // a.第一步：获取类对象
        Class c = Student.class;
        // b.提取类中的全部的构造器对象
        Constructor[] constructors = c.getDeclaredConstructors();
        // c.遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
        }
    }

    // 3.getConstructor(Class... parameterTypes)
    // 获取某个构造器：只能拿public修饰的某个构造器

    @Test
    public void getConstructor() throws Exception {
        // a.第一步：获取类对象
        Class c = Student.class;
        // b.定位单个构造器对象 (按照参数定位无参数构造器 只能拿public修饰的某个构造器)
        Constructor cons = c.getConstructor();
        System.out.println(cons.getName() + "===>" + cons.getParameterCount());
    }


    // 4.getConstructor(Class... parameterTypes)
    // 获取某个构造器：只要你敢写，这里就能拿到，无所谓权限是否可及。
    
    @Test
    public void getDeclaredConstructor() throws Exception {
        // a.第一步：获取类对象
        Class c = Student.class;
        // b.定位单个构造器对象 (按照参数定位无参数构造器)
        Constructor cons = c.getDeclaredConstructor();
        System.out.println(cons.getName() + "===>" + cons.getParameterCount());

        // c.定位某个有参构造器
        Constructor cons1 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println(cons1.getName() + "===>" + cons1.getParameterCount());

    }

}
```



#### **Constructor类中用于创建对象的方法**

| 符号                                      | 说明                                      |
| ----------------------------------------- | ----------------------------------------- |
| T newInstance(Object...  initargs)        | 根据指定的构造器创建对象                  |
| public  void setAccessible(boolean  flag) | 设置为true,表示取消访问检查，进行暴力反射 |

##### 范例

```java
/**
    目标: 反射_获取Constructor构造器然后通过这个构造器初始化对象。

    反射获取Class中的构造器对象Constructor作用：
            也是初始化并得到类的一个对象返回。

    Constructor的API:
         1. T newInstance(Object... initargs)
                创建对象，注入构造器需要的数据。
         2. void setAccessible(true)
                修改访问权限，true代表暴力攻破权限，false表示保留不可访问权限(暴力反射)
    小结：
        可以通过定位类的构造器对象。
        如果构造器对象没有访问权限可以通过：void setAccessible(true)打开权限
        构造器可以通过T newInstance(Object... initargs)调用自己，传入参数！
 */
public class TestStudent02 {
    // 1.调用构造器得到一个类的对象返回。

    @Test
    public void getDeclaredConstructor() throws Exception {
        // a.第一步：获取类对象
        Class c = Student.class;
        // b.定位单个构造器对象 (按照参数定位无参数构造器)
        Constructor cons = c.getDeclaredConstructor();
        System.out.println(cons.getName() + "===>" + cons.getParameterCount());

        // 如果遇到了私有的构造器，可以暴力反射
        // 权限被打开  cons.setAccessible(true);
        cons.setAccessible(true);

        Student s = (Student) cons.newInstance();
        System.out.println(s);

        System.out.println("-------------------");

        // c.定位某个有参构造器
        Constructor cons1 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println(cons1.getName() + "===>" + cons1.getParameterCount());

        Student s1 = (Student) cons1.newInstance("孙悟空", 1000);
        System.out.println(s1);
    }
```



### 反射获取成员变量对象

| 方法                                      | 说明                                         |
| ----------------------------------------- | -------------------------------------------- |
| Field[ ]  getFields()                     | 返回所有成员变量对象的数组（只能拿public的） |
| **Field[ ]  getDeclaredFields()**         | 返回所有成员变量对象的数组，存在就能拿到     |
| Field  getField(String  name)             | 返回单个成员变量对象（只能拿public的）       |
| Field  **getDeclaredField(String  name)** | 返回单个成员变量对象，存在就能拿到           |

#### 范例

```java
/**
     目标：反射_获取Field成员变量对象。

     反射的第一步是先得到Class类对象。

     1、Field getField(String name);
            根据成员变量名获得对应Field对象，只能获得public修饰
     2.Field getDeclaredField(String name);
            根据成员变量名获得对应Field对象，只要申明了就可以得到
     3.Field[] getFields();
            获得所有的成员变量对应的Field对象，只能获得public的
     4.Field[] getDeclaredFields();
            获得所有的成员变量对应的Field对象，只要申明了就可以得到
     小结：
        获取全部成员变量：getDeclaredFields
        获取某个成员变量：getDeclaredField
 */
public class FieldDemo01 {
    /**
     * 1.获取全部的成员变量。
     * Field[] getDeclaredFields();
     *  获得所有的成员变量对应的Field对象，只要申明了就可以得到
     */
    @Test
    public void getDeclaredFields(){
        // a.定位Class对象
       Class c = Student.class;
        // b.定位全部成员变量
        Field[] fields = c.getDeclaredFields();
        // c.遍历一下
        for (Field field : fields) {
            System.out.println(field.getName()+" "+field.getType());

        }
    }

    /**
        2.获取某个成员变量对象 Field getDeclaredField(String name);
     */
    @Test
    public void getDeclaredField() throws Exception {
        // a.定位Class对象
        Class c = Student.class;
        // b.根据名称定位某个成员变量
        Field f = c.getDeclaredField("age");
        System.out.println(f.getName() +"===>" + f.getType());
    }

}
```



获取成员变量的作用依然是在某个对象中取值、赋值

#### **Field类中用于取值、赋值的方法**

| 符号                                  | 说明     |
| ------------------------------------- | -------- |
| void  set(Object obj, Object value)： | 赋值     |
| Object  get(Object obj)               | 获取值。 |

```java
/**
    目标：反射获取成员变量: 取值和赋值。

    Field的方法：给成员变量赋值和取值
        void set(Object obj, Object value)：给对象注入某个成员变量数据
        Object get(Object obj):获取对象的成员变量的值。
        void setAccessible(true);暴力反射，设置为可以直接访问私有类型的属性。
        Class getType(); 获取属性的类型，返回Class对象。
        String getName(); 获取属性的名称。
 */
public class FieldDemo02 {
    @Test
    public void setField() throws Exception {
        // a.反射第一步，获取类对象
        Class c = Student.class;
        // b.提取某个成员变量
        Field ageF = c.getDeclaredField("age");
        // 暴力打开权限
        ageF.setAccessible(true);

        // c.赋值
        Student s = new Student();
        // s.setAge(18);
        ageF.set(s , 18);
        System.out.println(s);

        // d、取值
        int age = (int) ageF.get(s);
        System.out.println(age);

    }
}
```



### 反射获取方法对象

1.利用反射技术获取成员方法对象的方式

**获取类中成员方法对象**

**getDeclaredMethods()**

**getDeclaredMethod** **(String name,** **Class<?>...** **parameterTypes)** 

2.反射得到成员方法可以做什么？

**依然是在某个对象中触发该方法执行。**

**Object invoke(Object obj, Object...** **args)**

**如果某成员方法是非public的，需要打开权限（暴力反射），然后再触发执行**

**setAccessible(boolean)**



| 方法                                                         | 说明                                         |
| ------------------------------------------------------------ | -------------------------------------------- |
| Method[]  getMethods()                                       | 返回所有成员方法对象的数组（只能拿public的） |
| **Method[]  getDeclaredMethods()**                           | 返回所有成员方法对象的数组，存在就能拿到     |
| Method  getMethod(String  name, Class<?>... parameterTypes)  | 返回单个成员方法对象（只能拿public的）       |
| **Method  getDeclaredMethod(String  name, Class<?>... parameterTypes)** | 返回单个成员方法对象，存在就能拿到           |

#### 范例

```java
/**
    目标：反射——获取Method方法对象
    反射获取类的Method方法对象：
         1、Method getMethod(String name,Class...args);
             根据方法名和参数类型获得对应的方法对象，只能获得public的

         2、Method getDeclaredMethod(String name,Class...args);
             根据方法名和参数类型获得对应的方法对象，包括private的

         3、Method[] getMethods();
             获得类中的所有成员方法对象，返回数组，只能获得public修饰的且包含父类的

         4、Method[] getDeclaredMethods();
            获得类中的所有成员方法对象，返回数组,只获得本类申明的方法。
 */
public class MethodDemo01 {
    /**
     * 1.获得类中的所有成员方法对象
     */
    @Test
    public void getDeclaredMethods(){
        // a.获取类对象
        Class c = Dog.class;
        // b.提取全部方法；包括私有的
        Method[] methods = c.getDeclaredMethods();
        // c.遍历全部方法
        for (Method method : methods) {
            System.out.println(method.getName() +" 返回值类型：" + method.getReturnType() + " 参数个数：" + method.getParameterCount());
        // d.提取单个方法对象
    	Method m = c.getDeclaredMethod("eat");
    	Method m2 = c.getDeclaredMethod("eat", String.class);

        }
    }

```



#### **Method类中用于触发执行的方法**

| 符号                                           | 说明                                                         |
| ---------------------------------------------- | ------------------------------------------------------------ |
| Object **invoke**( Object obj, Object... args) | 运行方法  参数一：用obj对象调用该方法  参数二：调用方法的传递的参数（如果没有就不写）  返回值：方法的返回值（如果没有就不写） |

##### 范例

```java
/**
    Method的方法执行：
        Object invoke(Object obj, Object... args)
          参数一：触发的是哪个对象的方法执行。
          参数二： args：调用方法时传递的实际参数
 */
@Test
public void getDeclardMethod() throws Exception {
    // a.获取类对象
    Class c = Dog.class;
    // b.提取单个方法对象
    Method m = c.getDeclaredMethod("eat");
    Method m2 = c.getDeclaredMethod("eat", String.class);

    // 暴力打开权限了
    m.setAccessible(true);
    m2.setAccessible(true);

    // c.触发方法的执行 m.invoke(d)
    Dog d = new Dog();
    // 注意：方法如果是没有结果回来的，那么返回的是null.
    Object result = m.invoke(d);
    System.out.println(result);

    Object result2 = m2.invoke(d, "骨头");
    System.out.println(result2);
}
```



### 反射的作用-绕过编译阶段为集合添加数据



反射是作用在运行时的技术，此时集合的**泛型将不能产生约束**了，此时是可以**为集合存入其他任意类型的元素**

泛型只是在编译阶段可以约束集合只能操作某种数据类型，在编译成Class文件进入运行阶段的时候，其真实类型都是ArrayList了，**泛型相当于被擦除**了。

#### 范例

```java
public static void main(String[] args) throws Exception {

    ArrayList<Integer> lists3 = new ArrayList<>();
    lists3.add(23);
    lists3.add(22);
    // lists3.add("黑马");   // 报错

    // ArrayList.class  ===> public boolean add(E e)
    Class c = lists3.getClass(); 
    // 定位c类中的add方法
    Method add = c.getDeclaredMethod("add", Object.class);
    boolean rs = (boolean) add.invoke(lists3, "黑马");
    System.out.println(rs);

    System.out.println(lists3);

    // 突破泛型
    ArrayList list4 = lists3;
    list4.add("白马");
    list4.add(false);
    System.out.println(lists3);
}
```

反射为何可以给约定了泛型的集合存入其他类型的元素？

**编译成Class文件进入运行阶段的时候，泛型会自动擦除。**

**反射是作用在运行时的技术，此时已经不存在泛型了。**



### 反射的作用-通用框架的底层原理

#### 范例

```java
public class MybatisUtil {
    /**
     保存任意类型的对象
     * @param obj
     */
    public static void save(Object obj){
        try (
                PrintStream ps = new PrintStream(new FileOutputStream("D:\\Java\\newbee\\src\\reflection\\fremwork\\data.txt", true));
        ){
            // 1、提取这个对象的全部成员变量：只有反射可以解决
            //   c.getSimpleName()获取当前类名   c.getName获取全限名：包名+类名
            Class c = obj.getClass();
            ps.println("================" + c.getSimpleName() + "================");

            // 2、提取它的全部成员变量
            Field[] fields = c.getDeclaredFields();
            // 3、获取成员变量的信息
            for (Field field : fields) {
                String name = field.getName();
                // 提取本成员变量在obj对象中的值（取值）
                field.setAccessible(true);
                String value = field.get(obj) + "";
                ps.println(name  + "=" + value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

```java
/**
   目标：提供一个通用框架，支持保存所有对象的具体信息。
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Student s = new Student();
        s.setName("猪八戒");
        s.setClassName("西天跑路1班");
        s.setAge(1000);
        s.setHobby("吃，睡");
        s.setSex('男');
        MybatisUtil.save(s);

        Teacher t = new Teacher();
        t.setName("波仔");
        t.setSex('男');
        t.setSalary(6000);
        MybatisUtil.save(t);
    }
}
```



### 反射的作用

**可以在运行时得到一个类的全部成分然后操作。**

**可以破坏封装性。（很突出）**

**也可以破坏泛型的约束性。（很突出）**

**更重要的用途是适合：做Java高级框架**

**基本上主流框架都会基于反射设计一些通用技术功能。**



## **注解**

Java 注解（Annotation）又称 Java 标注，是 JDK5.0 引入的一种注释机制。

Java 语言中的类、构造器、方法、成员变量、参数等都可以被注解进行标注。

![image-20211121211213866](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211121211213866.png)

### **注解的作用**

**对Java中类、方法、成员变量做标记，然后进行特殊处理**，至于到底做何种处理由业务需求来决定。

例如：JUnit框架中，标记了注解@Test的方法就可以被当成测试方法执行，而没有标记的就不能当成测试方法执行。



### 自定义注解

![image-20211121212858530](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211121212858530.png)

#### **特殊属性**

value属性，如果只有一个value属性的情况下，使用value属性的时候可以省略value名称不写!!

但是如果有多个属性, 且多个属性没有默认值，那么value名称是不能省略的

#### 范例

```java
public @interface Book {
    String value(); // 特殊属性
    double price() ;
    //double price() default 9.9;
}

@Book(value = "/delete", price = 23.5)
```

### 元注解

元注解：就是注解注解的注解。 

**元注解有两个：**

 **@Target**: 约束自定义注解只能在哪些地方使用，

 **@Retention**：申明注解的生命周期



####  **@Target**

@Target中可使用的值定义在ElementType枚举类中，常用值如下

 TYPE，类，接口

 FIELD, 成员变量

METHOD, 成员方法

PARAMETER, 方法参数

CONSTRUCTOR, 构造器

LOCAL_VARIABLE, 局部变量



#### @Retention

@Retention中可使用的值定义在RetentionPolicy枚举类中，常用值如下

SOURCE： 注解只作用在源码阶段，生成的字节码文件中不存在

 CLASS： 注解作用在源码阶段，字节码文件阶段，运行阶段不存在，默认值.

 **RUNTIME**：注解作用在源码阶段，字节码文件阶段，运行阶段（开发常用）

#### 范例

```java
@Target({ElementType.METHOD,ElementType.FIELD}) // 元注解 只能注解方法和成员变量
@Retention(RetentionPolicy.RUNTIME) // 一直活着，在运行阶段这个注解也不消失
public @interface MyTest {
}
```



### 注解解析

注解的操作中经常需要进行解析，注解的解析就是判断是否存在注解，存在注解就解析出内容

#### **与注解解析相关的接口**

Annotation: 注解的顶级接口，注解都是Annotation类型的对象

AnnotatedElement:该接口定义了与注解解析相关的解析方法

| 方法                                                         | 说明                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| Annotation[ ]  getDeclaredAnnotations()                      | 获得当前对象上使用的所有注解，返回注解数组。                 |
| T getDeclaredAnnotation(**Class< T >**  **annotationClass**) | 根据注解类型获得对应注解对象                                 |
| boolean isAnnotationPresent(**Class< Annotation >**  **annotationClass**) | 判断当前对象是否使用了指定的注解，如果使用了则返回true，否则false |

所有的类成分Class, Method , Field , Constructor，都实现了AnnotatedElement接口他们都拥有解析注解的能力



#### **解析注解的技巧**

注解在哪个成分上，我们就先拿哪个成分对象。

比如注解作用成员方法，则要获得该成员方法对应的Method对象，再来拿上面的注解

比如注解作用在类上，则要该类的Class对象，再来拿上面的注解

比如注解作用在成员变量上，则要获得该成员变量对应的Field对象，再来拿上面的注解

##### 范例

```java
public class AnnotationDemo3 {
    @Test
    public void parseClass(){
        // a.先得到类对象
        Class c = BookStore.class;
        // b.判断这个类上面是否存在这个注解
        if(c.isAnnotationPresent(Bookk.class)){
            //c.直接获取该注解对象
            Bookk book = (Bookk) c.getDeclaredAnnotation(Bookk.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.author()));
        }
    }

    @Test
    public void parseMethod() throws NoSuchMethodException {
        // a.先得到类对象
        Class c = BookStore.class;

        Method m = c.getDeclaredMethod("test");

        // b.判断这个类上面是否存在这个注解
        if(m.isAnnotationPresent(Bookk.class)){
            //c.直接获取该注解对象
            Bookk book = (Bookk) m.getDeclaredAnnotation(Bookk.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.author()));
        }
    }
}

@Bookk(value = "《情深深雨濛濛》", price = 99.9, author = {"琼瑶", "dlei"})
class BookStore{

    @Bookk(value = "《三少爷的剑》", price = 399.9, author = {"古龙", "熊耀华"})
    public void test(){
    }
}
```

### 注解的应用场景一：junit框架

#### 范例

```java
public class AnnotationDemo4 {
    public void test1(){
        System.out.println("===test1===");
    }

    @MyTest
    public void test2(){
        System.out.println("===test2===");
    }

    @MyTest
    public void test3(){
        System.out.println("===test3===");
    }

    /**
      启动菜单：有注解的才被调用。
     */
    public static void main(String[] args) throws Exception {
        AnnotationDemo4 t = new AnnotationDemo4();
        // a.获取类对象
        Class c = AnnotationDemo4.class;
        // b.提取全部方法
        Method[] methods = c.getDeclaredMethods();
        // c.遍历方法，看是否有MyTest注解，有就跑它
        for (Method method : methods) {
            if(method.isAnnotationPresent(MyTest.class)){
                // 跑它
                method.invoke(t);
            }
        }
    }
}
```

```java
@Target({ElementType.METHOD,ElementType.FIELD}) // 元注解 只能注解方法和成员变量
@Retention(RetentionPolicy.RUNTIME) // 一直活着，在运行阶段这个注解也不消失
public @interface MyTest {
}
```



## **动态代理**

代理就是被代理者没有能力或者不愿意去完成某件事情，需要找个人代替自己去完成这件事，动态代理就是用来对业务功能（方法）进行代理的。

```java
public static Object newProxyInstance(ClassLoader loader,  Class<?>[] interfaces, InvocationHandler h)
```



### 关键步骤

1.必须有接口，实现类要实现接口（代理通常是基于接口实现的）。

2.创建一个实现类的对象，该对象为业务对象，紧接着为业务对象做一个代理对象。

![image-20211121221658088](https://lllzzzyyy.oss-cn-shenzhen.aliyuncs.com/image-20211121221658088.png)

#### 范例

```java
/**
    public static Object newProxyInstance(ClassLoader loader,  Class<?>[] interfaces, InvocationHandler h)
    参数一：类加载器，负责加载代理类到内存中使用。
    参数二：获取被代理对象实现的全部接口。代理要为全部接口的全部方法进行代理
    参数三：代理的核心处理逻辑
 */
public class ProxyUtil {
    /**
      生成业务对象的代理对象。
     * @param obj
     * @return
     */
    public static <T> T  getProxy(T obj) {
        // 返回了一个代理对象了
        return (T)Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 参数一：代理对象本身。一般不管
                        // 参数二：正在被代理的方法
                        // 参数三：被代理方法，应该传入的参数
                       long startTimer = System .currentTimeMillis();
                        // 马上触发方法的真正执行。(触发真正的业务功能)
                        Object result = method.invoke(obj, args);

                        long endTimer = System.currentTimeMillis();
                        System.out.println(method.getName() + "方法耗时：" + (endTimer - startTimer) / 1000.0 + "s");

                        // 把业务功能方法执行的结果返回给调用者
                        return result;
                    }
                });
    }
}
```

```java
public static void main(String[] args) {
    // 1、把业务对象，直接做成一个代理对象返回，代理对象的类型也是 UserService类型
    UserService userService = ProxyUtil.getProxy(new UserServiceImpl());
    System.out.println(userService.login("admin", "1234"));
    System.out.println(userService.deleteUsers());
    userService.selectUsers();
    userService.updateUsers(); // 走代理
}
```







### 动态代理的优点

非常的灵活，支持任意接口类型的实现类对象做代理，也可以直接为接本身做代理。

可以为被代理对象的所有方法做代理。

可以在不改变方法源码的情况下，实现对方法功能的增强。

不仅简化了编程工作、提高了软件系统的可扩展性，同时也提高了开发效率。























































