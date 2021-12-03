package main.geeksforgeks;// This Example is same as above but
// using object method reference to
// sort with custom comparator
import java.io.*;
import java.util.*;

// Object need to be sorted.
class Person {
	private String name;
	private Integer age;

	// Constructor
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public Integer getAge() { return age; }
	public String getName() { return name; }
}

// Comparator class
class ComparisonProvider {
	// A method to compare with name
	public int compareByName(Person a, Person b)
	{
		return a.getName().compareTo(b.getName());
	}

	// A method to compare with age
	public int compareByAge(Person a, Person b)
	{
		return a.getAge().compareTo(b.getAge());
	}
}

public class GFG {
	// Main
	public static void main(String[] args)
	{
		// List of person
		List<Person> personList = new ArrayList<>();
		// Add Elements
		personList.add(new Person("vicky", 24));
		personList.add(new Person("poonam", 25));
		personList.add(new Person("sachin", 19));

		// A comparator class with multiple
		// comaparator methods
		ComparisonProvider comparator
			= new ComparisonProvider();

		// Use instance method reference
		// to sort array by name
		Collections.sort(personList,
						comparator::compareByName);
		System.out.println("Sort by name :");
		personList.stream()
			.map(x -> x.getName())
			.forEach(System.out::println);

		// Use instance method reference
		// to sort array by age
		Collections.sort(personList,
						comparator::compareByAge);
		System.out.println("Sort by age :");
		personList.stream()
			.map(x -> x.getName())
			.forEach(System.out::println);
	}
}
