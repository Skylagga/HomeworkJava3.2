public class Main {
    public static void main(String[] args) {


        BmiService service = new BmiService();

        double bmi = service.calculate(100, 1.88);
        System.out.println(bmi);


    }
}






