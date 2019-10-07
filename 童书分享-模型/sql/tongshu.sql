/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/10/7 19:42:11                           */
/*==============================================================*/


drop table if exists address;

drop table if exists childrensBooks;

drop table if exists pictures;

drop table if exists shops;

drop table if exists users;

/*==============================================================*/
/* Table: address                                               */
/*==============================================================*/
create table address
(
   address_id           varchar(32) not null comment '地址编码',
   u_id                 vorchar(32) comment '用户编码',
   address_uname        varchar(100) comment '收货人',
   phone                varchar(11) comment '手机号码',
   address_content      varchar(100) comment '所在地区',
   address_details      varchar(100) comment '详细地址',
   "default"            int(1) comment '是否默认 0：默认；1：非默认',
   address_abel         varchar(32) comment '地址标签。1：家，2：公司；3：学校；4：自定义',
   setup_time           datetime comment '创建时间',
   update_time          datetime comment '更新时间',
   Column_11            char(10),
   Column_12            char(10),
   Column_13            char(10),
   primary key (address_id)
);

alter table address comment '地址表';

/*==============================================================*/
/* Table: childrensBooks                                        */
/*==============================================================*/
create table childrensBooks
(
   cb_id                varchar(32) not null comment '童书编号',
   cb_boxNumber         varchar(32) comment '童书盒编号',
   cb_bookName          varchar(32) comment '童书名称：多本书名用“,”隔开',
   cb_suit              varchar(32) comment '是否套装：0：是；1：否',
   cb_bookNumber        varchar(32) comment '童书本数',
   cb_applicationAge    int(100) comment '适用年龄段',
   cb_price             varchar(32) comment '价格',
   cb_introduction      varchar(255) comment '童书介绍',
   dianpu_id            varchar(32) comment '店铺编号',
   cb_shelf             varchar(32) comment '是否上架：0：上架；1：不上架',
   classification_id    varchar(32) comment '分类编号：三级联动',
   cb_delivery          int(1) comment '是否配送 0：是；1：否',
   cb_sameCity          int(1) comment '是否同城：0：是；1：不是',
   cb_expire            int(1) comment '是否到期提醒：0：是 1：否',
   cb_setupTime         datetime comment '创建时间',
   cb_updateTime        datetime comment '更新时间',
   Column_17            char(10),
   Column_18            char(10),
   Column_19            char(10),
   primary key (cb_id)
);

alter table childrensBooks comment '童书表';

/*==============================================================*/
/* Table: pictures                                              */
/*==============================================================*/
create table pictures
(
   pic_id               varchar(32) not null comment '图片编号',
   shop_id              varchar(32),
   cb_id                varchar(32) comment '童书编号',
   pic_content          varchar(255) comment '图片内容：二进制',
   "pic_ sort"          int(1) comment '图片分类：0：轮播图；1：详情图片；2：商铺logo',
   setup_time           datetime comment '创建时间',
   update_time          datetime comment '修改时间',
   Column_7             char(10),
   Column_8             char(10),
   Column_9             char(10),
   primary key (pic_id)
);

alter table pictures comment '图片表：童书中的图片';

/*==============================================================*/
/* Table: shops                                                 */
/*==============================================================*/
create table shops
(
   shop_id              char(10) not null comment '店铺编号',
   shop_name            char(10) comment '店铺名称',
   shop_address         char(10) comment '店铺地址',
   shop_phone           char(10) comment '店铺联系方式',
   shop_state           char(10) comment '店铺状态',
   shop_signing         char(10) comment '是否签约',
   shop_logo            char(10) comment '店铺logo',
   shop_authMethod      char(10) comment '店铺认证方式：0：个人认证，1：企业认证。',
   Column_9             char(10),
   Column_10            char(10),
   Column_11            char(10),
   primary key (shop_id)
);

alter table shops comment '店铺表';

/*==============================================================*/
/* Table: users                                                 */
/*==============================================================*/
create table users
(
   u_id                 vorchar(32) not null comment '用户编码',
   u_nickname           varchar(100) comment '用户昵称',
   u_name               varchar(100) comment '用户名称',
   u_password           varchar(100) comment '用户密码',
   u_phone              varchar(11) comment '用户电话',
   u_email              varchar(32) comment '用户邮箱',
   u_sex                int(1) comment '用户性别：0：女；1：男',
   u_age                varchar(32) comment '用户年龄',
   u_parent_id          vorchar(32),
   sign_day             int(32) comment '签到天数',
   u_role               int(1) comment '用户角色：1：普通用户；2：普通商户；3：管理员',
   u_wx_id              vorchar(32) comment '用户微信qq编号，关联第三方登录表',
   u_qq_id              vorchar(32),
   u_setup_time         datetime comment '创建时间',
   u_update_time        datetime comment '更新时间',
   Column_17            char(10),
   Column_18            char(10),
   Column_19            char(10),
   primary key (u_id)
);

alter table users comment '用户表';

alter table address add constraint FK_u_id foreign key (u_id)
      references users (u_id) on delete restrict on update restrict;

alter table pictures add constraint FK_cb_id foreign key (cb_id)
      references childrensBooks (cb_id) on delete restrict on update restrict;

