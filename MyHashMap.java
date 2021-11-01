
package HashMap;

public class MyHashMap {

	Node[] array=new Node[4];
	 
	public void put(int key, String value)
	{
		int index=key%array.length;
		if(array[index]==null)
		{
			array[index]=new Node(key,value);
		}
		else
		{
			Node temp=array[index];
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new Node(key, value);
		}
	}
	public String get(int key)
	{
		int index=key%array.length;
		if(array[index]==null)
		{
			return "Map is Empty";
		}
		else
		{
			Node temp=array[index];
			while(true)
			{
				if(temp.key==key)
				{
					return temp.value;
				}
				else if(temp.next==null)
				{
					return "key Not found";
				}
				else
				{
					temp=temp.next;
				}
			}
		}
	}
	void print()
	{
		for (int i = 0; i < array.length; i++) 
		{
			printMyHash(array[i]);
		}
	}
	private void printMyHash(Node node) {
		while(node!=null)
		{
			System.out.println(node.key+" "+node.value);
			node=node.next;
		}
		
	}
}
