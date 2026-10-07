import java.util.Arrays;

public class only_solution {
    public static void main(String[] args) {

        String s="PAYPALISHIRING";
        System.out.println(convert(s,3));

    }

    public  static String convert(String s, int numRows) {

        // String s="PAYPALISHIRING";

        int array_size = numRows;
        int do_while_loop = 0;
        int x = 0;

        char[] arr = s.toCharArray();
        int char_arr_increse = 0;

        char[][] result = new char[array_size][s.length()];

        while (do_while_loop <= s.length() / array_size) {
            for (int i = 0; i < array_size; i++) {
                ////System.out.print(i + ","+x+"       ");
                if (char_arr_increse > s.length() - 1)
                    break;
                result[i][x] = arr[char_arr_increse++];
            }
            x++;

            for (int j = array_size - 2; j > 0; j--, ++x) {
                //.out.print(j + ","+x+"      ");
                if (char_arr_increse > s.length() - 1)
                    break;
                result[j][x] = arr[char_arr_increse++];
            }

            //System.out.println();

            do_while_loop++;
        }


        char[][] cleaned = Arrays.stream(result)
                .map(row -> new String(row)
                        .replace(".", "")
                        .replace("\0", "")
                        .toCharArray())
                .toArray(char[][]::new);

     //   for (char[] row : cleaned) {
      //      System.out.println(row);

      //  }
      //  String str = new String(Arrays.toString(cleaned));

      //  String str = Arrays.stream(cleaned)
      //          .map(String::new)
      //          .collect(java.util.stream.Collectors.joining());

        //System.out.println(str);
        String str = Arrays.stream(result)
                .map(row -> new String(row).replace("\0", ""))
                .collect(java.util.stream.Collectors.joining());
        return str;

    }

    public  static void display(char[][] result) {

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if(result[i][j]=='.')
                    continue;
                System.out.print(result[i][j]);
            }

        }

    }
}
