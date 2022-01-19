import processing.core.PApplet;

/*
 * 4 balls move from left to right
 * ball 1 is at 1/5 from top, with speed of 1 unit per frame
 * ball 2 is 2/5 from top, with speed of 2 unit per frame
 * ball 3 is 3/5 from top, with speed of 3 unit per frame
 * ball 4 is 4/5 from top, with speed of 4 unit per frame
 * attempt 1 -> procedural
 * attempt 2 -> OOP
 */
public class ProceduralFourBalls extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int SIZE_OF_BALL = 10;
    int speedOfBall1 = 0;
    int speedOfBall2 = 0;
    int speedOfBall3 = 0;
    int speedOfBall4 = 0;

    public static void main(String[] args) {
        PApplet.main("ProceduralFourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle(HEIGHT / 5, 1, speedOfBall1);
        drawCircle(2 * HEIGHT / 5, 2, speedOfBall2);
        drawCircle(3 * HEIGHT / 5, 3, speedOfBall3);
        drawCircle(4 * HEIGHT / 5, 4, speedOfBall4);
    }

    private void drawCircle(int distanceFromTop, int frameRate, int currentBallSpeed) {
        ellipse(currentBallSpeed, distanceFromTop, SIZE_OF_BALL, SIZE_OF_BALL);
        switch (frameRate) {
            case 1:
                speedOfBall1 += frameRate;
                break;
            case 2:
                speedOfBall2 += frameRate;
                break;
            case 3:
                speedOfBall3 += frameRate;
                break;
            case 4:
                speedOfBall4 += frameRate;
                break;
        }
    }
}
