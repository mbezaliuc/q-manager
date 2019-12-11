create table if not exists t_user
(
  id       bigint auto_increment primary key,
  username varchar(255),
  password varchar(255),
  role     varchar(255)
);
