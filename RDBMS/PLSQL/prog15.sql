create or replace function add(x in number,y in number)
return number is
z number;
begin
	z:=x+y;
	return z;
end add;
/



declare
	a number;
	b number;
	c number;
begin
	a:=10;
	b:=10;
	c:=add(a,b);
	dbms_output.put_line('sum = '||c);
end;
/
