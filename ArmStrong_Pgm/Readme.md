ArmStrong Number
Sum of the cubes of the digits should be equal to number itself Armstrong

Example N=153

int original_num = N;

int temp;

//LOGIC HERE//
153 =>3=>3^3

temp = (temp)3=>Store the result in the other variable  "Armstrong"

so we use the operation for extracting last element from the given number

temp=n%10;
temp = 153%10
temp = 3;

apply "Math.pow(temp,3)" operation to cube the digit
(3)3 =>27   // Move this cube into varibale called "ArmStrong"

Now 153 , 3 is over Move to 5
eliminate it  as N=N/10;
N = 153/10;
N = 15;

if(Armstrong == orginal_no)
	ArmStrong;
else
	Not ArmStrong;