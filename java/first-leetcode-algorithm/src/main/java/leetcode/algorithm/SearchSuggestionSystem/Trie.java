package leetcode.algorithm.SearchSuggestionSystem;

public class Trie {
    TrieNode root;

    public Trie() {
        this.root = new TrieNode(null);
    }

    public void insert(String words) {
        TrieNode cur = this.root;
        for (char c : words.toCharArray()) {
            Integer idx = c - 'a';
            if (cur.getChildren()[idx] == null) {
                cur.getChildren()[idx] = new TrieNode(idx);
                // System.out.println(idx);
            }
            cur = cur.getChildren()[idx];
        }
        // System.out.println("end");
        cur.setEndOfWords();
    }

    public TrieNode getPrefixNode(String prefix) {
        TrieNode cur = this.root;
        for (char c : prefix.toCharArray()) {
            int idx = c - 'a';
            if (cur.getChildren()[idx] == null) {
                return null;
            }
            cur = cur.getChildren()[idx];
        }
        return cur;
    }

}
