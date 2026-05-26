class Assignment_2_1a
{
    String common_prefix(String[] arr1)
    {
        String common = "";
        String first = arr1[0];
        char prefix;
        int n = arr1.length;
        int j = 0;
        int c = 0;
        for (int i=1 ; i<n ; i++)
        {
            prefix = charAt(j);
            if (prefix == arr1[i].charAt(j))
            {
                c++;
            }
            
        }
    }
}

class Assignment_2_1
{
    public static void main(String[] args)
    {
        String[] arr1 = {"flower","flow","flight"};
        String[] arr2 = {"dog","race","car"};
        Assignment_2_1a obj1 = new Assignment_2_1a();
        String common = obj1.common_prefix(arr1);
        System.out.println(common);
    }
}