/*
 
    - Create class "PhysicsConstants" 
	which contains public static final variables for various physics constants
    eg. speed_of_light, gravitational_constant etc.
    
	
	- Implement a method Calculate_Energy(double mass) which uses speed of light to calculate energyusing E = mc^2.
    - Try to modify this value in another method to observer the results

 */
class PhysicsConstants {

    public static final long speedOfLight = 299792458;
    double mass;
    double energy;

    void Calculate_Energy(double mass) {
        energy = mass * speedOfLight * speedOfLight;
        System.out.println("The energy of the mass is :" + energy);
    }
}

public class Exercise2 {

    public static void main(String[] args) {
        PhysicsConstants p = new PhysicsConstants();
        p.mass = 6.7;
        p.Calculate_Energy(p.mass);
    }
}
