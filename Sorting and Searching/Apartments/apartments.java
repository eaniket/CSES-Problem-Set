import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class apartments {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());

        int[] applicants = Arrays.stream(reader.readLine().split(" "))
                                  .mapToInt(Integer::parseInt)
                                  .toArray();

        int[] apartments = Arrays.stream(reader.readLine().split(" "))
                                  .mapToInt(Integer::parseInt)
                                  .toArray();

        Arrays.sort(applicants);
        Arrays.sort(apartments);

        int count = getApartmentCount(applicants, apartments, k);

        writer.write(Integer.toString(count));
        writer.newLine();

        writer.flush();
    }

    private static int getApartmentCount(int[] applicants, int[] apartments, int k) {
        int count = 0;
        int i = 0;
        int j = 0;

        while (i < applicants.length && j < apartments.length) {
            if (Math.abs(applicants[i] - apartments[j]) <= k) {
                count++;
                i++;
                j++;
            } else if (applicants[i] < apartments[j]) {
                i++;
            } else {
                j++;
            }
        }

        return count;
    }
}
