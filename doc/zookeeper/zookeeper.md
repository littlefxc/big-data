# Zookeeper

## 1. Zookeeper 概念简介

Zookeeper 是一个分布式协调服务，就是为用户的分布式应用程序提供提供协调服务。

1. Zookeeper 是为别的分布式程序服务的。
2. Zookeeper 本事就是一个分布式程序（只要半数以上的节点存活，zk 就能正常服务）
3. Zookeeper 所提供的服务涵盖：

    - 主从协调。
    - 服务器节点动态上下线。
    - 统一配置管理。
    - 分布式共享锁。
    - 统一名称服务。
    - ...

4. 虽然说可以提供各中服务，但是 Zookeeper 在底层其实只提供了两个服务：

    - **管理（存储，读取）用户提交的数据**
    - **并为用户程序数据提供节点监听服务。**

Zookeeper 集群的角色：Leader 和 Follower（Observer）

只要集群中有半数以上节点存活，集群就能提供服务。

详情见 [ZooKeeper原理及使用](http://www.wuzesheng.com/?p=2609)

## 2. Zookeeper 集群机制

**半数机制：集群中半数以上机器存活，集群可用。**
zookeeper 适合装在奇数台机器上！！！

## 3. 安装

使用 docker-compose 安装 zookeeper 集群：