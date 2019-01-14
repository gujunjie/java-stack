package project01;

public class MyStack {
	
	private int[] elements;
	
	public MyStack()
	{
		elements=new int[0];
	}
	
	public void push(int data)
	{
		int[] newArr=new int[elements.length+1];//�½�һ������Ϊԭ�����鳤�ȼ�1��������
		for(int i=0;i<elements.length;i++)
		{
			newArr[i]=elements[i];//��ԭ�������Ԫ�ؽ��и���
		}
		newArr[newArr.length-1]=data;//����ĩβ������Ԫ��
		elements=newArr;
		
	}
	
	public int pop()
	{   
		
		if(isEmply())
		{
			throw new RuntimeException("ջ��û��Ԫ��");
		}
		else {
			
		int pop=elements[elements.length-1];//�ֲ�������¼ջ��Ԫ��
		int[] newArr=new int[elements.length-1];//�½�һ�����鱣���ջ���Ԫ��ջ
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
			throw new RuntimeException("ջ��û��Ԫ��");
		}
		else 
		{
		return elements[elements.length-1];
		}
	}

}
