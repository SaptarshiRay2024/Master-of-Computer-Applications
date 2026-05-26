import java.util.Scanner;

class Score1
{
    String highest(String[] player, int[] score)
    {
        int high_score = score[0];
        int high_index = 0;
        int size = score.length;
        for (int i = 1; i < size; i++)
        {
            if (score[i] > high_score)
            {
                high_score = score[i];
                high_index = i;
            }
        }
        return player[high_index];
    }

    float average(int[] score)
    {
        int sum = 0;
        float avg;
        int size = score.length;
        for (int i = 0; i < size; i++)
        {
            sum = sum + score[i];
        }
        avg = sum / size;
        return avg;
    }

    String[] sort(String[] player, int[] score)
    {
        int size = score.length, x;
        String y;
        for (int i = 1; i < size; i++)
        {
            for (int j = 0; j < size - 1; j++)
            {
                if (score[j] > score[j+1])
                {
                    x = score[j];
                    y = player[j];
                    score[j] = score[j+1];
                    player[j] = player[j+1];
                    score[j+1] = x;
                    player[j+1] = y;
                }
            }
        }
        return player;
    }

    int search(String[] player, String name)
    {
        int size = player.length;
        for (int i = 0; i < size; i++)
        {
            if (player[i].equals(name))
            {
                return i;
            }
        }
        return -1;
    }
}

class Score
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] player = {"ABCD", "EFGH", "IJKL", "MNOP", "QRST"};
        int[] score = {10, 30, 60, 20, 70};
        int size = score.length;

        Score1 s1 = new Score1();

        System.out.println("Player with highest score : " + s1.highest(player, score));

        System.out.println("Average score : " + s1.average(score));

        String[] sorted_player = s1.sort(player, score);
        System.out.println("Sorted player list");
        for (int i = 0; i < size; i++)
        {
            System.out.print(sorted_player[i] + " ");
        }
        System.out.println();

        String name;
        System.out.print("Enter name of player : ");
        name = sc.nextLine();
        if (s1.search(player, name) == -1)
        {
            System.out.println("Player not found");
        }
        else
        {
            System.out.println("Player found at index : " + s1.search(player, name));
        }
        sc.close();
    }
}
