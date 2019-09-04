### 地区的编辑新增

1. 在Regioncontroller添加对应 右侧的方法    可以通过在@requestMapping 添加 parent属性来 区分   前端的 get 需要添加 参数  

      异步请求是不能用 freeMarker 的指令

   ​	利用 treeview的点击事件 --onNodeSelected    节点被点击事件---在 总的treeView 上 注意 treeView 的格式

   

   

   2. 把数据回显到上去     clone   

      1. 选择右击 编辑  复制  图标可以在boorcss上找  ![](克隆的模板.PNG)

         克隆模板

         ![](克隆模板.PNG)

         添加内容

         ![1560738954517](填充的信息.PNG)

         编辑: 注意清空数据  直接 #xx input  整个为空    html为""

         编辑注意 清空

         保存成功 需要把 原先的东西 复制过来  提示框  然后注意 引入
         
         
         
         
         
         ## 总结
         
         #### 需求分析
         
         1. admin 动态实现数据 主要用了 onNodeSelected 获取对应的 id, 然后对应的请求携带的参数来      区分不同的方法  
         
         ---
         
         
         
         ​	