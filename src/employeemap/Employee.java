/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemap;

/**
 *
 * @author jsemm
 */
public class Employee
{
private String name;
private int id;

/**
* Creates a new Employee
*
* @param name Employee's name
* @param id Employee's id
*/
public Employee(String name, int id)
{
this.name = name;
this.id = id;
}

public int getId()
{
return id;
}
public String getName()
{
return name;
}
}
