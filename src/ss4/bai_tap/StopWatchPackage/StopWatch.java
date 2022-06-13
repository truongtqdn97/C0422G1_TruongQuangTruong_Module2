package ss4.bai_tap.StopWatchPackage;

public class StopWatch {
    private long startTime, endTime;
    public StopWatch() {
    }
//    public StopWatch(long startTime, long endTime) {
//        this.startTime = startTime;
//        this.endTime = endTime;
//    }

    public long getStartTime() {
        return startTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return endTime;
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return this.getEndTime() - this.getStartTime();
    }
}
