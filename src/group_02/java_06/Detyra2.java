package group_02.java_06;

import java.util.HashSet;

public class Detyra2 {
    public static void main(String[] args){

    }
}

class MenaxhoStudentet{
    HashSet<Integer> generatedIds;
    public MenaxhoStudentet(){
        this.generatedIds = new HashSet<>();
    }
    Student shtoStudentin(String emri, String mbiemri){
        int id = this.generateId();
        return new Student(id, emri, mbiemri);
    }

    int generateId(){
        int id = (int)(10000 + Math.random() * 89999);
        boolean isUnique = this.generatedIds.add(id);
        if(isUnique)
            return id;
        return this.generateId();
    }

}

class Student{
    int id;
    String emri;
    String mbiemri;
    public Student(int id, String emri, String mbiemri){
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
    }
}