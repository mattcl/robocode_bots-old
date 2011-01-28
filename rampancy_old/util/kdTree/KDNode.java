/**
 * KDNode.java
 */
package rampancy_old.util.kdTree;

import java.util.*;

/**
 * This interface specifies a KDNode for use in a KDTree
 * @author Matthew Chun-Lum
 *
 */
public class KDNode<T> {
    public int depth;
    public int axis;
    public T median;
    public KDNode<T> left;
    public KDNode<T> right;
    
    /**
     * @return {@code true} if this node is a leaf
     */
    public boolean isLeaf() {
        return (left == null && right == null);
    }
}
