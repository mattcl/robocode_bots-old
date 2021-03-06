/**
 * Constants.java
 */
package rampancy_old.util;

import java.awt.Color;

/**
 * This class stores all of the constants used by Durandal
 * @author Matt Chun-Lum
 *
 */
public abstract class Constants {

    // ------------------ General --------------- //
    public static final int VERSION_FOR_DATA = 1;
    
    
    public static final double MAX_RADAR_TRACKING_AMOUNT = Math.PI / 4.0;
    public static final double RAM_TOLERANCE = Math.PI/40.0;
    public static final double DELTA_TOLERANCE = 0.01;
    public static final double STARTING_ENERGY = 100;
    
    public static final double ABSOLUTE_MINIMUM_DISTANCE = 150;
    public static final double IDEAL_DISTANCE = 200;
    
    
    // ------------ Stats ------------- //
    public static final int MIN_SUPER_NODE_VISIT_COUNT = 10;
    
    
    // ------------- Weapon Constants ---------- //
    public static final int NUM_WEAPONS = 2;
    
    public static final int STANDARD_GUN_INDEX = 0;
    public static final String STANDARD_GUN_NAME = "standard gun";
    public static final Color STANDARD_GUN_COLOR = Color.green;
    
    public static final int PM_GUN_INDEX = 1;
    public static final String PM_GUN_NAME = "pattern matching gun";
    public static final Color PM_GUN_COLOR = Color.pink;
    
    
    // ------------- Statistics Constants -------------- //

    public static final double STANDARD_WEIGHTING = 1;
    public static final double STANDARD_ROLL_DEPTH = 10;

    public static final double GUESS_FACTOR_TOLERANCE = 0.2;

}
