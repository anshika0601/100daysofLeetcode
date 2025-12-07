public class karprabinalgo {
    private final int prime=101;

    private double calculateHash(String str) {
        double hash=0;
        for(int i=0;i<str.length();i++) {
            hash=hash+str.charAt(i)+Math.pow(prime,i);
        }
        return hash;

    }
    private double updateHash(double prevHash,char old,char new,int patternLength) {
        double newHash=(prevHash-oldchar)/prime;//rolling hash
        newHash=newHash+new*math.pow(prime,patternLength-1);
        return newHash;

    }
    public void searchFor(String text,String pattern) {
        int patternLength=pattern.length;
        double patternHash=calculateHash(pattern);
        double textHash=calculateHash(text.substring(patternLength));
        for(int i=0;i<text.length-patternLength;i++) {
            if(textHash==patternHash) {
            if(text.substring(i,i+patternLength).equals(pattern)) {
                System.out.println("pattern found at iindex",i);

            }
        }
        if(i<text.length()-patternLength) {
            textHash=updateHash(textHash,text.charAt(i),text.charAt(i+patternLength),patternLength);
        }

        }
    }
    
}
