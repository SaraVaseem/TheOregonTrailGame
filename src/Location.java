public class Location {

    String location;
    int milesTraveled;

    //updatethis.location based on miles traveled
    public void updateLocation(int milesTraveled) {
        //updatethis.location
        if(milesTraveled == 0){
           this.location = "Independence"; 
        } else if(milesTraveled == 102){
            this.location = "Kansas River Crossing";
        } else if(milesTraveled == 204){
            this.location = "Big Blue River Crossing";
        } else if(milesTraveled == 300){
            this.location = "Fort Kearney";
        } else if(milesTraveled == 554){
            this.location = "Chimney Rock";
        } else if(milesTraveled == 640){
            this.location = "Fort Laramie";
        } else if(milesTraveled == 932){
            this.location = "Independence Rock";
        } else if(milesTraveled == 1024){
            this.location = "South Pass";
        } else if(milesTraveled == 1180){
            this.location = "Green River";
        } else if(milesTraveled == 1286){
            this.location = "Soda Springs";
        } else if(milesTraveled == 1440){
            this.location = "Fort Hall";
        } else if(milesTraveled == 1640){
           this.location = "Snake River Crossing";
        } else if(milesTraveled == 1864){
           this.location = "Fort Boise";
        } else if(milesTraveled == 1936){
           this.location = "Blue Mountains";
        } else if(milesTraveled == 2046){
           this.location = "Fort Walla Walla";
        } else if(milesTraveled == 2100){
           this.location = "The Dalles";
        } else if(milesTraveled == 2226){
           this.location = "Barlow Toll Road";
        } else if(milesTraveled == 2256){
           this.location = "Willamette Valley";
        }
    }
}
