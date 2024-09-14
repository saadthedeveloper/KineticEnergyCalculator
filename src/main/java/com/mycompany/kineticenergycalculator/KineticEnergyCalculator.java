/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kineticenergycalculator;
import javax.swing.JOptionPane;
/**
 * A simple Java program to calculate the kinetic energy of an object
 * using its mass and velocity as inputs from the user.
 * The formula for kinetic energy is: KE = 0.5 * mass * velocity^2.
 * This class contains methods to input mass, velocity, calculate kinetic energy,
 * and display the result.
 * 
 * @author msaad
 */
public class KineticEnergyCalculator {

    /**
     * The main method that serves as the entry point of the program.
     * It calls the output method to start the process.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        output();
    }
    
    /**
     * Prompts the user to input the object's mass in kilograms.
     * The method uses a dialog box to get input and parses it into a double.
     *
     * @return The mass of the object as a double.
     */
    public static double massInput() {
        double mass;
        mass = Double.parseDouble(JOptionPane.showInputDialog("Enter the object's mass (in kilograms)"));
        return mass;
    }
    
    /**
     * Prompts the user to input the object's velocity in meters per second.
     * The method uses a dialog box to get input and parses it into a double.
     *
     * @return The velocity of the object as a double.
     */
    public static double velocityInput() {
        double velocity;
        velocity = Double.parseDouble(JOptionPane.showInputDialog("Enter the object's velocity (in meters per second)"));
        return velocity;
    }
    
    /**
     * Calculates the kinetic energy of the object using the formula:
     * KE = 0.5 * mass * velocity^2.
     * It calls the {@link #massInput()} and {@link #velocityInput()} methods to get the necessary values.
     *
     * @return The calculated kinetic energy as a double.
     */
    public static double kineticEnergy() {
        double velocity = velocityInput();
        double mass = massInput();
        double kineticEnergy;
     
        kineticEnergy = 0.5 * mass * (velocity * velocity);
        
        return kineticEnergy;
    }
    
    /**
     * Displays the calculated kinetic energy in a message dialog.
     * The result is shown to the user in joules.
     */
    public static void output() {
        JOptionPane.showMessageDialog(null, "Kinetic energy based on provided inputs is " + kineticEnergy() + " joules");
    }
}
