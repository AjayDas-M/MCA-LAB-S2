declare
area number(5,2);
radius number(3,1);
pi constant number(3,2):=3.14;
begin
	radius:=&radius;
	area:=pi*power(radius,2);
	dbms_output.put_line('The area of the circle '||radius||' is '||area);
end;
/
