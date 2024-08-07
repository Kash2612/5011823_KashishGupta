public class FutureValue {
    public static double calculateFutureValue(double startValue, double inflation, int time){
        if(time==0){
            return startValue;
        }
        return calculateFutureValue(startValue, inflation,time-1)*(1+inflation);
    }
}
