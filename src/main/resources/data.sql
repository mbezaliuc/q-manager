/*
delete from  user_privileges;
delete from  privileges;
delete from  t_user;
INSERT INTO t_user (username, password, role)
VALUES ('Denis', '$2a$10$Wfmn9mYn.F9qdGta8lsx4.aqjwG8x3Y2k7ArC43.gU9wUjlQHtUyK', 'ROLE_ADMINISTRATOR'),
       ('Ivan', '$2a$10$Wfmn9mYn.F9qdGta8lsx4.aqjwG8x3Y2k7ArC43.gU9wUjlQHtUyK', 'ROLE_USER');


INSERT INTO privileges (id, name) VALUES
(1, 'FACEBOOK'),
(2, 'YOUTUBE'),
(3, 'INSTAGRAM'),
(4, 'VK')
;


insert into user_privileges(user_id, privilege_id) values
(1,1),
(1,2),
(1,3),
(1,4),
(2,1),
(2,2),
(2,3),
(2,4)
;

SELECT * FROM t_user;*/