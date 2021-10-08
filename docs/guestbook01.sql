desc guestbook;

-- insert
insert into guestbook values(null, '하경훈','1234','안녕하세요',now());

-- select 
select no, name, date_format(reg_date,'%Y/%m/%d %H:%i:%s'), message from guestbook order by reg_date;

-- delete
delete from guestbook where no = 3 and password = '1234';


ALTER TABLE guestbook AUTO_INCREMENT=1;
SET @COUNT = 0;
UPDATE guestbook SET no = @COUNT:=@COUNT+1;