declare
	str varchar2(20);
	rev varchar2(20);
	len number(5);
begin
	str:='&str';
	len:=length(str);
	for i in reverse 1..len
		loop
			rev:=rev||substr(str,i,1);
		end loop;
	dbms_output.put_line('Reverse = '||rev);
end;
/
