import java.awt.*;

public class main {
    public static void main(String[] args) {
        Turtle grizlee = new Turtle();
        grizlee.penColor(Color.darkGray);
        grizlee.width(23);

        for (int y = -250; y <= 250; y += 20) {
            grizlee.up();
            grizlee.setPosition(-250, y);
            grizlee.down();
            grizlee.forward(500);
        }
        //กล่อง
        grizlee.width(10);
        grizlee.up();
        grizlee.setPosition(-100,100);
        grizlee.down();
        grizlee.penColor(Color.red);
        grizlee.forward(200);
        grizlee.right(90);
        grizlee.forward(200);
        grizlee.right(90);
        grizlee.forward(200);
        grizlee.right(90);
        grizlee.forward(200);
        grizlee.right(90);
        grizlee.penColor(Color.green);
        grizlee.up();
        grizlee.setPosition(-100,0);
        grizlee.down();
        grizlee.forward(200);
        grizlee.up();
        grizlee.setPosition(0,100);
        grizlee.down();
        grizlee.right(90);
        grizlee.forward(200);
        grizlee.up();
        grizlee.setPosition(0,0);
        grizlee.down();
        grizlee.penColor(Color.blue);

       //โบซ้าย
        grizlee.right(15);
        grizlee.forward(15);
        grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);grizlee.right(15);
        grizlee.forward(15);
       //โบขวา
        grizlee.setPosition(0,0);
        grizlee.down();
        grizlee.penColor(Color.blue);
        grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);grizlee.forward(15);
        grizlee.left(15);


        double yTop = 230;
        double yMid = 200;
        double yBot = 170;

// M
        grizlee.up(); grizlee.setPosition(-235, yBot); grizlee.down();
        grizlee.setPosition(-235, yTop);
        grizlee.setPosition(-225, yMid);
        grizlee.setPosition(-215, yTop);
        grizlee.setPosition(-215, yBot);

// E
        grizlee.up(); grizlee.setPosition(-190, yTop); grizlee.down();
        grizlee.setPosition(-206, yTop);
        grizlee.setPosition(-206, yBot);
        grizlee.setPosition(-190, yBot);
        grizlee.up(); grizlee.setPosition(-206, yMid); grizlee.down();
        grizlee.setPosition(-194, yMid);

// R
        grizlee.up(); grizlee.setPosition(-181, yBot); grizlee.down();
        grizlee.setPosition(-181, yTop);
        grizlee.setPosition(-167, yTop);
        grizlee.setPosition(-167, yMid);
        grizlee.setPosition(-181, yMid);
        grizlee.setPosition(-165, yBot);

// R
        grizlee.up(); grizlee.setPosition(-156, yBot); grizlee.down();
        grizlee.setPosition(-156, yTop);
        grizlee.setPosition(-142, yTop);
        grizlee.setPosition(-142, yMid);
        grizlee.setPosition(-156, yMid);
        grizlee.setPosition(-140, yBot);

// Y
        grizlee.up(); grizlee.setPosition(-131, yTop); grizlee.down();
        grizlee.setPosition(-122, yMid);
        grizlee.setPosition(-113, yTop);
        grizlee.up(); grizlee.setPosition(-122, yMid); grizlee.down();
        grizlee.setPosition(-122, yBot);

// C
        grizlee.up(); grizlee.setPosition(-72, yTop); grizlee.down();
        grizlee.setPosition(-88, yTop);
        grizlee.setPosition(-88, yBot);
        grizlee.setPosition(-72, yBot);

// H
        grizlee.up(); grizlee.setPosition(-63, yBot); grizlee.down();
        grizlee.setPosition(-63, yTop);
        grizlee.up(); grizlee.setPosition(-47, yBot); grizlee.down();
        grizlee.setPosition(-47, yTop);
        grizlee.up(); grizlee.setPosition(-63, yMid); grizlee.down();
        grizlee.setPosition(-47, yMid);

// R
        grizlee.up(); grizlee.setPosition(-38, yBot); grizlee.down();
        grizlee.setPosition(-38, yTop);
        grizlee.setPosition(-24, yTop);
        grizlee.setPosition(-24, yMid);
        grizlee.setPosition(-38, yMid);
        grizlee.setPosition(-22, yBot);

// I
        grizlee.up(); grizlee.setPosition(-13, yTop); grizlee.down();
        grizlee.setPosition(-3, yTop);
        grizlee.up(); grizlee.setPosition(-8, yTop); grizlee.down();
        grizlee.setPosition(-8, yBot);
        grizlee.up(); grizlee.setPosition(-13, yBot); grizlee.down();
        grizlee.setPosition(-3, yBot);

// S
        grizlee.up(); grizlee.setPosition(22, yTop); grizlee.down();
        grizlee.setPosition(6, yTop);
        grizlee.setPosition(6, yMid);
        grizlee.setPosition(22, yMid);
        grizlee.setPosition(22, yBot);
        grizlee.setPosition(6, yBot);

// T
        grizlee.up(); grizlee.setPosition(31, yTop); grizlee.down();
        grizlee.setPosition(49, yTop);
        grizlee.up(); grizlee.setPosition(40, yTop); grizlee.down();
        grizlee.setPosition(40, yBot);

// M
        grizlee.up(); grizlee.setPosition(58, yBot); grizlee.down();
        grizlee.setPosition(58, yTop);
        grizlee.setPosition(68, yMid);
        grizlee.setPosition(78, yTop);
        grizlee.setPosition(78, yBot);

// A
        grizlee.up(); grizlee.setPosition(87, yBot); grizlee.down();
        grizlee.setPosition(96, yTop);
        grizlee.setPosition(105, yBot);
        grizlee.up(); grizlee.setPosition(91, yMid); grizlee.down();
        grizlee.setPosition(101, yMid);

// S
        grizlee.up(); grizlee.setPosition(114, yTop); grizlee.down();
        grizlee.setPosition(114, yMid);
        grizlee.setPosition(130, yMid);
        grizlee.setPosition(130, yBot);
        grizlee.setPosition(114, yBot);
        grizlee.up(); grizlee.setPosition(130, yTop); grizlee.down();
        grizlee.setPosition(114, yTop);
    }
}

