package com.javarush;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Tests {
    public static void main(String[] args) {

//        Path path1 = new Path("D:/tmp/tmp5.txt");
//        Path path1 = Paths.get("D:/tmp/tmp5.txt");
//        Path path2 = Paths.get("D:/tmp/");
//        Path path3 = Paths.get("tmp5.txt");
//
//        //calculate relateve path
//        Path path4 = path2.relativize(path1);
//        System.out.println(path4);
//
//        //concatinate paths
//        Path path5 = path2.resolve(path3);
//        System.out.println(path5);
//        Path path6 = path3.resolve(path2);
//        System.out.println(path6);
//
//        System.out.println(new FileProperties("dsfhbjhsdcv", 10000, 2180, 2));
//        System.out.println(new FileProperties("dsfhbjhsdcv", 0, 0, 1));
        //"d:/tmp/archiveTest/"
        //"d:/tmp/tmp5_archive.zip"

        ZipFileManager zipFileManager = new ZipFileManager(Paths.get("d:/tmp/tmp5_archive3.zip"));
        try {
//            zipFileManager.createZip(Paths.get("d:/tmp/archiveTest/tmp3.txt"));
            zipFileManager.createZip(Paths.get("d:/tmp/archiveTest/"));
//            zipFileManager.createZip(Paths.get("d:/tmp/archi"));

            //zipFileManager.removeFile(Paths.get("jnvdkfjn\\run.bat"));
            //zipFileManager.addFile(Paths.get("jnvdkfjn\\run.bat"));
//            zipFileManager.addFile(Paths.get("d:/tmp/tmp5.txt"));

            zipFileManager.addFile(Paths.get("d:/tmp/text.txt"));

            List<Path> pathList = new ArrayList<Path>(){
                {add(Paths.get("d:/tmp/tmp1.txt"));
                 add(Paths.get("d:/tmp/tmp2.txt"));
                 add(Paths.get("d:/tmp/tmp3.txt"));
                }
            };

            zipFileManager.addFiles(pathList);

        } catch (Exception e) {
            e.printStackTrace();
        }


        ConsoleHelper.writeMessage("-----------------------------------------");
        ConsoleHelper.writeMessage("-----------------------------------------");
        ConsoleHelper.writeMessage("-----------------------------------------");
        try {
            List<FileProperties> filePropertiesList = zipFileManager.getFilesList();
            filePropertiesList.forEach((V)-> ConsoleHelper.writeMessage(V.toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
