import java.util.*;
class PrimeFibo
{
	public static void main(String args[])
	{
	int n,m;
	List<Integer> list = new ArrayList<Integer>();
	List<Integer> list1 = new ArrayList<Integer>();
	n = Integer.parseInt(args[0]);
	m = Integer.parseInt(args[1]);
	
	System.out.println(n);
	System.out.println(m);
	
	while(n<m)
	{
		boolean flag = false;
		for(int i = 2; i<= n/2; ++i)
		{
			if(n % i == 0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
			list.add(n);
			//System.out.print(n + " ");
			
		++n;
		
	}
	System.out.println(list);

	int num = list.size();
	System.out.println(list.get(0));
	
	/*for(int i = 0; i<num; i++)
	{
		for(int j = 0; j<num; j++)
		{
			if(list.get(i) != list.get(j))
			{
				list1.add( (list.get(i)) + (list.get(j)));
			}
		}
	}
	System.out.println(list1);
						
	
	}
}