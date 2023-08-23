package datastructures.treeintersection;

import datastructures.tree.BinaryTree;
import datastructures.tree.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TreeIntersection {

  public static List<Integer> treeIntersection(BinaryTree treeOne, BinaryTree treeTwo){
    if(treeOne == null || treeTwo == null){
      return null;
    }
    HashSet<Integer> hash = new HashSet<>();
    List<Integer> outputList = new ArrayList<>();

    preorderHashHelper(treeOne.root, hash);
    preOrderListHelper(treeTwo.root,hash, outputList);

    return outputList;

  }

  public static void preorderHashHelper(Node node, HashSet<Integer> hash){
    if(node == null){return;}
    hash.add(node.value);
    preorderHashHelper(node.left, hash);
    preorderHashHelper(node.right,hash);
  }

  public static void preOrderListHelper(Node node, HashSet<Integer> hash, List<Integer> output){
    if(node == null){return;}
    if(hash.contains(node.value)){
      output.add(node.value);
    }
    preOrderListHelper(node.left, hash, output);
    preOrderListHelper(node.right,hash,output);
  }
}
