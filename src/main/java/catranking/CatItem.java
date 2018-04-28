package catranking ;

import java.util.Comparator;

public class CatItem {
    private final String name;
    private final int rank;

    public CatItem(String name, int rank){
        this.name = name;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.rank + ":" + this.name;
    }


}

class SortbyRank implements Comparator<CatItem>
{
    public int compare(CatItem a, CatItem b)
    {
        return a.getRank() - b.getRank();
    }
}

