package com.question.bank.leedcode.easy;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * @author hughjin
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(9);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(9);
        ListNode list2 = new ListNode(4);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(5);

        ListNode result = AddTwoNumbers.addTwoNumbers(list1, list2);
        // 564 + 949 = 1513
        System.out.println(result.val);
        System.out.println(result.next.val);
        System.out.println(result.next.next.val);
        System.out.println(result.next.next.next.val);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //返回值链表
        ListNode listNode = new ListNode(0);
        //操作数据的链表
        ListNode p = listNode;
        //最后一位数字
        int sum = 0;
        //判断，l1,l2为null sum不为0 表示进位
        while (l1 != null || l2 != null || sum != 0) {
            //l1为null l2即为result
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            //l2为null l1即为result
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            //给next赋值
            p.next = new ListNode(sum % 10);
            //进位数的值
            sum = sum / 10;
            //定位下个节点
            p = p.next;
        }
        //返回结果去掉头节点
        return listNode.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
