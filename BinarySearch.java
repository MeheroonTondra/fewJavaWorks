public class BinarySearch {
 
    public static int searchString(Trailer[] names, String key) {
    int first = 0;
    int last  = names.length;
 
    while (first < last) {
        int mid = (first + last) / 2;
        if (key.compareTo(names[mid].getOwnerName()) < 0) {
            last = mid;
        } else if (key.compareTo(names[mid].getOwnerName()) > 0) {
            first = mid + 1;
        } else {
            return mid;
        }
    }
    return -(first + 1);
  }
}
 