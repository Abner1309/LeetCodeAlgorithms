import java.util.*;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (s == null || words == null || words.length == 0) return res;

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        // 1. Mapa de frequências fixo (O que precisamos encontrar)
        Map<String, Integer> counts = new HashMap<>();
        for (String w : words) counts.put(w, counts.getOrDefault(w, 0) + 1);

        // 2. Tentar todos os deslocamentos possíveis (0 até wordLen - 1)
        for (int i = 0; i < wordLen; i++) {
            int left = i, right = i, count = 0;
            Map<String, Integer> seen = new HashMap<>();

            // Janela deslizante saltando de wordLen em wordLen
            while (right + wordLen <= s.length()) {
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (counts.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    count++;

                    // Se pegamos mais cópias do que o necessário, encolhemos a janela pela esquerda
                    while (seen.get(word) > counts.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        count--;
                        left += wordLen;
                    }

                    // Se a contagem total bate, achamos um índice
                    if (count == wordCount) res.add(left);

                } else {
                    // Palavra não existe no dicionário: reseta tudo e pula para o próximo bloco
                    seen.clear();
                    count = 0;
                    left = right;
                }
            }
        }
        return res;
    }
}