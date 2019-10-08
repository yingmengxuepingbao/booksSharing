/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/10/8 13:43:49                           */
/*==============================================================*/


drop table if exists address;

drop table if exists authentication;

drop table if exists childrensBooks;

drop table if exists classification;

drop table if exists pictures;

drop table if exists shops;

drop table if exists users;

/*==============================================================*/
/* Table: address                                               */
/*==============================================================*/
create table address
(
   address_id           varchar(32) not null comment '��ַ����',
   u_id                 vorchar(32) comment '�û�����',
   address_uname        varchar(100) comment '�ջ���',
   phone                varchar(11) comment '�ֻ�����',
   address_content      varchar(100) comment '���ڵ���',
   address_details      varchar(100) comment '��ϸ��ַ',
   "default"            int(1) comment '�Ƿ�Ĭ�� 0��Ĭ�ϣ�1����Ĭ��',
   address_abel         varchar(32) comment '��ַ��ǩ��1���ң�2����˾��3��ѧУ��4���Զ���',
   setup_time           datetime comment '����ʱ��',
   update_time          datetime comment '����ʱ��',
   Column_11            char(10),
   Column_12            char(10),
   Column_13            char(10),
   primary key (address_id)
);

alter table address comment '��ַ��';

/*==============================================================*/
/* Table: authentication                                        */
/*==============================================================*/
create table authentication
(
   authentication_id    varchar(32) not null comment '��֤����',
   authentication_method int(1) comment '��֤��ʽ1������2����ҵ',
   userName             varchar(32) comment '����',
   userNumber           varchar(32) comment '֤������',
   legalName            varchar(32) comment '���˴�������',
   business_license     varchar(100) comment 'Ӫҵִ��',
   Column_7             char(10),
   Column_8             char(10),
   Column_9             char(10),
   primary key (authentication_id)
);

alter table authentication comment '�����֤��';

/*==============================================================*/
/* Table: childrensBooks                                        */
/*==============================================================*/
create table childrensBooks
(
   cb_id                varchar(32) not null comment 'ͯ����',
   cb_boxNumber         varchar(32) comment 'ͯ��б��',
   cb_bookName          varchar(32) comment 'ͯ�����ƣ��౾�����á�,������',
   cb_suit              varchar(32) comment '�Ƿ���װ��0���ǣ�1����',
   cb_bookNumber        varchar(32) comment 'ͯ�鱾��',
   cb_applicationAge    int(100) comment '���������',
   cb_price             varchar(32) comment '�۸�',
   cb_introduction      varchar(255) comment 'ͯ�����',
   shop_id              varchar(32) comment '���̱��',
   cb_shelf             varchar(32) comment '�Ƿ��ϼܣ�0���ϼܣ�1�����ϼ�',
   classification_id    varchar(32) comment '�����ţ���������',
   cb_delivery          int(1) comment '�Ƿ����� 0���ǣ�1����',
   cb_sameCity          int(1) comment '�Ƿ�ͬ�ǣ�0���ǣ�1������',
   cb_expire            int(1) comment '�Ƿ������ѣ�0���� 1����',
   cb_setupTime         datetime comment '����ʱ��',
   cb_updateTime        datetime comment '����ʱ��',
   Column_17            char(10),
   Column_18            char(10),
   Column_19            char(10),
   primary key (cb_id)
);

alter table childrensBooks comment 'ͯ���';

/*==============================================================*/
/* Table: classification                                        */
/*==============================================================*/
create table classification
(
   classification_id    varchar(32) not null comment '������',
   classification_name  varchar(100) comment '��������',
   classification_pid   varchar(32) comment '����PID',
   setupTime            datetime comment '����ʱ��',
   update_Time          datetime comment '����ʱ��',
   Column_6             char(10),
   Column_7             char(10),
   Column_8             char(10),
   primary key (classification_id)
);

alter table classification comment 'ͯ�����';

/*==============================================================*/
/* Table: pictures                                              */
/*==============================================================*/
create table pictures
(
   pic_id               varchar(32) not null comment 'ͼƬ���',
   shop_id              varchar(32) comment '���̱��',
   cb_id                varchar(32) comment 'ͯ����',
   pic_content          varchar(255) comment 'ͼƬ���ݣ�������',
   pic_sort             int(1) comment 'ͼƬ���ࣺ0���ֲ�ͼ��1������ͼƬ��2������logo',
   setup_time           datetime comment '����ʱ��',
   update_time          datetime comment '�޸�ʱ��',
   Column_7             char(10),
   Column_8             char(10),
   Column_9             char(10),
   primary key (pic_id)
);

alter table pictures comment 'ͼƬ��ͯ���е�ͼƬ';

/*==============================================================*/
/* Table: shops                                                 */
/*==============================================================*/
create table shops
(
   shop_id              varchar(32) not null comment '���̱��',
   u_id                 vorchar(32) comment '�û�����',
   shop_name            varchar(100) comment '��������',
   shop_address         varchar(32) comment '���̵�ַ',
   shop_phone           varchar(11) comment '������ϵ��ʽ',
   shop_state           int(1) comment '����״̬',
   shop_signing         int(1) comment '�Ƿ�ǩԼ',
   bank_code            varchar(32) comment '�����˻�����',
   shop_logo            varchar(32) comment '����logo',
   authentication_method int(1) comment '������֤��ʽ��0��������֤��1����ҵ��֤��',
   authentication_id    varchar(32) comment '��֤����',
   Column_10            char(10),
   Column_11            char(10),
   Column_12            char(10),
   primary key (shop_id)
);

alter table shops comment '���̱�';

/*==============================================================*/
/* Table: users                                                 */
/*==============================================================*/
create table users
(
   u_id                 vorchar(32) not null comment '�û�����',
   u_nickname           varchar(100) comment '�û��ǳ�',
   u_name               varchar(100) comment '�û�����',
   u_password           varchar(100) comment '�û�����',
   u_phone              varchar(11) comment '�û��绰',
   u_email              varchar(32) comment '�û�����',
   u_sex                int(1) comment '�û��Ա�0��Ů��1����',
   u_age                varchar(32) comment '�û�����',
   u_parent_id          vorchar(32) comment '�����˱��',
   sign_day             int(32) comment 'ǩ������',
   u_role               int(1) comment '�û���ɫ��1����ͨ�û���2����ͨ�̻���3������Ա',
   u_wx_id              vorchar(32) comment '�û�΢��qq��ţ�������������¼��',
   u_qq_id              vorchar(32) comment '�û�qq����',
   u_setup_time         datetime comment '����ʱ��',
   u_update_time        datetime comment '����ʱ��',
   Column_17            char(10),
   Column_18            char(10),
   Column_19            char(10),
   primary key (u_id)
);

alter table users comment '�û���';

alter table address add constraint FK_u_id foreign key (u_id)
      references users (u_id) on delete restrict on update restrict;

alter table childrensBooks add constraint FK_classification foreign key (classification_id)
      references classification (classification_id) on delete restrict on update restrict;

alter table childrensBooks add constraint FK_shop_id foreign key (shop_id)
      references shops (shop_id) on delete restrict on update restrict;

alter table pictures add constraint FK_cb_id foreign key (cb_id)
      references childrensBooks (cb_id) on delete restrict on update restrict;

alter table shops add constraint FK_authentication_id foreign key (authentication_id)
      references authentication (authentication_id) on delete restrict on update restrict;

alter table shops add constraint FK_u_id foreign key (u_id)
      references users (u_id) on delete restrict on update restrict;

