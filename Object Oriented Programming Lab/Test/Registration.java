import java.util.Scanner;

class Registration1
{
    String check_attherate(String email)
    {
        if (email.contains("@"))
        {
            return "Email address contains @";
        }
        else
        {
            return "Email address does not contain @";
        }
    }

    String check_dot(String email)
    {
        if (email.contains("."))
        {
            return "Email address contains dot";
        }
        else
        {
            return "Email address does not contain dot";
        }
    }

    String check_username(String username)
    {
        if (username.isEmpty())
        {
            return "Username cannot be empty";
        }
        else
        {
            return "Username is valid";
        }
    }

    String check_password(String password)
    {
        boolean len = false, cap = false, num = false, sym = false;
        if (password.length() > 8)
        {
            len = true;
        }
        for (int i = 0 ; i < password.length() ; i++)
        {
            if (Character.isUpperCase(password.charAt(i)))
            {
                cap = true;
                break;
            }
        }
        for (int i = 0 ; i < password.length() ; i++)
        {
            if (Character.isDigit(password.charAt(i)))
            {
                num = true;
                break;
            }
        }
        for (int i = 0 ; i < password.length() ; i++)
        {
            if (Character.isLetterOrDigit(password.charAt(i)))
            {
                sym = true;
                break;
            }
        }
        if (len && cap && num && sym)
        {
            return "Password meets all conditions";
        }
        else
        {
            return "Password does not meet conditions";
        }
    }

    String upper_to_lower(String username)
    {
        String lower_username = username.toLowerCase();
        return lower_username;
    }

    String substring(String email)
    {
        int index = email.indexOf("@");
        String domain = email.substring(index + 1);
        return domain;
    }
}

class Registration
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String email, username, password;
        System.out.print("Enter email address : ");
        email = sc.nextLine();
        System.out.print("Enter username : ");
        username = sc.nextLine();
        System.out.print("Enter password : ");
        password = sc.nextLine();
        Registration1 obj1 = new Registration1();
        System.out.println(obj1.check_attherate(email));
        System.out.println(obj1.check_dot(email));
        System.out.println(obj1.check_username(username));
        System.out.println(obj1.check_password(password));
        System.out.println(obj1.upper_to_lower(username));
        System.out.println(obj1.substring(email));
        sc.close();
    }
}
