package group_04.java_06;

import java.util.HashSet;

public class Detyra2 {
}
class MenaxhoStudentat{
    static HashSet<Integer> generatedIds = new HashSet<>();
    Student shtoStudent(String emri, String mbiemri){
        int id = generateId();
        return new Student(id, emri, mbiemri);
    }
    int generateId(){
        int id = (int)(10000 + Math.random() * 89999);
        boolean isUnique = generatedIds.add(id);
        if(isUnique)
            return id;
        return generateId();
    }
}

class Student{
    int id;
    String emri;
    String mbiemri;
    Student(int id, String emri, String mbiemri){
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
    }
}

