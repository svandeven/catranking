import catranking.CatItem;
import catranking.CatRank;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.*;
import java.util.Arrays;
public class SortedCatListTest {

    @Test
    public void sortedCatListTest() {
        CatItem a = new CatItem("Bob",2);
        CatItem b = new CatItem("Rita",1);
        CatItem c = new CatItem("Sue",3);
        List<CatItem> catList = Arrays.asList(a,b,c);
        List<CatItem> orderedCatList =  Arrays.asList(b,a,c);
        assertEquals(orderedCatList, catList.stream().sorted().collect(toList()));
    }


}
