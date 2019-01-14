package project01;

public class MyStack {
	
	private int[] elements;
	
	public MyStack()
	{
		elements=new int[0];
	}
	
	public void push(int data)
	{
		int[] newArr=new int[elements.length+1];//新建一个长度为原来数组长度加1的新数组
		for(int i=0;i<elements.length;i++)
		{
			newArr[i]=elements[i];//把原来数组的元素进行复制
		}
		newArr[newArr.length-1]=data;//数组末尾插入新元素
		elements=newArr;
		
	}
	
	public int pop()
	{   
		
		if(isEmply())
		{
			throw new RuntimeException("栈内没有元素");
		}
		else {
			
		int pop=elements[elements.length-1];//局部变量记录栈顶元素
		int[] newArr=new int[elements.length-1];//新建一个数组保存出栈后的元素栈
		for(int i=0;i<elements.length-1;i++)
		{
			newArr[i]=elements[i];
		}
		elements=newArr;
		return pop;
		}
		
	
	}
	
	public boolean isEmply()
	{
		return elements.length==0;
	}
	
	public int size()
	{
		return elements.length;
	}
	
	public int peek()
	{   
		
		if(isEmply())
		{
			throw new RuntimeException("栈内没有元素");
		}
		else 
		{
		return elements[elements.length-1];
		}
	}

}
