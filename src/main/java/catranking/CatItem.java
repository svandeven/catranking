package catranking ;

import java.util.Comparator;

public class CatItem implements Comparable{
    private final String name;
    private final int rank;

    public CatItem(String name, int rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "CatItem{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }

    public int compareTo(Object otherCat)  {
        return this.rank - ((CatItem)otherCat).getRank();
    }
}
