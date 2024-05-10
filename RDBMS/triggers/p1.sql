create or replace trigger t2 after insert or update on xy
begin
if inserting
then
       insert into testables values('insert done', current_TIMESTAMP);
else
      insert into testables values('update done', current_timestamp);
end if;
end;
/

