package COM.BRIDGELABZ;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;


public class WriteAddressBookDataInJSONFile {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        JSONObject addressbookDetails1 = new JSONObject();
        addressbookDetails1.put("FirstName", "sri");
        addressbookDetails1.put("LastName", "polumati");
        addressbookDetails1.put("Email", "polumatisrilakshmi@gmail.com");
        addressbookDetails1.put("mob. no.", "9963464457");
        addressbookDetails1.put("Address", "Ravulapalem,AndhraPradesh");

        JSONObject addressbookObject1 = new JSONObject();
        addressbookObject1.put("Addressbook1", addressbookDetails1);


        JSONObject addressbookDetails2 = new JSONObject();
        addressbookDetails2.put("FirstName", "siri");
        addressbookDetails2.put("LastName", "geddam");
        addressbookDetails2.put("Email", "sirigeddam04@gmail.com");
        addressbookDetails2.put("mob.no.", "9423912661");
        addressbookDetails2.put("Address", "Ravulapalem,AndhraPradesh");

        JSONObject addressbookObject2 = new JSONObject();
        addressbookObject2.put("Addressbook2", addressbookDetails2);

        JSONObject addressbookDetails3 = new JSONObject();
        addressbookDetails3.put("FirstName", "ravi");
        addressbookDetails3.put("LastName", "paul");
        addressbookDetails3.put("Email", "ravipaul30@gmail.com");
        addressbookDetails3.put("mob. no.", "9404200733");
        addressbookDetails3.put("Address", "Ravulapalem,AndhraPradesh");

        JSONObject addressbookObject3 = new JSONObject();
        addressbookObject3.put("Addressbook3", addressbookDetails3);


        JSONArray addressbookList = new JSONArray();
        addressbookList.put(addressbookObject1);
        addressbookList.put(addressbookObject2);
        addressbookList.put(addressbookObject3);

        try (FileWriter file = new FileWriter("C:\\sri\\addressbookdata.json")) {
            file.write(addressbookList.toString());
            file.flush();
            System.out.println("File is created successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

