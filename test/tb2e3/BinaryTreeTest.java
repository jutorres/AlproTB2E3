package tb2e3;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTreeTest {
    
    public BinaryTreeTest() {
    }
    
    @Test
    public void testPrintLength() {
        BinaryTree tree = new BinaryTree();
        
        tree.add(9);
        tree.add(11);
        tree.add(10);
        
        List<Integer> ar = tree.printLength();
        
        assertEquals(Arrays.asList(9, 11, 10), ar);
    }
    
    @Test
    public void testPrintLength1() {
        BinaryTree tree = new BinaryTree();
        
        tree.add(7);
        tree.add(9);
        tree.add(6);
        tree.add(5);
        
        List<Integer> ar = tree.printLength();
        
        assertEquals(Arrays.asList(7, 6, 9, 5), ar);
    }
    
    @Test
    public void testPrintLength2() {
        BinaryTree tree = new BinaryTree();
        
        tree.add(8);
        tree.add(12);
        tree.add(4);
        tree.add(2);
        tree.add(15);
        
        List<Integer> ar = tree.printLength();
        
        assertEquals(Arrays.asList(8, 4, 12, 2, 15), ar);
    }
    
    @Test
    public void testPrintLength3() {
        BinaryTree tree = new BinaryTree();
        
        tree.add(4);
        tree.add(7);
        tree.add(3);
        tree.add(11);
        tree.add(20);
        tree.add(18);
        
        List<Integer> ar = tree.printLength();
        
        assertEquals(Arrays.asList(4, 3, 7, 11, 20, 18), ar);
    }
    
    @Test
    public void testPrintLength4() {
        BinaryTree tree = new BinaryTree();
        
        tree.add(10);
        tree.add(12);
        tree.add(15);
        tree.add(17);
        tree.add(18);
        tree.add(20);
        tree.add(21);
        
        List<Integer> ar = tree.printLength();
        
        assertEquals(Arrays.asList(10, 12, 15, 17, 18, 20, 21), ar);
    }
    
    @Test
    public void testPrintLength5() {
        BinaryTree tree = new BinaryTree();
        
        tree.add(10);
        tree.add(8);
        tree.add(12);
        tree.add(7);
        tree.add(9);
        tree.add(11);
        tree.add(13);
        
        
        List<Integer> ar = tree.printLength();
        
        assertEquals(Arrays.asList(10, 8, 12, 7, 9, 11, 13), ar);
    }
    
    @Test
    public void testPrintLength6() {
        BinaryTree tree = new BinaryTree();
        
        tree.add(15);
        tree.add(10);
        tree.add(20);
        tree.add(6);
        tree.add(13);
        tree.add(17);
        tree.add(24);
        tree.add(4);
        tree.add(7);
        tree.add(12);
        tree.add(14);
        tree.add(16);
        tree.add(18);
        tree.add(23);
        tree.add(25);
        
        
        List<Integer> ar = tree.printLength();
        
        assertEquals(Arrays.asList(15, 10, 20, 6, 13, 17, 24, 4, 7, 12, 14, 16, 18, 23, 25), ar);
    }
    
    @Test
    public void testPrintLength7() {
        BinaryTree tree = new BinaryTree();
        
        tree.add(10);
        tree.add(8);
        tree.add(11);
        
        
        List<Integer> ar = tree.printLength();
        
        assertEquals(Arrays.asList(10, 8, 11), ar);
    }
    
    @Test
    public void testPrintLength8() {
        BinaryTree tree = new BinaryTree();
        
        tree.add(20);
        tree.add(10);
        tree.add(30);
        tree.add(5);
        tree.add(15);
        tree.add(25);
        tree.add(35);
        tree.add(3);
        tree.add(8);
        tree.add(13);
        tree.add(18);
        tree.add(23);
        tree.add(28);
        tree.add(33);
        tree.add(38);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(9);
        tree.add(12);
        tree.add(14);
        tree.add(17);
        tree.add(19);
        tree.add(22);
        tree.add(24);
        tree.add(27);
        tree.add(29);
        tree.add(32);
        tree.add(34);
        tree.add(37);
        tree.add(39);

        
        List<Integer> ar = tree.printLength();
        
        assertEquals(Arrays.asList(20, 10, 30, 5, 15, 25, 35, 3, 8, 13, 18, 23, 28, 33, 38, 2, 4, 
                                    6, 9, 12, 14, 17, 19, 22, 24, 27, 29, 32, 34, 37, 39), ar);
    }
    
    @Test
    public void testPrintLength9() {
        BinaryTree tree = new BinaryTree();
        
        tree.add(60);
        tree.add(30);
        tree.add(120);
        tree.add(15);
        tree.add(45);
        tree.add(105);
        tree.add(135);
        tree.add(7);
        tree.add(24);
        tree.add(37);
        tree.add(54);
        tree.add(97);
        tree.add(114);
        tree.add(127);
        tree.add(144);
        tree.add(5);
        tree.add(12);
        tree.add(18);
        tree.add(26);
        tree.add(35);
        tree.add(42);
        tree.add(48);
        tree.add(58);
        tree.add(95);
        tree.add(102);
        tree.add(108);
        tree.add(116);
        tree.add(125);
        tree.add(129);
        tree.add(141);
        tree.add(148);
        tree.add(4);
        tree.add(6);
        tree.add(10);
        tree.add(13);
        tree.add(17);
        tree.add(19);
        tree.add(25);
        tree.add(27);
        tree.add(34);
        tree.add(36);
        tree.add(41);
        tree.add(43);
        tree.add(47);
        tree.add(49);
        tree.add(57);
        tree.add(59);
        tree.add(94);
        tree.add(96);
        tree.add(101);
        tree.add(103);
        tree.add(107);
        tree.add(109);
        tree.add(115);
        tree.add(117);
        tree.add(124);
        tree.add(126);
        tree.add(128);
        tree.add(130);
        tree.add(140);
        tree.add(142);
        tree.add(147);
        tree.add(149);
        
        List<Integer> ar = tree.printLength();
        
        assertEquals(Arrays.asList(60, 30, 120, 15, 45, 105, 135, 7, 24, 37, 54, 97, 114, 127, 144,
                                    5, 12, 18, 26, 35, 42, 48, 58, 95, 102, 108, 116, 125, 129, 141, 148,
                                     4, 6, 10, 13, 17, 19, 25, 27, 34, 36, 41, 43, 47, 49, 57, 59, 94,96,
                                       101, 103, 107, 109, 115, 117, 124, 126, 128, 130, 140, 142, 147, 149), ar);
    }
    
}
