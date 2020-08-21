package Phone;

public class WaterTankAlarm {
    public void ControlWaterFlow() {
        int WaterLevel=3;
        if (WaterLevel==3){
            raiseAlarm();
            //System.out.println("Send an alarm!!!");
        }else if(WaterLevel>=4){
            stopValve();
            //System.out.println("Stop the valve!!!");
        }
        else{
            System.out.println("Tank is not yet full,Keep it on!");
        }
    }
    public void raiseAlarm(){
        System.out.println("Raise the Alarm.");
    }
    public void stopValve(){
        System.out.println("Stop the Valve!");
    }
}
