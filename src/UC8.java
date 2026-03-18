import java.util.HashMap;

public class UC8{

    public static HashMap<Character, String[]> createMap() {

        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "

        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "

        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        return map;
    }

    public static void displayBanner(String A, HashMap<Character, String[]> map) {

        for (int i = 0; i < 7; i++) {

            StringBuilder sb = new StringBuilder(); 
            for (char ch : A.toCharArray()) {
                sb.append(map.get(ch)[i]).append("   ");
            }

            System.out.println(sb.toString());
        }}

    public static void main(String[] args) {

        HashMap<Character, String[]> map = createMap();
        String A = "OOPS";

        displayBanner(A, map);
    }}

