create table Author 
(
auth_id integer not null, 
fname varchar(20),
lname varchar(20), 
bdate DATE,
create_date DATETIME,
last_mod DATETIME,
primary key (auth_id));


create table Language 
(
lang_id integer not null, 
lang_name varchar(20),
create_date DATETIME,
last_mod DATETIME,
primary key (lang_id));

create table Book 
(
isbn integer not null, 
title varchar(250), 
create_date DATETIME,
last_mod DATETIME,
primary key (isbn));

create table AuthorLanguage 
(
auth_id integer not null, 
lang_id integer not null, 
create_date DATETIME,
primary key (auth_id, lang_id),
foreign key (auth_id) references Author(auth_id),
foreign key (lang_id) references Language(lang_id));

create table BookLanguage 
(
isbn integer not null, 
lang_id integer not null, 
create_date DATETIME,
primary key (isbn, lang_id),
foreign key (isbn) references Book(isbn),
foreign key (lang_id) references Language(lang_id));

create table Award 
(
aw_id integer not null, 
aw_name varchar(250), 
create_date DATETIME,
last_mod DATETIME,
primary key (aw_id));

create table AuthorAward 
(
auth_id integer not null, 
aw_id integer not null, 
create_date DATETIME,
primary key (auth_id, aw_id),
foreign key (auth_id) references Author(auth_id),
foreign key (aw_id) references Award(aw_id));

create table Genre 
(
gen_id integer not null, 
gen_name varchar(50), 
create_date DATETIME,
last_mod DATETIME,
primary key (gen_id));



create table BookGenre 
(
isbn integer not null, 
gen_id integer not null, 
create_date DATETIME,
primary key (isbn, gen_id),
foreign key (isbn) references Book(isbn),
foreign key (gen_id) references Genre(gen_id));


insert into Author (auth_id, fname, lname, bdate, create_date, last_mod)
values
(0001, 'Pearl', 'Buck', '1892-06-26', NOW(), NOW()),
(0002, 'Yasunari', 'Kawabata', '1899-06-11', NOW(), NOW()),
(0003, 'Jane', 'Smiley', '1949-09-26', NOW(), NOW()),
(0004, 'Gabriel', 'Garcia Marquez', '1927-03-06', NOW(), NOW()),
(0005, 'Larry', 'McMurtry', '1936-06-03', NOW(), NOW()),
(0006, 'Jean', 'Craighead George', '1919-07-02', NOW(), NOW()),
(0007, 'Thomas', 'Mann', '1875-06-06', NOW(), NOW()),
(0008, 'Seamus', 'Heaney', '1939-04-13', NOW(), NOW()),
(0009, 'Halldor', 'Laxness', '1902-04-23', NOW(), NOW()),
(0010, 'Karin', 'Tidbeck', '1977-04-06', NOW(), NOW()),
(0011, 'Vladimir', 'Nabokov', '1899-04-22', NOW(), NOW());


insert into Language (lang_id, lang_name, create_date, last_mod)
values
(1001, 'Chinese', NOW(), NOW()),
(1002, 'Japanese', NOW(), NOW()),
(1003, 'English', NOW(), NOW()),
(1004, 'Spanish', NOW(), NOW()),
(1005, 'German', NOW(), NOW()),
(1006, 'Irish Gaelic', NOW(), NOW()),
(1007, 'old English', NOW(), NOW()),
(1008, 'Icelandic', NOW(), NOW()),
(1009, 'Swedish', NOW(), NOW()),
(1010, 'Russian', NOW(), NOW());



insert into Book (isbn, title, create_date, last_mod)
values
(2001, 'The Good Earth', NOW(), NOW()),
(2002, 'Snow Country', NOW(), NOW()),
(2003, 'The Greenlanders', NOW(), NOW()),
(2004, 'One Hundred Years of Solitude', NOW(), NOW()),
(2005, 'Lonesome Dove', NOW(), NOW()),
(2006, 'Julie of the Wolves', NOW(), NOW()),
(2007, 'Der Zauberberg', NOW(), NOW()),
(2008, 'Beowulf', NOW(), NOW()),
(2009, 'Icelands Bell', NOW(), NOW()),
(2010, 'Jagannath', NOW(), NOW()),
(2011, 'Lolita', NOW(), NOW());


insert into AuthorLanguage (auth_id, lang_id, create_date)
values
(0001, 1001, NOW()),
(0001, 1003, NOW()),
(0002, 1002, NOW()),
(0003, 1003, NOW()),
(0004, 1004, NOW()),
(0005, 1003, NOW()),
(0006, 1003, NOW()),
(0007, 1005, NOW()),
(0008, 1003, NOW()),
(0008, 1006, NOW()),
(0008, 1007, NOW()),
(0009, 1008, NOW()),
(0009, 1003, NOW()),
(0010, 1003, NOW()),
(0010, 1009, NOW()),
(0011, 1003, NOW()),
(0011, 1010, NOW());


insert into BookLanguage (isbn, lang_id, create_date)
values
(2001, 1003, NOW()),
(2001, 1001, NOW()),
(2002, 1003, NOW()),
(2002, 1002, NOW()),
(2003, 1003, NOW()),
(2004, 1003, NOW()),
(2004, 1004, NOW()),
(2005, 1003, NOW()),
(2006, 1003, NOW()),
(2007, 1005, NOW()),
(2007, 1003, NOW()),
(2008, 1003, NOW()),
(2008, 1007, NOW()),
(2009, 1008, NOW()),
(2010, 1003, NOW()),
(2010, 1009, NOW()),
(2011, 1003, NOW()),
(2011, 1010, NOW());

insert into Award (aw_id, aw_name, create_date,
 last_mod)
values
(3001, 'Nobel Prize', NOW(), NOW()),
(3002, 'Pulitzer Prize', NOW(), NOW()),
(3003, 'Neustadt International Prize', NOW(), NOW()),
(3004, 'Newbery Medal', NOW(), NOW()),
(3005, 'Hans Christian Andersen Award', NOW(), NOW()),
(3006, 'Deutscher Jugendliteraturpreis', NOW(), NOW()),
(3007, 'Goethe Prize', NOW(), NOW()),
(3008, 'T.S. Eliot Prize', NOW(), NOW()),
(3009, 'PEN Translation', NOW(), NOW()),
(3010, 'Science Fiction & Fantasy Translation Awards', NOW(), NOW());

insert into Genre (gen_id, gen_name, create_date, last_mod)
values
(4001, 'Fiction', NOW(), NOW()),
(4002, 'Historical Fiction', NOW(), NOW()),
(4003, 'Japanese Literature', NOW(), NOW()),
(4004, 'Magical Realism', NOW(), NOW()),
(4005, 'Classic', NOW(), NOW()),
(4006, 'Children Literature', NOW(), NOW()),
(4007, 'survival fiction', NOW(), NOW()),
(4008, 'Young Adult', NOW(), NOW()),
(4009, 'Adventure', NOW(), NOW()),
(4010, 'Western', NOW(), NOW()),
(4011, 'German Literature', NOW(), NOW()),
(4012, 'Philosophy', NOW(), NOW()),
(4013, 'Medieval Literature', NOW(), NOW()),
(4014, 'Fantasy', NOW(), NOW()),
(4015, 'Mythology', NOW(), NOW()),
(4016, 'Epic', NOW(), NOW()),
(4017, 'Poetry', NOW(), NOW()),
(4018, 'Scandinavian Literature', NOW(), NOW()),
(4019, 'Short Story', NOW(), NOW()),
(4020, 'Sceince Fiction', NOW(), NOW()),
(4021, 'Speculative Fiction', NOW(), NOW()),
(4022, 'Nonfiction', NOW(), NOW());

insert into AuthorAward (auth_id, aw_id, create_date)
values
(0001, 3001, NOW()),
(0001, 3002, NOW()),
(0002, 3001, NOW()),
(0003, 3002, NOW()),
(0004, 3001, NOW()),
(0004, 3003, NOW()),
(0005, 3002, NOW()),
(0006, 3004, NOW()),
(0006, 3005, NOW()),
(0006, 3006, NOW()),
(0007, 3001, NOW()),
(0007, 3007, NOW()),
(0008, 3001, NOW()),
(0008, 3008, NOW()),
(0008, 3009, NOW()),
(0009, 3001, NOW()),
(0010, 3010, NOW());

insert into BookGenre (isbn, gen_id, create_date)
values
(2001, 4001, NOW()),
(2001, 4002, NOW()),
(2002, 4001, NOW()),
(2002, 4003, NOW()),
(2003, 4001, NOW()),
(2003, 4002, NOW()),
(2004, 4001, NOW()),
(2004, 4002, NOW()),
(2004, 4004, NOW()),
(2004, 4005, NOW()),
(2005, 4001, NOW()),
(2005, 4002, NOW()),
(2005, 4010, NOW()),
(2006, 4006, NOW()),
(2006, 4007, NOW()),
(2006, 4001, NOW()),
(2006, 4008, NOW()),
(2006, 4005, NOW()),
(2006, 4009, NOW()),
(2007, 4001, NOW()),
(2007, 4005, NOW()),
(2007, 4011, NOW()),
(2007, 4012, NOW()),
(2008, 4005, NOW()),
(2008, 4013, NOW()),
(2008, 4002, NOW()),
(2008, 4001, NOW()),
(2008, 4014, NOW()),
(2008, 4015, NOW()),
(2008, 4016, NOW()),
(2008, 4017, NOW()),
(2009, 4005, NOW()),
(2009, 4001, NOW()),
(2009, 4002, NOW()),
(2009, 4018, NOW()),
(2010, 4019, NOW()),
(2010, 4001, NOW()),
(2010, 4014, NOW()),
(2010, 4020, NOW()),
(2010, 4021, NOW()),
(2011, 4001, NOW()),
(2011, 4005, NOW());
