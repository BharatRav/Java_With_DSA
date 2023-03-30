package String.Leetcode;

public class RobotBoundedInCircle {
    public boolean isRobotBounded(String instructions) {
        // enter your code here.

        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
        if (instructions.length()==0) {
            return false;
        }

        int x =0,y=0;

        String direction ="North";

        for (char ch: instructions.toCharArray()) {
            if (ch=='G') {
                if (direction.equals("North")) {
                    y+=1;
                }
                else if (direction.equals("South")) {
                    y-=1;
                }
                else if (direction.equals("East")) {
                    x+=1;
                }
                else {
                    x-=1;
                }
            }
            else if (ch=='L') {
                if(direction.equals("North")) {
                    direction="West";
                }
                else if(direction.equals("West")) {
                    direction ="South";
                }
                else if(direction.equals("South")) {
                    direction ="East";
                }
                else {
                    direction ="North";
                }
            }
            else if (ch=='R') {
                if(direction.equals("North")) {
                    direction="East";
                }
                else if(direction.equals("West")) {
                    direction ="North";
                }
                else if(direction.equals("South")) {
                    direction ="West";
                }
                else {
                    direction ="South";
                }
            }
        }

        if(x==0 && y==0) {
            return true;
        }

        if (direction.equals("North")) {
            return false;
        }
        return true;
    }
}
