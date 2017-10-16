package binSearch;

/**
 * Simple Class with two in for a Pair
 */
public class Pair 
{
	private int lower;
	private int higher;
	
	Pair(int lower, int higher)
	{
		this.lower = lower;
		this.higher = higher;
	}

	// Generiert duch eclipse
	@Override
	public int hashCode() {
		final int prime = 101;
		int result = 1;
		result = prime * result + higher;
		result = prime * result + lower;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair other = (Pair) obj;
        return higher == other.higher && lower == other.lower;
    }

	@Override
	public String toString() {
		return "("+ lower + ", " + higher + ")";
	}
}
