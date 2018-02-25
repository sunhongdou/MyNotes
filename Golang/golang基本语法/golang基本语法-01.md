# golang笔记（1） #
2018/2/25 13:23:11 **Created By sunhongdou**   
## 基本语法 ##
### 1.环境变量的配置：###
GOROOT = c:\go  （go1.5.1.windows-amd64的安装目录）  
GOPATH = 工作目录  
![golang环境变量配置](http://t1.aixinxi.net/o_1c75n8qp29fj1438ctk1usj11fka.png-j.jpg)  

**Liunx下的环境变量配置：**  
export PATH=/usr/local/go/bin:$PATH  
export GOROOT=/usr/local/go  
export GOPATH=/home/user/go  
最后可以执行 go env 命令来查看配置的环境变量
### 2. go常用命令 ###
go build 编译  
go run 编译运行  
go get 动态远程获取代码
go doc 本地运行web版本的文档 godoc-http=:88  

### 3.常用的编辑器 ###
#### 3.1 LiteIDE ####
快捷键：  
编译： ctr+B  
运行： ctr+R  
调试：F5  
添加/去掉断点：F9  

### 4.基本语法 ###
#### 4.1 导包 ####
1. go语言使用package表示包
2. main函数是程序的入口函数 表明这是一个可运行的包，在编译后生成可执行的文件
3. 非main 源码生成.a为后缀的文件
4. import 用来导入依赖包
#### 4.2 变量定义 ####
1. 变量的声明： 
   方法一： var vn type // eg: var temp int 
   方法二： vn1,vn2 := v1,v2  
	**说明**： (1) ：= 只能用在函数内部，出现在左边的不能是已经定义过的，而var用来定义全局变量  
     (2) _,b=1,2 _为特殊的变量名，任何赋值给它的值都将被舍弃  
     (3) 变量未被使用，编译会报错  
	
		package main
		func main(){
		  var i int   //编译会报错 i没有被使用
		}  
     (4) 变量组:
  
		var(       	    | var(
		  v1 byte		|  		v1 int = 0
		  v2 float32 	|		v2 byte = 0
		  v3 string		|		v3 string = "hello"
		)				|  )
      
2. 零值：并非是空值，而是一种"变量未填充前"的默认值，通常为0，string的零值为"",bool的零值为false
3. 变量的初始化：var vn1,vn2,vn3 type = v1,v2,v3 //类型可以省略，可以自动推断
4. 常量：编译阶段已经确定下来的值，在程序运行时无法改变的该值。  
	
		格式： const name = value  
		const PI float32 = 3.14159  
	 	const str = "abc"
		const(
			v0 int =0    //说明：不能只定义，不赋值
			v1 byte = 0
			v2 string = "hello"
		)
说明：（1）常量如果没有显式的设置，则参考上一行，每行多个值的时候，需要参考行和被参考行的常量个数一样。  

		const(
		  a=1
		  b
		)
		func main(){
			fmt.Println(b)   //结果与a一致，输出为： 1
		}
	（2）iota为关键字，它的值与行有关系，与常量的个数没有关系

		const(
			a = iota
			b=iota
			c,d=iota,iota
			e,f
			h=iota+1
		)
		分别输出，结果为： a=0,b=1,c=2,d=2,e=3,f=3,h=5
5. 预定义标识符： 这类标识符随go语言的源码一同出现，它是在go语言源码中被声明的，包括以下几种：  
  （1）所有数据类型的名称  
  （2）接口类型 error  
  （3）常量true、false、iota
  （4）所有内建函数的名称，如：append、cap、close、complex、copy、delete image len make new panic print real recover
	
6.  字符串操作  
	(1)字符串长度 len(str)  
	(2)取字符 str[i]  
	(3)双引号引起来的字符串，可以使用转义符，而用反引号引起来的字符没有转义，原样输出。

