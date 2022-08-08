import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {

    // Create ArrayList and a class
        List<Student> students = new ArrayList<>();
        // add elements
        students.add(new Student(1,"Jose"));
        students.add(new Student(2,"Sayed" ));
        students.add(new Student(3,"Nick"));
        students.add(new Student(4,"Ronnie"));
        System.out.println(students);
        // Iteration on ArrayLists
        // 1. For Loop with get(index)
        for(int i=0; i<=students.size()-1; i++){
            System.out.println(students.get(i));
        }

        System.out.println("-----------------------------------------");

        //2.Iterator
        //Forward Iteration
        Iterator iter = students.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("Iterator print backward-----------------------------------------");

        //Backward Iteration
        while(((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }
        System.out.println("Printing for each loop-----------------------------------------");

        // 3. for each loop
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("Printing with lambda-----------------------------------------");

        // 4. Lambda
        students.forEach(p-> System.out.println(p));

        System.out.println("Printing with sorted List by comp-----------------------------------------");

        // Sorting Elements in List
        Collections.sort(students,new sortByIdDesc());
        System.out.println(students);

        System.out.println("Printing with sorted List by Name comp-----------------------------------------");
        Collections.sort(students, new sortByNameDesc());
        System.out.println(students);


    }
    static class sortByIdDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.id-o1.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
