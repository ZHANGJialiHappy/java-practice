public class FindIndex {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        FindIndex a = new FindIndex();
        System.out.println(a.strStr("sadbutsad", "sade"));
    }

}
