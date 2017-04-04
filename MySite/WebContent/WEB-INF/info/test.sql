create table MySiteMember(
	id varchar2(100) primary key,
	name varchar2(100) not null,
	password varchar2(100) not null
)
insert into MySiteMember(id,name,password) values ('7moonil7','김문일','');
insert into MySiteMember(id,name,password) values ('client1','임시고객1','client');
insert into MySiteMember(id,name,password) values ('client2','임시고객2','client');
insert into MySiteMember(id,name,password) values ('client3','임시고객3','client');
insert into MySiteMember(id,name,password) values ('client4','임시고객4','client');

select count(*) from MySiteMember

create table MySiteClientUrlTable(
	urlno number primary key,
	url varchar2(1000) not null,	
	id varchar2(100) not null,
	constraint fk_MySiteId foreign key (id)
	references MySiteMember(id)
)
create sequence seq_MySiteUrl;

insert into MySiteClientUrlTable(urlno,url,id) values (seq_MySiteUrl.nextval,'http://www.naver.com','client1');
select count(*) from MySiteClientUrlTable

select u.url from MySiteMember m,MySiteClientUrlTable u where m.id=u.id and u.id='client1' order by urlno desc;



