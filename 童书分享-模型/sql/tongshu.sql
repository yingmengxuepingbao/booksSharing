/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/10/16 10:57:21                          */
/*==============================================================*/


drop table if exists book_share_address;

drop table if exists book_share_authentication;

drop table if exists book_share_childrensBooks;

drop table if exists book_share_classification;

drop table if exists book_share_pictures;

drop table if exists book_share_shops;

drop table if exists book_share_users;

/*==============================================================*/
/* Table: book_share_address                                    */
/*==============================================================*/
create table book_share_address
(
   address_id           varchar(32) not null comment '��ַ����',
   u_id                 varchar(32) comment '�û�����',
   address_uname        varchar(100) comment '�ջ���',
   phone                varchar(11) comment '�ֻ�����',
   address_content      varchar(100) comment '���ڵ���',
   address_details      varchar(100) comment '��ϸ��ַ',
   address_default      int(1) comment '�Ƿ�Ĭ�� 0��Ĭ�ϣ�1����Ĭ��',
   address_abel         varchar(32) comment '��ַ��ǩ��1���ң�2����˾��3��ѧУ��4���Զ���',
   setup_time           datetime comment '����ʱ��',
   update_time          datetime comment '����ʱ��',
   Column_11            char(10),
   Column_12            char(10),
   Column_13            char(10),
   primary key (address_id)
);

alter table book_share_address comment '��ַ��';

/*==============================================================*/
/* Table: book_share_authentication                             */
/*==============================================================*/
create table book_share_authentication
(
   authentication_id    varchar(32) not null comment '��֤����',
   authentication_method int(1) comment '��֤��ʽ1������2����ҵ',
   userName             varchar(32) comment '����',
   userNumber           varchar(32) comment '֤������',
   pic_zheng            varchar(100) comment '���֤������Ƭ',
   pic_fan              varchar(100) comment '���֤ ������Ƭ',
   pic_ren              varchar(100) comment '�ֳ����֤��Ƭ',
   legalName            varchar(32) comment '���˴�������',
   business_license     varchar(100) comment 'Ӫҵִ��',
   xinyong_code         varchar(32) comment 'ͳһ������ô���',
   pic_sepup_time       datetime,
   pic_update_time      datetime,
   Column_9             char(10),
   primary key (authentication_id)
);

alter table book_share_authentication comment '�����֤��';

/*==============================================================*/
/* Table: book_share_childrensBooks                             */
/*==============================================================*/
create table book_share_childrensBooks
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

alter table book_share_childrensBooks comment 'ͯ���';

/*==============================================================*/
/* Table: book_share_classification                             */
/*==============================================================*/
create table book_share_classification
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

alter table book_share_classification comment 'ͯ�����';

/*==============================================================*/
/* Table: book_share_pictures                                   */
/*==============================================================*/
create table book_share_pictures
(
   pic_id               varchar(32) not null comment 'ͼƬ���',
   shop_id              varchar(32) comment '���̱��',
   cb_id                varchar(32) comment 'ͯ����',
   pic_content          varchar(255) comment 'ͼƬ���ݣ�������',
   pic_sort             int(1) comment 'ͼƬ���ࣺ0���ֲ�ͼ��1������ͼƬ��2������logo',
   pic_size             varchar(255) comment 'ͼƬ��С',
   pic_url              varchar(255) comment 'ͼƬURL',
   setup_time           datetime comment '����ʱ��',
   update_time          datetime comment '�޸�ʱ��',
   Column_7             char(10),
   Column_8             char(10),
   Column_9             char(10),
   primary key (pic_id)
);

alter table book_share_pictures comment 'ͼƬ��ͯ���е�ͼƬ';

/*==============================================================*/
/* Table: book_share_shops                                      */
/*==============================================================*/
create table book_share_shops
(
   shop_id              varchar(32) not null comment '���̱��',
   u_id                 varchar(32) comment '�û�����',
   shop_name            varchar(100) comment '��������',
   shop_address         varchar(32) comment '���̵�ַ',
   shop_phone           varchar(11) comment '������ϵ��ʽ',
   shop_state           int(1) comment '����״̬��1��ţ�0�����',
   shop_signing         int(1) comment '�Ƿ�ǩԼ��0 ǩԼ��1δǩԼ',
   bank_code            varchar(32) comment '�����˻�����',
   shop_logo            varchar(32) comment '����logo',
   authentication_method int(1) comment '������֤��ʽ��0��������֤��1����ҵ��֤��',
   authentication_id    varchar(32) comment '��֤����',
   shop_setup_time      datetime,
   shop_update_time     datetime,
   Column_12            char(10),
   primary key (shop_id)
);

alter table book_share_shops comment '���̱�';

/*==============================================================*/
/* Table: book_share_users                                      */
/*==============================================================*/
create table book_share_users
(
   u_id                 varchar(32) not null comment '�û�����',
   u_nickname           varchar(100) comment '�û��ǳ�',
   u_name               varchar(100) comment '�û�����',
   u_password           varchar(100) comment '�û�����',
   u_phone              varchar(11) comment '�û��绰',
   u_email              varchar(32) comment '�û�����',
   u_sex                int(1) comment '�û��Ա�0��Ů��1����',
   u_age                varchar(32) comment '�û�����',
   u_parent_id          varchar(32) comment '�����˱��',
   sign_day             int(32) comment 'ǩ������',
   u_role               int(1) comment '�û���ɫ��1����ͨ�û���2����ͨ�̻���3������Ա',
   u_wx_id              varchar(32) comment '�û�΢��qq��ţ�������������¼��',
   u_qq_id              varchar(32) comment '�û�qq����',
   u_setup_time         datetime comment '����ʱ��',
   u_update_time        datetime comment '����ʱ��',
   Column_17            char(10),
   Column_18            char(10),
   Column_19            char(10),
   primary key (u_id)
);

alter table book_share_users comment '�û���';

alter table book_share_address add constraint FK_u_id foreign key (u_id)
      references book_share_users (u_id) on delete restrict on update restrict;

alter table book_share_childrensBooks add constraint FK_classification foreign key (classification_id)
      references book_share_classification (classification_id) on delete restrict on update restrict;

alter table book_share_childrensBooks add constraint FK_shop_id foreign key (shop_id)
      references book_share_shops (shop_id) on delete restrict on update restrict;

alter table book_share_pictures add constraint FK_cb_id foreign key (cb_id)
      references book_share_childrensBooks (cb_id) on delete restrict on update restrict;

alter table book_share_shops add constraint FK_authentication_id foreign key (authentication_id)
      references book_share_authentication (authentication_id) on delete restrict on update restrict;

alter table book_share_shops add constraint FK_u_id foreign key (u_id)
      references book_share_users (u_id) on delete restrict on update restrict;

