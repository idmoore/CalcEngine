package com.novus.pluralsight;

 class Main {

    public static void main(String[] args) {

        double[] leftValues = {25.0d, 50.0d, 65.0d, 100.0d};
        double[] rightValues = {2.0d, 5.0d, 7.5d, 10.0d};
        char[] opCodes = {'a', 's', 'm', 'd'};
        double[] results = new double [opCodes.length];

        for (int i = 0; i < opCodes.length; i++ ) {
        switch (opCodes[i]) {
            case 'a' :
                results[i] = leftValues[i] + rightValues[i];
                break;
            case 's' :
                results[i] = leftValues[i] - rightValues[i];
                break;
            case 'd' :
                results[i] = leftValues[i] / rightValues[i] != 0.0d ? leftValues[i] / rightValues[i] : 0.0d;
                break;
            case 'm':
                results[i] = leftValues[i] * rightValues[i];
                break;
            default:
                System.out.println("Error, invalid opCode");
                results[i] = 0.0d;
                break;

                for(double theResult : results); {
                System.out.println("Result = ");
                System.out.print(results);

                    }  
        }





        }
    }
}
