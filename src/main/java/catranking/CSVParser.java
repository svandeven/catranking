package catranking;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.Reader;
import java.util.*;

public class CSVParser {



    public static List<CatItem> readCSVFileOfCats() {
        List<CatItem> catList = new ArrayList();;
        Reader in;
        try {
           in = new FileReader("src/main/resources/Cats.csv");
           Iterable<CSVRecord> records = CSVFormat.DEFAULT.withHeader().parse(in);
           for (CSVRecord record : records) {
            String name = record.get("Name");
            int rank = Integer.parseInt(record.get("TopTen"));
               catList.add(new CatItem(name,rank));
            }
            in.close();
        } catch (Exception e) {
            System.out.println("error opening or processing file " + e.toString());
        }

        return catList;
    }





}
