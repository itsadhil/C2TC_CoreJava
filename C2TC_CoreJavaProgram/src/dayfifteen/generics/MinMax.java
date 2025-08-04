//Program to demonstrate generic interface
package dayfifteen.generics;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}

