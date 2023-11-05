package com.java.solid.design.principle.singleresponsibility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

//Single- Responsibility : A class should have one and only one reason to change, and the class should have one reason to change.
// meaning that a class should have only one job.
//In object-oriented programming, a god object is an object that references a large number of distinct types,
//has too many unrelated or uncategorized methods, or some combination of bothThe god object is an example of an anti-pattern and a code smell.
// Seperation of concerns - different classes handling different, independent tasks/ problems.
public class Journal {
    private final List<String> entries = new ArrayList<>();
    //Static variable in Java is variable which belongs to the class and initialized only once at the start of the execution
    private static int count = 0;

    public void addEntry(String text){
        entries.add("Entry No " +  (++count) + ": " + text);
    }

    public void removeEntry(int index){
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    //single responsibility principle
    //adding method like save , load , remove deviate the Single Responsibility principle
    public void save(String filename) throws FileNotFoundException {
       try(PrintStream out = new PrintStream(filename)){
           out.println(toString());
       }
    }
    public void load(String filename){}
    public void load(URL url){}
    public boolean remove(String filename){return false;}
}

//better approach is to create a class responsible for save, load, remove Journal from File System.
//let say
class JournalFileDAO{
    public void saveToFile(Journal journal, String filename, boolean overwrite) throws FileNotFoundException{
        if(overwrite || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            }
        }
    }

    public boolean removeFile(String filename){
        final File file = new File(filename);
        boolean isFileDeleted = false;
        if(file.exists()){
            isFileDeleted = file.delete();
        }
        return isFileDeleted;
    }


}

class Demo{
    public static void main(String[] args) throws IOException {
        Journal journal = new Journal();
        journal.addEntry("I am happy today");
        journal.addEntry("I am write java program today");
        System.out.println(journal);


        //Single Responsibility principle
        JournalFileDAO journalFileDAO = new JournalFileDAO();
        journalFileDAO.saveToFile(journal,"D:\\fileJournal.txt",true);

        //boolean isFileDeleted = persistence.removeFile("D:\\fileJournal.txt");
        //System.out.println("File delete :"+ isFileDeleted);

        // windows!
        Runtime.getRuntime().exec("notepad.exe " + "D:\\fileJournal.txt");
    }
}
