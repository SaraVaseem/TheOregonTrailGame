public class Location {

    String location;
    int milesTraveled;

    //update location based on miles traveled
    public static void updateLocation(int milesTraveled) {
        //update location
        if(milesTraveled == 0){
           location = "Independence"; 
        } else if(milesTraveled == 102){
            location = "Kansas River Crossing";
        } else if(milesTraveled == 204){
            location = "Big Blue River Crossing";
        } else if(milesTraveled == 300){
            location = "Fort Kearney";
        } else if(milesTraveled == 554){
            location = "Chimney Rock";
        } else if(milesTraveled == 640){
            location = "Fort Laramie";
        } else if(milesTraveled == 932){
            location = "Independence Rock";
        } else if(milesTraveled == 1024){
            location = "South Pass";
        } else if(milesTraveled == 1180){
            location = "Green River";
        } else if(milesTraveled == 1286){
            location = "Soda Springs";
        } else if(milesTraveled == 1440){
            location = "Fort Hall";
        } else if(milesTraveled == 1640){
            location = "Snake River Crossing";
        } else if(milesTraveled == 1864){
            location = "Fort Boise";
        } else if(milesTraveled == 1936){
            location = "Blue Mountains";
        } else if(milesTraveled == 2046){
            location = "Fort Walla Walla";
        } else if(milesTraveled == 2100){
            location = "The Dalles";
        } else if(milesTraveled == 2226){
            location = "Barlow Toll Road";
        } else if(milesTraveled == 2256){
            location = "Willamette Valley";
        }
    }
}
