declare
    area number(5,2);
    radius number(3,1);
    pi constant number(3,2) := 3.14;
begin
    radius := &radius;
    if radius<0 then
    	dbms_output.put_line("radius cannot be negative ");
    else
    	area:=pi
    	for i in 1..2
    	loop
     	  dbms_output.put_line(' Area');
            area := area * (radius ** 2);
            dbms_output.put_line('The area of the circle is ' || area);
    	end loop;
    end if;
end;
/

