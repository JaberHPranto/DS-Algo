package theory.data_structure.strings;

public class String_Builder {
//    String is mutable whereas StringBuilder is immutable
//    so when we call append on StringBuilder ref variable, it doesn't create new object every time rather mutate the old object

    public static void main(String[] args) {
        StringBuilder series = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series.append(ch);
        }

        System.out.println(series);

        series.deleteCharAt(0);
        System.out.println(series);

        System.out.println(series.indexOf("f"));

        series.reverse();
        System.out.println(series);


    }
}
