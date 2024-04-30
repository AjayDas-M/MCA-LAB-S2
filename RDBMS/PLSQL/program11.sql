declare
	fact number:=1;
	num number(3);
begin
	num:=&num;
	for i in 1..num
		loop
			fact:=fact*i;
		end loop;
	dbms_output.put_line('FActorial of '||num||' is '||fact);
end;
/
	
