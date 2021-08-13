final class a
{
void display()
{
System.out.print("a");
}
}
class b extends a//error beacuse we cannot inherit final class
{
void print()
{
System.out.print("s");
}
}



class finalcls
{
public static void main(String geetu[])
{
b obj=new b();
obj.print();
}
}
