package leetcode.algorithm.SearchSuggestionSystem;

public class TrieNode {
    TrieNode[] children;
    boolean endOfWords;
    Integer idx;
    boolean visited;

    public TrieNode(Integer idx) {
        this.children = new TrieNode[26];
        this.endOfWords = false;
        this.idx = idx;
        this.visited = false;
    }

    public TrieNode[] getChildren() {
        return this.children;
    }

    public boolean isEndOfWords() {
        return this.endOfWords;
    }

    public void setEndOfWords() {
        this.endOfWords = true;
    }

    public Integer getIdx() {
        return this.idx;
    }
}
