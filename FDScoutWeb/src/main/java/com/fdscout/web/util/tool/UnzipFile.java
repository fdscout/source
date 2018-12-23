package com.fdscout.web.util.tool;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.apache.log4j.Logger;

public class UnzipFile {
    public static List<String> unzipFiles(String localFolder, String fileName)  {
        int buffer = 2048;
        List<String> fileNameList = new ArrayList<String>();
        FileOutputStream fos = null;
        BufferedInputStream is = null;
        BufferedOutputStream dest = null;
        try {
            ZipFile zip = new ZipFile(new File(localFolder + fileName));
            Enumeration<? extends ZipEntry> zipFileEntries = zip.entries();
 
            // Process each entry
            while (zipFileEntries.hasMoreElements())
            {
                // grab a zip file entry
                ZipEntry entry = (ZipEntry) zipFileEntries.nextElement();
                String currentEntry = entry.getName();
                fileNameList.add(currentEntry);
                File destFile = new File(localFolder, currentEntry);
                //destFile = new File(newPath, destFile.getName());
                File destinationParent = destFile.getParentFile();
                // create the parent directory structure if needed
                destinationParent.mkdirs();
 
                if (!entry.isDirectory())
                {
                    is = new BufferedInputStream(zip.getInputStream(entry));
                    int currentByte;
                    // establish buffer for writing file
                    byte data[] = new byte[buffer];
 
                    // write the current file to disk
                    fos = new FileOutputStream(destFile);
                    dest = new BufferedOutputStream(fos, buffer);
 
                    // read and write until last byte is encountered
                    while ((currentByte = is.read(data, 0, buffer)) != -1) {
                        dest.write(data, 0, currentByte);
                    }
                    dest.flush();
                    dest.close();
                    fos.flush();
                    fos.close();
                    is.close();
                }
            }
        }
        catch (Exception e) 
        {
            Logger.getLogger(Class.class).error("ERROR: "+e.getMessage());
        }   
        
        if (dest != null) {
            try {
                dest.close();
            }
            catch (IOException ioe) {
                 Logger.getLogger(Class.class).error("ERROR: "+ ioe.getMessage());
            }
        }
        if (fos != null) {
            try {
                fos.close();
            }
            catch (IOException ioe) {
                 Logger.getLogger(Class.class).error("ERROR: "+ ioe.getMessage());
            }
        }
        if (is != null) {
            try {
                is.close();
            }
            catch (IOException ioe) {
                 Logger.getLogger(Class.class).error("ERROR: "+ ioe.getMessage());
            }
        }
        return fileNameList;
    }
}
