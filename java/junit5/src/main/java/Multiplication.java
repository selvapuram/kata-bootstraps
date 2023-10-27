public class Multiplication {
    public int multiply(int param1, int param2) {
        int sum = 0;
        int iteration = Math.max(param1, param2);
        int noToAdd = Math.min(param1, param2);
        if(param1 < 0 && param2 < 0) {
            iteration = Math.abs(param1);
            noToAdd = Math.abs(param2);
        }
        for(int i = 0; i < iteration; i++) {
            sum += noToAdd;
        }
        return sum;
    }
}
