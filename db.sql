create table wallet
(
   id bigint auto_increment  primary key comment '自增主键id',
   money int default 0 comment '余额'
)
comment '钱包';


create table wallet_detail
(
   id bigint auto_increment primary key,
   wallet_id bigint not null comment '钱包id',
   money int default 0,
   create_time datetime not null comment '创建时间'
)
comment '钱包流水';

