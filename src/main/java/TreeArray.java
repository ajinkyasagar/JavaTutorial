import java.util.ArrayList;

public class TreeArray {
    public static int countLeaves(int[] tree) {
       
                    
        int count=0;
        for (int index = 0; index < tree.length; index++)
        {
        	Boolean flag=false;
        	
        	for(int index1 = 0; index1 < tree.length; index1++ )
        	{
        		if(index==tree[index1])
        		{
        			flag=true;
        			break;
        		}
        	}
        	if(flag==false)
        	{
        		count++;
        	}
        
        }
      
        
        
		return count;
        
        
    }

    public static void main(String[] args) {
        System.out.println(TreeArray.countLeaves(new int[] { 1, 3, 1, -1, 3 }));
    }
}