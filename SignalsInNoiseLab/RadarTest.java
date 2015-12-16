

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * This makes a new radar with the set size of 5x5
     * This sets the location of the monster so that it can be checked to make sure it is in the 
     * right place when checked
     * Then it detects where they think the monster is and then checks it with assertEquals
     * 
     */
    @Test
    public void testRadar()
    {
        Radar radar = new Radar(5,5);
        radar.setMonsterLocation(0,0);
        radar.setNoiseFraction(0.00);
        radar.scan();
        assertEquals(true, radar.isDetected(0,0));
    }
}
