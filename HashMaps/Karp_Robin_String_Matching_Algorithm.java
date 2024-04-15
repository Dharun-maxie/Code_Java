package HashMaps;

public class Karp_Robin_String_Matching_Algorithm {
    public static  final int PRIME = 131;
    public static void main(String[] args) {
        String pattern = "ll";
        String Phrase = "hello";
        System.out.println(Search(pattern, Phrase));
    }
    public static boolean Search(String pattern, String Phrase)
    {
        double patternHash=getHash(pattern);
        double phaseHash=getHash(Phrase.substring(0,pattern.length()));

        for (int i = 0; i <= Phrase.length() - pattern.length(); i++) {
            if(phaseHash == patternHash && pattern.equals(Phrase.substring(i,i+pattern.length())))
                return true;
            if( i < Phrase.length() - pattern.length())
                phaseHash=UpdatedHash(phaseHash, Phrase.charAt(i), Phrase.charAt(i+pattern.length()), pattern.length());
        }

        return false;
    }

    public static double getHash(String pattern)
    {
        double hash= 0;
        for (int i = 0; i < pattern.length(); i++) {
            hash+=pattern.charAt(i)*Math.pow(PRIME, i);
        }
        return hash;
    }

    public static double UpdatedHash(double oldHash, char oldChar,char newChar, int newCharIndex)
    {
        double newHash= (oldHash - oldChar)/PRIME ;
        newHash = newHash + newChar * Math.pow(PRIME, newCharIndex-1);
        return newHash;
    }
}
