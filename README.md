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

## 抽象类的成员特点

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



































## IDea

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
