class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();

        for(String str : strs) {
            int len = str.length();
            encodedStr.append(len);
            encodedStr.append('#');
            encodedStr.append(str);
        }
        return encodedStr.toString();
    }

    public List<String> decode(String str) {
        int lenStr = str.length();

        List<String> strs = new ArrayList<>();
        int i = 0;
        while(i < lenStr) {
            int j = i;
            while (str.charAt(i) != '#') {
                i++;
            }
            int strLen = Integer.parseInt(str.substring(j, i));
            i++;
            strs.add(str.substring(i, i + strLen));
            i += strLen;
        }
        return strs;
    }
}
