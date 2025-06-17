package MethodPractice.Level_3;

import java.util.*;

public class OtpGenerator {

    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static boolean Otp(int[] otps) {
        Set<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            uniqueOTPs.add(otp);
        }
        return uniqueOTPs.size() == otps.length;
    }

    public static void displayOTPs(int[] otps) {
        
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        displayOTPs(otpArray);

        boolean unique = Otp(otpArray);
        System.out.println("\nAre all OTPs unique? " + (unique ? "Yes" : "No"));
    }
}

