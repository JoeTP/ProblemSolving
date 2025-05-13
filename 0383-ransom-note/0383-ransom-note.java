class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
 if (ransomNote.isEmpty()) {
            return true;
        }

        if (magazine.isEmpty()) {
            return false;
        }

        Map<Character, Integer> freqMag = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            freqMag.merge(c, 1, Integer::sum);
        }

        for (char c : ransomNote.toCharArray()) {
            int count = freqMag.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            freqMag.put(c, count - 1);
        }

        return true;
    }
}