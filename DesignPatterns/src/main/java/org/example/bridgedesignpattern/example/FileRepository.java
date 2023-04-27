package org.example.bridgedesignpattern.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class FileRepository implements StorageRepository{
    public void store(BaseEntiy entiy){

        try {

            FileOutputStream fileOut = new FileOutputStream("filePath");


            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);


            objectOut.writeObject(entiy);

            objectOut.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
