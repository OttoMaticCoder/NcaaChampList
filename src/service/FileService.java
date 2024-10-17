package service;

import wrestler.Wrestler;

import java.io.*;
import java.util.Arrays;

public class FileService {

    private String fileName = "NCAA-Legends.txt";

    public Wrestler[] readWrestlerList() {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            reader.readLine();
            String line;
            Wrestler[] wrestleList =new Wrestler[56];
            int count = 0;

            while ((line = reader.readLine()) != null) {
                String[] wrestleData = line.split(",");

                String name = wrestleData[0];
                String college = wrestleData[1];
                String nattys = wrestleData[2];
                String weight = wrestleData[3];

                Wrestler wrestler = new Wrestler(name, college, nattys, weight);
                wrestleList[count] = wrestler;
                count++;
            }
            System.out.println(Arrays.toString(wrestleList));
            return wrestleList;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void writeToFile(Wrestler[] wrestleList, String targetFileName) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(targetFileName))) {
            writer.write("Wrestler Name, College, National Titles, Weight Class\n");
            for (Wrestler wrestler : wrestleList) {
                writer.write(wrestler.toString() + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
