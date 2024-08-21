class Solution {
    public String reverseWords(String s) {
        // Convert the input string to a StringBuilder for easier modification
        StringBuilder result = new StringBuilder();

        // Split for all spaces
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++){
            // Make a new Stringbuilder for each word
            StringBuilder sb = new StringBuilder(arr[i]);
            //Append that to the result substring -- reversed
            result.append(sb.reverse());
            //Append space after each word
            result.append(" ");
        }
        // Return as string with no leading spaces
        return result.toString().trim();

    }}