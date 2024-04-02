package ca.mcmaster.se2aa4.mazerunner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeedUpTest {
    @Test
    public void testSpeedUp(){
        Path path = new Path();
        path.addStep('F');
        path.addStep('R');
        path.addStep('F');


        Path pathh = new Path();
        pathh.addStep('F');
        pathh.addStep('L');
        pathh.addStep('R');

        SpeedUp var = new SpeedUp();
        Float ratio = var.speedUpRatio(path, pathh);
        // Assert the speedup value is approximately equal to 1.00
        assertEquals(2.00F, ratio);
    }

}