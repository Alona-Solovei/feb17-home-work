public class Main {
    public static void main(String[] args) {

        Group group=new Group();
        group.add(new Student("Max", 0));
        group.add(new Student("Den", 5));
        group.add(new Student("Fill", 2));
 //       group.add(new Student("Maria", 6));

        System.out.println(group);
        System.out.println("------------");
        Group group1=group.getStudentList();
        System.out.println(group1);
        System.out.println("------------");

        group.getStudent(0).setRate(new double[]{6,10,10,6,6});
        group.getStudent(1).setRate(new double[]{7});
        group.getStudent(2).setRate(new double[]{});
        System.out.println(group);

        System.out.println(group.getBestStudent());
    }
}