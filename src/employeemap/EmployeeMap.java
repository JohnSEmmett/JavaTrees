
package employeemap;
import java.util.SortedMap;
import java.util.TreeMap;

public class EmployeeMap
{
private final SortedMap<Integer, String> map;

    public EmployeeMap() {
        this.map = new TreeMap<Integer, String>();
    }

public void add(Employee employee)
{
map.put(employee.getId(), employee.getName());
}

public String lookUp(int id)
{
return map.get(id);
}
}