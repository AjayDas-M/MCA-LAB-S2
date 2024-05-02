declare
    area number(5,2);
    par number(5,2);
    c number(2);
    radius number(3,1);
    pi constant number(3,2) := 3.14;
begin
    radius := &radius;
    for i in 1..2
    loop
        dbms_output.put_line('1. Area');
        dbms_output.put_line('2. Parameter');
        c := &c;
        if c = 1 then
            area := pi * (radius ** 2);
            dbms_output.put_line('The area of the circle is ' || area);
        elsif c = 2 then
            par := 2 * pi * radius;
            dbms_output.put_line('The parameter of the circle is ' || par);
        else
            dbms_output.put_line('Wrong choice!!!');
        end if;
    end loop;
end;
/

