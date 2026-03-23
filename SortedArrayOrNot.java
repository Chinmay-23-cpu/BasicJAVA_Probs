// public class SortedArrayOrNot {
//     public static void main(String[] args)
//     {
//         int[] arr = {3,6,9,11,19,24};

//         boolean IsSorted = true;
//         for(int i = 0 ; i<5 ; i++)
//         {
          
//           for(int j = i+1 ; j<6 ; j++)
//           {
//               if(arr[i] >= arr[j])
//               {
//                 IsSorted = false;
//                 break;
//               }
//           }
//           if(IsSorted == false)
//           {
//             break;
//           }
//         }
//         if(IsSorted == false)
//         {
//             System.out.println("Array is not sorted");
//         }
//         else
//         {
//             System.out.println("Array is sorted");
//         }
//     }
// }


// O(N)
public class SortedArrayOrNot {
    public static void main(String[] args)
    {
        int[] arr = {3,6,9,11,19,22};
        int flag =1;
        for(int i = 0 ; i<5 ; i++)
        { 
            if(arr[i]>arr[i+1])
            {
                flag = 0;
                break;
            }
              
        }
        if(flag==1)
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is not sorted");
        }
        
    }
}

