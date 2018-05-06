## golang 基本语法-02 ##
### 1. 类型转换  ###
#### 1.1 基本使用 ####
(1.)类型转换读取  
	
	vInt,err := cfg.Int("must","int")  
(2.)Must 系列方法

	vBool := cfg.MustBool("must","bool")
(3.)删除指定键值  

	ok := cfg.DeleteKey("must","string")
(4.)保存配置文件
	
	err = goconfig.SaveConfigFile(cfg,"conf_save.ini)
（5.）多文件覆盖加载
	
	cfg,err := goconfig.LoadConfigFile("conf.ini","conf2.ini")
	err = cfg.AppendFiles("conf3.ini")
(6.) 配置文件重载

	err = cfg.Reload()
(7.) 为Must系列方法设置缺省值
	
	vBool := cfg.MustBool("must","bool404",true)
(8.) 递归读取键值  
	
	sec,err := cfg.GetSection("auto increment")
