# Git使用教程 #
## 1.Git命令 ##
### 1.1 git配置 ###
**1. 配置用户名和email**   

	git config --global user.name xxx  
	git config --global uer.email xxx@xx.com  
**2. 设置git 的颜色**  

	git config --global color.ui true  
**3. 查看配置信息**  

	方法一： git config --list  
	方法二： cat ~/.gitconfig  (查看配置文件)  
**说明：**也可以编辑配置文件 vi ~/.gitconfig  
**4. 查看git初始化信息**  

	命令： git init  ls -A 可以看到一个 .git文件夹（隐藏）
	cd .git/  ls 进入.git 文件夹可以看到有以下几个文件夹  

![](http://t1.aixinxi.net/o_1c7614i50sj2bjt1mai1atmu1a.jpg-j.jpg)  

**说明**：
　(1)　如果是空文件夹，执行git init 相当于创建一个空的repo,即会产生.git文件夹。目录结构和上面的一致！  
　　　　　(2) cat HEAD　　ref: refs/heads/master
  
**5. 克隆远端代码到工作空间**   

	git clone 链接  
**6. git status 查看git状态**   

	git status -s 查看git状态的简短显示 M表示修改   
**7. git add 文件名  添加工作空间的文件到暂存区**    
**8. git commit -m "提交信息" 提交暂存区的文件到远端仓库**  

![git-commit](http://t1.aixinxi.net/o_1c765svjlorncqa1rjg1uqh19gna.png-j.jpg)  

**说明：**  
 
	(1) git 提交代码分三步走，即有三块跳板：工作区、暂存区、和远端仓库；
	(2) git add 将工作区的文件添加到暂存区;
	(3) git commit 是将暂存区的文件提交到远端仓库。
	(4) git　commit -am "提交信息" 工作区提交到远端仓库。其中暂存区，有缓存和索引。  
**9. git diff 不同区域的文件比对**  

![git_diff](http://t1.aixinxi.net/o_1c76dp70v4lpoh61f16o1v4o5a.png-j.jpg)  

**说明：**   

	(1) git diff : 工作区与暂存区比较  
	(2) git diff --staged 暂存区与远端仓库比较  
	(3) git diff HEAD 工作区与远端仓库比较  
 **远端仓库会记录所有提交记录：**   

![git_HEAD记录](http://t1.aixinxi.net/o_1c76p9stv88tp212cd3d4o28a.png-j.jpg)  
**10. git checkout 从远端检出到本地** 
 
![](http://t1.aixinxi.net/o_1c76h1op1gva7r31439129h17dma.png-j.jpg)  

**说明：**  

	(1) git reset file  从远端仓库到拉到暂存区
	(2) git checkout file 从暂存区拉到工作区
	(3) git checkout HEAD file 从远端仓库拉到本地工作区
	(4) git add 从工作区提交到暂存区
	(5) git commit -m 从暂存区提交到远端仓库
	(6) git commit -am 从工作区直接提交到远端仓库
**11. git rm file 移除文件**  
**12. git mv fileName newName 重命名文件**
　说明：移除或者重命名后，再通过git commit 提交即可  
**13. git stash 和 git stash pop**　
**说明：**  

	(1) git stash          # 暂存当前正在进行的工作
	(2) git stash list     # 将当前git栈信息打印出来
	(3) git show stash@{0} # 取出最后一个栈信息 
	(4) git stash pop      # 取出最新的一次暂存数据，pop后，暂存区就不会存在这次数据 
						   # 相当于git stash apply 和git stash drop
	(5) git stash --help   # 获取更多帮助信息 
	(6) git stash clear    # 将栈清空
**14. git cat-file命令用法**  

	(1) git cat-file 命令显示版本库对象的内容、类型及大小信息
	(2) -t 显示对象的类型  -s 显示对象的大小  
	(3) -p  根据对象的类型，以优雅的方式显式对象内容
	　　eg:$ git cat-file -p HEAD　　
**15. git log命令用法**  

	(1) git log --oneline 把每一个提交压缩到一行
	(2) git log --decorate会显示出tag信息.
	(3) git log --author=[author name] 可以指定作者的提交历史
	(4) git log --since --before --until --after 根据提交时间筛选log.
	(5) git log --grep 根据commit信息过滤log: git log --grep=keywords
	(6) git log --stat 用来看改动的相对信息
**16. git rev-parse命令用法**  

	(1) git rev-parse –git-dir 显示版本库.git目录所在位置
	(2) git rev-parse –show-toplevel 显示工作区根目录
	(3) git rev-parse –show-prefix 所在目录相对于工作区根目录的相对目录
	(4) git rev-parse –show-cdup 显示从当前目录后退到工作区的根的身度
	　　eg: git rev-parse HEAD
**17. 分支代码**
	
	(1) git branch 分支名 创建分支
	(2) git checkout 分支名 切换分支
	(3) 在 .git/refs/heads 下可以看到所有的分支
	(4) git branch -d 分支名 删除分支
	(5) git checkout -b 创建并切换分支
	(6) git branch 列出所有分支
	(7) git branch -v  查看各个分支最后一次提交
	(8) git branch –merged  查看哪些分支合并入当前分支
	(9) git fetch origin 更新远端仓库到本地
	(10) git merge origin/mybranch 取远程分支合并到本地
![git checkout 分支](http://t1.aixinxi.net/o_1c76pt1dki44p3rfd91gso1vtra.png-j.jpg)
## 相关链接 ##
[git常用命令总结](https://www.cnblogs.com/mengdd/p/4153773.html)  
[git使用笔记](https://www.cnblogs.com/xiaodi-js/p/5258195.html)

















