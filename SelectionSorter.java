public class SelectionSorter
{
    private Trailer[] a;
    /**
       Constructs the selection sorter
       @param anArray the array to sort
     */
    public SelectionSorter (Trailer[] anArray)
    {
        a = anArray;
    }

    /**
       Sorts the array managed by this selection sorter
     */
    public void sort ()
    {
        for (int i = 0 ; i < a.length - 1 ; i++)
        {
            int minPos = minimumPosition (i);
            swap (minPos, i, a);
        }
    }


    /**
       Finds the smallest element in a tail region of the array.
       The elements are String objects in this case, and the
       comparison is based on the compareTo method of String.
       @param from the first position of the tail region
       @return the position of the smallest element in tail region
     */
    private int minimumPosition (int from)
{

    String holder = a[from].getOwnerName();
    int position = from;
    for (int i = from ; i < a.length ; i++)
    {
        if (a[i].getOwnerName().compareTo (holder) < 0)
        {
            holder = a[i].getOwnerName();
            position = i;
        }

    }
    return position;                
}

        /**
           Swaps two entries of the array
           @param i the first position to swap
           @param j the second position to swap
         */
        private void swap (int i, int j, Trailer[] a)
        {
           Trailer temp = a[i];
           a[i] = a[j];
           a[j] = temp;
        }
    }