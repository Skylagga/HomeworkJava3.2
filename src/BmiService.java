public class BmiService {

    public double calculate(double weight, double height) {

        double bodyMassIndex;

        bodyMassIndex = weight / (height * height);

        System.out.println("BMI for weight "+weight +"kg");
        System.out.println("height "+height +"m");
        System.out.println("is equivalent to "+bodyMassIndex +".");



        return bodyMassIndex;
    }


}

