package classwork;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {

    public File classWorkFile() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String userFile = scan.nextLine();
        File file = new File(userFile);
        if (file.exists() && file.isDirectory()) {

        } else {
            file = new File("students.bin");
        }
        return file;
    }

    public File outPutFile(Collection<Student> studentCollection, File file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(studentCollection);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return file;
    }

    public List<Student> collectionStudent() {
        List<Student> studentCollection;
        StudentSup studentSup = new StudentSup();
        studentCollection = Stream.generate(studentSup).limit(10).collect(Collectors.toList());
        return studentCollection;
    }

    public void intPutFile(File file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            System.out.println(ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Student> topStudents(List<Student> studentList, int n) {
        StudentComparatorMark cmpMark = new StudentComparatorMark();
        StudentComparatorName cmpName = new StudentComparatorName();
        studentList.sort(cmpMark);
        List<Student> topN = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            topN.add(studentList.get(i));
        }
        topN.sort(cmpName);
        return topN;
    }

    public File outPutFileTop(List<Student> studentList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес для сохранения файла");
        String fileSave = scanner.nextLine();
        File newFile = new File(fileSave);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(newFile))) {
            oos.writeObject(studentList);
        } catch (FileNotFoundException e) {
            System.out.println("Нет файла");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return newFile;
    }
}
