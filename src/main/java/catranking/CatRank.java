package catranking;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CatRank {

    public static void main(String[] args){
        List<CatItem> catList = new CSVParser().readCSVFileOfCats();
        catList.stream().sorted().forEach(System.out::println);
    }
}
