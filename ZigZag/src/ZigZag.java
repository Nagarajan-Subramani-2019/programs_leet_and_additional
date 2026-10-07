public class ZigZag {
    public static void main(String[] args) {

String s="PAYPALISHIRING";

int array_size=3;
int do_while_loop=0;
int x=0;

char[] arr = s.toCharArray();
int char_arr_increse=0;

char[][] result=new char[array_size][s.length()];

        for (int i = 0; i < result.length; i++)
            for (int j = 0; j < result[i].length; j++)
                result[i][j]='.';


while(do_while_loop<=s.length()/array_size) {
    for (int i = 0; i < array_size; i++)
    {
        ////System.out.print(i + ","+x+"       ");
        if(char_arr_increse>s.length()-1)
            break;
            result[i][x]=arr[char_arr_increse++];
    }
        x++;

    for (int j = array_size-2; j > 0; j--,++x)
    {
        //.out.print(j + ","+x+"      ");
        if(char_arr_increse>s.length()-1)
            break;
        result[j][x]=arr[char_arr_increse++];
    }

    //System.out.println();

    do_while_loop++;
}

        display(result);
}

public  static void display(char[][] result) {

    for (int i = 0; i < result.length; i++) {
        for (int j = 0; j < result[i].length; j++) {
            char value = result[i][j];
            System.out.print(value == '\0' ? ". " : value + " ");
        }

    System.out.println();
}

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if(result[i][j]=='.')
                continue;
                    System.out.print(result[i][j]);
            }

        }

    }

}
