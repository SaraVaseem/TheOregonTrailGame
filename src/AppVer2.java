import java.util.InputMismatchException;
import java.util.Scanner;

public class AppVer2 {
    public static void startGame(Scanner myObj, int choice) {
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
            try {
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
                } else {
                    System.out.println("Invalid input, try again.");
                }
            } catch (InputMismatchException e){
                myObj.nextLine();
                System.out.println("Invalid input, try again.");
            }
        } // end while loop
    } // end startGame
                
    public static void chooseRole(Scanner myObj, int multiplier, int money, String occupation) {

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
    } // end chooseRole


    public static void chooseNames(Scanner myObj, String wagon_leader_name, String member_1, String member_2, String member_3, String member_4) {
        boolean isNotCorrect = true;

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
    } // end chooseNames
        
    public static void chooseMonth(Scanner myObj, Calendar calendar) {
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
            month = myObj.nextInt();

            try {
                month = myObj.nextInt();
                //add month functionality
                switch(month) {
                    case 1:
                        //update weather
                        //calendar = new Calendar(March, 1848);
                        break;
                    case 2:
                        //update weather
                        //calendar = new Calendar(April, 1848);
                        break;
                    case 3:
                        //update weather
                        //calendar = new Calendar(May, 1848);
                        break;
                    case 4:
                        //update weather
                        //calendar = new Calendar(June, 1848);
                        break;
                    case 5:
                        //update weather
                        //calendar = new Calendar(July, 1848);
                        break;
                    case 6:
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
                    default:
                        System.out.println("Invalid choice, try again.");
                }
            } catch(InputMismatchException e){
                myObj.nextLine();
                System.out.println("Invalid choice, try again.");
            }
        }
    }

    public static void mattsGeneralStore(Scanner myObj, Wagon wagon, Oxen oxen, Food food, ClothingSet clothes, Bullets bullets, Wheel wheel, Axle axle, Tongue tongue) {
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
        
            int store_choice = 0;
            MattsGeneralStore store = new MattsGeneralStore();

            while(store_choice != 6){
                System.out.println("\r\n" +
                "\r\n------------------------------------------\r\n" +
                "        Matt's General Store\r\n" +
                "        Independence, Missouri\r\n" +
                " April 1, 1848\r\n" +
                "\r\n" +
                "-----------------------------------------\r\n" +
                "1. Oxen                     $ " /* + oxen */ + "\r\n" +
                "2. food                     $ " /* + food */ + "\r\n" +
                "3. clothing                 $ " /* + clothing */ + "\r\n" +
                "4. ammunition               $ " /* + ammunition */ + "\r\n" +
                "5. spare parts              $ " /* + spare part */ + "\r\n" +
                "6. checkout cart\r\n" +
                "----------------------------------------\r\n" +
                "Total bill: $0.00\r\n" +
                "\r\n" +
                "Amount you have: $" +/*wagon.moneyLeft +*/ "\r\n" +
                "\r\n" +
                "Which item would you like to buy ?");
                store_choice = myObj.nextInt();
                try{
                    //add Matt's store functionality
                    if (store_choice == 1) {
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
                        int num_of_yokes = myObj.nextInt();

                        //calculate price
                        store.sell("oxen", num_of_yokes, wagon, oxen);
                        System.out.println("\r\n" +
                            "            Bill so far: "+ store.getTotalCost() );
                        //go back to main store

                    } else if (store_choice == 2) {
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
                        int pounds_of_food = myObj.nextInt();
                        //calculate price
                        store.sell("food", pounds_of_food, wagon, food);
                        System.out.println("\r\n" +
                            "            Bill so far: " +store.getTotalCost());
                        //go back to main store

                    } else if (store_choice == 3) {
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
                        int sets_of_clothing = myObj.nextInt();
                        //calculate price
                        store.sell("clothes", sets_of_clothing, wagon, clothes);
                        System.out.println("\r\n" +
                            "            Bill so far: "+store.getTotalCost());
                        //go back to main store

                    } else if (store_choice == 4) {
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
                        int boxes_of_ammo = myObj.nextInt();
                        //calculate price
                        store.sell("bullets", boxes_of_ammo, wagon, bullets);
                        System.out.println("\r\n" +
                            "            Bill so far: "+store.getTotalCost());
                        //go back to main store

                    } else if (store_choice == 5) {
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
                        int wheels = myObj.nextInt();

                        if (wheels > 3) {
                            System.out.println("-> You wagon many only carry 3 wagon wheels.\r\n" +
                                "How many wagon wheels ?");
                            wheels = myObj.nextInt();
                        }

                        System.out.println("How many wagon axles ?");
                        int axles = myObj.nextInt();
                        if (axles > 3) {
                            System.out.println("-> You wagon many only carry 3 wagon axles.\r\n" +
                                "How many wagon axles ?");
                            axles = myObj.nextInt();
                        }

                        System.out.println("How many wagon tongues ?");
                        int tongues = myObj.nextInt();
                        if (tongues > 3) {
                            System.out.println("-> You wagon many only carry 3 wagon tongues.\r\n" +
                                "How many wagon tongues ?");
                            tongues = myObj.nextInt();
                        }

                        //calculate price

                        store.sell("wheel", wheels, wagon, wheel);
                        store.sell("axle", axles, wagon, axle);
                        store.sell("tongue", tongues, wagon, tongue);
                        System.out.println("\r\n" +
                            "            Bill so far: "+store.getTotalCost());
                        //go back to main store
                    } else if (store_choice == 6) {
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
                    } else {
                        System.out.println("Invalid choice, try again.");
                    }
                } catch(InputMismatchException e){
                    myObj.nextLine();
                    System.out.println("Invalid choice, try again.");
                }
            } // end while loop
    } // end MattsGeneralStore
    
    public static void showMenu(Scanner myObj, Wagon wagon, Oxen oxen, Food food, ClothingSet clothes, Bullets bullets, Wheel wheel, Axle axle, Tongue tongue) {
        Location location = new Location();
        System.out.println("\r\n" +
            "\r\n------------------------------------------\r\n" +
            "[Now loading the wagon]\r\n" +
            "------------------------------------------\r\n" +
            "\r\n" +
            "\r\n" +
            "------------------------------------------\r\n" +
            location.location +/* + date */
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
            "Pace: " + wagon.getPace() + " \r\n" +
            "Rations: " + wagon.getRations() + " \r\n" +
            "----\r\n" +
            "You may: \r\n" +
            "    1. Continue on trail \r\n" +
            "    2. Check supplies \r\n" +
            "    3. Change the pace \r\n" +
            "    4. Change food rations\r\n" +
            "    5. Stop to rest\r\n" +
            "    6. Attempt to trade \r\n" +
            "    7. Talk to people \r\n" +
            "    8. Buy supplies\r\n" +
            "\r\n" +
            "What is your choice ?");

            try{
                menu_option = myObj.nextInt();

                //add menu functionality
                if (menu_option == 1) {
                    System.out.println("------------------------------------------\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "------------------------------------------\r\n" + //
                        "From Independence it is 102 miles to Kansas River crossing\r\n" + //
                        "\r\n" + //
                        "Date: " /* + date */ + "\r\n" + //
                        "Weather: " /* + weather */ + "\r\n" + //
                        "Health: " /* + health */ + "\r\n" + //
                        "Food: " + wagon.getRations() + "\r\n" + //
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
                    } else if (location.location == "Kansas River crossing") {
                        System.out.println("\n" +
                            "\n" +
                            "------------------------------------------\n" +
                            "\n" +
                            "\n" +
                            /* name +*/ "has " /* + disease */ + "\n" +
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
                    //go back to menu
                } else if (menu_option == 2) {
                    System.out.println("------------------------------------------\r\n" + //
                        "\r\n" + //
                        "\r\n" + //
                        "------------------------------------------\r\n" + //
                        "        Your Supplies \r\n" + //
                        "\r\n" + //
                        "oxen                " + oxen.getCount() + "\r\n" + //
                        "sets of clothes     " + clothes.getCount() + "\r\n" + //
                        "bullets             " + bullets.getCount() + "\r\n" + //
                        "wagon wheels        " + wheel.getCount() + "\r\n" + //
                        "wagon axles         " + axle.getCount() + "\r\n" + //
                        "wagon tongues       " + tongue.getCount() + "\r\n" + //
                        "pounds of food      " + food.getCount() + "\r\n" + //
                        "money left          " + wagon.getMoneyLeft() + "\r\n" + //
                        "\r\n" + //
                        "Press SPACE BAR to continue\r\n" + //
                        "------------------------------------------\r\n\r\n\r\n");
                } else if (menu_option == 3) {
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
                        
                        try{
                            pace = myObj.nextInt();

                            if (pace == 1) {
                                //add steady pace
                                wagon.setPace("Steady");
                            } else if (pace == 2) {
                                //add strenuous pace
                                wagon.setPace("Grueling");
                            } else if (pace == 3) {
                                //add grueling pace
                                wagon.setPace("Strenuous");
                            } else if (pace == 4) {
                                //explain different paces
                            } else{
                                System.out.println("Invalid choice, try again.");
                            }
                        } catch(InputMismatchException e){
                            myObj.nextLine();
                            System.out.println("Invalid choice, try again.");
                        }
                    }
                    //update pace
                    //go back to menu
                } else if (menu_option == 4) {
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
                                wagon.setRations("Filling", food);
                            } else if (ration == 2) {
                                //add meager ration
                                wagon.setRations("Meager", food);;
                            } else if (ration == 3) {
                                //add bare bones ration
                                wagon.setRations("Bare bones", food);
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
                } else if (menu_option == 5) {
                    System.out.println("How many days would you like to rest ?");
                    int days = myObj.nextInt();
                    //update date
                } else if (menu_option == 6) {
                    //trade
                } else if (menu_option == 7) {
                    //TalkToPeople t = new TalkToPeople();
                    //t.talkToPeople();
                } else if (menu_option == 8) {
                    //buy supplies at forts
                } else {
                    System.out.println("Invalid choice, try again.");
                }
            } catch(InputMismatchException e){
                myObj.nextLine();
                System.out.println("Invalid choice, try again.");
            }
        } // end while loop
    }// end showMenu
    
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        int choice = 0;
        //add choice functionality
        
        startGame(myObj, choice);

        int multiplier = 1;
        int money = 0;
        String occupation = "Banker";
        chooseRole(myObj, multiplier, money, occupation);

        String wagon_leader_name = "Joe";
        String member_1 = "Joe";
        String member_2 = "Joe";
        String member_3 = "Joe";
        String member_4 = "Joe";
        chooseNames(myObj, wagon_leader_name, member_1, member_2, member_3, member_4);

        WagonLeader wagonLeader = new WagonLeader(wagon_leader_name, occupation);
        WagonMember member1 = new WagonMember(member_1);
        WagonMember member2 = new WagonMember(member_2);
        WagonMember member3 = new WagonMember(member_3);
        WagonMember member4 = new WagonMember(member_4);

        Wagon wagon = new Wagon(wagonLeader, member1, member2, member3, member4, multiplier, money);

        Calendar calendar = new Calendar("March", 1848);
        chooseMonth(myObj, calendar);

        Oxen oxen = new Oxen();
        Food food = new Food();
        ClothingSet clothes = new ClothingSet();
        Bullets bullets = new Bullets();
        Wheel wheel = new Wheel();
        Axle axle = new Axle();
        Tongue tongue = new Tongue();
        mattsGeneralStore(myObj, wagon, oxen, food, clothes, bullets, wheel, axle, tongue);

        showMenu(myObj, wagon, oxen, food, clothes, bullets, wheel, axle, tongue);
        myObj.close();
    }
}