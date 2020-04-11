import java.util.Comparator;

public class PubDateAscComparator implements Comparator {
    
    @Override
	public int compare(Object book1, Object book2) {
		int val = ((Integer)((Book) book1).getYear()).compareTo(((Integer) ((Book) book2).getYear()));

		if (val == 0) {
			return ((Book) book1).getTitle().compareTo(((Book) book2).getTitle());

		} 
		return val;
	}
    
}