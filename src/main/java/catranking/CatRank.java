package catranking;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatRank {

    public static void main(String[] args){
        List<CatItem> catList =  new ArrayList();
        catList = CSVParser.readCSVFileOfCats();
        Collections.sort(catList, new SortbyRank());
        printList(catList);
    }

    public static List<CatItem> sortByRank(List<CatItem> catList){
        Collections.sort(catList, new SortbyRank());
        return catList;
    }


    private static void printList(List<CatItem> list){
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}
