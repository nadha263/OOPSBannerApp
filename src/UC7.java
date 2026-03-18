public class UC7 {

static class PatternUtil {

     public static String[] getOPattern() {
            return new String[] {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            };}

       public static String[] getPPattern() {
            return new String[] {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
            };}

        public static String[] getSPattern() {
            return new String[] {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
            };}}

    public static void main(String[] args) {

        String[] oPattern = PatternUtil.getOPattern();
        String[] pPattern = PatternUtil.getPPattern();
        String[] sPattern = PatternUtil.getSPattern();

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + "   " +
                oPattern[i] + "   " +
                pPattern[i] + "   " +
                sPattern[i]
            );
        }}}

