package com.aaa;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadLocalRandom;

/**
 * TODO - divide all below programs
 *
 * for practice
 *
 * @author Srinath.Rayabarapu
 */
public class HelloWorld {

    private static String abc = "Hello";
    private static final Logger LOG = LoggerFactory.getLogger(HelloWorld.class);

    public static String srinath = "Srinath";



    public static StatusEnum TransactionStatusToRequestStatus(EmvTransactionStatus transactionStatus) {
        System.out.println("StatusEnum.values() : " + StatusEnum.values());
        System.out.println("transactionStatus.ordinal() : " + transactionStatus.ordinal());
        return StatusEnum.values()[transactionStatus.ordinal()];
    }



    public static void main(String[] args) throws JsonProcessingException {

//        Instant now = Instant.now();
//
//        Instant lastRun = now.minus(6, ChronoUnit.NANOS);
//        Instant fiveMinutesBack = now.minus(5, ChronoUnit.NANOS);
//
//        if(lastRun.compareTo(fiveMinutesBack) < 0){
//            System.out.println("lastrun is greater");
//        } else if(lastRun.compareTo(fiveMinutesBack) > 0) {
//            System.out.println("lastrun is lesser");
//        } else {
//            System.out.println("equal");
//        }
//
//
//        StatusEnum statusEnum = TransactionStatusToRequestStatus(EmvTransactionStatus.HEALTHCHECK_SUCCEDED);
//        System.out.println("statusEnum : " + statusEnum.toString());

        Integer i = ThreadLocalRandom.current().nextInt(100000, 1000000);
        System.out.println("random 6 digs : " + i.toString());

        System.out.println(getMaskedPANNumber("01234567890123456789012"));

        System.out.println(443/100);


//        Currency gbp = Currency.getInstance("GBP");
//        String s = JSONUtility.toJSON(gbp);
//        System.out.println(s);
//
//        Object o = JSONUtility.toObject("GBP", Currency.class);
//        System.out.println(o.toString());
//
//        String xyz = "zyx";
//
//        log("Hello World.. demo program!");
//
//        int[] intArraySorted = {1, 2, 4, 6, 8, 10, 14, 21, 56, 90};
//
//        boolean isFound = findBSRecursive(intArraySorted, 0, intArraySorted.length - 1, 10);
//        log("Is element found : " + isFound);
//
//        isFound = findBSIterative(intArraySorted, 0, intArraySorted.length - 1, 90);
//        log("Is element found : " + isFound);
//
//
//        System.out.println("\n" +
//                "_________                  .___ _____ __________.___ \n" +
//                "\\_   ___ \\_____ _______  __| _//  _  \\\\______   \\   |\n" +
//                "/    \\  \\/\\__  \\\\_  __ \\/ __ |/  /_\\  \\|     ___/   |\n" +
//                "\\     \\____/ __ \\|  | \\/ /_/ /    |    \\    |   |   |\n" +
//                " \\______  (____  /__|  \\____ \\____|__  /____|   |___|\n" +
//                "        \\/     \\/           \\/       \\/              \n");


    }

    static {
        String xyz = "x1";
        xyz = "abc";
    }

    private static boolean findBSRecursive(int[] inputArray, int startIndex, int endIndex, int findVal) {
        if (startIndex <= endIndex) {
            int middle = startIndex + (endIndex - startIndex) / 2;
            if (inputArray[middle] == findVal) {
                return true;
            }
            if (inputArray[middle] < findVal) {
                return findBSRecursive(inputArray, middle + 1, endIndex, findVal);
            }
            return findBSRecursive(inputArray, startIndex, middle - 1, findVal);
        } else {
            return false;
        }
    }

    private static boolean findBSIterative(int[] inputArray, int startIndex, int endIndex, int findVal) {
        while (startIndex <= endIndex) {
            int middle = startIndex + (endIndex - startIndex) / 2;
            if (inputArray[middle] == findVal) {
                return true;
            } else if (inputArray[middle] < findVal) {
                startIndex = middle + 1;
            } else {
                endIndex = middle - 1;
            }
        }
        return false;
    }

    private static void log(String str) {
        LOG.info(str);
    }

    public static String getMaskedPANNumber(String pan){
        String maskedPAN = "";
        try{
            if(pan.length() == 23) {
                pan = pan.substring(0, 19);
            }
            maskedPAN = pan.substring(0, 11) + "****" + pan.substring(15);
        }catch (Exception e){
            //ignore
        }
        return maskedPAN;
    }

}

enum StatusEnum {
    READY("ready"),
    CANCELLED("cancelled"),
    PENDING("pending"),
    SUCCEEDED("succeeded"),
    FAILED("failed"),
    ERRORED("errored"),
    HEALTH("healthchecking"),
    BEGIN("begin"),
    SOFTDECLINE("softdecline"),
    INIT("init"),
    HEALTHCHECK_SUCCEDED("init111");

    private String value;

    StatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "StatusEnum{" +
                "value='" + value + '\'' +
                '}';
    }


}

enum EmvTransactionStatus {
    READY,      // Waiting for card
    CANCELLED,  // Wait for card cancelled
    PENDING,    // Card presented, authorising
    SUCCEEDED,  // Payment processed successfully
    FAILED,     // Payment failed, declined
    ERRORED,    // We had an error (talking to identity, cardapi, or something else)
    HEALTH,     // Checking health of PED device
    BEGIN,      // We have started a transaction but not yet armed the ped
    SOFTDECLINE, // Either Central CardAPI didn't authorise or Contactless is not allowed
    INIT,
    HEALTHCHECK_SUCCEDED
}
