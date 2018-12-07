UML课程设计
-----------

目录
----

-   [UML课程设计](#uml课程设计)
-   [目录](#目录)
-   [项目规范及各种教程](#项目规范及各种教程)
    -   [约定](#约定)
-   [docker部署说明](#docker部署说明)
    -   [git教程](#git教程)
    -   [processon](#processon)

项目规范及各种教程
------------------

### 约定

-   所有路径全部使用绝对路径,勿使用相对路径,以免造成跳转错误.
-   命名要规范 (驼峰)
-   请不要将.idea/ 等文件传上来
-   commit时,请说清楚你所修改的内容

docker部署说明
--------------

-   部署命令

``` {.bash}
docker build -t  dearhouaimin .
docker-compose up -d db
docker-compose up -d web
```

-   查看状态的命令

``` {.bash}
docker logs -f team_web
```

### git教程

-   [Git教程-
    廖雪峰的官方网站](https://www.liaoxuefeng.com/wiki/0013739516305929606dd18361248578c67b8067c8c017b000)\
-   [GitHub团队项目合作流程](https://www.cnblogs.com/schaepher/p/4933873.html)

### processon

-   [processon在线画用例图](https://www.processon.com)
