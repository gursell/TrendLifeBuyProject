package utilities;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToTxt {
    /*


    public static void saveRegistrantData(Registrant registrant){

        try {
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("registrantFile"), true);
            //src/resource/feature/testdata/PatientData

            BufferedWriter writer = new BufferedWriter(fileWriter);

//            writer.append(registrant.getFirstName() + "," + registrant.getLastName() + ","
//                            + registrant.getUsername() + "," + registrant.getEmail() + ","
//                            + registrant.getPassword() + "," + registrant.getSSN() + ", \n");

            writer.append(registrant.toString() + ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void saveRoomData(RoomCreateUpdateDelete room) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("room_records"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.append(room + "\n");
            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void saveTestItemInfo(CreateUpdateDeleteTestItem createUpdateDeleteTestItem) {
        try {
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("created_testItem_records"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.append(createUpdateDeleteTestItem.getName() + "," + createUpdateDeleteTestItem.getDescription() + "," + createUpdateDeleteTestItem.getPrice() + "," +
                    createUpdateDeleteTestItem.getDefaultValMin() + "," + createUpdateDeleteTestItem.getDefaultValMax() + "," + createUpdateDeleteTestItem.getCreatedDate() + "\n");
//writer.append(createUpdateDeleteTestItem+"\n");


            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveAllTestItems(CreateUpdateDeleteTestItem[] createUpdateDeleteTestItem) {
        try {
            //we make it FALSE because we will update all data whenever we make a get request for all.
            // Every time we will get all data
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("testItems_All_records"), false);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (int i = 0; i < createUpdateDeleteTestItem.length; i++) {
                writer.append(createUpdateDeleteTestItem[i].getName() + "," + createUpdateDeleteTestItem[i].getDescription() + "," +
                        createUpdateDeleteTestItem[i].getPrice() + "," + createUpdateDeleteTestItem[i].getDefaultValMin() + "," +
                        createUpdateDeleteTestItem[i].getDefaultValMax() + "," + createUpdateDeleteTestItem[i].getCreatedDate() + "\n");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveAllRoomData(RoomCreateUpdateDelete[] room) {
        try {
            //we make it FALSE because we will update all data whenever we make a get request for all.
            // Every time we will get all data
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("room_All_records"), false);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (int i = 0; i < room.length; i++) {
                writer.append(room[i].getCreatedBy() + "," + room[i].getDescription() + "," +
                        room[i].getPrice() + "," + room[i].getRoomNumber() + "," +
                        room[i].getRoomType() + "," + room[i].isStatus() + "\n");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void savePatientIds(List<Object> patientIDs) {

        try {
            //src/test/resources/testData/DBPatientIDs.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("db_patient_ids"),false);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (Object eachID: patientIDs)
                writer.append(eachID + ",\n");

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void savePatientNames(String fileName, List<Object> firstName) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));

            for (int i = 0; i < firstName.size(); i++)
                writer.append(firstName.get(i).toString() + ",\n");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void savePatientData(List<Object> patientData) {

        try {
            //src/test/resources/testData/DBPatientData.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("db_patient_data"),false);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (Object eachID: patientData)
                writer.append(eachID + ",\n");

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

     */





}