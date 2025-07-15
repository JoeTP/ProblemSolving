class Solution {
    public boolean isValid(String word) {
        String vowel = "aeiou";
        boolean hasVowel = false;
        boolean hasCon = false;
        if (word.length() >= 3) {
            for (int i = 0; i < word.length(); i++) {
                char letter = word.toLowerCase().charAt(i);
                if (!Character.isLetter(letter) && !Character.isDigit(letter)) return false;
if (Character.isLetter(letter)) {
    if (vowel.contains(String.valueOf(letter))) {
        hasVowel = true;
    } else {
        hasCon = true;
    }
}
            }
        }

        return hasVowel && hasCon;
    }
}