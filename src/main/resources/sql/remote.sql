drop database if exists remote;
create database remote;

use remote;

drop table if exists remote_user;
create table `remote_user`(
    `remote_user_id` varchar(50) not null auto_increment,
    `remote_user_name` varchar(20) not null COMMENT '姓名',
    `remote_user_class` varchar(35) not null COMMENT '班级',
    primary key (`remote_user_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;