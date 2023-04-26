import java.util.Scanner;

public class ControlledWalk {
    public static void main(String[] args) {
        int[][] hurdles={{1,6},{2,3},{1,2},{3,5},{0,2},{5,7},{-1,-3},{-1,0},{-2,3},{-4,2},{2,6}};
        int startX=0,startY=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of steps");
        int n= sc.nextInt();
        for (int i=1; i<=n;i++) {
            System.out.println("enter direction to move");
            String direction=sc.next();
            if (direction.equals(">")) {
                startX += 1;
                for (int j = 0; j <=10; j++) {


                    if (startX == hurdles[j][0] && startY == hurdles[j][1]) {
                        System.out.println("you cannot move in this direction,there's a hurdle there");
                        startX -= 1;
                    }
                }
                System.out.println("current location:" + "(" + startX + "," + startY + ")");
            }



            else if (direction.equals("<")) {
                startX -= 1;
                for (int j = 0; j <= 10; j++) {
                    if (startX == hurdles[j][0] && startY == hurdles[j][1]) {
                        System.out.println("you cannot move in this direction,there's a hurdle there");
                        startX += 1;
                    }
                }
                System.out.println("current location:"+"("+startX+","+startY+")");
            }
            else if (direction.equals("^")) {
                startY += 1;
                for (int j = 0; j <= 10; j++) {

                    if (startX == hurdles[j][0] && startY == hurdles[j][1]) {
                        System.out.println("you cannot move in this direction,there's a hurdle there");
                        startY -= 1;
                    }
                }

                System.out.println("current location:"+"("+startX+","+startY+")");

            }
            else if (direction.equals("v")) {
                startY -= 1;
                for (int j = 0; j <=10; j++) {

                    if (startX == hurdles[j][0] && startY == hurdles[j][1]) {
                        System.out.println("you cannot move in this direction,there's a hurdle there");
                        startY += 1;
                    }
                }
                System.out.println("current location:"+"("+startX+","+startY+")");


            }


        }




        System.out.println("Your final location is: ("+startX+","+startY+")");


}
}



