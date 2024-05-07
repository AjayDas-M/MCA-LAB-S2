create or replace function findmax(x in number,y in number)
	return number is 
	z number;
	begin
		if x>y then
			z:=x;
		else
			z:=y;
		end if;
		return z;
	end findmax;
/

declare
	a number;
	b number;
	c number;
begin
	a:=23;
	b:=45;
	c:=findmax(a,b);
	dbms_output.put_line('The maximux is: '||c);
end;
/
