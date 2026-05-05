public class DXC2 {


            public static void main(String[] args) {
                try {
                    int result = 10 / 0;
                    System.out.println("Result: " + result);
                } catch (Exception e) {
                    throw new RuntimeException("Calculation failed");
                } finally {
                    System.out.println("Cleanup code executed");
                }
            }
        }


