package com.company;

public class CouchySchwarzTheoremChecker {

    public static double leftValue;
    public static double rightValue;
    public static double normOfUVector;
    public static double normOfVVector;
    public void showElements(double [] fVector, double [] sVector ) {
        System.out.println("All values of a vector 1::");

        for (int i = 0; i < fVector.length; i++) {
            System.out.println(fVector[i]);
        }
        System.out.println("All values of a vector 2::");
        for (int i = 0; i < sVector.length; i++) {
            System.out.println(sVector[i]);
        }
    }
    public  void checkCSHTheorem(double [] fVector, double [] sVector)
    {
        for (int i = 0; i < fVector.length; i++) {
            leftValue +=  fVector[i] * sVector[i];
        }
        leftValue = Math.abs(leftValue);
        if (leftValue == 0)
        {
            System.out.println("Vectors are orthogonal (Perpendicular)");
        }
        else {
            System.out.println("Left Value of a Theorem is:: "+leftValue);
            for (int i = 0; i < fVector.length; i++) {
                normOfUVector += fVector[i] * fVector[i];
            }
            normOfUVector = Math.sqrt(normOfUVector);
            for (int i = 0; i < fVector.length; i++) {
                normOfVVector += sVector[i] * sVector[i];
            }
            normOfVVector = Math.sqrt(normOfVVector);
            rightValue = normOfVVector * normOfUVector;
            System.out.println("Right Value of a Theorem is:: " + rightValue);
            System.out.println("Answer: " + leftValue + " <= " + rightValue);
        }
    }

}
