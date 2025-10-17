import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductRatingTest {
    public static void main(String[] args) {
        String csvFilePath = "E:/JavaCoding/StoresCSVFile/src/Product_Rating - Sheet1.csv";
        int aTotal = 0;
        int bTotal = 0;
        int cTotal = 0;
        int dTotal = 0;
        int eTotal = 0;

        int aAmountRatings = 0;
        int bAmountRatings = 0;
        int cAmountRatings = 0;
        int dAmountRatings = 0;
        int eAmountRatings = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                int i = -1;
                String[] values = line.split(",");
                for (String value : values) {
                    i++;
                    if (value.equals("A")) {
                        break;
                    }
                    if (!values[i].equals("0")) {
                        if (i == 0) {
                            aTotal += Integer.parseInt(values[i]);
                            aAmountRatings++;
                        } else if (i == 1) {
                            bTotal += Integer.parseInt(values[i]);
                            bAmountRatings++;
                        } else if (i == 2) {
                            cTotal += Integer.parseInt(values[i]);
                            cAmountRatings++;
                        } else if (i == 3) {
                            dTotal += Integer.parseInt(values[i]);
                            dAmountRatings++;
                        } else if (i == 4) {
                            eTotal += Integer.parseInt(values[i]);
                            eAmountRatings++;
                        }
                    }

                    System.out.print(value + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        ProductARating a = new ProductARating(aTotal, aAmountRatings);
        ProductBRating b = new ProductBRating(bTotal, bAmountRatings);
        ProductCRating c = new ProductCRating(cTotal, cAmountRatings);
        ProductDRating d = new ProductDRating(dTotal, dAmountRatings);
        ProductERating prodE = new ProductERating(eTotal, eAmountRatings);

        System.out.println(a.getRatingAverage());
        System.out.println(b.getRatingAverage());
        System.out.println(c.getRatingAverage());
        System.out.println(d.getRatingAverage());
        System.out.println(prodE.getRatingAverage());

    }
}