package com.example1;

        import com.example1.info.Mobile;
        import org.slf4j.ILoggerFactory;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;

        import java.util.*;
        //import java.util.logging.Logger;

public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Set<Mobile> mobList = new HashSet<>();
        int choice;
        Scanner s= new Scanner(System.in);
        do {
            logger.info("1. Insert");
            logger.info("2. Display one");
            logger.info("3. Display all");
            logger.info("4. Delete ");
            logger.info("5. Update");
            logger.info("6. Exit");
            logger.info("Enter your choice");

            choice = s.nextInt();

            switch (choice) {
                case 1:
                    Mobile mobile = getMobileList(s);
                    break;
                case 2:
                    logger.info("Enter mobile id : ");
                    int idToSearch = s.nextInt();

                    if(isExists(idToSearch,mobList)==true){
                        printMobile(idToSearch,mobList);
                    }else
                    {
                        logger.error("Provided id {} not found!", idToSearch);
                    }
                    //logger.info("Record deleted");
                    break;
                case 3:
                    printMobileList(mobList);
                    break;

                case 4:
                    logger.info("Enter mobile id : ");
                    int idtoSearch = s.nextInt();

                    //logger.info("Record deleted");
                    break;
                case 5:
                    logger.info("Enter mobile id : ");
                    int searchforid = s.nextInt();

                    Iterator<Mobile> iterator3 = mobList.iterator();

                    while (iterator3.hasNext()){
                        Mobile mobile = iterator3.next();
                        if(mobile.getId()==searchforid){
                            //mobList.remove(mobile);
                            // logger.info(mobile);
                            logger.info("Enter name to be update");
                            String tsName = s.next();
                            mobile.setName(tsName);
                            logger.info("Enter city to be update");
                            String tsCity = s.next();
                            mobile.setName(tsName);
                            logger.info("Record Updated");
                        }
                        // logger.info("ID Not Found");

                    }

                    break;
                case 6:
                    break;
                default:
                    logger.info("Please enter correct choice");
                    break;
            }

        } while (choice != 6) ;

    }

    private static void printMobileList(Set<Mobile> mobList) {
        logger.info("mobile List");
        Iterator<Mobile> iterator = mobList.iterator();
        while (iterator.hasNext()) {
            Mobile mobile = iterator.next();
            logger.info(mobile.toString());
        }
    }

    private static void printMobile(int idToSearch, Set<Mobile> mobList) {
        Iterator<Mobile> iterator1 = mobList.iterator();
        while (iterator1.hasNext()){
            Mobile mobile = iterator1.next();
            if(mobile.getId()==idToSearch){
                logger.info(mobile.toString());
            }
        }
    }

    private static boolean isExists(int idToSearch, Set<Mobile> mobList) {
        Iterator<Mobile> iterator1 = mobList.iterator();
        while (iterator1.hasNext()){
            Mobile mobile = iterator1.next();
            if(mobile.getId()==idToSearch){
                return true;
            }
        }
        return false;
    }

    private static Mobile getMobileList(Scanner s) {
        logger.info("Enter mobile information:");
        logger.info("Id:");
        int tId = s.nextInt();
        logger.info("Name:");
        String tName = s.next();
        logger.info("Price");
        String tCity= s.next();
        return new Mobile(tId,tName,tCity);
        }
}
