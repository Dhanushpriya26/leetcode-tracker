// Last updated: 9/25/2026, 9:49:38 AM
1public class Solution {
2    private static final Map<Character, Integer> A = new HashMap<>();
3    static { A.put('A',0); A.put('C',1); A.put('G',2); A.put('T',3); }
4    private final int A_SIZE_POW_9 = (int) Math.pow(A.size(), 9);
5
6    public List<String> findRepeatedDnaSequences(String s) {
7        Set<String> res = new HashSet<>();
8        Set<Integer> hashes = new HashSet<>();
9        for (int i = 0, rhash = 0; i < s.length(); i++) {
10            if (i > 9) rhash -= A_SIZE_POW_9 * A.get(s.charAt(i-10));
11            rhash = A.size() * rhash + A.get(s.charAt(i));
12            if (i > 8 && !hashes.add(rhash)) res.add(s.substring(i-9,i+1));
13        }
14        return new ArrayList<>(res);
15    }
16}