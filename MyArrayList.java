package ArrayList1;

public class MyArrayList {
	int size=5;
int a[]=new int[size];
int index=0;
public MyArrayList() {
	super();
	// TODO Auto-generated constructor stub
}
public MyArrayList(int size) {
	super();
	a=new int[size];
}
public void add(int num)
{
	if(index>=a.length)
	{
		int b[]=new int[(int) (a.length*1.75)];
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
		}
		a=b;
	}
	boolean flag=false;
	for (int i = 0; i <index; i++) {
		if(a[i]==num)
		{
			flag=false;
		}
	}
	if(flag==false)
	{
		a[index++]=num;
	}
}
public void print()
{
	for (int i = 0; i < index; i++) {
		System.out.println(a[i]);
	}
}

}
