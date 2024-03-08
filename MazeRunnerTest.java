import student.micro.jeroo.*;
import static student.micro.jeroo.CompassDirection.*;
import static student.micro.jeroo.RelativeDirection.*;
import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
/**
 *  A test class to test the methods introduced in the MazeRunner subclass.
 *  @author Taruni Addanki (tarunia)
 *  @version (2021.09.26)
 */
public class MazeRunnerTest
    extends TestCase
{
    //~ Fields ................................................................
    //private TestingIsland island;
    //private MazeRunner runner;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new MazeRunnerTest test object.
     */
    public MazeRunnerTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        //island = new TestingIsland();
        //runner = new MazeRunner();
        //island.addObject(runner, 1, 1);
        //island.addObject(new Flower(), 2, 1);
        //island.addObject(new Net(), 3, 1);
    }


    //~ Testing ----------------------------------------------------------
    /**
     * Tests collectFlowers()
     */
    public void testcollectFlowers()
    {
        TestingIsland island = new TestingIsland();
        MazeRunner runner = new MazeRunner();
        island.addObject(runner, 1, 1);
        island.addObject(new Flower(), 2, 1);
        //call the method
        runner.collectFlowers();
        //check expected results
        assertThat(runner.getX()).isEqualTo(2);
        assertThat(runner.getY()).isEqualTo(1);
        assertThat(runner.getFlowers()).isEqualTo(1);
        assertThat(island.hasFlowerAt(2, 1)).isTrue();
        assertThat(island.countFlowers()).isEqualTo(0);
    }
    /**
     * Tests disableNets()
     */
    public void testdisableNets()
    {
        TestingIsland island = new TestingIsland();
        MazeRunner runner = new MazeRunner();
        island.addObject(runner, 1, 1);
        island.addObject(new Net(), 3, 1);
        //call the method
        runner.disableNets();
        //check expected results
        assertThat(island.hasNetAt(3, 1)).isTrue();
        assertThat(runner.isClear(AHEAD));
        assertThat(island.countNets()).isEqualTo(0);
    }
    /**
     * Tests returnToStart()
     */
    public void testreturnToStart()
    {
        TestingIsland island = new TestingIsland();
        MazeRunner runner = new MazeRunner();
        island.addObject(runner, 1, 1);
        //call the method
        runner.returnToStart();
        //check expected results
        assertThat(runner.getX()).isEqualTo(2);
        assertThat(runner.getY()).isEqualTo(1);
    }
    /**
     * Tests avoidWater()
     */
    public void testavoidWater()
    {
        TestingIsland island = new TestingIsland();
        MazeRunner runner = new MazeRunner();
        island.addObject(runner, 1, 1);
        //call the method
        runner.avoidWater();
        //check expected results
        assertThat(runner.seesWater(AHEAD)).isTrue();
        assertThat(runner.getHeading()).isEqualTo(SOUTH);
    }
    /**
     * Tests moveForeward()
     */
    public void testmoveForeward()
    {
        TestingIsland island = new TestingIsland();
        MazeRunner runner = new MazeRunner();
        island.addObject(runner, 1, 1);
        //call the method
        runner.moveForeward();
        //check expected results
        assertThat(runner.isClear(AHEAD));
        assertThat(runner.getHeading()).isEqualTo(SOUTH);
    }
    /**
     * Tests clearMaze()
     */
    public void testclearMaze()
    {
        TestingIsland island = new TestingIsland();
        MazeRunner runner = new MazeRunner();
        island.addObject(runner, 1, 1);
        //call the method
        runner.clearMaze();
        //check expectde results
        assertThat(island.countNets()).isEqualTo(0);
        assertThat(island.countFlowers()).isEqualTo(0);
        assertThat(runner.getX()).isEqualTo(2); //1,1
        assertThat(runner.getY()).isEqualTo(1);
    }
}
