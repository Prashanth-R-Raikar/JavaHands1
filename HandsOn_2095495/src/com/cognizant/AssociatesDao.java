
import java.util.List;

public interface AssociatesDao {
	
	public int addAssociates(Associates associates);
	public List<Associates> getAllAssociates();
	public Associates getAssociatesById(int id);
	public int updateAssociates(Associates associates);
	public int deleteAssociates(int id);

}
