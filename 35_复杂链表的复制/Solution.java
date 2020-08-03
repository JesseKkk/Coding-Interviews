/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null)return null;
        RandomListNode currentNode = pHead;
        
        //复制节点
        while(currentNode != null){
            RandomListNode cloneNode = new RandomListNode(currentNode.label);
            RandomListNode nexNode = currentNode.next;
            currentNode.next = cloneNode;
            cloneNode.next = nexNode;
            currentNode = nexNode;
        }
        
        //复制random
        currentNode = pHead;
        while(currentNode != null){
            currentNode.next.random = currentNode.random == null ? null : currentNode.random.next;
            currentNode = currentNode.next.next;
        }
        
        //拆分链表
        currentNode = pHead;
        RandomListNode pCloneHead = pHead.next;
        while(currentNode != null){
            RandomListNode cloneNode = currentNode.next;
            currentNode.next = cloneNode.next;
            cloneNode.next = cloneNode.next == null ? null : cloneNode.next.next;
            currentNode = currentNode.next;
        }
        return pCloneHead;
    }
}