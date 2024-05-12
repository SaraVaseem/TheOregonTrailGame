import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner myObj = new Scanner(System.in);
        int choice = 0;
        //myObj.close();
        //add choice functionality

        while(choice != 1){
            System.out.println("-------\r\n" +
            "\r\n" + //
            "\r\n" + //
            "------------------------------------------\r\n" + //
            "The Oregon Trail \r\n" + //
            "\r\n" + //
            "You may:\r\n" + //
            "    1. Travel the trail \r\n" + //
            "    2. Learn about the trail\r\n" + //
            "    3. See the Oregon Top Ten \r\n" + //
            "    4. Turn sound off \r\n" + //
            "\r\n" + //
            "What is your choice ?");
            try{
                choice = myObj.nextInt();
                if (choice == 1) {
                    //travel the trail
                } else if (choice == 2) {
                    System.out.println("What was it like to cross 2,000 miles of plains, rivers, and mountains in 1848?\r\n" + //
                        "The Oregon Trail\" allows you relive one of the greatest adventures in\r\n" + //
                        "American history:  the journey taken by thousands of emigrants on the\r\n" + //
                        "Oregon Trail.  It was a long, difficult journey--one that often resulted in\r\n" + //
                        "failure and death.  But for those who succeeded, it led to a new and better\r\n" + //
                        "life in the rich, fertile Willamette Valley of Oregon.  \r\n" + //
                        "\r\n" + //
                        "How will you make life-and-death decisions?  How will you cross the rivers?\r\n" + //
                        "How much and what kind of supplies should you take along?  If you run low on\r\n" + //
                        "provisions, will you be able to hunt or trade to get the food you need?  Will\r\n" + //
                        "you overcome the dangers of disease and severe weather?\r\n" + //
                        "\r\n" + //
                        "\"The Oregon Trail\" poses these and other exciting challenges.\r\n" + //
                        "\r\n" + //
                        "If for some reason you don't survive--your wagon burns, thieves steal your \r\n" + //
                        "oxen, you run out of provisions, or you die of cholera--don't give up!  Unlike\r\n" + //
                        "the real-life pioneers of 1848, you can try again and again until you succeed \r\n" + //
                        "and your name is added to \"The Oregon Trail List of Legends.\"\r\n" + //
                        "\r\n" + //
                        "The object of \"The Oregon Trail\" is for you to make it all the way from\r\n" + //
                        "Independence, Missouri, to Oregon's Willamette Valley.  Along the way, you'll\r\n" + //
                        "have many decisions to make.");
                } else if (choice == 3) {
                    //see the Oregon Top Ten (extra)
                } else if (choice == 4) {
                    //turn sound off (extra)
                } else {
                    System.out.println("Invalid input, try again.");
                }
            } catch (InputMismatchException e){
                myObj.nextLine();
                System.out.println("Invalid input, try again.");
            }
        }// end while loop

        int multiplier = 1;
        int money = 0;
        String occupation = "Banker";
        int role = 4;
        while(role == 4){
            System.out.println("------------------------------------------\r\n" + //
            "\r\n" + //
            "\r\n" + //
            "------------------------------------------\r\n" + //
            "    Many kinds of people made the trip to Oregon.\r\n" + //
            "\r\n" + //
            "    You may:\r\n" + //
            "        1. Be a banker from Boston\r\n" + //
            "        2. Be a carpenter from Ohio \r\n" + //
            "        3. Be a farmer from Illinois\r\n" + //
            "        4. Find out the differences between these choices\r\n" + //
            "\r\n" + //
            "        what is your choice ?");
            try{
                role = myObj.nextInt();
                //add role functionality
                if (role == 1) {
                    //+1600 money left & normal points
                    money = 1600;
                    multiplier = 1;
                    occupation = "Banker";
                } else if (role == 2) {
                    //+800 money left & twice as many points
                    money = 800;
                    multiplier = 2;
                    occupation = "Carpenter";
                } else if (role == 3) {
                    //+ 400 money left & thrice as many points
                    money = 400;
                    multiplier = 3;
                    occupation = "Farmer";
                } else if (role == 4) {
                    System.out.println("------------------------------------------\r\n" + //
                        "            Traveling to Oregon isn't easy! But if you're a banker, you'll have more money for supplies\r\n" + //
                        "            and services than a carpenter or a farmer.\r\n" + //
                        "\r\n" + //
                        "            However, the harder you have to try, the more points you deserve!\r\n" + //
                        "            Therefore, the farmer earns the greatest number of points and the banker earns the least.\r\n" + //
                        "\r\n" + //
                        "            Press SPACE BAR to continue \r\n" + //
                        "\r\n" + //
                        "------------------------------------------");
                    //go back to choices
                } else {
                    System.out.println("Invalid choice, try again.");
                }
            } catch(InputMismatchException e){
                myObj.nextLine();
                System.out.println("Invalid choice, try again.");
            }
        } // end while loop

        boolean isNotCorrect = true;
        String wagon_leader_name = "Joe";
        String member_1 = "Joe";
        String member_2 = "Joe";
        String member_3 = "Joe";
        String member_4 = "Joe";

        while(isNotCorrect){
            System.out.println("------------------------------------------\r\n" + //
            "\r\n" + //
            "------------------------------------------\r\n" + //
            "        What is the first name of the wagon leader?");
            wagon_leader_name = myObj.nextLine();
    
            System.out.println("        What are the first names of the four other members of your party ?\r\n" + //
                "1. ");
            member_1 = myObj.nextLine();
    
            System.out.println("2. ");
            member_2 = myObj.nextLine();
    
            System.out.println("3. ");
            member_3 = myObj.nextLine();
    
            System.out.println("4. ");
            member_4 = myObj.nextLine();
    
            //add verification
            System.out.println("Are these names correct ? ");
            String verify = myObj.nextLine();

            if(verify.equals("yes") || verify.equals("y")) {
                isNotCorrect = false;
            }

        } // end while loop
        // WagonLeader wagonLeader = new WagonLeader(wagon_leader_name, occupation);
        // WagonMember member1 = new WagonMember(member_1);
        // WagonMember member2 = new WagonMember(member_2);
        // WagonMember member3 = new WagonMember(member_3);
        // WagonMember member4 = new WagonMember(member_4);

        // Wagon wagon = new Wagon(wagonLeader, member1, member2, member3, member4, multiplier, money);

        int month = -1;
        while(month < 1 || month > 5){
            System.out.println("------------------------------------------\r\n" +
            "\r\n" + //
            "\r\n" + //
            "------------------------------------------\r\n" + //
            "[ Going back to 1848 ]" + "\r\n" + //
            "------------------------------------------\r\n" + //
            "        It is 1848. Your jumping off place for Oregon is Independence, Missouri.\r\n" + //
            "        You must decide which month to leave Independence.\r\n" + //
            "\r\n" + //
            "            1. March\r\n" + //
            "            2. April \r\n" + //
            "            3. May \r\n" + //
            "            4. June \r\n" + //
            "            5. July \r\n" + //
            "            6. Ask for advice\r\n" + //
            "\r\n" + //
            "        What is your choice ?");
            try {
                month = myObj.nextInt();

                //add month functionality
                Calendar calendar;
                if (month == 1) {
                    //update weather
                    //calendar = new Calendar(March, 1848);
                } else if (month == 2) {
                    //update weather
                    //calendar = new Calendar(April, 1848);
                } else if (month == 3) {
                    //update weather
                    //calendar = new Calendar(May, 1848);
                } else if (month == 4) {
                    //update weather
                    //calendar = new Calendar(June, 1848);
                } else if (month == 5) {
                    //update weather
                    //calendar = new Calendar(July, 1848);
                } else if (month == 6) {
                    System.out.println("\n\n\n" +
                        "------------------------------------------\n" +
                        "You attend a public meeting held for 'folks with the California Oregon fever'\n" +
                        "You're told:\n\n" +
                        "If you leave too early, there won't be any grass for your oxen to eat.\n" +
                        "If you leave too late, you may not get to Oregon before winter comes.\n" +
                        "If you leave at just the right time, there will be green grass and \n" +
                        "the weather will still be cool.\n\n" +
                        "Press SPACE BAR to continue\n" +
                        "------------------------------------------");
                    //go back to month options
                }
            } catch(InputMismatchException e){
                myObj.nextLine();
                System.out.println("Invalid choice, try again.");
            }
        }//end while loop


        //add bill + inventory info        
        System.out.println("------------------------------------------\r\n\r\n\r\n\r\n" +
            "------------------------------------------\r\n" +
            "Before leaving Independence, you should buy equipment and supplies.\r\n" +
            "You have $" + 
            //wagon.moneyLeft + 
            " in cash, but you don't have to spend it all now.\r\n\r\n" +
            "Press SPACE BAR to continue\r\n" +
            "------------------------------------------");
        System.out.println("\r\n" +
            "------------------------------------------\r\n\r\n" +
            "You can buy whatever you need at Matt's General Store\r\n" +
            "\r\n" +
            "Press SPACE BAR to continue\r\n" +
            "------------------------------------------");
        System.out.println("\r\n\r\n" +
            "------------------------------------------\r\n" +
            "Hello, I'm Matt. So you're going to Oregon!\r\n" +
            "I can fix you up with what you need:\r\n" +
            "\r\n" +
            "- a team of oxen to pull your wagon \r\n" +
            "- clothing for both summer and winter \r\n" +
            "- plenty of food for the trip \r\n" +
            "- ammunition for your rifles \r\n" +
            "- spare parts for your wagon \r\n" +
            "\r\n" +
            "Press SPACE BAR to continue\r\n" +
            "------------------------------------------");
        
        // MattsGeneralStore store = new MattsGeneralStore();
        // Oxen oxen = new Oxen();
        // Food food = new Food();
        // ClothingSet clothing = new ClothingSet();
        // Bullets bullets  = new Bullets();
        // Axle axle = new Axle();
        // Wheel wheel = new Wheel();
        // Tongue tongue = new Tongue();
        // int store_choice = 0;

        //while(store_choice != 6){
            System.out.println("\r\n" +
            "\r\n------------------------------------------\r\n" +
            "        Matt's General Store\r\n" +
            "        Independence, Missouri\r\n" +
            " April 1, 1848\r\n" +
            "\r\n" +
            "-----------------------------------------\r\n" +
            "1. Oxen                     $ 0.00 " /*+ oxen.getCount()*/ + "\r\n" +
            "2. food                     $ 0.00 " /*+ food.getCount()*/ + "\r\n" +
            "3. clothing                 $ 0.00 " /*+ clothing.getCount()*/ + "\r\n" +
            "4. ammunition               $ 0.00 " /*+ bullets.getCount()*/ + "\r\n" +
            "5. spare parts              $ 0.00 " /*+ wheel.getCount()+tongue.getCount()+axle.getCount()*/ + "\r\n" +
            "6. checkout cart\r\n" +
            "----------------------------------------\r\n" +
            "Total bill: $0.00\r\n" +
            "\r\n" +
            "Amount you have: $" /*+wagon.getMoneyLeft()*/ + "\r\n" +
            "\r\n" +
            "Which item would you like to buy ?");

            try {
                int store_choice = myObj.nextInt();

            //add Matt's store functionality
            //if (store_choice == 1) {
                
                int num_of_yokes = -1;
                while(num_of_yokes < 0){
                    System.out.println("\r\n" + //
                    "\r\n" + //
                    "------------------------------------------\r\n" + //
                    "        Matt's General Store\r\n" + //
                    "        Independence, Missouri\r\n" + //
                    "                 April 1, 1848\r\n" + //
                    "\r\n" + //
                    "There are 2 oxen in a yoke; I recommend at least 3 yoke.\r\n" + //
                    "I charge $40 a yoke.\r\n" + //
                    "\r\n" + //
                    "How many yoke do you want ?");
                    num_of_yokes = myObj.nextInt();
    
                    //calculate price
                }
                //store.sell("oxen", num_of_yokes, wagon, oxen);
                System.out.println("\r\n" +
                    "            Bill so far: $0.00 "/*+ store.getTotalCost()*/ );
                //go back to main store

                //} else if (store_choice == 2) {
                    int pounds_of_food = -1;
                    while(pounds_of_food< 0){
                        System.out.println("\r\n" +
                        "\r\n" +
                        "\r\n" +
                        "\r\n" +
                        "------------------------------------------\r\n" +
                        "        Matt's General Store\r\n" +
                        "        Independence, Missouri\r\n" +
                        "                 April 1, 1848\r\n" +
                        "\r\n" +
                        "I recommend you take at least 200 pounds of food for each person in your family.;\r\n" +
                        "I see that you have 5 people in all. You'll need flour, sugar, bacon, and coffee.\r\n" +
                        "My price is 20 cents per pound.\r\n" +
                        "\r\n" +
                        "How many pounds of food do you want ?");
                        pounds_of_food = myObj.nextInt();
                        //calculate price
                    }
                    //store.sell("food", pounds_of_food, wagon, food);
                    System.out.println("\r\n" +
                        "            Bill so far: $0.00 " /*+store.getTotalCost()*/);
                    //go back to main store

                //} else if (store_choice == 3) {
                    int sets_of_clothing = -1;
                    while(sets_of_clothing < 0){
                        System.out.println("\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "------------------------------------------\r\n" + //
                        "        Matt's General Store\r\n" + //
                        "        Independence, Missouri\r\n" + //
                        "                 April 1, 1848\r\n" + //
                        "\r\n" + //
                        "you'll need warm clothing in the mountains. \r\n" + //
                        "I recommend taking at least 2 sets of clothes per person.\r\n" + //
                        "Each set is $10.00.\r\n" + //
                        "\r\n" + //
                        "How many sets of clothes do you want ?");
                        sets_of_clothing = myObj.nextInt();
                        //calculate price
                    }

                    //store.sell("clothes", sets_of_clothing, wagon, clothing);
                    System.out.println("\r\n" +
                        "            Bill so far: $0.00"/*+store.getTotalCost()*/);
                    //go back to main store

                //} else if (store_choice == 4) {
                    int boxes_of_ammo = -1;
                    while(boxes_of_ammo < 0){
                        System.out.println("\r\n" +
                        "\r\n" +
                        "\r\n" +
                        "\r\n" +
                        "------------------------------------------\r\n" +
                        "        Matt's General Store\r\n" +
                        "        Independence, Missouri\r\n" +
                        "                 April 1, 1848\r\n" +
                        "\r\n" +
                        "I sell ammunition in boxes of 20 bullets.\r\n" +
                        "Each box costs $2.00.\r\n" +
                        "\r\n" +
                        "How many boxes do you want?");
                        boxes_of_ammo = myObj.nextInt();
                
                        //calculate price
                    }

                    //store.sell("bullets", boxes_of_ammo, wagon, bullets);
                    System.out.println("\r\n" +
                        "            Bill so far: $0.00"/*+store.getTotalCost()*/);
                    //go back to main store

                //} else if (store_choice == 5) {
                    System.out.println("------------------------------------------\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "------------------------------------------\r\n" +
                    "        Matt's General Store\r\n" +
                    "        Independence, Missouri\r\n" +
                    "\r\n" +
                    "It's a good idea to have a few spare parts for your wagon.\r\n" +
                    "Here are the prices:\r\n" +
                    "\r\n" +
                    "    wagon wheel -   $10 each\r\n" +
                    "    wagon axle -    $10 each \r\n" +
                    "    wagon tongue -  $10 each\r\n" +
                    "\r\n" +
                    "How many wagon wheels ?");
                    
                    int wheels = -1;
                    while(wheels < 0 || wheels > 3){
                        wheels = myObj.nextInt();
                        if (wheels > 3) {
                            System.out.println("-> You wagon many only carry 3 wagon wheels.\r\n" +
                                "How many wagon wheels ?");
                        }
                    }

                    System.out.println("How many wagon axles ?");
                    int axles = -1;

                    while(axles < 0 || axles > 3){
                        axles = myObj.nextInt();
                        if (axles > 3) {
                            System.out.println("-> You wagon many only carry 3 wagon axles.\r\n" +
                                "How many wagon axles ?");
                        }
                    }

                    System.out.println("How many wagon tongues ?");
                    int tongues = -1;
                    while(tongues < 0 || tongues > 3){
                        tongues = myObj.nextInt();
                        if (tongues > 3) {
                            System.out.println("-> You wagon many only carry 3 wagon tongues.\r\n" +
                                "How many wagon tongues ?");
                            tongues = myObj.nextInt();
                        }
                    }

                    //calculate price

                    // store.sell("wheel", wheels, wagon, wheel);
                    // store.sell("axle", axles, wagon, axle);
                    // store.sell("tongue", tongues, wagon, tongue);
                    System.out.println("\r\n" +
                        "            Bill so far: $0.00"/*+ store.getTotalCost()*/);
                    //go back to main store
                //} else if (store_choice == 6) {
                    //add items to invemtory & subtract from money left
                    System.out.println("------------------------------------------\r\n" +
                        "\r\n" +
                        "\r\n" +
                        "\r\n" +
                        "\r\n" +
                        "\r\n" +
                        "\r\n" +
                        "------------------------------------------\r\n" +
                        "Well then, you're ready to start.\r\n" +
                        "Good luck ! You have a long and difficult journey ahead of you.\r\n" +
                        "\r\n" +
                        "Press SPACE BAR to continue\r\n" +
                        "------------------------------------------");
                // } else {
                //     System.out.println("Invalid choice, try again.");
                // }
            } catch(InputMismatchException e){
                myObj.nextLine();
                System.out.println("Invalid choice, try again.");
            }
        //}// end while loop

        //Location location = new Location();
        System.out.println("\r\n" +
            "\r\n------------------------------------------\r\n" +
            "[Now loading the wagon]\r\n" +
            "------------------------------------------\r\n" +
            "\r\n" +
            "\r\n" +
            "------------------------------------------\r\n" +
            //location.location /* + date */ +
            "\r\n" +
            "\r\n" +
            "Press SPACE BAR to continue\r\n" +
            "------------------------------------------\r\n" +
            "\r\n\r\n" +
            "------------------------------------------\r\n");
        
        
        int menu_option = 0;
        boolean gameIsNotOver = true;
         /*weather + */
         /*date + */ 
        while(gameIsNotOver){
            System.out.println("\r\n" +
            "\r\n" +
            "Weather: " /* + weather*/ + " \r\n" +
            "Health: " /* + health*/ + " \r\n" +
            "Pace: " + /*wagon.pace +*/ " \r\n" +
            "Rations: " + /*wagon.rations +*/ " \r\n" +
            "----\r\n" +
            "You may: \r\n" +
            "    1. Continue on trail \r\n" +
            "    2. Check supplies \r\n" +
            "    3. Look at map \r\n" +
            "    4. Change the pace \r\n" +
            "    5. Change food rations\r\n" +
            "    6. Stop to rest\r\n" +
            "    7. Attempt to trade \r\n" +
            "    8. Talk to people \r\n" + //only sometimes avalaible
            "    9. Buy supplies\r\n" + //only avalaible at forts
            "    10. Hunt for food\r\n" + //only sometimes avalaible
            "\r\n" +
            "What is your choice ?");
            try{
                menu_option = myObj.nextInt();

                //add menu functionality
                if (menu_option == 1) {
                    //if (location.location == "Independence") {
                        System.out.println("------------------------------------------\r\n" + //
                            "\r\n" + //
                            "\r\n" + //
                            "------------------------------------------\r\n" + //
                            "From Independence it is 102 miles to Kansas River crossing\r\n" + //
                            "\r\n" + //
                            "Date: " /* + date */ + "\r\n" + //
                            "Weather: " /* + weather */ + "\r\n" + //
                            "Health: " /* + health */ + "\r\n" + //
                            "Food: " /* + food */ + "\r\n" + //
                            "Next landmark: " /* + landmark */ + "\r\n" + //
                            "Miles traveled: " /* + miles */ + "\r\n" + //
                            "\r\n" + //
                            "Press SPACE BAR to continue\r\n" + //
                            "------------------------------------------");
                        //update date, weather, health, food, next landmark, miles traveled
                        System.out.println("\r\n" + //
                            "\r\n" + //
                            "------------------------------------------\r\n" + //
                            "\r\n" + //
                            "Date: " /* + date */ + "\r\n" + //
                            "\r\n" + //
                            "\r\n" + //
                            "");
                    //} else if (location.location == "Kansas River crossing") {
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            /* name +*/ "has cholera\n" +
                            "\n" +
                            "Date: April 2, 1848                 April 2 --> 4\n" +
                            "Weather: cool                       cool --> warm\n" +
                            "Health: good\n" +
                            "Food: 1985 pounds                   1985 --> 1955\n" +
                            "Next landmark: 22 miles             82 --> 52 --> 22\n" +
                            "Miles traveled: 80 miles            50 --> 80\n" +
                            "\n" +
                            "Press SPACE BAR to continue\n" +
                            "------------------------------------------");
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "You are now at the Kansas River crossing.\n" +
                            "Would you like to look around ? Y\n" +
                            "\n" +
                            "Date: April 5, 1848\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "");
                    //} else if (location.location == "Big Blue River crossing") {
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "You are now at the Big Blue River crossing.\n" +
                            "Would you like to look around ? Y\n" +
                            "\n" +
                            "Date: April 10, 1848\n" +
                            "Weather: warm\n" +
                            "Health: good\n" +
                            "Food: 1900 pounds\n" +
                            "Next landmark: 118 miles\n" +
                            "Miles traveled: 182 miles\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "shows river stream\n" +
                            "\n" +
                            "Big Blue River crossing\n" +
                            "April 10, 1848\n" +
                            "\n" +
                            "Press SPACE BAR to continue\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "");
                    //} else if (location.location == "Fort Kearney") {
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "You are now at Fort Kearney.\n" +
                            "Would you like to look around ? Y\n" +
                            "\n" +
                            "Date: April 15, 1848\n" +
                            "Weather: warm\n" +
                            "Health: good\n" +
                            "Food: 1850 pounds\n" +
                            "Next landmark: 250 miles\n" +
                            "Miles traveled: 250 miles\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "shows fort\n" +
                            "\n" +
                            "Fort Kearney\n" +
                            "April 15, 1848\n" +
                            "\n" +
                            "Press SPACE BAR to continue\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "");
    
                    //} else if (location.location == "Chimney Rock") {
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "You are now at Chimney Rock.\n" +
                            "Would you like to look around ? Y\n" +
                            "\n" +
                            "Date: April 20, 1848\n" +
                            "Weather: warm\n" +
                            "Health: good\n" +
                            "Food: 1800 pounds\n" +
                            "Next landmark: 86 miles\n" +
                            "Miles traveled: 304 miles\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "shows rock\n" +
                            "\n" +
                            "Chimney Rock\n" +
                            "April 20, 1848\n" +
                            "\n" +
                            "Press SPACE BAR to continue\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "");
    
                    //} else if (location.location == "Fort Laramie") {
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "You are now at Fort Laramie.\n" +
                            "Would you like to look around ? Y\n" +
                            "\n" +
                            "Date: April 25, 1848\n" +
                            "Weather: warm\n" +
                            "Health: good\n" +
                            "Food: 1750 pounds\n" +
                            "Next landmark: 190 miles\n" +
                            "Miles traveled: 494 miles\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "shows fort\n" +
                            "\n" +
                            "Fort Laramie\n" +
                            "April 25, 1848\n" +
                            "\n" +
                            "Press SPACE BAR to continue\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "");
    
                    //} else if (location.location == "Independence Rock") {
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "You are now at Independence Rock.\n" +
                            "Would you like to look around ? Y\n" +
                            "\n" +
                            "Date: April 30, 1848\n" +
                            "Weather: warm\n" +
                            "Health: good\n" +
                            "Food: 1700 pounds\n" +
                            "Next landmark: 102 miles\n" +
                            "Miles traveled: 576 miles\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "shows rock\n" +
                            "\n" +
                            "Independence Rock\n" +
                            "April 30, 1848\n" +
                            "\n" +
                            "Press SPACE BAR to continue\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "");
    
                    //} else if (location.location == "South Pass") {
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "You are now at South Pass.\n" +
                            "Would you like to look around ? Y\n" +
                            "\n" +
                            "Date: May 5, 1848\n" +
                            "Weather: warm\n" +
                            "Health: good\n" +
                            "Food: 1650 pounds\n" +
                            "Next landmark: 57 miles\n" +
                            "Miles traveled: 633 miles\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "shows pass\n" +
                            "\n" +
                            "South Pass\n" +
                            "May 5, 1848\n" +
                            "\n" +
                            "Press SPACE BAR to continue\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "");
    
                    //} else if (location.location == "Green River crossing") {
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "You are now at Green River crossing.\n" +
                            "Would you like to look around ? Y\n" +
                            "\n" +
                            "Date: May 10, 1848\n" +
                            "Weather: warm\n" +
                            "Health: good\n" +
                            "Food: 1600 pounds\n" +
                            "Next landmark: 125 miles\n" +
                            "Miles traveled: 758 miles\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "shows river stream\n" +
                            "\n" +
                            "Green River crossing\n" +
                            "May 10, 1848\n" +
                            "\n" +
                            "Press SPACE BAR to continue\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "");
                    //} else if (location.location == "Soda Springs") {
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "You are now at Soda Springs.\n" +
                            "Would you like to look around ? Y\n" +
                            "\n" +
                            "Date: May 15, 1848\n" +
                            "Weather: warm\n" +
                            "Health: good\n" +
                            "Food: 1550 pounds\n" +
                            "Next landmark: 57 miles\n" +
                            "Miles traveled: 815 miles\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "shows springs\n" +
                            "\n" +
                            "Soda Springs\n" +
                            "May 15, 1848\n" +
                            "\n" +
                            "Press SPACE BAR to continue\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "");
                    //} else if (location.location == "Fort Hall") {
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "You are now at Fort Hall.\n" +
                            "Would you like to look around ? Y\n" +
                            "\n" +
                            "Date: May 20, 1848\n" +
                            "Weather: warm\n" +
                            "Health: good\n" +
                            "Food: 1500 pounds\n" +
                            "Next landmark: 182 miles\n" +
                            "Miles traveled: 997 miles\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "shows fort\n" +
                            "\n" +
                            "Fort Hall\n" +
                            "May 20, 1848\n" +
                            "\n" +
                            "Press SPACE BAR to continue\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "");
                    //} else if (location.location == "Snake River crossing") {
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "You are now at Snake River crossing.\n" +
                            "Would you like to look around ? Y\n" +
                            "\n" +
                            "Date: May 25, 1848\n" +
                            "Weather: warm\n" +
                            "Health: good\n" +
                            "Food: 1450 pounds\n" +
                            "Next landmark: 113 miles\n" +
                            "Miles traveled: 1110 miles\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "shows river stream\n" +
                            "\n" +
                            "Snake River crossing\n" +
                            "May 25, 1848\n" +
                            "\n" +
                            "Press SPACE BAR to continue\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "");
                    //} else if (location.location == "Fort Boise") {
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "You are now at Fort Boise.\n" +
                            "Would you like to look around ? Y\n" +
                            "\n" +
                            "Date: May 30, 1848\n" +
                            "Weather: warm\n" +
                            "Health: good\n" +
                            "Food: 1400 pounds\n" +
                            "Next landmark: 160 miles\n" +
                            "Miles traveled: 1273 miles\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "shows fort\n" +
                            "\n" +
                            "Fort Boise\n" +
                            "May 30, 1848\n" +
                            "\n" +
                            "Press SPACE BAR to continue\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "");
                    //} else if (location.location == "Blue Mountains") {
                        //trail divides here between Fort Walla Walla & The Dalles
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "You are now at the Blue Mountains.\n" +
                            "Would you like to look around ? Y\n" +
                            "\n" +
                            "Date: June 5, 1848\n" +
                            "Weather: warm\n" +
                            "Health: good\n" +
                            "Food: 1350 pounds\n" +
                            "Next landmark: 55 miles\n" +
                            "Miles traveled: 1465 miles\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "shows mountains\n" +
                            "\n" +
                            "Blue Mountains\n" +
                            "June 5, 1848\n" +
                            "\n" +
                            "Press SPACE BAR to continue\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "");
                    //} else if (location.location == "Fort Walla Walla") {
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "You are now at Fort Walla Walla.\n" +
                            "Would you like to look around ? Y\n" +
                            "\n" +
                            "Date: June 10, 1848\n" +
                            "Weather: warm\n" +
                            "Health: good\n" +
                            "Food: 1300 pounds\n" +
                            "Next landmark: 55 miles\n" +
                            "Miles traveled: 1520 miles\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "shows fort\n" +
                            "\n" +
                            "Fort Walla Walla\n" +
                            "June 10, 1848\n" +
                            "\n" +
                            "Press SPACE BAR to continue\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "");
                    //} else if (location.location == "The Dalles") {
                        //trail divides here between the Columbia River & the Barlow Toll Road
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "You are now at The Dalles.\n" +
                            "Would you like to look around ? Y\n" +
                            "\n" +
                            "Date: June 15, 1848\n" +
                            "Weather: warm\n" +
                            "Health: good\n" +
                            "Food: 1250 pounds\n" +
                            "Next landmark: 100 miles\n" +
                            "Miles traveled: 1620 miles\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "shows town\n" +
                            "\n" +
                            "The Dalles\n" +
                            "June 15, 1848\n" +
                            "\n" +
                            "Press SPACE BAR to continue\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "");
                    //} else if (location.location == "Columbia River") {
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "You are now at the Columbia River.\n" +
                            "Would you like to look around ? Y\n" +
                            "\n" +
                            "Date: June 20, 1848\n" +
                            "Weather: warm\n" +
                            "Health: good\n" +
                            "Food: 1200 pounds\n" +
                            "Next landmark: 100 miles\n" +
                            "Miles traveled: 1720 miles\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "shows river stream\n" +
                            "\n" +
                            "Columbia River\n" +
                            "June 20, 1848\n" +
                            "\n" +
                            "Press SPACE BAR to continue\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "");
                    //} else if (location.location == "Barlow Toll road") {
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "You are now at the Barlow Toll road.\n" +
                            "Would you like to look around ? Y\n" +
                            "\n" +
                            "Date: June 25, 1848\n" +
                            "Weather: warm\n" +
                            "Health: good\n" +
                            "Food: 1150 pounds\n" +
                            "Next landmark: 100 miles\n" +
                            "Miles traveled: 1820 miles\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "shows road\n" +
                            "\n" +
                            "Barlow Toll road\n" +
                            "June 25, 1848\n" +
                            "\n" +
                            "Press SPACE BAR to continue\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "");
                    //} else if (location.location == "Willamette Valley") {
                        //you win game
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "Congratulations ! You have made it to Willamette Valley.\n" +
                            "\n" +
                            "Date: June 30, 1848\n" +
                            "Weather: warm\n" +
                            "Health: good\n" +
                            "Food: 1100 pounds\n" +
                            "Next landmark: 0 miles\n" +
                            "Miles traveled: 2000 miles\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "shows valley\n" +
                            "\n" +
                            "Willamette Valley\n" +
                            "June 30, 1848\n" +
                            "\n"
                            );
                            gameIsNotOver = false;
                    //}

                    //go back to menu
                } else if (menu_option == 2) {
                    System.out.println("------------------------------------------\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "------------------------------------------\r\n" + //
                        "        Your Supplies \r\n" + //
                        "\r\n" + //
                        "oxen                " /*+ oxen.getCount()*/ + "\r\n" + //
                        "sets of clothes     " /*+ clothing.getCount()*/ + "\r\n" + //
                        "bullets             " /*+ bullets.getCount()*/ + "\r\n" + //
                        "wagon wheels        " /*+ wheel.getCount()*/ + "\r\n" + //
                        "wagon axles         " /*+ axle.getCount()*/ + "\r\n" + //
                        "wagon tongues       " /*+ tongue.getCount()*/ + "\r\n" + //
                        "pounds of food      " /*+ food.getCount()*/ + "\r\n" + //
                        "money left          " /*+ wagon.getMoneyLeft()*/ + "\r\n" + //
                        "\r\n" + //
                        "Press SPACE BAR to continue\r\n" + //
                        "------------------------------------------\r\n\r\n\r\n");
                } else if (menu_option == 3) {
                    //show map (extra)
                } else if (menu_option == 4) {
                    
                    int pace = -1;

                    while(pace <= 0 || pace > 4){
                        System.out.println("\r\n" + //
                        "\r\n" + //
                        "------------------------------------------\r\n" + //
                        "Change pace (currently \"steady\")\r\n" + //
                        "\r\n" + //
                        "The pace at which you travel can change. Your choices are: \r\n" + //
                        "\r\n" + //
                        "    1. a steady pace \r\n" + //
                        "    2. a strenuous pace \r\n" + //
                        "    3. a grueling pace \r\n" + //
                        "    4. find out what these different paces mean \r\n" + //
                        "\r\n" + //
                        "What is your choice ?");
                        try {
                            pace = myObj.nextInt();

                            if (pace == 1) {
                                //add steady pace
                            } else if (pace == 2) {
                                //add strenuous pace
                            } else if (pace == 3) {
                                //add grueling pace
                            } else if (pace == 4) {
                                //explain differnet paces
                            } else {
                                System.out.println("Invalid choice, try again.");
                            }
                        } catch(InputMismatchException e){
                            myObj.nextLine();
                            System.out.println("Invalid choice, try again.");
                        }
                    }
                    
                    //update pace
                    //go back to menu
                } else if (menu_option == 5) {
                    
                    int ration = -1;
                    
                    while(ration <= 0 || ration > 3){
                        System.out.println("------------------------------------------\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "------------------------------------------\r\n" + //
                        "change food rations \r\n" + //
                        "(currently " /*+ ration*/ + ")\r\n" + //
                        "\r\n" + //
                        "The amount of food the people in your party eat \r\n" + //
                        "each day can change. These amounts are: \r\n" + //
                        "\r\n" + //
                        "1. filling - meals are large and generous \r\n" + //
                        "2. meager - meals are small but adequate \r\n" + //
                        "3. bare bones - meals are very small, everyone stays hungry \r\n" + //
                        "\r\n" + //
                        "What is your choice ?");
                        try {
                            ration = myObj.nextInt();
                            if (ration == 1) {
                                //add filling ration
                            } else if (ration == 2) {
                                //add meager ration
                            } else if (ration == 3) {
                                //add bare bones ration
                            } else {
                                System.out.println("Invalid choice, try again.");
                            }
                        } catch(InputMismatchException e){
                            myObj.nextLine();
                            System.out.println("Invalid choice, try again.");
                        }
                    }
                    
                    //update food rations
                    //go back to menu
                } else if (menu_option == 6) {
                    System.out.println("How many days would you like to rest ?");
                    int days = myObj.nextInt();
                    //update date
                } else if (menu_option == 7) {
                    //trade
                } else if (menu_option == 8) {
                    //TalkToPeople t = new TalkToPeople();
                    //t.talkToPeople();
                } else if (menu_option == 9) {
                    //buy supplies at forts
                } else if (menu_option == 10) {
                    //hunt for food (extra)  
                    //wagon.huntForFood(bullets, food); 
                } else {
                    System.out.println("Invalid choice, try again.");
                }
            } catch(InputMismatchException e){
                myObj.nextLine();
                System.out.println("Invalid choice, try again.");
            }
            
        } // end while loop
    }
}
