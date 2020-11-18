import java.util.List;
 
/**
 * Defines DAO operations for the products model.
 * @author Caroline Rives
 *
 */
public interface ProductsDAO {
     
    public void saveOrUpdate(Contact contact);
     
    public void delete(int contactId);
     
    public Contact get(int contactId);
     
    public List<Contact> list();
}