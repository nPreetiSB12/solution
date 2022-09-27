java language

import java.util.*;
class calculator
{
public static void main(String args[])
{
double a,b,result;
char operation;
Scanner s=new scanner(System.in);
System.out.println("enter value of a and b");
a=s.nextDouble();
b=s.nextDouble();
System.out.println("enter operation: +,-,*,/");
operation=s.nextcharAt(0);
switch(operation)
{
case '+':
result=a+b;
System.out.println("result is"+result);
break;
case '-':
result=a-b;
System.out.println("result is"+result);
break;
case '*':
result=a*b;
System.out.println("result is"+result);
break;
case '/':
result=a/b;
System.out.println("result is"+result);
break;
}
}
}