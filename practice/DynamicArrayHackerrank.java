package practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    	List<Integer> result = new ArrayList<>();
    	if(queries == null) return result;
    	int lastAnswer = 0;
    	List<List<Integer>> arr = new ArrayList<>();
    	
    	for(int i = 0; i < n; i++) {
    		arr.add(new ArrayList<Integer>());
    	}
    	
    	for(int i = 0; i < queries.size(); i++) {
    		List<Integer> q = queries.get(i);
    		int x = q.get(1);
    		int y = q.get(2);
    		int index = (x ^ lastAnswer) % n;
    		if(q.get(0) == 1) {
    			arr.get(index).add(y);
    		} else {
    			List<Integer> seq = arr.get(index);
    			lastAnswer = seq.get(y % seq.size());
    			result.add(lastAnswer);
    			System.out.println(lastAnswer);
    		}
    	}
    	return result;
    }

}

public class DynamicArrayHackerrank {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.dynamicArray(n, queries);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
