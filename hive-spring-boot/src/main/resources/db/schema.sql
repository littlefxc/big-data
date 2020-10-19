create table if not exists capacity_stats_live_access
(
    id          bigint comment '主键',
    device_num  varchar(100) COMMENT '设备号',
    start_time  timestamp COMMENT '调阅开始时间',
    finish_time timestamp COMMENT '调阅结束时间',
    duration    bigint COMMENT '耗时，单位秒',
    response    int COMMENT '调用结果 1.成功 0.失败'
) COMMENT '直播调阅日志统计' row format delimited fields terminated by ',';

create table if not exists capacity_stats_live_exception
(
    id             bigint COMMENT '主键',
    device_num     varchar(100) COMMENT '设备号',
    account        varchar(255) COMMENT '用户客户域',
    province_code  varchar(50) COMMENT '设备所属省编码',
    province_name  varchar(50) COMMENT '设备所属省名称',
    city_code      varchar(50) COMMENT '设备所属市编码',
    city_name      varchar(50) COMMENT '设备所属市名称',
    county_code    varchar(50) COMMENT '设备所属区编码',
    county_name    varchar(50) COMMENT '设备所属区名称',
    exception_time timestamp COMMENT '异常时间，yyyy-MM-dd HH:mm:ss格式',
    exception_date date COMMENT '异常日期，yyyy-MM-dd格式，用于按天统计'
) COMMENT '直播异常统计' row format delimited fields terminated by ',';

CREATE TABLE if not exists capacity_stats_resource
(
    id          bigint COMMENT '主键',
    name        varchar(100) COMMENT '资源名称，唯一性校验',
    type        varchar(100) COMMENT '资源类型',
    total       varchar(255) COMMENT '资源总量',
    used        varchar(255) COMMENT '已使用资源量',
    area_code   varchar(50) COMMENT '地区编码',
    update_time timestamp COMMENT '更新时间',
    address     varchar(100) COMMENT '地址'
) COMMENT '资源统计，包括计算、存储、全天、事件的使用情况' row format delimited fields terminated by ',';

CREATE TABLE if not exists capacity_stats_review_bind
(
    id            bigint COMMENT '主键',
    device_num    varchar(100) COMMENT '设备号',
    account       varchar(255) COMMENT '用户客户域',
    province_code varchar(50) COMMENT '设备所属省编码',
    province_name varchar(50) COMMENT '设备所属省名称',
    city_code     varchar(50) COMMENT '设备所属市编码',
    city_name     varchar(50) COMMENT '设备所属市名称',
    county_code   varchar(50) COMMENT '设备所属区编码',
    county_name   varchar(50) COMMENT '设备所属区名称',
    package_type  int COMMENT '套餐类型 1.全天 2.事件',
    bind_status   int COMMENT ' 绑定状态 1.绑定 2.解绑',
    bind_time     timestamp COMMENT '绑定/解绑时间，yyyy-MM-dd HH:mm:ss格式',
    bind_date     date COMMENT '绑定/解绑时间，yyyy-MM-dd格式，用于按天统计'
) COMMENT '云回看激活统计' row format delimited fields terminated by ',';

CREATE TABLE capacity_stats_review_exception
(
    id             bigint COMMENT '主键',
    device_num     varchar(100) COMMENT '设备号',
    account        varchar(255) COMMENT '用户客户域',
    province_code  varchar(50) COMMENT '设备所属省编码',
    province_name  varchar(50) COMMENT '设备所属省名称',
    city_code      varchar(50) COMMENT '设备所属市编码',
    city_name      varchar(50) COMMENT '设备所属市名称',
    county_code    varchar(50) COMMENT '设备所属区编码',
    county_name    varchar(50) COMMENT '设备所属区名称',
    exception_time timestamp COMMENT '异常时间，yyyy-MM-dd HH:mm:ss格式，用于按天统计',
    exception_date date COMMENT '异常日期，yyyy-MM-dd格式，用于按天统计'
) COMMENT '云回看异常统计' row format delimited fields terminated by ',';