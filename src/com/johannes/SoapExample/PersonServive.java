/**
 * 
 */
package com.johannes.SoapExample;

/**
 * @author JManaka
 *
 */
public interface PersonServive {
	
public boolean addPerson(Person p);
	
	public boolean deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();

}
