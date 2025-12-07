import java.util.*;

class solution {
    String rev(String revers) { 
        StringBuilder sb = new StringBuilder(revers);
        return sb.reverse().toString();
    }

    String vow(String s) {
        Set<Character> block = new HashSet<Character>();
        block.add('a');
        block.add('e');
        block.add('i');
        block.add('o');
        block.add('u');
        block.add('A');
        block.add('E');
        block.add('I');
        block.add('O');
        block.add('U');

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (block.contains(s.charAt(i))) {
                char c = s.charAt(i);
                int ab = (int) s.charAt(i) + 1;
                result.append((char) ab);
            } else if (Character.isDigit(s.charAt(i)) && s.charAt(i) != '0') {
                int start = i;
                while (i < s.length() && Character.isDigit(s.charAt(i)) && s.charAt(i) != '0') {
                    i++;
                }
                StringBuilder digits = new StringBuilder(s.substring(start, i));
                result.append(digits.reverse());
                i--; // Adjust for the outer loop increment
            } else if (!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i))) {
                // Append special characters unchanged
                result.append(s.charAt(i));}
                else {

                char c = s.charAt(i);
                int ab = (int) s.charAt(i) - 1;
                result.append((char) ab);
            }
        }
        return result.toString();
    }

    public static void main(String args[]) {
        solution s = new solution();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String r = s.vow(str);
        System.out.println(r);
    }
}
