package catranking;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;
import static java.nio.charset.StandardCharsets.UTF_8;

public class CSVParser {


    private static final String OUTPUT_FILE = "/Users/svandeven/temp/catranking/src/main/resources/Cats.csv";

    public List<CatItem> readCSVFileOfCats() {
        List<CatItem> catList = new ArrayList<>();
        try (InputStreamReader in = new InputStreamReader(new FileInputStream(OUTPUT_FILE),UTF_8)) {
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.withHeader().parse(in);
             for (CSVRecord record : records) {
            String name = record.get("Name");
            int rank = Integer.parseInt(record.get("TopTen"));
               catList.add(new CatItem(name,rank));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return catList;
    }





}
