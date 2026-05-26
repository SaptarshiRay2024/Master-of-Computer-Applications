class Assignment_2_2a
{
    int CheckPassword(char[] str, int n)
    {
        boolean four_char = false;
        boolean one_num = false;
        boolean one_cap = false;
        boolean no_space = false;
        boolean no_num = false;
        if (n >= 4)
        {
            four_char = true;
        }
        for (int i=0 ; i<n ; i++)
        {
            if (Character.isDigit(str[i]))
            {
                one_num = true;
                break;
            }
        }
        for (int i=0 ; i<n ; i++)
        {
            if (Character.isUpperCase(str[i]))
            {
                one_cap = true;
                break;
            }
        }
        for (int i=0 ; i<n ; i++)
        {
            if (str[i] != ' ')
            {
                no_space = true;
            }
        }
        if (!Character.isDigit(str[0]))
        {
            no_num = true;
        }
        if (four_char && one_num && one_cap && no_space && no_num)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}

class Assignment_2_2
{
    public static void main(String[] args)
    {
        String str1 = "aA1_67";
        String str2 = "a987 abC012";
        int n1 = str1.length();
        int n2 = str2.length();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Assignment_2_2a obj1 = new Assignment_2_2a();
        System.out.println(obj1.CheckPassword(ch2, n2));
    }
}