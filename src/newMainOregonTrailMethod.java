import java.util.Scanner;

public class newMainOregonTrailMethod {
    static Scanner sc = new Scanner(System.in);
    static newInventory inventory;
    static Wagon wagon;
    static Calendar calendar;
    static WagonLeader wagonLeader;
    static WagonMember member1;
    static WagonMember member2;
    static WagonMember member3;
    static WagonMember member4;
    static Trail trail;
    static double money;
    static String occupation;

    public static void main(String[] args) {
        firstInterface();
    }

    private static void firstInterface() {
        System.out.println("-------\r\n" +
            "\r\n" + //
            "\r\n" + //
            "------------------------------------------\r\n" + //
            "The Oregon Trail \r\n" + //
            "\r\n" + //
            "You may:\r\n" + //
            "    1. Travel the trail \r\n" + //
            "    2. Learn about the trail\r\n" + //
            "\r\n" + //
            "What is your choice ?");
        
        int choice = sc.nextInt();

        switch(choice) {
            case 1 :
                chooseRole();
                chooseNames();
                chooseMonth();
                mattsGeneralStore();
                travelTheTrail();
                break;
            case 2 :
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
                firstInterface();
                break;
            default :
                System.out.println("Please select one of the valid options.");
                firstInterface();
                break;
        }
    }

    private static void chooseRole() {
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
            "        What is your choice ?");

        int choice = sc.nextInt();

        switch(choice) {
            case 1 :
                money = 1600;
                occupation = "Banker";
                break;
            case 2 :
                money = 800;
                occupation = "Carpenter";
                break;
            case 3 :
                money = 400;
                occupation = "Farmer";
                break;
            case 4 :
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

                chooseRole();
                break;
            default :
                System.out.println("Please select a valid option.");
                chooseRole();
                break;
        }
    }

    private static void chooseNames() {
        String nameLeader;
        String name1;
        String name2;
        String name3;
        String name4;

        System.out.println("What is the name of the wagon leader?");
        nameLeader = sc.next();
        System.out.println("What is the name of the first member?");
        name1 = sc.next();
        System.out.println("What is the name of the second member?");
        name2 = sc.next();
        System.out.println("What is the name of the third member?");
        name3 = sc.next();
        System.out.println("What is the name of the fourth member?");
        name4 = sc.next();

        System.out.println("Are these names correct? (yes/no)");
        System.out.println("1. " + nameLeader
        + "\n 2. " + name1
        + "\n 3. " + name2
        + "\n 4. " + name3
        + "\n 5. " + name4 + "\n");

        String choice = sc.next();
        switch(choice) {
            case "yes" :
                wagonLeader = new WagonLeader(nameLeader, occupation);
                member1 = new WagonMember(name1);
                member2 = new WagonMember(name2);
                member3 = new WagonMember(name3);
                member4 = new WagonMember(name4);
                break;
            case "no" :
                chooseNames();
                break;
            default :
                System.out.println("Please select a valid option.");
                chooseNames();
                break;
        }
    }

    private static void chooseMonth() {
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
        
        int choice = sc.nextInt();

        switch(choice) {
            case 1 :
                calendar = new Calendar("March", 1848);
                break;
            case 2 :
                calendar = new Calendar("April", 1848);
                break;
            case 3 :
                calendar = new Calendar("May", 1848);
                break;
            case 4 :
                calendar = new Calendar("June", 1848);
                break;
            case 5 :
                calendar = new Calendar("July", 1848);
                break;
            case 6 :
                System.out.println("\n\n\n" +
                    "------------------------------------------\n" +
                    "You attend a public meeting held for 'folks with the California Oregon fever'\n" +
                    "You're told:\n\n" +
                    "If you leave too early, there won't be any grass for your oxen to eat.\n" +
                    "If you leave too late, you may not get to Oregon before winter comes.\n" +
                    "If you leave at just the right time, there will be green grass and \n" +
                    "the weather will still be cool.\n\n" +
                    "------------------------------------------");
                chooseMonth();
                break;
            default :
                System.out.println("Please select a valid option.");
                chooseMonth();
                break;
        }
    }

    private static void mattsGeneralStore() {
        MattsGeneralStore store = new MattsGeneralStore();

        System.out.println("------------------------------------------\r\n\r\n\r\n\r\n" +
            "------------------------------------------\r\n" +
            "Before leaving Independence, you should buy equipment and supplies.\r\n" +
            "You have $" + 
            //wagon.moneyLeft + 
            " in cash, but you don't have to spend it all now.\r\n\r\n");
        System.out.println("\r\n" +
            "------------------------------------------\r\n\r\n" +
            "You can buy whatever you need at Matt's General Store\r\n" +
            "\r\n");
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
            "\r\n");
        
        
    }

    private static void travelTheTrail() {

    }
}