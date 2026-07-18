class Solution {
    double power(double b, int e) {

        long pow = e;
        double ans = 1.0;

        // Handle negative exponent
        if (pow < 0) {
            b = 1 / b;
            pow = -pow;
        }

        // Binary Exponentiation
        while (pow > 0) {

            // If power is odd
            if (pow % 2 == 1) {
                ans = ans * b;
            }

            // Square the base
            b = b * b;

            // Divide power by 2
            pow = pow / 2;
        }

        return ans;
    }
}