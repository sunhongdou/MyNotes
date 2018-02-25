# Git使用教程 #
## 1.Git配置 ##
### 1.1 git配置 ###
1. 配置用户名和email:  
git config --global user.name xxx  
git config --global uer.email xxx@xx.com  
2. 设置git 的颜色：  
git config --global color.ui true  
3. 查看配置信息：  
方法一： git config --list  
方法二： cat ~/.gitconfig  (查看配置文件)  
**说明：**也可以编辑配置文件 vi ~/.gitconfig  
4. 查看git初始化信息：  
命令： git init  ls -A 可以看到一个 .git文件夹（隐藏）
cd .git/  ls 进入.git 文件夹可以看到有以下几个文件夹  

![](http://t1.aixinxi.net/o_1c7614i50sj2bjt1mai1atmu1a.jpg-j.jpg)  

**说明**：如果是空文件夹，执行git init 相当于创建一个空的repo,即会产生.git文件夹。目录结构和上面的一致！   
5. 克隆远端代码到工作空间：  
    git clone 链接  
6. git status 查看git状态
7. git add 文件名  添加工作空间的文件到暂存区
8. git commit -m "提交信息" 提交暂存区的文件到远端仓库  

![git-commit](http://t1.aixinxi.net/o_1c765svjlorncqa1rjg1uqh19gna.png-j.jpg)  

**说明：** git分三块区域：工作区、暂存区、和远端仓库；通过git add将工作区的文件添加到暂存区，git commit 是将暂存区的文件提交到远端仓库。其中暂存区，有缓存和索引。  
9. git diff 不同区域的文件比对  

![git_diff](http://t1.aixinxi.net/o_1c76dp70v4lpoh61f16o1v4o5a.png-j.jpg)  

**说明：**   
(1) git diff : 工作区与暂存区比较  
(2) git diff --staged 暂存区与远端仓库比较  
(3) git diff HEAD 工作区与远端仓库比较  








