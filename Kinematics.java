import java.util.Scanner;

public class Kinematics{
    private static double u = 0.0;
    private static double v = 0.0;
    private static double t = 0.0;
    private static double x = 0.0;
    private static double a = 0.0;
    private static String initialVelocity = "";
    private static String finalVelocity = "";
    private static String time = "";
    private static String displacement = "";
    private static String acceleration = "";
    
    public static void main(String args[]){
        instantiate();
        decide();
    }

    public static void instantiate(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Initial Velocity :: ");
        initialVelocity = keyboard.next();
        if(initialVelocity.equals("00") || initialVelocity.equals("solve")){
        } else {
            u = Double.parseDouble(initialVelocity);
        }

        System.out.print("Final Velocity :: ");
        finalVelocity = keyboard.next();
        if(finalVelocity.equals("00") || finalVelocity.equals("solve")){
        } else {
            v = Double.parseDouble(finalVelocity);
        }
        
        System.out.print("Time :: ");
        time = keyboard.next();
        if(time.equals("00") || time.equals("solve")){
        } else {
            t = Double.parseDouble(time);
        }

        System.out.print("Displacement :: ");
        displacement = keyboard.next();
        if(displacement.equals("00") || displacement.equals("solve")){
        } else {
            x = Double.parseDouble(displacement);
        }

        System.out.print("Acceleration :: ");
        acceleration = keyboard.next();
        if(acceleration.equals("00") || acceleration.equals("solve")){
        } else {
            a = Double.parseDouble(acceleration);
        }
        keyboard.close();
    }
    public static void decide(){
        if(acceleration.equals("00")){
            System.out.println("\nThe answer is :: " + eq1() + "\n");
        }

        if(displacement.equals("00")){
            System.out.println("\nThe answer is :: " + eq2() + "\n");
        }

        if(finalVelocity.equals("00")){
            System.out.println("\nThe answer is :: " + eq3() + "\n");
        }

        if(time.equals("00")){
            System.out.println("\nThe answer is :: " + eq4() + "\n");
        }
    }
    public static double eq1(){
        if(initialVelocity.equals("solve")){
            return (2 * (x / t) - v);
        } else if(finalVelocity.equals("solve")){
            return (2 * (x / t) - u);
        } else if(displacement.equals("solve")){
            return (((v + u) / 2.0) * t);
        } else {
            return (x / ((v + u) / 2));
        }
    }
    public static double eq2(){
        if(initialVelocity.equals("solve")){
            return (v - (a * t));
        } else if(finalVelocity.equals("solve")){
            return (u + (a * t));
        } else if(time.equals("solve")){
            return ((v - u) / a);
        } else {
            return ((v - u) / t);
        }
    }
    public static double eq3(){
        if(initialVelocity.equals("solve")){
            return ((x / t) - ((a * t) / 2.0));
        } else if(displacement.equals("solve")){
            return ((u * t) + ((a * (Math.pow(t,2))) / 2.0));
        } else if(time.equals("solve")){
            if((((-1.0 * u) + (Math.sqrt(Math.pow(u,2)) + (2.0 * a * x))) / a) > 0){
                return (((-1.0 * u) + (Math.sqrt(Math.pow(u,2)) + (2.0 * a * x))) / a);
            }  else {
                return (((-1.0 * u) - (Math.sqrt(Math.pow(u,2)) + (2.0 * a * x))) / a);
            }
        } else {
            return ((2 * (x - (u * t))) / (Math.pow(t,2)));
        }
    }
    public static double eq4(){
        if(initialVelocity.equals("solve")){
            return (Math.sqrt(Math.pow(v,2) - (2.0 * a * x)));
        } else if(finalVelocity.equals("solve")){
            return (Math.sqrt(Math.pow(u,2) + (2.0 * a * x)));
        } else if(displacement.equals("solve")){
            return ((Math.pow(v,2) - Math.pow(u,2)) / (2.0 * a));
        } else {
            return ((Math.pow(v,2) - Math.pow(u,2)) / (2.0 * x));
        }
    }
        
}