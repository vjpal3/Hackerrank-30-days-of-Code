import java.util.Comparator;

public class PubDateDescComparator implements Comparator {
    
    @Override
	public int compare(Object book1, Object book2) {
		
		if(((Book)book1).getYear() == ((Book)book2).getYear()) {
		    return ((Book) book1).getTitle().compareTo(((Book) book2).getTitle());
		}
		
		if(((Book)book1).getYear() > ((Book)book2).getYear()) {
		    return -1;
		}
		
		return 1;
	}
}