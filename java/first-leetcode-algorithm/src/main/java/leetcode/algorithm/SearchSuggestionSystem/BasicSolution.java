package leetcode.algorithm.SearchSuggestionSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BasicSolution extends Solution {

    /* trie + DFS */

    @Override
    public List<List<String>> searchSuggestionSystem(String[] products, String searchWord) {
        // use trie tree to store the products
        // the trie tree need to be sort in lexicographically
        // when add a word and add a list to the result

        List<List<String>> results = new ArrayList();
        Trie productTree = createProductsTree(products);
        String prefix = "";

        for (char c : searchWord.toCharArray()) {
            List<String> subResults = new ArrayList();
            prefix += c;
            int count = 0;

            TrieNode prefixNode = productTree.getPrefixNode(prefix);
            if (prefixNode == null) {
                results.add(subResults);
                continue;
            }

            Stack<TrieNode> stack = new Stack();
            Stack<String> stackRes = new Stack();
            stack.push(prefixNode);
            stackRes.push("");

            // DFS
            while (count < 3 && !stack.isEmpty()) {
                TrieNode cur = stack.pop();
                String curStr = stackRes.pop();
                if (cur.isEndOfWords()) {
                    subResults.add(prefix + curStr);
                    count++;
                }

                for (int i = 25; i >= 0; i--) {

                    if (cur.getChildren()[i] != null) {
                        char letter = (char) ('a' + i);
                        stack.push(cur.getChildren()[i]);
                        stackRes.push(curStr + letter);
                    }
                }
            }

            results.add(subResults);
        }
        return results;
    }



    public Trie createProductsTree(String[] products) {
        Trie productTree = new Trie();
        for (String product : products) {
            productTree.insert(product);
        }
        return productTree;
    }

}
