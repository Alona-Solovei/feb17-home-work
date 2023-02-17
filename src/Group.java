import java.util.Arrays;

public class Group {
    private Student[] array;
    private int capacity;
    private int size;

    public Group() {
        this.capacity = 3;
        this.array = new Student[capacity];
        this.size = 0;
    }

    public void add(Student student) {
        if (size < array.length) {
            array[size++] = student;
        }
    }

    public Group getStudentList() {
        Group resList = new Group();
        for (int i = 0; i < size; i++) {
            if (checkStudent(array[i])) {
                resList.add(array[i]);
            }
        }
        return resList;
    }

    private boolean checkStudent(Student student) {
        return student.getSkipping() > 3;
    }


    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < size; i++) {
            res += array[i] + System.lineSeparator();
        }
        return res;
    }

    public Student getStudent(int index) {
        if (index < size && index >= 0) {
            return array[index];
        } else{
            return null;
         }
    }
    public Student getBestStudent(){
        Student best = array[0];
        for (int i = 0; i <size ; i++) {
         if (best.averageGrade()<array[i].averageGrade()){
             best=array[i];
         }
        }
        return best;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }
}



