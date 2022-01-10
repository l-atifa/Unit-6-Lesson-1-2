import java.util.*;
class Main {
  public static void main(String[] args) {
    int[] nums = new int[6]; //array with 6 
    nums[0]=5; //directly populating array with elements
    nums[1]=10;
    nums[2]=15;
    nums[3]=20;
    nums[4]=25;
    nums[5]=30;

    for(int i = 0; i<nums.length; i++)
    {
      //System.out.println(nums[i]); //brackets i to know which index element to print
      System.out.println("nums[" + i + "] = " + nums[i]);
    }
    
     for(int i = nums.length - 1; i>=0; i--)
    {
      //System.out.println(nums[i]); //brackets i to know which index element to print
      System.out.println("nums[" + i + "] = " + nums[i]);
    }

    System.out.println();

    //use array elements in a calculation
    int sum = nums[0]+ nums[1];
    System.out.println("sum = " + sum);
    nums[5] = nums[5]*2;
    System.out.println("nums[5] = "+ nums[5]);

    System.out.println();

    for(int i = 0; i<nums.length; i++)
    {
      nums[i] = nums[i] / 5; //take current value and divide by 5, restore in location
      System.out.println("nums[" + i + "] = " + nums[i]);
    }

    System.out.println();

    int[] nums2 = {5,10,15,20,25,30}; //initializer list
    for(int i = 0; i<nums2.length; i++)
    {
      nums2[i] = nums2[i] + 100; //take current value and divide by 5, restore in location
      System.out.println("nums2[" + i + "] = " + nums2[i]);
    }

    System.out.println();

    String[] candy = new String[5];
    Scanner it = new Scanner(System.in);
    int index = 0;
    while(index<candy.length-1)
    {
      System.out.println("Enter a candy: ");
      candy[index]= it.nextLine();
      System.out.println("candy[" + index + "] = " + candy[index]);
      index++;
    }

    System.out.println();

    //Searching for a string
    //String[] words = {"Have", "a", "nice", "day"};
    String words[] = {"Have", "a", "nice", "day"};
    int indexWhere2 = -1; //assume "nice" is not in the array
    for(int indexx = 0; indexx < words.length; indexx++)
    {
      if(words[indexx].equals("nice"))
      {
        indexWhere2 = indexx;
        break;
      }
    }
    if(indexWhere2 != -1)
    {
      System.out.println("Look (nice) has been found at " + index);
    }
    else
    {
      System.out.println("Look (nice) has not been found");
    }

    System.out.println();

    //Count values in an array
    int evens = 0;
    int odds = 0;
    for(int i = 0; i<nums.length; i++)
    {
      if(nums[i] % 2 == 0)
      {
        evens++;
      }
      else
      {
        odds++;
      }
    }
    System.out.println("Evens: " + evens + "\nOdds: " + odds);

    System.out.println();

    //Set flag if word has more than 4 letters
    boolean flag = false;
    for(int i = 0; i<words.length; i++)
    {
      if(words[i].length() >= 4)
      {
        flag = true;
        break;
      }
    }
    System.out.println("The array words has a word with more than 4 letters: " + flag);



  }
}