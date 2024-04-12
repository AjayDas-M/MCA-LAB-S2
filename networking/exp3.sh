x=5
y=10
if [ $x -gt $y ]
then
	echo "$x is greater than $y"
elif [ $x -ne $y ]
then
	echo "$y is greater than $x"
else
	echo "$x is equal to $y"
fi
