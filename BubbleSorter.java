public class BubbleSorter
{
   private Trailer[] a;

   /**
      Constructs a bubble sorter.
      @param anArray the array to sort
   */
   public BubbleSorter(Trailer[] anArray)
   {
      a = anArray;
   }

   /**
      Sorts the array managed by this bubble sorter.
   */
   public void sort()
   {
      boolean swapped = true;
      for (int i = a.length - 1; i > 0 && swapped; i--)
      {
         swapped = false;
         for (int j = a.length - 1; j >= a.length - i; j--)
         {
            if (a[j].getBuildingNum() < a[j - 1].getBuildingNum())
            {
               swap(j, j - 1, a);
               swapped = true;
            }
         }
      }
   }

   /**
      Swaps two entries of the array.
      @param i the first position to swap
      @param j the second position to swap
   */
   private void swap(int i, int j, Trailer[] a)
   {
      Trailer temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
}